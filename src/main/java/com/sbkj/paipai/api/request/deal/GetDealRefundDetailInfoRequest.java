package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.GetDealRefundDetailInfoResponse;
import com.sbkj.paipai.api.utils.FileItem;


/**
 * 本接口主要用于买卖家根据拍拍网销售订单号查询订单的退款详细信息
 * @author DOmmy
 * create:2014-08-08
 */
public class GetDealRefundDetailInfoRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetDealRefundDetailInfoResponse>{
	
	/**订单编码 */
	private String dealCode;
	/** 0（默认）：卖家1：买家 */
	private Integer userRole;
	/** 卖家或者买家QQ号 */
	private String userUin;
	
	public String getUserUin() {
		return userUin;
	}

	public void setUserUin(String userUin) {
		this.userUin = userUin;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public String getApiMethodName() {
		return "/deal/getDealRefundDetailInfo.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("userRole", String.valueOf(userRole));
		params.put("userUin", String.valueOf(userUin));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		return params;
	}

	public Class<GetDealRefundDetailInfoResponse> getResponseClass() {
		return GetDealRefundDetailInfoResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
