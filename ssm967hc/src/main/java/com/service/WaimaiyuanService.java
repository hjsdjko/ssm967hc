package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaimaiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaimaiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaimaiyuanView;


/**
 * 外卖员
 *
 * @author 
 * @email 
 * @date 2022-04-21 17:05:48
 */
public interface WaimaiyuanService extends IService<WaimaiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaimaiyuanVO> selectListVO(Wrapper<WaimaiyuanEntity> wrapper);
   	
   	WaimaiyuanVO selectVO(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
   	
   	List<WaimaiyuanView> selectListView(Wrapper<WaimaiyuanEntity> wrapper);
   	
   	WaimaiyuanView selectView(@Param("ew") Wrapper<WaimaiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaimaiyuanEntity> wrapper);
   	

}

