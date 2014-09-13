package com.sbkj.paipai.api.request.attr;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.attr.GetAttrOptionListResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 查询属性选项列表
 * @author DOmmy
 * create:2014-08-09
 */
public class GetAttrOptionListRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetAttrOptionListResponse>{
	
	/**类目ID */
	private Long classId;
	/**父属性ID */
	private Long parentAttrId;
	/**子属性在父属性选项里对应的optionID */
	private Long optionId;
	/**属性ID，注意当属性为子属性时，需要填写父属性ID还有选项ID */
	private Long attrId;
	
	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getParentAttrId() {
		return parentAttrId;
	}

	public void setParentAttrId(Long parentAttrId) {
		this.parentAttrId = parentAttrId;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getApiMethodName() {
		return "/attr/getAttrOptionList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("classId", String.valueOf(classId));
		params.put("parentAttrId", String.valueOf(parentAttrId));
		params.put("optionId", String.valueOf(optionId));
		params.put("attrId", String.valueOf(attrId));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetAttrOptionListResponse> getResponseClass() {
		return GetAttrOptionListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
