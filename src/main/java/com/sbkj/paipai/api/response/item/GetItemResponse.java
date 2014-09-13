package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.ExtendInfo;
import com.sbkj.paipai.api.domain.item.ParsedAttr;
import com.sbkj.paipai.api.domain.item.Stock;

/**
 * 根据商品编码查询单个商品信息的接口
 * @author DOmmy
 * create:2014-08-08
 */
public class GetItemResponse extends PaipaiResponse{

	private static final long serialVersionUID = 5832174735939537282L;
	private String itemCode;// string  商品编码，商品在拍拍上标识的唯一编码 
	private String itemLocalCode;// string  商家对商品的编码，商家自行保证该编码的唯一性，
	private String itemName;// string  商品名称 
	private String itemState;// string  商品状态,所有状态代码及含义请看本文档页后说明 
	private String stateDesc;// string  商品状态的说明 
	private String relatedItems;// string  推荐搭配商品编码，多个以‘|’号隔开 
	private String itemProperty;// string  商品属性 
	private String properties;// string  商品的属性组合串
	private String stockCount;// number  商品库存总数量 
	private String itemPrice;// number  商品销售单价 
	private String marketPrice;// number  商品的市场价格 
	private String expressPrice;// number  商品的快递费用 
	private String emsPrice;// number  商品的EMS费用 
	private String mailPrice;// number  商品的邮寄费用 
	private String categoryId;// number  商品的种类id（店铺自定义分类） 
	private String classId;// number  商品的类目id 
	private String cityId;// number  城市id 
	private String provinceId;// number  省份id 
	private String countryId;// number  国家id 
	private String freeReturn;// number  是否7天免邮包退：1=是、0=否， 默认为0 
	private String attr;// string  原有商品的属性串 
	private String attr2;// string  新格式商品的属性串,如：version=1,1:1|2:2|a:a|b:1,2,4^a:你好 
	private String customAttr;// string  商品的商家自定义属性 
	private List<ParsedAttr> parsedAttrList;// list  商品的商家自定义属性说明列表 
	private List<ExtendInfo> extendList;// list  商品扩展属性列表 
	
	private String buyLimit;// number  购买时的数量限制 
	private String detailInfo;// string  商品的详情内容 
	private String freightId;// number  商品的运费模板id 
	private String guarantee14Days;// number  是否14天包换 1是 0否 
	private String guarantee7Days;// number  是否7天包退 1是 0否 
	private String guaranteeCompensation;// number  是否假一赔三 1是 0否 
	private String guaranteeRepair;// number  是否提供保修服务 1是 0否 
	private String invoiceItem;// number  是否提供发票 1是 0否 
	private String createTime;// time  发布时间 
	private String lastModifyTime;// time  最后修改时间 
	private String lastToSaleTime;// time  上次上架时间 
	private String lastToStoreTime;// time  上次下架时间 
	private String payType;// string  支持的付款方式 (发货方式)，以“,”隔开
	private String picLink;// string  商品图片连接 
	private String qqvipDiscount;// number  QQ会员折扣 万分之几 
	private String qqvipItem;// number  是否QQ会员店商品 
	private String recommendItem;// number  是否推荐商品 1是 0否 
	private String regionInfo;// string  地区信息 
	private String reloadCount;// number  重上架次数 
	private String secondHandItem;// number  是否为二手商品 1是 0否 
	private String sellerPayFreight;// number  卖家或者买家承担运费的情况
	private String sellerName;// string  店铺名称 
	private String sellerUin;// number  卖家QQ号 
	private String theme;// string  商品详情页面主题 
	private String themeId;// number  商品详情模版ID 
	private String validDuration;// time  商品上架后卖N天后下架（单位以秒计，目前系统N只支持7天和14天两个值） 
	private String visitCount;// number  访问的次数 
	private String soldCount;// number  近期销售的商品数量 
	private String soldTotalCount;// number  销售的商品数量 
	private String soldTimes;// number  近期销售的订单次数 
	private String soldTotalTimes;// number  销售订单的总次数 
	private String buyNum;// number  近期购买商品数量 
	private String totalBuyNum;// number  购买商品的总数量 
	private String buyCount;// number  近期下单的订单次数 
	private String totalBuyCount;// number  下单的订单总次数 
	private String weight;// number  商品的重量 
	private String windowItem;// number  是否为橱窗商品 1是 0否 
	private String sizeTableId;// number  商品的尺码表Id 
	private List<Stock> stockList;// list  商品的库存列表 
	
	private String stockJsonList;// string 标准json数组 新库存信息,内容和stockList一致.格式如下:[{字段名:字段值,...},{字段名:字段值,...}]。字段定义请参考：商品库存信息字段说明 
	private String icsonDesc;// string  易迅商品详情内容 
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
	public String getRelatedItems() {
		return relatedItems;
	}
	public void setRelatedItems(String relatedItems) {
		this.relatedItems = relatedItems;
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
	public String getStockCount() {
		return stockCount;
	}
	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getExpressPrice() {
		return expressPrice;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public String getEmsPrice() {
		return emsPrice;
	}
	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	public String getMailPrice() {
		return mailPrice;
	}
	public void setMailPrice(String mailPrice) {
		this.mailPrice = mailPrice;
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
	public String getFreeReturn() {
		return freeReturn;
	}
	public void setFreeReturn(String freeReturn) {
		this.freeReturn = freeReturn;
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
	public List<ParsedAttr> getParsedAttrList() {
		return parsedAttrList;
	}
	public void setParsedAttrList(List<ParsedAttr> parsedAttrList) {
		this.parsedAttrList = parsedAttrList;
	}
	public List<ExtendInfo> getExtendList() {
		return extendList;
	}
	public void setExtendList(List<ExtendInfo> extendList) {
		this.extendList = extendList;
	}
	public String getBuyLimit() {
		return buyLimit;
	}
	public void setBuyLimit(String buyLimit) {
		this.buyLimit = buyLimit;
	}
	public String getDetailInfo() {
		return detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public String getFreightId() {
		return freightId;
	}
	public void setFreightId(String freightId) {
		this.freightId = freightId;
	}
	public String getGuarantee14Days() {
		return guarantee14Days;
	}
	public void setGuarantee14Days(String guarantee14Days) {
		this.guarantee14Days = guarantee14Days;
	}
	public String getGuarantee7Days() {
		return guarantee7Days;
	}
	public void setGuarantee7Days(String guarantee7Days) {
		this.guarantee7Days = guarantee7Days;
	}
	public String getGuaranteeCompensation() {
		return guaranteeCompensation;
	}
	public void setGuaranteeCompensation(String guaranteeCompensation) {
		this.guaranteeCompensation = guaranteeCompensation;
	}
	public String getGuaranteeRepair() {
		return guaranteeRepair;
	}
	public void setGuaranteeRepair(String guaranteeRepair) {
		this.guaranteeRepair = guaranteeRepair;
	}
	public String getInvoiceItem() {
		return invoiceItem;
	}
	public void setInvoiceItem(String invoiceItem) {
		this.invoiceItem = invoiceItem;
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
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPicLink() {
		return picLink;
	}
	public void setPicLink(String picLink) {
		this.picLink = picLink;
	}
	public String getQqvipDiscount() {
		return qqvipDiscount;
	}
	public void setQqvipDiscount(String qqvipDiscount) {
		this.qqvipDiscount = qqvipDiscount;
	}
	public String getQqvipItem() {
		return qqvipItem;
	}
	public void setQqvipItem(String qqvipItem) {
		this.qqvipItem = qqvipItem;
	}
	public String getRecommendItem() {
		return recommendItem;
	}
	public void setRecommendItem(String recommendItem) {
		this.recommendItem = recommendItem;
	}
	public String getRegionInfo() {
		return regionInfo;
	}
	public void setRegionInfo(String regionInfo) {
		this.regionInfo = regionInfo;
	}
	public String getReloadCount() {
		return reloadCount;
	}
	public void setReloadCount(String reloadCount) {
		this.reloadCount = reloadCount;
	}
	public String getSecondHandItem() {
		return secondHandItem;
	}
	public void setSecondHandItem(String secondHandItem) {
		this.secondHandItem = secondHandItem;
	}
	public String getSellerPayFreight() {
		return sellerPayFreight;
	}
	public void setSellerPayFreight(String sellerPayFreight) {
		this.sellerPayFreight = sellerPayFreight;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	public String getValidDuration() {
		return validDuration;
	}
	public void setValidDuration(String validDuration) {
		this.validDuration = validDuration;
	}
	public String getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(String visitCount) {
		this.visitCount = visitCount;
	}
	public String getSoldCount() {
		return soldCount;
	}
	public void setSoldCount(String soldCount) {
		this.soldCount = soldCount;
	}
	public String getSoldTotalCount() {
		return soldTotalCount;
	}
	public void setSoldTotalCount(String soldTotalCount) {
		this.soldTotalCount = soldTotalCount;
	}
	public String getSoldTimes() {
		return soldTimes;
	}
	public void setSoldTimes(String soldTimes) {
		this.soldTimes = soldTimes;
	}
	public String getSoldTotalTimes() {
		return soldTotalTimes;
	}
	public void setSoldTotalTimes(String soldTotalTimes) {
		this.soldTotalTimes = soldTotalTimes;
	}
	public String getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(String buyNum) {
		this.buyNum = buyNum;
	}
	public String getTotalBuyNum() {
		return totalBuyNum;
	}
	public void setTotalBuyNum(String totalBuyNum) {
		this.totalBuyNum = totalBuyNum;
	}
	public String getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(String buyCount) {
		this.buyCount = buyCount;
	}
	public String getTotalBuyCount() {
		return totalBuyCount;
	}
	public void setTotalBuyCount(String totalBuyCount) {
		this.totalBuyCount = totalBuyCount;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWindowItem() {
		return windowItem;
	}
	public void setWindowItem(String windowItem) {
		this.windowItem = windowItem;
	}
	public String getSizeTableId() {
		return sizeTableId;
	}
	public void setSizeTableId(String sizeTableId) {
		this.sizeTableId = sizeTableId;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	public String getStockJsonList() {
		return stockJsonList;
	}
	public void setStockJsonList(String stockJsonList) {
		this.stockJsonList = stockJsonList;
	}
	public String getIcsonDesc() {
		return icsonDesc;
	}
	public void setIcsonDesc(String icsonDesc) {
		this.icsonDesc = icsonDesc;
	}

}
