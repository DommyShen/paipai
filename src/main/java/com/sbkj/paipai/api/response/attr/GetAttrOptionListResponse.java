package com.sbkj.paipai.api.response.attr;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.attr.Option;

/**
 * 查询属性选项列表
 * @author DOmmy
 * create:2014-08-09
 */
public class GetAttrOptionListResponse extends PaipaiResponse{

	private static final long serialVersionUID = 2543452070444001148L;
	
	private String attrId;
	private String attrName;
	private String optionCount;
	private List<Option> optionList;
	public String getAttrId() {
		return attrId;
	}
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(String optionCount) {
		this.optionCount = optionCount;
	}
	public List<Option> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<Option> optionList) {
		this.optionList = optionList;
	}
	
}
