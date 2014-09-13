package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 根据商品编码查询单个商品相关信息的接口
 * @author DOmmy
 * create:2014-08-09
 */
public class GetItemInfoResponse extends PaipaiResponse{

	private static final long serialVersionUID = -1265018959836216966L;
	
	private String sellerUin;// number  卖家QQ号 
	private String sellerName;// string  卖家名称 
	private String itemCode;// string  商品编码，商品在拍拍上标识的唯一编码 
	private String itemLocalCode;// string  商家对商品的编码，商家自行保证该编码的唯一性，否则根据该编码查询可能出错。 
	private String itemName;// string  商品名称 
	private String visitCount;// number  访问的次数 
	private String number;// number  商品当前的库存量 
	
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(String visitCount) {
		this.visitCount = visitCount;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
