package com.entity.vo;

import com.entity.TejiajipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 特价机票
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public class TejiajipiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 航空公司
	 */
	
	private String hangkonggongsi;
		
	/**
	 * 航班
	 */
	
	private String hangban;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 起飞时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qifeishijian;
		
	/**
	 * 到达时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daodashijian;
		
	/**
	 * 起飞地点
	 */
	
	private String qifeididian;
		
	/**
	 * 到达地点
	 */
	
	private String daodadidian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 特价
	 */
	
	private Float tejia;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 机票详情
	 */
	
	private String jipiaoxiangqing;
				
	
	/**
	 * 设置：航空公司
	 */
	 
	public void setHangkonggongsi(String hangkonggongsi) {
		this.hangkonggongsi = hangkonggongsi;
	}
	
	/**
	 * 获取：航空公司
	 */
	public String getHangkonggongsi() {
		return hangkonggongsi;
	}
				
	
	/**
	 * 设置：航班
	 */
	 
	public void setHangban(String hangban) {
		this.hangban = hangban;
	}
	
	/**
	 * 获取：航班
	 */
	public String getHangban() {
		return hangban;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：起飞时间
	 */
	 
	public void setQifeishijian(Date qifeishijian) {
		this.qifeishijian = qifeishijian;
	}
	
	/**
	 * 获取：起飞时间
	 */
	public Date getQifeishijian() {
		return qifeishijian;
	}
				
	
	/**
	 * 设置：到达时间
	 */
	 
	public void setDaodashijian(Date daodashijian) {
		this.daodashijian = daodashijian;
	}
	
	/**
	 * 获取：到达时间
	 */
	public Date getDaodashijian() {
		return daodashijian;
	}
				
	
	/**
	 * 设置：起飞地点
	 */
	 
	public void setQifeididian(String qifeididian) {
		this.qifeididian = qifeididian;
	}
	
	/**
	 * 获取：起飞地点
	 */
	public String getQifeididian() {
		return qifeididian;
	}
				
	
	/**
	 * 设置：到达地点
	 */
	 
	public void setDaodadidian(String daodadidian) {
		this.daodadidian = daodadidian;
	}
	
	/**
	 * 获取：到达地点
	 */
	public String getDaodadidian() {
		return daodadidian;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：特价
	 */
	 
	public void setTejia(Float tejia) {
		this.tejia = tejia;
	}
	
	/**
	 * 获取：特价
	 */
	public Float getTejia() {
		return tejia;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：机票详情
	 */
	 
	public void setJipiaoxiangqing(String jipiaoxiangqing) {
		this.jipiaoxiangqing = jipiaoxiangqing;
	}
	
	/**
	 * 获取：机票详情
	 */
	public String getJipiaoxiangqing() {
		return jipiaoxiangqing;
	}
			
}
