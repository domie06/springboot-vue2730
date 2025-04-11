package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JipiaoyudingEntity;
import com.entity.view.JipiaoyudingView;

import com.service.JipiaoyudingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.config.AlipayConfig;

/**
 * 机票预订
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@RestController
@RequestMapping("/jipiaoyuding")
public class JipiaoyudingController {
    @Autowired
    private JipiaoyudingService jipiaoyudingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JipiaoyudingEntity jipiaoyuding, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jipiaoyuding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JipiaoyudingEntity> ew = new EntityWrapper<JipiaoyudingEntity>();
    	PageUtils page = jipiaoyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jipiaoyuding), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JipiaoyudingEntity jipiaoyuding, 
		HttpServletRequest request){
        EntityWrapper<JipiaoyudingEntity> ew = new EntityWrapper<JipiaoyudingEntity>();
    	PageUtils page = jipiaoyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jipiaoyuding), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JipiaoyudingEntity jipiaoyuding){
       	EntityWrapper<JipiaoyudingEntity> ew = new EntityWrapper<JipiaoyudingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jipiaoyuding, "jipiaoyuding")); 
        return R.ok().put("data", jipiaoyudingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JipiaoyudingEntity jipiaoyuding){
        EntityWrapper< JipiaoyudingEntity> ew = new EntityWrapper< JipiaoyudingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jipiaoyuding, "jipiaoyuding")); 
		JipiaoyudingView jipiaoyudingView =  jipiaoyudingService.selectView(ew);
		return R.ok("查询机票预订成功").put("data", jipiaoyudingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JipiaoyudingEntity jipiaoyuding = jipiaoyudingService.selectById(id);
        return R.ok().put("data", jipiaoyuding);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JipiaoyudingEntity jipiaoyuding = jipiaoyudingService.selectById(id);
        return R.ok().put("data", jipiaoyuding);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JipiaoyudingEntity jipiaoyuding, HttpServletRequest request){
    	jipiaoyuding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jipiaoyuding);

        jipiaoyudingService.insert(jipiaoyuding);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JipiaoyudingEntity jipiaoyuding, HttpServletRequest request){
    	jipiaoyuding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jipiaoyuding);

        jipiaoyudingService.insert(jipiaoyuding);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JipiaoyudingEntity jipiaoyuding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jipiaoyuding);
        jipiaoyudingService.updateById(jipiaoyuding);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jipiaoyudingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JipiaoyudingEntity> wrapper = new EntityWrapper<JipiaoyudingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jipiaoyudingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	



    @RequestMapping("/alipay")
    public R payController(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url+"jipiaoyuding"+"/list.jsp");
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url+"jipiaoyuding"+"/notify");

        String out_trade_no = new String(request.getParameter("tradeno"));
        String total_amount = new String(request.getParameter("totalamount").getBytes("ISO-8859-1"),"UTF-8");
        String subject = new String(request.getParameter("subject"));
        String body = "";

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return R.ok().put("data",form);
    }

    @IgnoreAuth
    @RequestMapping("notify")
    public R nofity(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /* *
         * 功能：支付宝服务器异步通知页面
         *************************页面功能说明*************************
         * 创建该页面文件时，请留心该页面文件中无任何HTML代码及空格。
         * 该页面不能在本机电脑测试，请到服务器上做测试。请确保外部可以访问该页面。
         * 如果没有收到该页面返回的 success
         * 建议该页面只做支付成功的业务逻辑处理，退款的处理请以调用退款查询接口的结果为准。
         */

            //获取支付宝POST过来反馈信息
            Map<String,String> params = new HashMap<String,String>();
            Map<String,String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }

            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            }else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
                JipiaoyudingEntity jipiaoyuding = jipiaoyudingService.selectOne(new EntityWrapper<JipiaoyudingEntity>().eq("dingdanbianhao", out_trade_no));
                if(jipiaoyuding!=null) {
                    jipiaoyuding.setIspay("已支付");
                    jipiaoyudingService.updateById(jipiaoyuding);
                }
            }

            //——请在这里编写您的程序（以上代码仅作参考）——
            return R.ok();
    }


}
