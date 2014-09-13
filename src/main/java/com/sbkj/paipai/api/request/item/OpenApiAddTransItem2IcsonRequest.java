package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.OpenApiAddTransItem2IcsonResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 同步商品到易迅开放平台
 * @author DOmmy
 * create:2014-08-08
 */
public class OpenApiAddTransItem2IcsonRequest extends PaipaiBaseRequest
				implements PaipaiRequest<OpenApiAddTransItem2IcsonResponse>{
	
	/**商品id */
	private String itemId;
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getApiMethodName() {
		return "/v2/item/openApiAddTransItem2Icson.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemId", itemId);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<OpenApiAddTransItem2IcsonResponse> getResponseClass() {
		return OpenApiAddTransItem2IcsonResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
