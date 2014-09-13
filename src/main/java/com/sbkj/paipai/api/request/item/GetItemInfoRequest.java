package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.GetItemInfoResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 根据商品编码查询单个商品相关信息的接口
 * @author DOmmy
 * create:2014-08-09
 */
public class GetItemInfoRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetItemInfoResponse>{
	
	/**商品编码 */
	private String itemCode;
	/**需要查询的商品信息：2048:商品实时浏览量信息 */
	private String optionStr;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOptionStr() {
		return optionStr;
	}

	public void setOptionStr(String optionStr) {
		this.optionStr = optionStr;
	}

	public String getApiMethodName() {
		return "/item/getItemInfo.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("optionStr", optionStr);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetItemInfoResponse> getResponseClass() {
		return GetItemInfoResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
