package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.Stock;

/**
 * 批量修改商品库存信息 
 * @author DOmmy
 * create:2014-08-08
 */
public class EditItemStockResponse extends PaipaiResponse{
	
	private static final long serialVersionUID = -2642620656924863357L;
	
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
