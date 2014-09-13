package com.sbkj.paipai.api.domain.deal;

/**
 * 拍拍网的订单的商品
 * @author DOmmy
 * create:2014-08-08
 */
public class PcItemInfo {
	private String dealSubCode;// string  子订单id 
	private String itemCode;// string  商品编码 
	private String itemCodeHistory;// string  订单的商品快照编码 
	private String itemLocalCode;// string  商家编码 
	private String skuId;// number  商品的库存唯一标识码,由拍拍平台生成 
	private String stockLocalCode;// string  商品库存编码 
	private String stockAttr;// string  买家下单时选择的库存属性 
	private String itemDetailLink;// string  商品详情的url 
	private String itemName;// string  商品名称 
	private String itemPic80;// string  商品图片的url 
	private String itemDealPrice;// number  买家下单时的商品价格 
	private String itemAdjustPrice;// number  订单的调整价格:正数为订单加价,负数为订单减价 
	private String itemDiscountFee;// number  购买商品的红包值、折扣优惠价 
	private String itemDealCount;// int8  购买的数量 
	private String account;// string  充值帐号（点卡类商品订单中才有意义） 
	private String refundState;// string  退款状态，有退款时才有值 
	private String refundStateDesc;// string  退款状态描述，有退款时才有值 
	private String tradePropertymask;// string  自订单属性串，多个属性之间用下划线_隔开
	private String wanggouQuanId;// string  网购券ID 
	private String wanggouQuanAmt;// number  网购券金额 
	private String itemDealState;
	
	public String getItemDealState() {
		return itemDealState;
	}
	public void setItemDealState(String itemDealState) {
		this.itemDealState = itemDealState;
	}
	public String getDealSubCode() {
		return dealSubCode;
	}
	public void setDealSubCode(String dealSubCode) {
		this.dealSubCode = dealSubCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCodeHistory() {
		return itemCodeHistory;
	}
	public void setItemCodeHistory(String itemCodeHistory) {
		this.itemCodeHistory = itemCodeHistory;
	}
	public String getItemLocalCode() {
		return itemLocalCode;
	}
	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getStockLocalCode() {
		return stockLocalCode;
	}
	public void setStockLocalCode(String stockLocalCode) {
		this.stockLocalCode = stockLocalCode;
	}
	public String getStockAttr() {
		return stockAttr;
	}
	public void setStockAttr(String stockAttr) {
		this.stockAttr = stockAttr;
	}
	public String getItemDetailLink() {
		return itemDetailLink;
	}
	public void setItemDetailLink(String itemDetailLink) {
		this.itemDetailLink = itemDetailLink;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPic80() {
		return itemPic80;
	}
	public void setItemPic80(String itemPic80) {
		this.itemPic80 = itemPic80;
	}
	public String getItemDealPrice() {
		return itemDealPrice;
	}
	public void setItemDealPrice(String itemDealPrice) {
		this.itemDealPrice = itemDealPrice;
	}
	public String getItemAdjustPrice() {
		return itemAdjustPrice;
	}
	public void setItemAdjustPrice(String itemAdjustPrice) {
		this.itemAdjustPrice = itemAdjustPrice;
	}
	public String getItemDiscountFee() {
		return itemDiscountFee;
	}
	public void setItemDiscountFee(String itemDiscountFee) {
		this.itemDiscountFee = itemDiscountFee;
	}
	public String getItemDealCount() {
		return itemDealCount;
	}
	public void setItemDealCount(String itemDealCount) {
		this.itemDealCount = itemDealCount;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getRefundStateDesc() {
		return refundStateDesc;
	}
	public void setRefundStateDesc(String refundStateDesc) {
		this.refundStateDesc = refundStateDesc;
	}
	public String getTradePropertymask() {
		return tradePropertymask;
	}
	public void setTradePropertymask(String tradePropertymask) {
		this.tradePropertymask = tradePropertymask;
	}
	public String getWanggouQuanId() {
		return wanggouQuanId;
	}
	public void setWanggouQuanId(String wanggouQuanId) {
		this.wanggouQuanId = wanggouQuanId;
	}
	public String getWanggouQuanAmt() {
		return wanggouQuanAmt;
	}
	public void setWanggouQuanAmt(String wanggouQuanAmt) {
		this.wanggouQuanAmt = wanggouQuanAmt;
	}
	
}
