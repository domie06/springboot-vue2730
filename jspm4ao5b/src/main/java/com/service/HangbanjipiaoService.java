package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HangbanjipiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HangbanjipiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HangbanjipiaoView;


/**
 * 航班机票
 *
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface HangbanjipiaoService extends IService<HangbanjipiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HangbanjipiaoVO> selectListVO(Wrapper<HangbanjipiaoEntity> wrapper);
   	
   	HangbanjipiaoVO selectVO(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
   	
   	List<HangbanjipiaoView> selectListView(Wrapper<HangbanjipiaoEntity> wrapper);
   	
   	HangbanjipiaoView selectView(@Param("ew") Wrapper<HangbanjipiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HangbanjipiaoEntity> wrapper);
   	

}

