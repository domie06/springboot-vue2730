package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshangbanjipiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshangbanjipiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshangbanjipiaoView;


/**
 * 航班机票评论表
 *
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface DiscusshangbanjipiaoService extends IService<DiscusshangbanjipiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshangbanjipiaoVO> selectListVO(Wrapper<DiscusshangbanjipiaoEntity> wrapper);
   	
   	DiscusshangbanjipiaoVO selectVO(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
   	
   	List<DiscusshangbanjipiaoView> selectListView(Wrapper<DiscusshangbanjipiaoEntity> wrapper);
   	
   	DiscusshangbanjipiaoView selectView(@Param("ew") Wrapper<DiscusshangbanjipiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshangbanjipiaoEntity> wrapper);
   	

}

