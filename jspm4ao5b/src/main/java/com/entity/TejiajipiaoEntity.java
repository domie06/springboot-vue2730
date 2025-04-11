package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特价机票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@TableName("tejiajipiao")
public class TejiajipiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TejiajipiaoEntity() {
		
	}
	
	public TejiajipiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 机票编号
	 */
					
	private String jipiaobianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 机票详情
	 */
					
	private String jipiaoxiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：机票编号
	 */
	public void setJipiaobianhao(String jipiaobianhao) {
		this.jipiaobianhao = jipiaobianhao;
	}
	/**
	 * 获取：机票编号
	 */
	public String getJipiaobianhao() {
		return jipiaobianhao;
	}
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
