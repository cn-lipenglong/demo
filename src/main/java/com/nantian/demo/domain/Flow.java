package com.nantian.demo.domain;

import java.util.Date;

/**
 * 流水表
 */
public class Flow {
	private String id;
	/**
	 * 流水号
	 */
	private String flowNum;
	/**
	 *订单号
	 */
	private String orderNum;
	/**
	 *产品Id
	 */
	private Product prodect;
	/**
	 *支付金额
	 */
	private String paidAmount;
	/**
	 *支付方式	1：支付宝 \r\n  2：微信
	 */
	private Integer paidMethod;
	/**
	 *购买数量
	 */
	private Integer buyCounts;
	/**
	 *创建时间
	 */
	private Date createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlowNum() {
		return flowNum;
	}

	public void setFlowNum(String flowNum) {
		this.flowNum = flowNum;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Product getProdect() {
		return prodect;
	}

	public void setProdect(Product prodect) {
		this.prodect = prodect;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Integer getPaidMethod() {
		return paidMethod;
	}

	public void setPaidMethod(Integer paidMethod) {
		this.paidMethod = paidMethod;
	}

	public Integer getBuyCounts() {
		return buyCounts;
	}

	public void setBuyCounts(Integer buyCounts) {
		this.buyCounts = buyCounts;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Flow{" +
				"id='" + id + '\'' +
				", flowNum='" + flowNum + '\'' +
				", orderNum='" + orderNum + '\'' +
				", prodect=" + prodect +
				", paidAmount='" + paidAmount + '\'' +
				", paidMethod=" + paidMethod +
				", buyCounts=" + buyCounts +
				", createDate=" + createDate +
				'}';
	}
}
