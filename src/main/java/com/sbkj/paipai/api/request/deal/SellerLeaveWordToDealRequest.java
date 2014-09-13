package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerLeaveWordToDealResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口给订单留言，买卖家均可在订单详情中查看到该留言
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerLeaveWordToDealRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerLeaveWordToDealResponse>{
	
	/**订单编码 */
	private String dealCode;
	/**留言内容 */
	private String leaveWord;
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getLeaveWord() {
		return leaveWord;
	}

	public void setLeaveWord(String leaveWord) {
		this.leaveWord = leaveWord;
	}

	public String getApiMethodName() {
		return "/deal/sellerLeaveWordToDeal.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("leaveWord", leaveWord);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerLeaveWordToDealResponse> getResponseClass() {
		return SellerLeaveWordToDealResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
