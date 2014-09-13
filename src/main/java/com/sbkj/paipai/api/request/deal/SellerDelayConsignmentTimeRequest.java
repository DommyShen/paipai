package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerDelayConsignmentTimeResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口延长订单的收货时间（卖家标记发货之后才能调用该接口） 只有状态为“卖家已发货，等待买家确认收货”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerDelayConsignmentTimeRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerDelayConsignmentTimeResponse>{
	
	/**订单编码 */
	private String dealCode;
	/**延长收货的天数 */
	private Integer days;
	
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getDealCode() {
		return dealCode;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public String getApiMethodName() {
		return "/deal/sellerDelayConsignmentTime.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("days", String.valueOf(days));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerDelayConsignmentTimeResponse> getResponseClass() {
		return SellerDelayConsignmentTimeResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
