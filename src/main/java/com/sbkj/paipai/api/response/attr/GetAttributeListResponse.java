package com.sbkj.paipai.api.response.attr;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.attr.Attr;

/**
 * 查询类目属性列表
 * @author DOmmy
 * craete:2014-08-09
 */
public class GetAttributeListResponse extends PaipaiResponse{

	private static final long serialVersionUID = 964433790845139581L;
	
	private String classId;
	private String className;
	private String attrId;
	private String optionId;
	private String attrCount;
	private List<Attr> attrList;
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getAttrId() {
		return attrId;
	}
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getAttrCount() {
		return attrCount;
	}
	public void setAttrCount(String attrCount) {
		this.attrCount = attrCount;
	}
	public List<Attr> getAttrList() {
		return attrList;
	}
	public void setAttrList(List<Attr> attrList) {
		this.attrList = attrList;
	}
	
}

