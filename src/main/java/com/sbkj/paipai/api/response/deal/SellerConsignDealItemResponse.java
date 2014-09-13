package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 本接口主要用于卖家订单标记发货（注：需买家先完成付款后，卖家才能调用该接口对订单标记发货） 注意：该接口不支持货到付款的订单标记发货。
 *  只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作 所以卖家再调用该接口之前，必须先查询订单的状态是否处于“买家已付款，
 *  等待卖家发货”，否则频繁调用接口失败时将会被后台处罚！
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerConsignDealItemResponse extends PaipaiResponse{

	private static final long serialVersionUID = -2089199093288302866L;
	/**订单编码 */
	private String dealCode;
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
