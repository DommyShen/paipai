package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口取消订单(买家付款之后只能走申请退款接口，不能调用该接口取消订单) 只有状态为“等待买家付款”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerCancelDealResponse extends PaipaiResponse{

	private static final long serialVersionUID = -4446051857255624691L;
	
	/**订单编码*/
	private String dealCode;
	/** 关闭订单的原因说明  */
	private String closeReasonDesc;
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getCloseReasonDesc() {
		return closeReasonDesc;
	}
	public void setCloseReasonDesc(String closeReasonDesc) {
		this.closeReasonDesc = closeReasonDesc;
	}
	
}
