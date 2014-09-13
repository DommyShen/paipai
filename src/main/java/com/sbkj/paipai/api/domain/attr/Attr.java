package com.sbkj.paipai.api.domain.attr;

import java.util.List;

public class Attr {
	private String attrId;
	private String attrName;
	private String property;
	private String desc;
	private String parentId;
	private String parentAttrId;
	private String orderFlag;
	private String keyAttr;
	private String necessary;
	private String saleAttr;
	private String b2cHidden;
	private String c2cHidden;
	private String useType;
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
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentAttrId() {
		return parentAttrId;
	}
	public void setParentAttrId(String parentAttrId) {
		this.parentAttrId = parentAttrId;
	}
	public String getOrderFlag() {
		return orderFlag;
	}
	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}
	public String getKeyAttr() {
		return keyAttr;
	}
	public void setKeyAttr(String keyAttr) {
		this.keyAttr = keyAttr;
	}
	public String getNecessary() {
		return necessary;
	}
	public void setNecessary(String necessary) {
		this.necessary = necessary;
	}
	public String getSaleAttr() {
		return saleAttr;
	}
	public void setSaleAttr(String saleAttr) {
		this.saleAttr = saleAttr;
	}
	public String getB2cHidden() {
		return b2cHidden;
	}
	public void setB2cHidden(String b2cHidden) {
		this.b2cHidden = b2cHidden;
	}
	public String getC2cHidden() {
		return c2cHidden;
	}
	public void setC2cHidden(String c2cHidden) {
		this.c2cHidden = c2cHidden;
	}
	public String getUseType() {
		return useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}
	public List<Option> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<Option> optionList) {
		this.optionList = optionList;
	}
	
}
