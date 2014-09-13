package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerSignDealPreparingResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口标记订单当前的状态为配货中（卖家标记发货之后则不能调用该接口） 只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSignDealPreparingRequest extends PaipaiBaseRequest
				implements PaipaiRequest<SellerSignDealPreparingResponse>{
	
	/**订单编码 */
	private String dealCode;
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getApiMethodName() {
		return "/deal/sellerSignDealPreparing.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerSignDealPreparingResponse> getResponseClass() {
		return SellerSignDealPreparingResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
