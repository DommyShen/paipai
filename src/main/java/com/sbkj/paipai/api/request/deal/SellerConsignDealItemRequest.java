package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerConsignDealItemResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于卖家订单标记发货（注：需买家先完成付款后，卖家才能调用该接口对订单标记发货） 注意：该接口不支持货到付款的订单标记发货。
 *  只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作 所以卖家再调用该接口之前，必须先查询订单的状态是否处于“买家已付款，
 *  等待卖家发货”，否则频繁调用接口失败时将会被后台处罚！
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerConsignDealItemRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerConsignDealItemResponse>{
	
	/**订单编码 */
	private String dealCode;
	/**物流公司名称 */
	private String logisticsName;
	/**卖家填写的发货说明 */
	private String logisticsDesc;
	/**发货单号(运单号)	 */
	private String logisticsCode;
	/**预计几天后到货 */
	private Long arriveDays;
	
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getLogisticsName() {
		return logisticsName;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsDesc() {
		return logisticsDesc;
	}

	public void setLogisticsDesc(String logisticsDesc) {
		this.logisticsDesc = logisticsDesc;
	}

	public String getLogisticsCode() {
		return logisticsCode;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public Long getArriveDays() {
		return arriveDays;
	}

	public void setArriveDays(Long arriveDays) {
		this.arriveDays = arriveDays;
	}

	public String getApiMethodName() {
		return "/deal/sellerConsignDealItem.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("logisticsName", logisticsName);
		params.put("logisticsDesc", logisticsDesc);
		params.put("logisticsCode", logisticsCode);
		params.put("arriveDays", String.valueOf(arriveDays));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerConsignDealItemResponse> getResponseClass() {
		return SellerConsignDealItemResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
