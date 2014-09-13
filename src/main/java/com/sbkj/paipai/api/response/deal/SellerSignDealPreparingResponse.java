package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口标记订单当前的状态为配货中（卖家标记发货之后则不能调用该接口） 只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSignDealPreparingResponse extends PaipaiResponse{

	private static final long serialVersionUID = -7808849400381969876L;
	/**订单编码 */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
