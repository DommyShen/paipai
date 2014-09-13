package com.sbkj.paipai.api.request.deal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.GetPhoneDealListResponse;
import com.sbkj.paipai.api.utils.DateUtils;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于搜索卖家在手机拍拍侧产生的订单列表。(本接口查询订单的条件，所有设置的查询条件是AND的关系。
 * @author DOmmy
 * create:2014-08-08
 */
public class GetPhoneDealListRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetPhoneDealListResponse>{

	/**查询方式;1: 只查deal，不关联查对应的商品;2: 关联查对应的商品信息 */
	private Long dealFormat;
	/**查询类型 256：货到付款 255：在线支付 */
	private Long payType;
	/**订单ID,单个或多个 */
	private String dealIds;
	/**订单产生的时间开始 */
	private Date startTime;
	/**订单产生的时间结束 */
	private Date endTime;
	/**订单子状态:1：待买家确认2：待卖家确认3：待卖家发货6：待确认收货7：交易成功8：买家拒收 9：交易关闭 */
	private Long dealSubState;
	/**商品编码 */
	private String itemCode;
	/**页数索引，从0开始 */
	private Long pageIndex;
	/**页大小 每页返回的订单记录数，不要超过30。默认为20 */
	private Long pageSize;
	
	public Long getDealFormat() {
		return dealFormat;
	}

	public void setDealFormat(Long dealFormat) {
		this.dealFormat = dealFormat;
	}

	public Long getPayType() {
		return payType;
	}

	public void setPayType(Long payType) {
		this.payType = payType;
	}

	public String getDealIds() {
		return dealIds;
	}

	public void setDealIds(String dealIds) {
		this.dealIds = dealIds;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getDealSubState() {
		return dealSubState;
	}

	public void setDealSubState(Long dealSubState) {
		this.dealSubState = dealSubState;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
		return "/deal/getPhoneDealList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealFormat", String.valueOf(dealFormat));
		params.put("payType", String.valueOf(payType));
		params.put("dealIds", dealIds);
		params.put("startTime", DateUtils.getFormatTime(startTime));
		params.put("endTime", DateUtils.getFormatTime(endTime));
		params.put("dealSubState", String.valueOf(dealSubState));
		params.put("itemCode", itemCode);
		params.put("pageIndex", String.valueOf(pageIndex));
		params.put("pageSize", String.valueOf(pageSize));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetPhoneDealListResponse> getResponseClass() {
		return GetPhoneDealListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
