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


import com.dao.WaimaiyuanDao;
import com.entity.WaimaiyuanEntity;
import com.service.WaimaiyuanService;
import com.entity.vo.WaimaiyuanVO;
import com.entity.view.WaimaiyuanView;

@Service("waimaiyuanService")
public class WaimaiyuanServiceImpl extends ServiceImpl<WaimaiyuanDao, WaimaiyuanEntity> implements WaimaiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaimaiyuanEntity> page = this.selectPage(
                new Query<WaimaiyuanEntity>(params).getPage(),
                new EntityWrapper<WaimaiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaimaiyuanEntity> wrapper) {
		  Page<WaimaiyuanView> page =new Query<WaimaiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaimaiyuanVO> selectListVO(Wrapper<WaimaiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaimaiyuanVO selectVO(Wrapper<WaimaiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaimaiyuanView> selectListView(Wrapper<WaimaiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaimaiyuanView selectView(Wrapper<WaimaiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
