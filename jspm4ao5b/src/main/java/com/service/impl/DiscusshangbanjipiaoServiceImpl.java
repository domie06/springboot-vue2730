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


import com.dao.DiscusshangbanjipiaoDao;
import com.entity.DiscusshangbanjipiaoEntity;
import com.service.DiscusshangbanjipiaoService;
import com.entity.vo.DiscusshangbanjipiaoVO;
import com.entity.view.DiscusshangbanjipiaoView;

@Service("discusshangbanjipiaoService")
public class DiscusshangbanjipiaoServiceImpl extends ServiceImpl<DiscusshangbanjipiaoDao, DiscusshangbanjipiaoEntity> implements DiscusshangbanjipiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshangbanjipiaoEntity> page = this.selectPage(
                new Query<DiscusshangbanjipiaoEntity>(params).getPage(),
                new EntityWrapper<DiscusshangbanjipiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshangbanjipiaoEntity> wrapper) {
		  Page<DiscusshangbanjipiaoView> page =new Query<DiscusshangbanjipiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshangbanjipiaoVO> selectListVO(Wrapper<DiscusshangbanjipiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshangbanjipiaoVO selectVO(Wrapper<DiscusshangbanjipiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshangbanjipiaoView> selectListView(Wrapper<DiscusshangbanjipiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshangbanjipiaoView selectView(Wrapper<DiscusshangbanjipiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
