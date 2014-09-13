package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerGetLeaveWordFromDealResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 通过调用本接口查询订单中的买卖家留言
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerGetLeaveWordFromDealRequest extends PaipaiBaseRequest
						implements PaipaiRequest<SellerGetLeaveWordFromDealResponse>{
	
	/**订单编码  */
	private String dealCode;
	/**第几页开始查询 */
	private Long pageIndex;
	/**每页的数量 */
	private Long pageSize;
	
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
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

	public String getApiMethodName() {
		return "/deal/sellerGetLeaveWordFromDeal.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("pageIndex", String.valueOf(pageIndex));
		params.put("pageSize", String.valueOf(pageSize));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerGetLeaveWordFromDealResponse> getResponseClass() {
		return SellerGetLeaveWordFromDealResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
