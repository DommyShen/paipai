package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.Stock;

/**
 * 批量删除商品库存 
 * @author DOmmy
 * create:2014-08-08
 */
public class DeleteItemStockResponse extends PaipaiResponse{

	private static final long serialVersionUID = 6199544150874136610L;
	
	private List<Stock> succList;
	private List<Stock> failList;
	
	public List<Stock> getSuccList() {
		return succList;
	}
	public void setSuccList(List<Stock> succList) {
		this.succList = succList;
	}
	public List<Stock> getFailList() {
		return failList;
	}
	public void setFailList(List<Stock> failList) {
		this.failList = failList;
	}
	
}
