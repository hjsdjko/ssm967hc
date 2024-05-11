package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaimaidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaimaidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaimaidingdanView;


/**
 * 外卖订单
 *
 * @author 
 * @email 
 * @date 2022-04-21 17:05:49
 */
public interface WaimaidingdanService extends IService<WaimaidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaimaidingdanVO> selectListVO(Wrapper<WaimaidingdanEntity> wrapper);
   	
   	WaimaidingdanVO selectVO(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
   	
   	List<WaimaidingdanView> selectListView(Wrapper<WaimaidingdanEntity> wrapper);
   	
   	WaimaidingdanView selectView(@Param("ew") Wrapper<WaimaidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaimaidingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WaimaidingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WaimaidingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WaimaidingdanEntity> wrapper);
}

