package com.dao;

import com.entity.TejiajipiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TejiajipiaoVO;
import com.entity.view.TejiajipiaoView;


/**
 * 特价机票
 * 
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface TejiajipiaoDao extends BaseMapper<TejiajipiaoEntity> {
	
	List<TejiajipiaoVO> selectListVO(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
	
	TejiajipiaoVO selectVO(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
	
	List<TejiajipiaoView> selectListView(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);

	List<TejiajipiaoView> selectListView(Pagination page,@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
	
	TejiajipiaoView selectView(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
	

}
