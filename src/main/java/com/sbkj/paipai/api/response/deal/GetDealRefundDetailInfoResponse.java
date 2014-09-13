package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.RefundDetailDealItem;

/**
 * 本接口主要用于买卖家根据拍拍网销售订单号查询订单的退款详细信息
 * @author DOmmy
 * create:2014-08-08
 */
public class GetDealRefundDetailInfoResponse extends PaipaiResponse{

	private static final long serialVersionUID = -1597884139209108155L;
	
	private String dealCode;// string  订单编码 
	private String dealDetailLink;// string  订单的详情连接 
	private List<RefundDetailDealItem> itemList;// list  订单的商品列表 
	
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
	public List<RefundDetailDealItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<RefundDetailDealItem> itemList) {
		this.itemList = itemList;
	}

}
