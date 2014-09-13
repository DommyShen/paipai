package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.Stock;

/**
 *  批量新增商品库存信息 
 * @author DOmmy
 * create:2014-08-08
 */
public class AddItemStockResponse extends PaipaiResponse{

	private static final long serialVersionUID = -8780659668707449165L;
	
	private List<Stock> succList;

	public List<Stock> getSuccList() {
		return succList;
	}

	public void setSuccList(List<Stock> succList) {
		this.succList = succList;
	}
	
}
