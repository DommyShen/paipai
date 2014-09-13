package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口给订单留言，买卖家均可在订单详情中查看到该留言
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerLeaveWordToDealResponse extends PaipaiResponse{

	private static final long serialVersionUID = 2587701437762699289L;
	/** 订单编码  */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
