package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 订单评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-21 17:05:49
 */
@TableName("dingdanpingjia")
public class DingdanpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanpingjiaEntity() {
		
	}
	
	public DingdanpingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 菜品名称
	 */
					
	private String caipinmingcheng;
	
	/**
	 * 菜品图片
	 */
					
	private String caipintupian;
	
	/**
	 * 餐厅编号
	 */
					
	private String cantingbianhao;
	
	/**
	 * 菜品评分
	 */
					
	private String caipinpingfen;
	
	/**
	 * 配送评分
	 */
					
	private String peisongpingfen;
	
	/**
	 * 配送工号
	 */
					
	private String peisonggonghao;
	
	/**
	 * 内容反馈
	 */
					
	private String neirongfankui;
	
	/**
	 * 评价日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingjiariqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：菜品名称
	 */
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
	/**
	 * 设置：菜品图片
	 */
	public void setCaipintupian(String caipintupian) {
		this.caipintupian = caipintupian;
	}
	/**
	 * 获取：菜品图片
	 */
	public String getCaipintupian() {
		return caipintupian;
	}
	/**
	 * 设置：餐厅编号
	 */
	public void setCantingbianhao(String cantingbianhao) {
		this.cantingbianhao = cantingbianhao;
	}
	/**
	 * 获取：餐厅编号
	 */
	public String getCantingbianhao() {
		return cantingbianhao;
	}
	/**
	 * 设置：菜品评分
	 */
	public void setCaipinpingfen(String caipinpingfen) {
		this.caipinpingfen = caipinpingfen;
	}
	/**
	 * 获取：菜品评分
	 */
	public String getCaipinpingfen() {
		return caipinpingfen;
	}
	/**
	 * 设置：配送评分
	 */
	public void setPeisongpingfen(String peisongpingfen) {
		this.peisongpingfen = peisongpingfen;
	}
	/**
	 * 获取：配送评分
	 */
	public String getPeisongpingfen() {
		return peisongpingfen;
	}
	/**
	 * 设置：配送工号
	 */
	public void setPeisonggonghao(String peisonggonghao) {
		this.peisonggonghao = peisonggonghao;
	}
	/**
	 * 获取：配送工号
	 */
	public String getPeisonggonghao() {
		return peisonggonghao;
	}
	/**
	 * 设置：内容反馈
	 */
	public void setNeirongfankui(String neirongfankui) {
		this.neirongfankui = neirongfankui;
	}
	/**
	 * 获取：内容反馈
	 */
	public String getNeirongfankui() {
		return neirongfankui;
	}
	/**
	 * 设置：评价日期
	 */
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
