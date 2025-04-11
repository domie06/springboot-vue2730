package com.entity.vo;

import com.entity.HangbanjipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 航班机票
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public class HangbanjipiaoVO  implements Serializable {
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
	 * 乘机地点
	 */
	
	private String chengjididian;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 机票票价
	 */
	
	private Float jipiaopiaojia;
		
	/**
	 * 出发地
	 */
	
	private String chufadi;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 飞行时长
	 */
	
	private String feixingshizhang;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 出发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chufashijian;
		
	/**
	 * 机票详情
	 */
	
	private String jipiaoxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：乘机地点
	 */
	 
	public void setChengjididian(String chengjididian) {
		this.chengjididian = chengjididian;
	}
	
	/**
	 * 获取：乘机地点
	 */
	public String getChengjididian() {
		return chengjididian;
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
	 * 设置：机票票价
	 */
	 
	public void setJipiaopiaojia(Float jipiaopiaojia) {
		this.jipiaopiaojia = jipiaopiaojia;
	}
	
	/**
	 * 获取：机票票价
	 */
	public Float getJipiaopiaojia() {
		return jipiaopiaojia;
	}
				
	
	/**
	 * 设置：出发地
	 */
	 
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：飞行时长
	 */
	 
	public void setFeixingshizhang(String feixingshizhang) {
		this.feixingshizhang = feixingshizhang;
	}
	
	/**
	 * 获取：飞行时长
	 */
	public String getFeixingshizhang() {
		return feixingshizhang;
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
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
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
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
