package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.ModifyItemDetailInfoResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 修改指定商品的详情说明(商品的具体描述的内容段)
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemDetailInfoRequest extends PaipaiBaseRequest
					implements PaipaiRequest<ModifyItemDetailInfoResponse>{
	
	/**商品编码
itemCode和itemLocalCode至少必须填写一个。
索引字段，不能修改。 */
	private String itemCode;
	/**商家编码
itemCode和itemLocalCode至少必须填写一个。
索引字段，不能修改。 */
	private String itemLocalCode;
	/**商品详情说明 */
	private String detailInfo;
	/**易迅商品详情内容。该接口一次只能处理一种类型详情。detailInfo和icsonDesc只需填其中一个,如果两个都填写,默认只处理detailInfo */
	private String icsonDesc;
	
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

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getIcsonDesc() {
		return icsonDesc;
	}

	public void setIcsonDesc(String icsonDesc) {
		this.icsonDesc = icsonDesc;
	}

	public String getApiMethodName() {
		return "/item/modifyItemDetailInfo.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("stockStr", detailInfo);
		params.put("stockStr", icsonDesc);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifyItemDetailInfoResponse> getResponseClass() {
		return ModifyItemDetailInfoResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
