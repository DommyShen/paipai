package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 本接口主要用于卖家修改某个商品的价格和库存数量（单库存商品的总数量或者多库存商品的某个具体库存的数量） 注意,今日特价商品只能修改商品描述，不能修改库存
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemStockResponse extends PaipaiResponse{

	private static final long serialVersionUID = 4372914962185278781L;
	/**商品编码 */
	private String itemCode;
	/**同步后的库存价格 */
	private Long stockPrice;
	/**同步后的库存数量 */
	private Long stockCount;
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
	
}
