package com.sbkj.paipai.api.request.item;


public class ModifyResult {
	private String itemCode;// string  商品编码 
	private String itemLocalCode;// string  商家编码 
	private String result;// number  结果标志：0成功；非0失败 
	private String itemState;// string  修改后的状态 
	private String stateDesc;// string  修改后的状态描述 
	
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getItemState() {
		return itemState;
	}
	public void setItemState(String itemState) {
		this.itemState = itemState;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

}
