package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TejiajipiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TejiajipiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TejiajipiaoView;


/**
 * 特价机票
 *
 * @author 
 * @email 
 * @date 2022-03-12 16:25:59
 */
public interface TejiajipiaoService extends IService<TejiajipiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TejiajipiaoVO> selectListVO(Wrapper<TejiajipiaoEntity> wrapper);
   	
   	TejiajipiaoVO selectVO(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
   	
   	List<TejiajipiaoView> selectListView(Wrapper<TejiajipiaoEntity> wrapper);
   	
   	TejiajipiaoView selectView(@Param("ew") Wrapper<TejiajipiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TejiajipiaoEntity> wrapper);
   	

}

