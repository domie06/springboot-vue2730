package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TejiajipiaoDao;
import com.entity.TejiajipiaoEntity;
import com.service.TejiajipiaoService;
import com.entity.vo.TejiajipiaoVO;
import com.entity.view.TejiajipiaoView;

@Service("tejiajipiaoService")
public class TejiajipiaoServiceImpl extends ServiceImpl<TejiajipiaoDao, TejiajipiaoEntity> implements TejiajipiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TejiajipiaoEntity> page = this.selectPage(
                new Query<TejiajipiaoEntity>(params).getPage(),
                new EntityWrapper<TejiajipiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TejiajipiaoEntity> wrapper) {
		  Page<TejiajipiaoView> page =new Query<TejiajipiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TejiajipiaoVO> selectListVO(Wrapper<TejiajipiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TejiajipiaoVO selectVO(Wrapper<TejiajipiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TejiajipiaoView> selectListView(Wrapper<TejiajipiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TejiajipiaoView selectView(Wrapper<TejiajipiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
