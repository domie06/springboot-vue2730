package com.dao;

import com.entity.HangbanjipiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HangbanjipiaoVO;
import com.entity.view.HangbanjipiaoView;


/**
 * 航班机票
 * 
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface HangbanjipiaoDao extends BaseMapper<HangbanjipiaoEntity> {
	
	List<HangbanjipiaoVO> selectListVO(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
	
	HangbanjipiaoVO selectVO(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
	
	List<HangbanjipiaoView> selectListView(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);

	List<HangbanjipiaoView> selectListView(Pagination page,@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
	
	HangbanjipiaoView selectView(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
	

}
