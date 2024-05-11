package com.entity.view;

import com.entity.WaimaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外卖订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 17:05:49
 */
@TableName("waimaidingdan")
public class WaimaidingdanView  extends WaimaidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaimaidingdanView(){
	}
 
 	public WaimaidingdanView(WaimaidingdanEntity waimaidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, waimaidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
