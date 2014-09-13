package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.ModifyItemStockResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于卖家修改某个商品的价格和库存数量（单库存商品的总数量或者多库存商品的某个具体库存的数量） 注意,今日特价商品只能修改商品描述，不能修改库存
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemStockRequest extends PaipaiBaseRequest
				implements PaipaiRequest<ModifyItemStockResponse>{
	
	/**商品编码itemCode和itemLocalCode两者中只需要填写一个。 */
	private String itemCode;
	/**商家编码itemCode和itemLocalCode两者中只需要填写一个 */
	private String itemLocalCode;
	/**库存唯一标识sku id,由拍拍平台生成 */
	private Long skuId;
	/**合作商家的私有库存编码,如果有填写skuId,不需要填写该字段 */
	private String stockLocalCode;
	/**合作商家的私有库存编码,如果有填写skuId,不需要填写该字段 */
	private String stockAttr;
	/**合作商家的私有库存编码,如果有填写skuId,不需要填写该字段 */
	private Long stockPrice;
	/**库存数量若该库存数量不变，则不应提供本节点。 */
	private Long stockCount;
	/**库存备注 */
	private String stockRemark;
	/**是否修改库存编码，0=否；1=是 */
	private Long modifyLocalCode;
	/**需要修改的新库存编码，该字段其作用的前提是modifyLocalCode=1 */
	private String stockLocalCodeNew;
	/**需要修改的新商家编码，该字段其作用的前提是modifyLocalCode=1 */
	private String itemLocalCodeNew;
	
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

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
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

	public String getStockRemark() {
		return stockRemark;
	}

	public void setStockRemark(String stockRemark) {
		this.stockRemark = stockRemark;
	}

	public Long getModifyLocalCode() {
		return modifyLocalCode;
	}

	public void setModifyLocalCode(Long modifyLocalCode) {
		this.modifyLocalCode = modifyLocalCode;
	}

	public String getStockLocalCodeNew() {
		return stockLocalCodeNew;
	}

	public void setStockLocalCodeNew(String stockLocalCodeNew) {
		this.stockLocalCodeNew = stockLocalCodeNew;
	}

	public String getItemLocalCodeNew() {
		return itemLocalCodeNew;
	}

	public void setItemLocalCodeNew(String itemLocalCodeNew) {
		this.itemLocalCodeNew = itemLocalCodeNew;
	}

	public String getApiMethodName() {
		return "/item/modifyItemStock.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("skuId", String.valueOf(skuId));
		params.put("stockLocalCode", stockLocalCode);
		params.put("stockAttr", stockAttr);
		params.put("stockPrice", String.valueOf(stockPrice));
		params.put("stockCount", String.valueOf(stockCount));
		params.put("stockRemark", stockRemark);
		params.put("modifyLocalCode", String.valueOf(modifyLocalCode));
		params.put("stockLocalCodeNew", stockLocalCodeNew);
		params.put("itemLocalCodeNew", itemLocalCodeNew);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifyItemStockResponse> getResponseClass() {
		return ModifyItemStockResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
