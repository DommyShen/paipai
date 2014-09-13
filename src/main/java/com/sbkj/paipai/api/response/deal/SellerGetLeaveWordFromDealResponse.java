package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.LeaveWords;

/**
 * 通过调用本接口查询订单中的买卖家留言
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerGetLeaveWordFromDealResponse extends PaipaiResponse{

	private static final long serialVersionUID = -4795066800844018974L;
	/**每页的记录数 */
	private Long pageSize;
	/**当前第几页 */
	private Long pageIndex;
	/** 订单留言记录列表  */
	private List<LeaveWords> leaveWords;
	
	public Long getPageSize() {
		return pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public List<LeaveWords> getLeaveWords() {
		return leaveWords;
	}
	public void setLeaveWords(List<LeaveWords> leaveWords) {
		this.leaveWords = leaveWords;
	}
	
}
