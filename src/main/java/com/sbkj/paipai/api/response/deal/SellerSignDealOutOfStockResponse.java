package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家标记订单缺货 只能整个订单所有的商品都同时标记缺货 只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作 当订单中全部商品被标记缺货后，
 * 订单的状态变为：DS_CLOSED（订单已关闭），系统立即自动退款给买家； 当订单中部分商品被标记为缺货后，订单的状态不变（买家已付款等待卖家发货），
 * 退款部分需要等待交易完成后才真正退回给买家；
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSignDealOutOfStockResponse extends PaipaiResponse{

	private static final long serialVersionUID = 8529055124343829305L;
	/**订单编码 */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
