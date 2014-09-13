package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.Stock;

/**
 * 发布商品接口
 * @author DOmmy
 * create:2014-08-08
 */
public class AddItemResponse extends PaipaiResponse{

	private static final long serialVersionUID = -7981130186139405286L;
	
	private String itemCode;// string  商品编码，拍拍侧返回的一个商品一个的固定编码，不可改变 
	private String itemLocalCode;// string  商品本地编码，合作商家的私有商品编码 
	private String itemState;// string  商品状态 
	private String stateDesc;// string  商品状态原因描述。主要用于商品 非在售状态时，告诉商家为什么商品不在上架销售状态。 
	private List<Stock> stockList;// list  发布成功后的库存信息 
	
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
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
}
