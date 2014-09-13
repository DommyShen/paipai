package com.sbkj.paipai.api.domain.item;


public class ParsedAttr {
	private String attrId;// number  商品的属性串编码id 
	private String attrName;// string  商品的属性串编码名称 
	private String attrOptionId;// number  商品的属性串编码值id 
	private String attrOptionName;// string  商品的属性串编码值名称 
	
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
	public String getAttrOptionId() {
		return attrOptionId;
	}
	public void setAttrOptionId(String attrOptionId) {
		this.attrOptionId = attrOptionId;
	}
	public String getAttrOptionName() {
		return attrOptionName;
	}
	public void setAttrOptionName(String attrOptionName) {
		this.attrOptionName = attrOptionName;
	}
	
}
