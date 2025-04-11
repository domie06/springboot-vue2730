package com.entity.view;

import com.entity.HangbanjipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 航班机票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@TableName("hangbanjipiao")
public class HangbanjipiaoView  extends HangbanjipiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HangbanjipiaoView(){
	}
 
 	public HangbanjipiaoView(HangbanjipiaoEntity hangbanjipiaoEntity){
 	try {
			BeanUtils.copyProperties(this, hangbanjipiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
