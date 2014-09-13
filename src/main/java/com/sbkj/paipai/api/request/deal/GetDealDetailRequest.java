package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.GetDealDetailResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于卖家根据拍拍网销售订单号列表查询（交易结束2个月内的）订单的详细信息
 * @author DOmmy
 * create:2014-08-08
 */
public class GetDealDetailRequest extends PaipaiBaseRequest
					implements PaipaiRequest<GetDealDetailResponse>{
	
	/**historyDeal */
	private String dealCode;
	/**
	 * 是否列出商品
	 * 0（默认）：不列出订单相关商品
	 * 非0：列出订单相关商品（速度比较慢）
	 */
	private Integer listItem;
	/**是否查询历史订单，0否，1是 */
	private Integer historyDeal;
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public Integer getListItem() {
		return listItem;
	}

	public void setListItem(Integer listItem) {
		this.listItem = listItem;
	}

	public Integer getHistoryDeal() {
		return historyDeal;
	}

	public void setHistoryDeal(Integer historyDeal) {
		this.historyDeal = historyDeal;
	}

	public String getApiMethodName() {
		return "/deal/getDealDetail.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("listItem", String.valueOf(listItem));
		params.put("historyDeal", String.valueOf(historyDeal));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetDealDetailResponse> getResponseClass() {
		return GetDealDetailResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
