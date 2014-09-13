package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.RefundDealInfo;

/**
 * 本接口主要用于搜索退款单信息列表
 * @author DOmmy
 * craete:2014-08-08
 */
public class GetDealRefundInfoListResponse extends PaipaiResponse{

	private static final long serialVersionUID = 3789926910181276439L;
	
	private Long pageIndex;// number  当前是第几页 
	private Long pageTotal;// number  总页面 
	private Long countTotal;// number  满足查询条件的记录总数 
	private List<RefundDealInfo> dealList;// list  订单列表 
	
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
	public List<RefundDealInfo> getDealList() {
		return dealList;
	}
	public void setDealList(List<RefundDealInfo> dealList) {
		this.dealList = dealList;
	}
	
}
