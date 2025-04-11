package com.entity.view;

import com.entity.TejiajipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特价机票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@TableName("tejiajipiao")
public class TejiajipiaoView  extends TejiajipiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TejiajipiaoView(){
	}
 
 	public TejiajipiaoView(TejiajipiaoEntity tejiajipiaoEntity){
 	try {
			BeanUtils.copyProperties(this, tejiajipiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
