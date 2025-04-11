package com.dao;

import com.entity.DiscusshangbanjipiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshangbanjipiaoVO;
import com.entity.view.DiscusshangbanjipiaoView;


/**
 * 航班机票评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface DiscusshangbanjipiaoDao extends BaseMapper<DiscusshangbanjipiaoEntity> {
	
	List<DiscusshangbanjipiaoVO> selectListVO(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
	
	DiscusshangbanjipiaoVO selectVO(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
	
	List<DiscusshangbanjipiaoView> selectListView(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);

	List<DiscusshangbanjipiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
	
	DiscusshangbanjipiaoView selectView(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
	

}
