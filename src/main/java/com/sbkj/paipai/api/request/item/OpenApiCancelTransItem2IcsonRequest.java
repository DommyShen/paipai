package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.OpenApiCancelTransItem2IcsonResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 取消同步商品到易迅开放平台
 * @author DOmmy
 * create:2014-08-08
 */
public class OpenApiCancelTransItem2IcsonRequest extends PaipaiBaseRequest
					implements PaipaiRequest<OpenApiCancelTransItem2IcsonResponse>{
	
	/**商品id*/
	private String itemId;
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getApiMethodName() {
		return "/v2/item/openApiCancelTransItem2Icson.xhtml";
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

	public Class<OpenApiCancelTransItem2IcsonResponse> getResponseClass() {
		return OpenApiCancelTransItem2IcsonResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
