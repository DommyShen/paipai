package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.EditItemStockResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 批量修改商品库存信息 
 * @author DOmmy
 * create:2014-08-08
 */
public class EditItemStockRequest extends PaipaiBaseRequest
				implements PaipaiRequest<EditItemStockResponse>{

	/**商品编码 */
	private String itemCode;
	/**库存信息 */
	private String stockJsonList;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStockJsonList() {
		return stockJsonList;
	}

	public void setStockJsonList(String stockJsonList) {
		this.stockJsonList = stockJsonList;
	}

	public String getApiMethodName() {
		return "/item/editItemStock.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("stockJsonList", stockJsonList);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<EditItemStockResponse> getResponseClass() {
		return EditItemStockResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
