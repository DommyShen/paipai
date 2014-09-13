package com.sbkj.paipai.api.request.deal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.GetDealRefundInfoListResponse;
import com.sbkj.paipai.api.utils.DateUtils;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于搜索退款单信息列表
 * @author DOmmy
 * create:2014-08-08
 */
public class GetDealRefundInfoListRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetDealRefundInfoListResponse>{
	/**页码 */
	private Long pageIndex;
	/**每页的记录数 */
	private Long pageSize;
	/**卖家或者买家QQ号 */
	private String userUin;
	/**0（默认）：卖家；1：买家 */
	private Integer userRole;
	/**时间类型:CREATE=订单的创建时间，UPDATE=订单的最后修改时间 */
	private String timeType;
	/**起始时间，格式：yyyy-MM-dd HH:mm:ss，必须设置了参数timeType的前提下，该值才有效 */
	private Date timeBegin;
	/**结束时间，格式：yyyy-MM-dd HH:mm:ss，必须设置了参数timeType的前提下，该值才有效 */
	private Date timeEnd;
	
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

	public String getUserUin() {
		return userUin;
	}

	public void setUserUin(String userUin) {
		this.userUin = userUin;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public Date getTimeBegin() {
		return timeBegin;
	}

	public void setTimeBegin(Date timeBegin) {
		this.timeBegin = timeBegin;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getApiMethodName() {
		return "/deal/getDealRefundInfoList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("pageIndex", String.valueOf(pageIndex));
		params.put("pageSize", String.valueOf(pageSize));
		params.put("userUin", String.valueOf(userUin));
		params.put("userRole", String.valueOf(userRole));
		params.put("timeType", timeType);
		params.put("timeBegin", DateUtils.getFormatTime(timeBegin));
		params.put("timeEnd", DateUtils.getFormatTime(timeEnd));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		return params;
	}

	public Class<GetDealRefundInfoListResponse> getResponseClass() {
		return GetDealRefundInfoListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
