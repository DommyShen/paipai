package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.GetItemDetailInfoResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 根据商品编码查询单个商品详情描述的接口
 * @author DOmmy
 * create:2014-08-09
 */
public class GetItemDetailInfoRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetItemDetailInfoResponse>{
	/**商品编码 */
	private String itemCode;
	/**商家编码  */
	private String itemLocalCode;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemLocalCode() {
		return itemLocalCode;
	}

	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
	}

	public String getApiMethodName() {
		return "/item/getItemDetailInfo.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetItemDetailInfoResponse> getResponseClass() {
		return GetItemDetailInfoResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
