package com.sbkj.paipai.api.request.item;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.AddItemResponse;
import com.sbkj.paipai.api.utils.DateUtils;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 发布商品接口
 * @author DOmmy
 * create:2014-08-08
 */
public class AddItemRequest extends PaipaiBaseRequest
				implements PaipaiRequest<AddItemResponse>{
	/**商品名称1-60字节 */
	private String itemName;
	/**商品名称1-60字节 */
	private String sellType;
	/**商品所在城市 */
	private Long cityId;
	/**所在省份ID */
	private Long provinceId;
	/**国家 */
	private Long countryId;
	/**商品属性信息(描述商品分类，品牌，规格等的信息 */
	private String attr;
	/**自定义属性字符串 */
	private String customAttr;
	/**格式和attr基本一致 */
	private String attr2;
	/**商品所属的店铺分类id */
	private Long categoryId;
	/**商品所属的拍拍类目id */
	private Long classId;
	/**商品详情模版ID */
	private Long themeId;
	/**上架时长，单位为秒 */
	private Long validDuration;
	/**是否设置自动上架 */
	private Long autoReload;
	/**商品期望状态
“IS_FOR_SALE”：上架销售。
“IS_IN_STORE”：放入仓库。
“IS_SALE_ON_TIME”：定时上架 */
	private String itemState;
	/**定时上架时间 */
	private Date saleTime;
	/**购买限制，默认为0，表示不限制 */
	private Long buyLimit;
	/**商品详情描述内容，最大长度为 60k */
	private String detailInfo;
	/**是否卖家承担运费0：表示买家承担运费（默认）1：表示卖家承担运费 */
	private Long sellerPayFreight;
	/**运费模板编号 */
	private Long freightId;
	/**货到付款运费模板编号 */
	private Long codId;
	/**商品的发货方式 */
	private Long sendType;
	/**平邮价格 */
	private Long mailPrice;
	/**快递价格 */
	private Long expressPrice;
	/**EMS运费 */
	private Long emsPrice;
	/**商品对应的拍拍产品编码 */
	private String productCode;
	/**合作商家的私有商品编码 */
	private String itemLocalCode;
	/**合作商家的私有商品编码 */
	private Long secondHandItem;
	/**是否保修商品 */
	private Long warrantyItem;
	/**是否提供发票 */
	private Long invoiceItem;
	/**是否假一赔三诚信保证商品 */
	private Long guaranteeCompensation;
	/**是否7天包退诚信保证商品 */
	private Long guarantee7Days;
	/**是否14天先行赔付诚信保证商品 */
	private Long guarantee14Days;
	/**商品的市场参考价格 */
	private Long marketPrice;
	/**是否橱窗商品 */
	private Long windowItem;
	/**库存信息格式如下 */
	private String stockInfo;
	/**新库存信息格式 */
	private String stockJsonList;
	/**单库存商品的价格,如果是单库存商品的话必填 */
	private Long stockPrice;
	/**单库存商品的库存数量, */
	private Long stockCount;
	/**尺码表Id */
	private Long sizeTableId;
	/**推荐搭配商品编码，多个以‘|’号隔开 */
	private String relatedItems;
	/**是否为女装商品 */
	private Long womanItem;
	/**是否为虚拟商品 */
	private Long virtualItem;
	/**是否7天免邮包退 */
	private Long freeReturn;
	/**是否快速发货 */
	private Long quick;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSellType() {
		return sellType;
	}

	public void setSellType(String sellType) {
		this.sellType = sellType;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public String getCustomAttr() {
		return customAttr;
	}

	public void setCustomAttr(String customAttr) {
		this.customAttr = customAttr;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getThemeId() {
		return themeId;
	}

	public void setThemeId(Long themeId) {
		this.themeId = themeId;
	}

	public Long getValidDuration() {
		return validDuration;
	}

	public void setValidDuration(Long validDuration) {
		this.validDuration = validDuration;
	}

	public Long getAutoReload() {
		return autoReload;
	}

	public void setAutoReload(Long autoReload) {
		this.autoReload = autoReload;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public Date getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}

	public Long getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Long buyLimit) {
		this.buyLimit = buyLimit;
	}

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public Long getSellerPayFreight() {
		return sellerPayFreight;
	}

	public void setSellerPayFreight(Long sellerPayFreight) {
		this.sellerPayFreight = sellerPayFreight;
	}

	public Long getFreightId() {
		return freightId;
	}

	public void setFreightId(Long freightId) {
		this.freightId = freightId;
	}

	public Long getCodId() {
		return codId;
	}

	public void setCodId(Long codId) {
		this.codId = codId;
	}

	public Long getSendType() {
		return sendType;
	}

	public void setSendType(Long sendType) {
		this.sendType = sendType;
	}

	public Long getMailPrice() {
		return mailPrice;
	}

	public void setMailPrice(Long mailPrice) {
		this.mailPrice = mailPrice;
	}

	public Long getExpressPrice() {
		return expressPrice;
	}

	public void setExpressPrice(Long expressPrice) {
		this.expressPrice = expressPrice;
	}

	public Long getEmsPrice() {
		return emsPrice;
	}

	public void setEmsPrice(Long emsPrice) {
		this.emsPrice = emsPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getItemLocalCode() {
		return itemLocalCode;
	}

	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
	}

	public Long getSecondHandItem() {
		return secondHandItem;
	}

	public void setSecondHandItem(Long secondHandItem) {
		this.secondHandItem = secondHandItem;
	}

	public Long getWarrantyItem() {
		return warrantyItem;
	}

	public void setWarrantyItem(Long warrantyItem) {
		this.warrantyItem = warrantyItem;
	}

	public Long getInvoiceItem() {
		return invoiceItem;
	}

	public void setInvoiceItem(Long invoiceItem) {
		this.invoiceItem = invoiceItem;
	}

	public Long getGuaranteeCompensation() {
		return guaranteeCompensation;
	}

	public void setGuaranteeCompensation(Long guaranteeCompensation) {
		this.guaranteeCompensation = guaranteeCompensation;
	}

	public Long getGuarantee7Days() {
		return guarantee7Days;
	}

	public void setGuarantee7Days(Long guarantee7Days) {
		this.guarantee7Days = guarantee7Days;
	}

	public Long getGuarantee14Days() {
		return guarantee14Days;
	}

	public void setGuarantee14Days(Long guarantee14Days) {
		this.guarantee14Days = guarantee14Days;
	}

	public Long getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Long marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Long getWindowItem() {
		return windowItem;
	}

	public void setWindowItem(Long windowItem) {
		this.windowItem = windowItem;
	}

	public String getStockInfo() {
		return stockInfo;
	}

	public void setStockInfo(String stockInfo) {
		this.stockInfo = stockInfo;
	}

	public String getStockJsonList() {
		return stockJsonList;
	}

	public void setStockJsonList(String stockJsonList) {
		this.stockJsonList = stockJsonList;
	}

	public Long getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Long stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Long getStockCount() {
		return stockCount;
	}

	public void setStockCount(Long stockCount) {
		this.stockCount = stockCount;
	}

	public Long getSizeTableId() {
		return sizeTableId;
	}

	public void setSizeTableId(Long sizeTableId) {
		this.sizeTableId = sizeTableId;
	}

	public String getRelatedItems() {
		return relatedItems;
	}

	public void setRelatedItems(String relatedItems) {
		this.relatedItems = relatedItems;
	}

	public Long getWomanItem() {
		return womanItem;
	}

	public void setWomanItem(Long womanItem) {
		this.womanItem = womanItem;
	}

	public Long getVirtualItem() {
		return virtualItem;
	}

	public void setVirtualItem(Long virtualItem) {
		this.virtualItem = virtualItem;
	}

	public Long getFreeReturn() {
		return freeReturn;
	}

	public void setFreeReturn(Long freeReturn) {
		this.freeReturn = freeReturn;
	}

	public Long getQuick() {
		return quick;
	}

	public void setQuick(Long quick) {
		this.quick = quick;
	}

	public String getApiMethodName() {
		return "/item/addItem.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemName", itemName);
		params.put("sellType", sellType);
		params.put("cityId", String.valueOf(cityId));
		params.put("provinceId", String.valueOf(provinceId));
		params.put("countryId", String.valueOf(countryId));
		params.put("attr", attr);
		params.put("customAttr", customAttr);
		params.put("attr2", attr2);
		params.put("categoryId", String.valueOf(categoryId));
		params.put("classId", String.valueOf(classId));
		params.put("themeId", String.valueOf(themeId));
		params.put("validDuration", String.valueOf(validDuration));
		params.put("autoReload", String.valueOf(autoReload));
		params.put("itemState", itemState);
		params.put("saleTime", DateUtils.getFormatTime(saleTime));
		params.put("buyLimit", String.valueOf(buyLimit));
		params.put("detailInfo", detailInfo);
		params.put("sellerPayFreight", String.valueOf(sellerPayFreight));
		params.put("freightId", String.valueOf(freightId));
		params.put("codId", String.valueOf(codId));
		params.put("sendType", String.valueOf(sendType));
		params.put("mailPrice", String.valueOf(mailPrice));
		params.put("expressPrice", String.valueOf(expressPrice));
		params.put("emsPrice", String.valueOf(emsPrice));
		params.put("productCode", productCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("secondHandItem", String.valueOf(secondHandItem));
		params.put("warrantyItem", String.valueOf(warrantyItem));
		params.put("invoiceItem", String.valueOf(invoiceItem));
		params.put("guaranteeCompensation", String.valueOf(guaranteeCompensation));
		params.put("guarantee7Days", String.valueOf(guarantee7Days));
		params.put("guarantee14Days", String.valueOf(guarantee14Days));
		params.put("marketPrice", String.valueOf(marketPrice));
		params.put("windowItem", String.valueOf(windowItem));
		params.put("stockInfo", stockInfo);
		params.put("stockJsonList", stockJsonList);
		params.put("stockPrice", String.valueOf(stockPrice));
		params.put("stockCount", String.valueOf(stockCount));
		params.put("sizeTableId", String.valueOf(sizeTableId));
		params.put("relatedItems", relatedItems);
		params.put("womanItem", String.valueOf(womanItem));
		params.put("virtualItem", String.valueOf(virtualItem));
		params.put("freeReturn", String.valueOf(freeReturn));
		params.put("quick", String.valueOf(quick));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<AddItemResponse> getResponseClass() {
		return AddItemResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
