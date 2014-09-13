package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.GetItemResponse;
import com.sbkj.paipai.api.utils.FileItem;


/**
 * 根据商品编码查询单个商品信息的接口
 * @author DOmmy
 * create:2014-08-08
 */
public class GetItemRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetItemResponse>{
	
	/**商品编码 */
	private String itemCode;
	/**商家编码 */
	private String itemLocalCode;
	/**是否需要解析商品属性 */
	private Long needParseAttr;
	/**是否需要返回商品详情 */
	private Long needDetailInfo;
	/**是否需要返回附加信息 */
	private Long needExtendInfo;
	
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

	public Long getNeedParseAttr() {
		return needParseAttr;
	}

	public void setNeedParseAttr(Long needParseAttr) {
		this.needParseAttr = needParseAttr;
	}

	public Long getNeedDetailInfo() {
		return needDetailInfo;
	}

	public void setNeedDetailInfo(Long needDetailInfo) {
		this.needDetailInfo = needDetailInfo;
	}

	public Long getNeedExtendInfo() {
		return needExtendInfo;
	}

	public void setNeedExtendInfo(Long needExtendInfo) {
		this.needExtendInfo = needExtendInfo;
	}

	public String getApiMethodName() {
		return "/item/getItem.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("needParseAttr", String.valueOf(needParseAttr));
		params.put("needDetailInfo", String.valueOf(needDetailInfo));
		params.put("needExtendInfo", String.valueOf(needExtendInfo));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetItemResponse> getResponseClass() {
		return GetItemResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
