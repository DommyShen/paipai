package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.PcDealInfo;

/**
 * 本接口主要用于搜索卖家在拍拍网销售的订单列表。(本接口查询订单的条件，所有设置的查询条件是AND的关系。)
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSearchDealListResponse extends PaipaiResponse{

	private static final long serialVersionUID = 7051282610066803139L;
	
	private Long pageIndex;// number  当前是第几页 
	private Long pageTotal;// number  总页面 
	private Long countTotal;// number  满足查询条件的记录总数 
	private List<PcDealInfo> dealList;//订单列表 
	
	public Long getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(Long pageTotal) {
		this.pageTotal = pageTotal;
	}
	public Long getCountTotal() {
		return countTotal;
	}
	public void setCountTotal(Long countTotal) {
		this.countTotal = countTotal;
	}
	public List<PcDealInfo> getDealList() {
		return dealList;
	}
	public void setDealList(List<PcDealInfo> dealList) {
		this.dealList = dealList;
	}
	
}
