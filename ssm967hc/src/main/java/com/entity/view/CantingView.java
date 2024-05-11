package com.entity.view;

import com.entity.CantingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐厅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 17:05:48
 */
@TableName("canting")
public class CantingView  extends CantingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CantingView(){
	}
 
 	public CantingView(CantingEntity cantingEntity){
 	try {
			BeanUtils.copyProperties(this, cantingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
