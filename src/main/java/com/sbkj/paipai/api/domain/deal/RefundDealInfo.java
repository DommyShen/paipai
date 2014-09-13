package com.sbkj.paipai.api.domain.deal;

import java.util.List;

/**
 * 
 * @author DOmmy
 * create:2014-08-08
 */
public class RefundDealInfo {
	private String dealCode;// string  订单编码 
	private String dealDetailLink;// string  订单的详情连接 
	private List<RefundItemInfo> itemList;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getDealDetailLink() {
		return dealDetailLink;
	}
	public void setDealDetailLink(String dealDetailLink) {
		this.dealDetailLink = dealDetailLink;
	}
	public List<RefundItemInfo> getItemList() {
		return itemList;
	}
	public void setItemList(List<RefundItemInfo> itemList) {
		this.itemList = itemList;
	}
	
}
