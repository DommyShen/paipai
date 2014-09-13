package com.sbkj.paipai.api.domain.deal;

import java.util.List;

/**
 * 
 * @author DOmmy
 * create:2014-08-08
 */
public class RefundItemInfo {
	private String itemCode;// string  商品编码 
	private String itemCodeHistory;// string  订单的商品快照编码 
	private String itemLocalCode;// string  商家编码 
	private String skuId;// number  商品的库存唯一标识码,由拍拍平台生成 
	private String stockLocalCode;// string  商品库存编码 
	private String stockAttr;// string  买家下单时选择的库存属性 
	private List<RefundInfo> refundInfoList;// struct   
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
	public List<RefundInfo> getRefundInfoList() {
		return refundInfoList;
	}
	public void setRefundInfoList(List<RefundInfo> refundInfoList) {
		this.refundInfoList = refundInfoList;
	}
	
}
