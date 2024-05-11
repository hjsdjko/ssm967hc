package com.dao;

import com.entity.WaimaidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaimaidingdanVO;
import com.entity.view.WaimaidingdanView;


/**
 * 外卖订单
 * 
 * @author 
 * @email 
 * @date 2022-04-21 17:05:49
 */
public interface WaimaidingdanDao extends BaseMapper<WaimaidingdanEntity> {
	
	List<WaimaidingdanVO> selectListVO(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
	
	WaimaidingdanVO selectVO(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
	
	List<WaimaidingdanView> selectListView(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);

	List<WaimaidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
	
	WaimaidingdanView selectView(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
}
