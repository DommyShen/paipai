package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.ModifyItemStateResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于上下架商品
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemStateRequest extends PaipaiBaseRequest
					implements PaipaiRequest<ModifyItemStateResponse>{
	
	/**itemState */
	private String itemCode;
	/**商品编码,可替代itemCode参数;多个商品以逗号或者分号分隔 */
	private String itemCodeList;
	/**商家编码 */
	private String itemLocalCode;
	/**商家商品编码,可替代itemLocalCode参数;多个商品以逗号或者分号分隔 */
	private String itemLocalCodeList;
	/**商品期望的状态IS_FOR_SALE：上架销售。IS_IN_STORE：放入仓库。 */
	private String itemState;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCodeList() {
		return itemCodeList;
	}

	public void setItemCodeList(String itemCodeList) {
		this.itemCodeList = itemCodeList;
	}

	public String getItemLocalCode() {
		return itemLocalCode;
	}

	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
	}

	public String getItemLocalCodeList() {
		return itemLocalCodeList;
	}

	public void setItemLocalCodeList(String itemLocalCodeList) {
		this.itemLocalCodeList = itemLocalCodeList;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getApiMethodName() {
		return "/item/modifyItemState.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemCodeList", itemCodeList);
		params.put("itemLocalCode", itemLocalCode);
		params.put("itemLocalCodeList", itemLocalCodeList);
		params.put("itemState", itemState);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifyItemStateResponse> getResponseClass() {
		return ModifyItemStateResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}
	
}
