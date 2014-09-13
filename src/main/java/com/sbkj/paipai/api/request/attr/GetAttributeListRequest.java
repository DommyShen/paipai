package com.sbkj.paipai.api.request.attr;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.attr.GetAttributeListResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 查询类目属性列表
 * @author DOmmy
 * craete:2014-08-09
 */
public class GetAttributeListRequest extends PaipaiBaseRequest
					implements PaipaiRequest<GetAttributeListResponse>{
	
	/**类目ID，对应于查询导航接口里返回的isClass=1的nagigationId */
	private Long classId;
	/**属性ID */
	private Long attrId;
	/**属性选项ID */
	private Long optionId;
	/**是否输出属性的选项列表 */
	private Long option;
	
	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public Long getOption() {
		return option;
	}

	public void setOption(Long option) {
		this.option = option;
	}

	public String getApiMethodName() {
		return "/attr/getAttributeList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("classId", String.valueOf(classId));
		params.put("attrId", String.valueOf(attrId));
		params.put("optionId", String.valueOf(optionId));
		params.put("option", String.valueOf(option));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetAttributeListResponse> getResponseClass() {
		return GetAttributeListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
