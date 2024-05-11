package com.dao;

import com.entity.WaimaiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaimaiyuanVO;
import com.entity.view.WaimaiyuanView;


/**
 * 外卖员
 * 
 * @author 
 * @email 
 * @date 2022-04-21 17:05:48
 */
public interface WaimaiyuanDao extends BaseMapper<WaimaiyuanEntity> {
	
	List<WaimaiyuanVO> selectListVO(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
	
	WaimaiyuanVO selectVO(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
	
	List<WaimaiyuanView> selectListView(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);

	List<WaimaiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
	
	WaimaiyuanView selectView(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
	

}
