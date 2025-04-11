package com.entity.view;

import com.entity.DiscusshangbanjipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 航班机票评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
@TableName("discusshangbanjipiao")
public class DiscusshangbanjipiaoView  extends DiscusshangbanjipiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshangbanjipiaoView(){
	}
 
 	public DiscusshangbanjipiaoView(DiscusshangbanjipiaoEntity discusshangbanjipiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusshangbanjipiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
