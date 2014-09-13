package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.AddItemStockResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 *  批量新增商品库存信息 
 * @author DOmmy
 * create:2014-08-08
 */
public class AddItemStockRequest extends PaipaiBaseRequest
				implements PaipaiRequest<AddItemStockResponse>{
	
	/**商品ID */
	private String itemCode;
	/**商品本地编码 */
	private String itemLocalCode;
	/**库存信息 */
	private String stockJsonList;
	
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

	public String getStockJsonList() {
		return stockJsonList;
	}

	public void setStockJsonList(String stockJsonList) {
		this.stockJsonList = stockJsonList;
	}

	public String getApiMethodName() {
		return "/item/addItemStock.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("stockJsonList", stockJsonList);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<AddItemStockResponse> getResponseClass() {
		return AddItemStockResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
