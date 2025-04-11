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


import com.dao.HangbanjipiaoDao;
import com.entity.HangbanjipiaoEntity;
import com.service.HangbanjipiaoService;
import com.entity.vo.HangbanjipiaoVO;
import com.entity.view.HangbanjipiaoView;

@Service("hangbanjipiaoService")
public class HangbanjipiaoServiceImpl extends ServiceImpl<HangbanjipiaoDao, HangbanjipiaoEntity> implements HangbanjipiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HangbanjipiaoEntity> page = this.selectPage(
                new Query<HangbanjipiaoEntity>(params).getPage(),
                new EntityWrapper<HangbanjipiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HangbanjipiaoEntity> wrapper) {
		  Page<HangbanjipiaoView> page =new Query<HangbanjipiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HangbanjipiaoVO> selectListVO(Wrapper<HangbanjipiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HangbanjipiaoVO selectVO(Wrapper<HangbanjipiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HangbanjipiaoView> selectListView(Wrapper<HangbanjipiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HangbanjipiaoView selectView(Wrapper<HangbanjipiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
