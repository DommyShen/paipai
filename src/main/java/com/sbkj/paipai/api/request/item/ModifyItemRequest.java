package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.ModifyItemResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于编辑商品的各个属性,如果不需要编辑某个属性,则无需编辑的属性不需要传值。 对于修改商品详情、修改商品价格、修改商品库存，
 * 请采用单独修改商品详情、修改商品库存和价格的接口 参考： 单独修改商品详情： http://pop.paipai.com/bin/view/Main/modifyItemDetailInfo 
 * 单独修改商品库存或价格： http://pop.paipai.com/bin/view/Main/modifyItemStock
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemRequest extends PaipaiBaseRequest
				implements PaipaiRequest<ModifyItemResponse>{
	
	private String itemCode;
	private String itemLocalCode;
	private String itemName;
	private Long cityId;
	private Long provinceId;
	private Long countryId;
	private String attr;
	private String customAttr;
	private String attr2;
	private Long categoryId;
	private Long classId;
	private Long themeId;
	private Long validDuration;
	private Long autoReload;
	private Long buyLimit;
	private Long sellerPayFreight;
	private Long freightId;
	private Long codId;
	private Long mailPrice;
	private Long expressPrice;
	private Long emsPrice;
	private String productCode;
	private Long sendType;
	private Long secondHandItem;
	private Long warrantyItem;
	private Long invoiceItem;
	private Long guaranteeCompensation;
	private Long guarantee7Days;
	private Long guarantee14Days;
	private Long marketPrice;
	private Long qqVipDiscount;
	private Long windowItem;
	private String stockInfo;
	private String stockJsonList;
	private Long stockPrice;
	private Long stockCount;
	private Long sizeTableId;
	private String relatedItems;
	private Long redPacketSupport;
	private Long freeReturn;
	private Long quick;
	private Long preSale;
	
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

	public Long getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Long buyLimit) {
		this.buyLimit = buyLimit;
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

	public Long getSendType() {
		return sendType;
	}

	public void setSendType(Long sendType) {
		this.sendType = sendType;
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

	public Long getQqVipDiscount() {
		return qqVipDiscount;
	}

	public void setQqVipDiscount(Long qqVipDiscount) {
		this.qqVipDiscount = qqVipDiscount;
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

	public Long getRedPacketSupport() {
		return redPacketSupport;
	}

	public void setRedPacketSupport(Long redPacketSupport) {
		this.redPacketSupport = redPacketSupport;
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

	public Long getPreSale() {
		return preSale;
	}

	public void setPreSale(Long preSale) {
		this.preSale = preSale;
	}

	public String getApiMethodName() {
		return "/item/modifyItem.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		if(itemCode != null){
			params.put("itemCode", itemCode);
		}
		if(itemLocalCode != null){
			params.put("itemLocalCode", itemLocalCode);
		}
		if(itemName != null){
			params.put("itemName", itemName);
		}
		if(cityId != null){
			params.put("cityId", String.valueOf(cityId));
		}
		if(provinceId != null){
			params.put("provinceId", String.valueOf(provinceId));
		}
		if(countryId != null){
			params.put("countryId", String.valueOf(countryId));
		}
		if(attr != null){
			params.put("attr", attr);
		}
		if(customAttr != null){
			params.put("customAttr", customAttr);
		}
		if(attr2 != null){
			params.put("attr2", attr2);
		}
		if(categoryId != null){
			params.put("categoryId", String.valueOf(categoryId));
		}
		if(classId != null){
			params.put("classId", String.valueOf(classId));
		}
		if(themeId != null){
			params.put("themeId", String.valueOf(themeId));
		}
		if(validDuration != null){
			params.put("validDuration", String.valueOf(validDuration));
		}
		if(autoReload != null){
			params.put("autoReload", String.valueOf(autoReload));
		}
		if(buyLimit != null){
			params.put("buyLimit", String.valueOf(buyLimit));
		}
		if(sellerPayFreight != null){
			params.put("sellerPayFreight", String.valueOf(sellerPayFreight));
		}
		if(freightId != null){
			params.put("freightId", String.valueOf(freightId));
		}
		if(codId != null){
			params.put("codId", String.valueOf(codId));
		}
		if(mailPrice != null){
			params.put("mailPrice", String.valueOf(mailPrice));
		}
		if(expressPrice != null){
			params.put("expressPrice", String.valueOf(expressPrice));
		}
		if(emsPrice != null){
			params.put("emsPrice", String.valueOf(emsPrice));
		}
		if(productCode != null){
			params.put("productCode", productCode);
		}
		if(sendType != null){
			params.put("sendType", String.valueOf(sendType));
		}
		if(secondHandItem != null){
			params.put("secondHandItem", String.valueOf(secondHandItem));
		}
		if(warrantyItem != null){
			params.put("warrantyItem", String.valueOf(warrantyItem));
		}
		if(invoiceItem != null){
			params.put("invoiceItem", String.valueOf(invoiceItem));
		}
		if(guaranteeCompensation != null){
			params.put("guaranteeCompensation", String.valueOf(guaranteeCompensation));
		}
		if(guarantee7Days != null){
			params.put("guarantee7Days", String.valueOf(guarantee7Days));
		}
		if(guarantee14Days != null){
			params.put("guarantee14Days", String.valueOf(guarantee14Days));
		}
		if(marketPrice != null){
			params.put("marketPrice", String.valueOf(marketPrice));
		}
		if(qqVipDiscount != null){
			params.put("qqVipDiscount", String.valueOf(qqVipDiscount));
		}
		if(windowItem != null){
			params.put("windowItem", String.valueOf(windowItem));
		}
		if(stockInfo != null){
			params.put("stockInfo", stockInfo);
		}
		if(stockJsonList != null){
			params.put("stockJsonList", stockJsonList);
		}
		if(stockPrice != null){
			params.put("stockPrice", String.valueOf(stockPrice));
		}
		if(stockCount != null){
			params.put("stockCount", String.valueOf(stockCount));
		}
		if(sizeTableId != null){
			params.put("sizeTableId", String.valueOf(sizeTableId));
		}
		if(relatedItems != null){
			params.put("relatedItems", relatedItems);
		}
		if(redPacketSupport != null){
			params.put("redPacketSupport", String.valueOf(redPacketSupport));
		}
		if(freeReturn != null){
			params.put("freeReturn", String.valueOf(freeReturn));
		}
		if(quick != null){
			params.put("quick", String.valueOf(quick));
		}
		if(preSale != null){
			params.put("preSale", String.valueOf(preSale));
		}
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifyItemResponse> getResponseClass() {
		return ModifyItemResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
