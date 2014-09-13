package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.DeleteItemPicResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口删除商品主图，采用post请求
 * @author DOmmy
 * create:2014-08-08
 */
public class DeleteItemPicRequest extends PaipaiBaseRequest
				implements PaipaiRequest<DeleteItemPicResponse>{
	
	/**商品编码。 */
	private String itemCode;
	/**商品图片索引，取值只能是0到4之间，表示第1或第5张主图。一般商品拥有不超过5张主图，若要删除多张主图，则主图索引之间可用','分隔， 例如'0,1,2' */
	private Integer index;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getApiMethodName() {
		return "/item/deleteItemPic.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", String.valueOf(index));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<DeleteItemPicResponse> getResponseClass() {
		return DeleteItemPicResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
