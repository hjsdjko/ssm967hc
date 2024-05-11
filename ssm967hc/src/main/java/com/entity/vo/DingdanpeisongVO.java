package com.entity.vo;

import com.entity.DingdanpeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 订单配送
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 17:05:49
 */
public class DingdanpeisongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 配送进度
	 */
	
	private String peisongjindu;
		
	/**
	 * 订单评价
	 */
	
	private String dingdanpingjia;
		
	/**
	 * 配送费用
	 */
	
	private Integer peisongfeiyong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
		
	/**
	 * 配送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peisongshijian;
		
	/**
	 * 配送工号
	 */
	
	private String peisonggonghao;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：配送进度
	 */
	 
	public void setPeisongjindu(String peisongjindu) {
		this.peisongjindu = peisongjindu;
	}
	
	/**
	 * 获取：配送进度
	 */
	public String getPeisongjindu() {
		return peisongjindu;
	}
				
	
	/**
	 * 设置：订单评价
	 */
	 
	public void setDingdanpingjia(String dingdanpingjia) {
		this.dingdanpingjia = dingdanpingjia;
	}
	
	/**
	 * 获取：订单评价
	 */
	public String getDingdanpingjia() {
		return dingdanpingjia;
	}
				
	
	/**
	 * 设置：配送费用
	 */
	 
	public void setPeisongfeiyong(Integer peisongfeiyong) {
		this.peisongfeiyong = peisongfeiyong;
	}
	
	/**
	 * 获取：配送费用
	 */
	public Integer getPeisongfeiyong() {
		return peisongfeiyong;
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
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
				
	
	/**
	 * 设置：配送时间
	 */
	 
	public void setPeisongshijian(Date peisongshijian) {
		this.peisongshijian = peisongshijian;
	}
	
	/**
	 * 获取：配送时间
	 */
	public Date getPeisongshijian() {
		return peisongshijian;
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
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
