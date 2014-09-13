package com.sbkj.paipai.api.domain.item;


public class ExtendInfo {
	private String extendCode;// number  商品扩展属性编码id 
	private String extendName;// string  商品扩展属性名称 
	private String showMeg;// string  商品扩展属性名称说明 
	private String extendValue;// string  商品扩展属性值 
	
	public String getExtendCode() {
		return extendCode;
	}
	public void setExtendCode(String extendCode) {
		this.extendCode = extendCode;
	}
	public String getExtendName() {
		return extendName;
	}
	public void setExtendName(String extendName) {
		this.extendName = extendName;
	}
	public String getShowMeg() {
		return showMeg;
	}
	public void setShowMeg(String showMeg) {
		this.showMeg = showMeg;
	}
	public String getExtendValue() {
		return extendValue;
	}
	public void setExtendValue(String extendValue) {
		this.extendValue = extendValue;
	}
	
}
