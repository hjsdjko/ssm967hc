package com.entity.view;

import com.entity.WaimaiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外卖员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 17:05:48
 */
@TableName("waimaiyuan")
public class WaimaiyuanView  extends WaimaiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaimaiyuanView(){
	}
 
 	public WaimaiyuanView(WaimaiyuanEntity waimaiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, waimaiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
