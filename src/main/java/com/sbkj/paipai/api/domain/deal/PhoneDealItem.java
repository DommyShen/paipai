package com.sbkj.paipai.api.domain.deal;

/**
 * 手机端关联商品信息
 * @author DOmmy
 * create:2014-08-08
 */
public class PhoneDealItem {
	private String itemCode_TODO;// string  商品编码 
	private String itemName;// string  商品名称 
	private String itemLocalCode;// string  商家自定义的上商品编码 
	private String itemState;// string  商品当前的状态 
	private String stateDesc;// string  商品状态描述说明 
	private String sellerName;// string   
	private String categoryId;// number  店铺分类id 
	private String classId;// number  类目ID 
	private String picLink;// string  商品主要图片 
	private String itemPrice;// number  商品的基本价格 
	private String stockCount;// string  库存数量 
	private String buyLimit;// string  购买限制 
	private String marketPrice;// string  商品的市场价 
	private String attrInfo;// string  商品属性串 
	private String sellerUin_TODO;// string   
	private String weight;// string   
	private String codId;// string  货到付款的运费模版id 
	public String getItemCode_TODO() {
		return itemCode_TODO;
	}
	public void setItemCode_TODO(String itemCode_TODO) {
		this.itemCode_TODO = itemCode_TODO;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemLocalCode() {
		return itemLocalCode;
	}
	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
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
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getPicLink() {
		return picLink;
	}
	public void setPicLink(String picLink) {
		this.picLink = picLink;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getStockCount() {
		return stockCount;
	}
	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}
	public String getBuyLimit() {
		return buyLimit;
	}
	public void setBuyLimit(String buyLimit) {
		this.buyLimit = buyLimit;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getAttrInfo() {
		return attrInfo;
	}
	public void setAttrInfo(String attrInfo) {
		this.attrInfo = attrInfo;
	}
	public String getSellerUin_TODO() {
		return sellerUin_TODO;
	}
	public void setSellerUin_TODO(String sellerUin_TODO) {
		this.sellerUin_TODO = sellerUin_TODO;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCodId() {
		return codId;
	}
	public void setCodId(String codId) {
		this.codId = codId;
	}
	
}
