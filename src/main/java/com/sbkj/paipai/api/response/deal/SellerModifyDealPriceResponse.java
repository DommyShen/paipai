package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家可以使用本接口给买家付款之前的订单修改订单中的商品价格、或者修改运费价格
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerModifyDealPriceResponse extends PaipaiResponse{

	private static final long serialVersionUID = -4140435067083341141L;
	/**订单编码  */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
