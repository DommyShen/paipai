package com.sbkj.paipai.api.domain.item;



public class Stock {
	private String skuId;// number  发布成功后的库存唯一标识,后续修改删除时作为主键使用 
	private String stockLocalCode;// string  商家自身库存编码 
	private String stockAttr;// string  库存属性串,不作为库存唯一标识用 
	private String status;// number 用数字表示状态 库存状态:1-IS_IN_STORE, 2-IS_FOR_SALE,9-IS_PRE_DELETE 
	private String saleAttr;// string  库存销售属性串 
	
	private String pic;// string  库存图片URL 
	private String stockDesc;// string  商品的库存备注 
	private String soldCount_TODO;// number  商品的该库存对应的销售数量 
	private String stockPrice;// number  商品的库存的价格 
	private String stockCount_TODO;// number  商品的库存数量 
	private String createTime_TODO;// time  商品的库存创建时间 
	private String lastModifyTime_TODO;// time  商品的库存最后修改时间 
	
	private String errorCode;
	private String errorMsg;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSaleAttr() {
		return saleAttr;
	}
	public void setSaleAttr(String saleAttr) {
		this.saleAttr = saleAttr;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getStockDesc() {
		return stockDesc;
	}
	public void setStockDesc(String stockDesc) {
		this.stockDesc = stockDesc;
	}
	public String getSoldCount_TODO() {
		return soldCount_TODO;
	}
	public void setSoldCount_TODO(String soldCount_TODO) {
		this.soldCount_TODO = soldCount_TODO;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getStockCount_TODO() {
		return stockCount_TODO;
	}
	public void setStockCount_TODO(String stockCount_TODO) {
		this.stockCount_TODO = stockCount_TODO;
	}
	public String getCreateTime_TODO() {
		return createTime_TODO;
	}
	public void setCreateTime_TODO(String createTime_TODO) {
		this.createTime_TODO = createTime_TODO;
	}
	public String getLastModifyTime_TODO() {
		return lastModifyTime_TODO;
	}
	public void setLastModifyTime_TODO(String lastModifyTime_TODO) {
		this.lastModifyTime_TODO = lastModifyTime_TODO;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
