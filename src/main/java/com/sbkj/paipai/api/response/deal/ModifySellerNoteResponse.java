package com.sbkj.paipai.api.response.deal;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家可以使用本接口给订单添加备注内容，或者修改备注(不超过254个字符)。
 * @author DOmmy
 * craete:2014-08-08
 */
public class ModifySellerNoteResponse extends PaipaiResponse{

	private static final long serialVersionUID = -4174228519639565409L;
	
	/**订单编码 */
	private String dealCode;

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	
}
