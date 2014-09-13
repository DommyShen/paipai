package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.PhoneDeal;

/**
 * 本接口主要用于搜索卖家在手机拍拍侧产生的订单列表。(本接口查询订单的条件，所有设置的查询条件是AND的关系。
 * @author DOmmy
 * create:2014-08-08
 */
public class GetPhoneDealListResponse extends PaipaiResponse{

	private static final long serialVersionUID = 4585574096792465428L;
	
	/**满足查询条件的记录总数 */
	private Long totalCount;
	/**订单列表*/
	private List<PhoneDeal> dealList;
	
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<PhoneDeal> getDealList() {
		return dealList;
	}
	public void setDealList(List<PhoneDeal> dealList) {
		this.dealList = dealList;
	}
	
}
