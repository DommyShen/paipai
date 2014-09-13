package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口延长订单的收货时间（卖家标记发货之后才能调用该接口） 只有状态为“卖家已发货，等待买家确认收货”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerDelayConsignmentTimeResponse extends PaipaiResponse{

	private static final long serialVersionUID = -976952057536346459L;
	/**订单编码 */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
