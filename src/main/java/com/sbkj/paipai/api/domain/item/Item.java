package com.sbkj.paipai.api.domain.item;


public class Item {
	private String itemCode;// string  商品编码 
	private String itemName;// string  商品名称1-60字节 
	private String itemLocalCode;// string  合作商家的私有商品编码，由商家保证该编码在其所有商品中的唯一性，不超过40 Bytes。 
	private String itemState;// string  商品状态“IS_FOR_SALE”：上架销售。“IS_IN_STORE”：放入仓库。“IS_SALE_ON_TIME”：定时上架 
	private String stateCode;// number  商品状态码 
	private String stateDesc;// string  商品状态描述 
	private String itemProperty;// number  商品属性 
	private String properties;// string  商品属性串(拍拍助理)
	private String categoryId;// string  商品所属的店铺分类id 
	private String classId;// number  商品所属的拍拍类目id。每个商品只能从属于一个拍拍类目id，且必须从属于一个类目id。 
	private String attr;// string  原有商品属性信息 
	private String attr2;// string  新商品属性串信息,如：version=1,1:1|2:2|a:a|b:1,2,4^a:你好 
	private String customAttr;// string  自定义属性字符串 
	private String sellType;// string  出售类型 
	private String payType;// string  支付类型 
	private String marketPrice;// string  商品的市场参考价格，只对QQ会员特权卖家有效。 
	private String itemPrice;// number  商品价格 
	private String qqvipItem;// number  是否QQ会员商品1是0否。请求参数extendInfo=1时有效 
	private String qqvipDiscount;// number  商品折扣。请求参数extendInfo=1时有效 
	private String stockCount;// number  商品库存数量 
	private String sellerName;// string  商家昵称 
	private String sellerPayFreight;// number  买家或卖家承担运费
	private String freightId;// number  运费模版Id 
	private String codId;// number  货到付款运费模版Id 
	private String weight;// number  商品重量 
	private String mailPrice;// number  平邮价格 
	private String expressPrice;// number  快递价格 
	private String cityId;// number  商品所在城市 
	private String provinceId;// number  所在省 
	private String countryId;// number  国家 
	private String recommendItem;// number  是否推荐商品
	private String windowItem;// number  是否橱窗商品
	private String invoiceItem;// number  是否提供发票
	private String guaranteeCompensation;// number  是否假一赔三诚信保证商品
	private String guarantee7Days;// number  是否7天包退诚信保证商品
	private String guarantee14Days;// number  是否14天先行赔付诚信保证商品
	private String guaranteeRepair;// number  是否保修商品
	private String supportTenpay;// number  是否支持财付通
	private String buyLimit;// number  购买限制，0，表示不限制。大于0的值表示单个买家购买该商品不得超过该数目。 
	private String validDuration;// number  上架时长，单位为秒 
	private String theme;// string  商品详情页面颜色主题
	private String reloadCount;// number  修改次数 
	private String visitCount;// number  商品被访问次数 
	private String sizeTableId;// string  尺码表id extendInfo=1 时有效 
	private String createTime;// date  发布时间 yyyy-MM-dd HH:mm:ss 
	private String lastModifyTime;// date  最近修改时间 yyyy-MM-dd HH:mm:ss 
	private String lastToSaleTime;// date  最近上架时间 yyyy-MM-dd HH:mm:ss 
	private String lastToStoreTime;// date  最近下架时间 yyyy-MM-dd HH:mm:ss 
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateDesc() {
		return stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}
	public String getItemProperty() {
		return itemProperty;
	}
	public void setItemProperty(String itemProperty) {
		this.itemProperty = itemProperty;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
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
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	public String getAttr2() {
		return attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public String getCustomAttr() {
		return customAttr;
	}
	public void setCustomAttr(String customAttr) {
		this.customAttr = customAttr;
	}
	public String getSellType() {
		return sellType;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getQqvipItem() {
		return qqvipItem;
	}
	public void setQqvipItem(String qqvipItem) {
		this.qqvipItem = qqvipItem;
	}
	public String getQqvipDiscount() {
		return qqvipDiscount;
	}
	public void setQqvipDiscount(String qqvipDiscount) {
		this.qqvipDiscount = qqvipDiscount;
	}
	public String getStockCount() {
		return stockCount;
	}
	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerPayFreight() {
		return sellerPayFreight;
	}
	public void setSellerPayFreight(String sellerPayFreight) {
		this.sellerPayFreight = sellerPayFreight;
	}
	public String getFreightId() {
		return freightId;
	}
	public void setFreightId(String freightId) {
		this.freightId = freightId;
	}
	public String getCodId() {
		return codId;
	}
	public void setCodId(String codId) {
		this.codId = codId;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getMailPrice() {
		return mailPrice;
	}
	public void setMailPrice(String mailPrice) {
		this.mailPrice = mailPrice;
	}
	public String getExpressPrice() {
		return expressPrice;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getRecommendItem() {
		return recommendItem;
	}
	public void setRecommendItem(String recommendItem) {
		this.recommendItem = recommendItem;
	}
	public String getWindowItem() {
		return windowItem;
	}
	public void setWindowItem(String windowItem) {
		this.windowItem = windowItem;
	}
	public String getInvoiceItem() {
		return invoiceItem;
	}
	public void setInvoiceItem(String invoiceItem) {
		this.invoiceItem = invoiceItem;
	}
	public String getGuaranteeCompensation() {
		return guaranteeCompensation;
	}
	public void setGuaranteeCompensation(String guaranteeCompensation) {
		this.guaranteeCompensation = guaranteeCompensation;
	}
	public String getGuarantee7Days() {
		return guarantee7Days;
	}
	public void setGuarantee7Days(String guarantee7Days) {
		this.guarantee7Days = guarantee7Days;
	}
	public String getGuarantee14Days() {
		return guarantee14Days;
	}
	public void setGuarantee14Days(String guarantee14Days) {
		this.guarantee14Days = guarantee14Days;
	}
	public String getGuaranteeRepair() {
		return guaranteeRepair;
	}
	public void setGuaranteeRepair(String guaranteeRepair) {
		this.guaranteeRepair = guaranteeRepair;
	}
	public String getSupportTenpay() {
		return supportTenpay;
	}
	public void setSupportTenpay(String supportTenpay) {
		this.supportTenpay = supportTenpay;
	}
	public String getBuyLimit() {
		return buyLimit;
	}
	public void setBuyLimit(String buyLimit) {
		this.buyLimit = buyLimit;
	}
	public String getValidDuration() {
		return validDuration;
	}
	public void setValidDuration(String validDuration) {
		this.validDuration = validDuration;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getReloadCount() {
		return reloadCount;
	}
	public void setReloadCount(String reloadCount) {
		this.reloadCount = reloadCount;
	}
	public String getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(String visitCount) {
		this.visitCount = visitCount;
	}
	public String getSizeTableId() {
		return sizeTableId;
	}
	public void setSizeTableId(String sizeTableId) {
		this.sizeTableId = sizeTableId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getLastToSaleTime() {
		return lastToSaleTime;
	}
	public void setLastToSaleTime(String lastToSaleTime) {
		this.lastToSaleTime = lastToSaleTime;
	}
	public String getLastToStoreTime() {
		return lastToStoreTime;
	}
	public void setLastToStoreTime(String lastToStoreTime) {
		this.lastToStoreTime = lastToStoreTime;
	}
	
}
