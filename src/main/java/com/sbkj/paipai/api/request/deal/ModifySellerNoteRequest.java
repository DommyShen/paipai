package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.ModifySellerNoteResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家可以使用本接口给订单添加备注内容，或者修改备注(不超过254个字符)。
 * @author DOmmy
 * craete:2014-08-08
 */
public class ModifySellerNoteRequest extends PaipaiBaseRequest
				implements PaipaiRequest<ModifySellerNoteResponse>{

	/**订单编码 */
	private String dealCode;
	/**订单备注内容 不超过254个字符 */
	private String dealNote;
	/**
	 *订单备注类型
	 *RED=红色,
	 *YELLOW=黄色,
	 *GREEN=绿色,
	 *BLUE=蓝色,
	 *PINK=粉红色		 
	 */
	private String dealNoteType;
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getDealNote() {
		return dealNote;
	}

	public void setDealNote(String dealNote) {
		this.dealNote = dealNote;
	}

	public String getDealNoteType() {
		return dealNoteType;
	}

	public void setDealNoteType(String dealNoteType) {
		this.dealNoteType = dealNoteType;
	}

	public String getApiMethodName() {
		return "/deal/modifySellerNote.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("dealNote", dealNote);
		params.put("dealNoteType", dealNoteType);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifySellerNoteResponse> getResponseClass() {
		return ModifySellerNoteResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
