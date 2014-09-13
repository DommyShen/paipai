package com.sbkj.paipai.api.request.deal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerSearchDealListResponse;
import com.sbkj.paipai.api.utils.DateUtils;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 本接口主要用于搜索卖家在拍拍网销售的订单列表。(本接口查询订单的条件，所有设置的查询条件是AND的关系。)
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSearchDealListRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerSearchDealListResponse>{
	/**查询的是否为历史订单，0=否，1=是如果需要查询下单时间超过三个月的订单，则是查找历史订单了 */
	private Long historyDeal;
	/**时间类型 
	空字符串（默认）:表示不使用时间筛选项 
	CREATE:表示timeBegin和timeEnd是下单时间 
	PAY:表示timeBegin和timeEnd是付款时间
	UPDATE:表示timeBegin和timeEnd是订单最后更新时间(建议不使用这种过滤条件，尽量使用Create的下单时间) 
	如果timeType的类型为CREATE、UPDATE时，timeBegin和timeEnd字段必须赋值
	指定timeType时可同时用对应时间字段作为排序字段，排序方法见参数“orderDesc”说明；不指定timeType时没有排序。 */
	private String timeType;
	/**起始时间 
前提是timeType必须赋值， 
如果字段timeType的类型为CREATE、UPDATE,PAY时，该字段必须赋值 */
	private Date timeBegin;
	/**结束时间 
前提是timeType必须赋值，
如果字段timeType的类型为CREATE、UPDATE,PAY时，该字段必须赋值 */
	private Date timeEnd;
	/**订单状态 */
	private String dealState;
	/**1-拍拍订单,8-网购入易迅订单,默认是1,只拉拍拍订单 */
	private Long dealType;
	/**商品编码 */
	private String itemCode;
	/**商品名称关键字
目标订单的商品标题，表示查找和该商品标题相关的订单，
例如如果设置为“森林”，那么商品标题中带有“森林”词的订单列表就会被查找出来 */
	private String itemNameKey;
	/**是否列出商品
0（默认）：不列出订单相关商品
非0：列出订单相关商品（速度比较慢） */
	private Long listItem;
	/**订单编码 
可查询单个订单的信息 */
	private String dealCode;
	/**是否逆序排列
非0（默认）：逆序排列
0：顺序排列 */
	private Long orderDesc;
	/**页数索引，从1开始 */
	private Long pageIndex;
	/**页大小 
每页返回的订单记录数，不要超过20。默认为10 */
	private Long pageSize;
	/**订单备注类型，查询标注为指定类型的订单。(默认)为空时不过滤; RED.红色 YELLOW.黄色 GREEN.绿色 BLUE.蓝色 PINK.粉红色 */
	private String dealNoteType;
	/**订单的评价状态 
100=需要买家评价的
101=需要卖家评价的
102=买家已评价的
103=卖家已评价的 */
	private Long dealRateState;
	/**如果查询的是微购物的订单，则值设为：wgw_item */
	private String platform;

	public Long getHistoryDeal() {
		return historyDeal;
	}

	public void setHistoryDeal(Long historyDeal) {
		this.historyDeal = historyDeal;
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

	public String getDealState() {
		return dealState;
	}

	public void setDealState(String dealState) {
		this.dealState = dealState;
	}

	public Long getDealType() {
		return dealType;
	}

	public void setDealType(Long dealType) {
		this.dealType = dealType;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemNameKey() {
		return itemNameKey;
	}

	public void setItemNameKey(String itemNameKey) {
		this.itemNameKey = itemNameKey;
	}

	public Long getListItem() {
		return listItem;
	}

	public void setListItem(Long listItem) {
		this.listItem = listItem;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public Long getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(Long orderDesc) {
		this.orderDesc = orderDesc;
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

	public String getDealNoteType() {
		return dealNoteType;
	}

	public void setDealNoteType(String dealNoteType) {
		this.dealNoteType = dealNoteType;
	}

	public Long getDealRateState() {
		return dealRateState;
	}

	public void setDealRateState(Long dealRateState) {
		this.dealRateState = dealRateState;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getApiMethodName() {
		return "/deal/sellerSearchDealList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("historyDeal", String.valueOf(historyDeal));
		params.put("timeType", timeType);
		params.put("timeBegin", DateUtils.getFormatTime(timeBegin));
		params.put("timeEnd", DateUtils.getFormatTime(timeEnd));
		params.put("dealState", dealState);
		params.put("dealType", String.valueOf(dealType));
		params.put("itemCode", itemCode);
		params.put("itemNameKey", itemNameKey);
		params.put("listItem", String.valueOf(listItem));
		params.put("dealCode", dealCode);
		params.put("orderDesc", String.valueOf(orderDesc));
		params.put("pageIndex", String.valueOf(pageIndex));
		params.put("pageSize", String.valueOf(pageSize));
		params.put("dealNoteType", dealNoteType);
		params.put("dealRateState", String.valueOf(dealRateState));
		params.put("platform", platform);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerSearchDealListResponse> getResponseClass() {
		return SellerSearchDealListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
