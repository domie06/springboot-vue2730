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
 * 航班机票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@TableName("hangbanjipiao")
public class HangbanjipiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HangbanjipiaoEntity() {
		
	}
	
	public HangbanjipiaoEntity(T t) {
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
	 * 航班编号
	 */
					
	private String hangbanbianhao;
	
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
	 * 设置：航班编号
	 */
	public void setHangbanbianhao(String hangbanbianhao) {
		this.hangbanbianhao = hangbanbianhao;
	}
	/**
	 * 获取：航班编号
	 */
	public String getHangbanbianhao() {
		return hangbanbianhao;
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
