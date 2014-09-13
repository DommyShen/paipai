package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.DeleteItemStockResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 批量删除商品库存 
 * @author DOmmy
 * create:2014-08-08
 */
public class DeleteItemStockRequest extends PaipaiBaseRequest
				implements PaipaiRequest<DeleteItemStockResponse>{
	
	/**商品编码*/
	private String itemCode;
	/**要删除的sku列表。格式:skuId;skuId;... */
	private String skuIdList;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getSkuIdList() {
		return skuIdList;
	}

	public void setSkuIdList(String skuIdList) {
		this.skuIdList = skuIdList;
	}

	public String getApiMethodName() {
		return "/item/deleteItemStock.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("skuIdList", skuIdList);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<DeleteItemStockResponse> getResponseClass() {
		return DeleteItemStockResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
