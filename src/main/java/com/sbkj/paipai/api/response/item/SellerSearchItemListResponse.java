package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.item.Item;

/**
 * 根据卖家指定的条件查询商品信息列表
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSearchItemListResponse extends PaipaiResponse{

	private static final long serialVersionUID = -3534272278454547129L;
	
	private Long sellerUin;// number [10001,2000000000] 卖家QQ号 
	private Long countTotal;// number  记录总数 
	private Long pageIndex;// number  第几页 
	private Long pageSize;// number  每页记录条数 
	private Long pageTotal;// number  总页数 
	private List<Item> itemList;// list  商品列表 
	
	public Long getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(Long sellerUin) {
		this.sellerUin = sellerUin;
	}
	public Long getCountTotal() {
		return countTotal;
	}
	public void setCountTotal(Long countTotal) {
		this.countTotal = countTotal;
	}
	public Long getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageSize() {
		return pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(Long pageTotal) {
		this.pageTotal = pageTotal;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
}
