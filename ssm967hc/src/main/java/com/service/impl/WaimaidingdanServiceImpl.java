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


import com.dao.WaimaidingdanDao;
import com.entity.WaimaidingdanEntity;
import com.service.WaimaidingdanService;
import com.entity.vo.WaimaidingdanVO;
import com.entity.view.WaimaidingdanView;

@Service("waimaidingdanService")
public class WaimaidingdanServiceImpl extends ServiceImpl<WaimaidingdanDao, WaimaidingdanEntity> implements WaimaidingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaimaidingdanEntity> page = this.selectPage(
                new Query<WaimaidingdanEntity>(params).getPage(),
                new EntityWrapper<WaimaidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaimaidingdanEntity> wrapper) {
		  Page<WaimaidingdanView> page =new Query<WaimaidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaimaidingdanVO> selectListVO(Wrapper<WaimaidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaimaidingdanVO selectVO(Wrapper<WaimaidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaimaidingdanView> selectListView(Wrapper<WaimaidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaimaidingdanView selectView(Wrapper<WaimaidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WaimaidingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WaimaidingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WaimaidingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
