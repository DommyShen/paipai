package com.sbkj.paipai.api.request.item;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.SellerSearchItemListResponse;
import com.sbkj.paipai.api.utils.DateUtils;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 根据卖家指定的条件查询商品信息列表
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSearchItemListRequest extends PaipaiBaseRequest
				implements PaipaiRequest<SellerSearchItemListResponse>{
	/**查询第几页 */
	private Long pageIndex;
	/**每页显示的记录数,不超过30 */
	private Long pageSize;
	/**商品标题 */
	private String itemName;
	/** */
	private String itemTags;
	/**店铺自定义分类，“0” 查询未分类商品 */
	private String categoryId;
	/**目标商品的第一次发布时间条件区间里的左边界值 */
	private Long itemState;
	/**目标商品的第一次发布时间条件区间里的左边界值 */
	private Date createTimeBegin;
	/**目标商品的第一次发布时间条件区间里的右边界值 */
	private Date createTimeEnd;
	/**目标商品的最后变更时间条件区间里的左边界值 */
	private Date modifyTimeBegin;
	/**目标商品的最后变更时间条件区间里的右边界值 */
	private Date modifyTimeEnd;
	/**目标商品的上架时间条件区间里的 左边界值 */
	private Date toSaleTimeBegin;
	/**目标商品的上架时间条件区间里的右边界值 */
	private Date toSaleTimeEnd;
	/**目标商品价格大于等于 单位：分 */
	private Long priceMorethan;
	/**是否需要返回商品的附属信息，0为不需要，1为需要 */
	private Long priceLessthan;
	/**是否需要返回商品的附属信息，0为不需要，1为需要 */
	private Long extendInfo;
	/**目标商品列表的排序方式 */
	private Long orderType;
	
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemTags() {
		return itemTags;
	}

	public void setItemTags(String itemTags) {
		this.itemTags = itemTags;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Long getItemState() {
		return itemState;
	}

	public void setItemState(Long itemState) {
		this.itemState = itemState;
	}

	public Date getCreateTimeBegin() {
		return createTimeBegin;
	}

	public void setCreateTimeBegin(Date createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getModifyTimeBegin() {
		return modifyTimeBegin;
	}

	public void setModifyTimeBegin(Date modifyTimeBegin) {
		this.modifyTimeBegin = modifyTimeBegin;
	}

	public Date getModifyTimeEnd() {
		return modifyTimeEnd;
	}

	public void setModifyTimeEnd(Date modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}

	public Date getToSaleTimeBegin() {
		return toSaleTimeBegin;
	}

	public void setToSaleTimeBegin(Date toSaleTimeBegin) {
		this.toSaleTimeBegin = toSaleTimeBegin;
	}

	public Date getToSaleTimeEnd() {
		return toSaleTimeEnd;
	}

	public void setToSaleTimeEnd(Date toSaleTimeEnd) {
		this.toSaleTimeEnd = toSaleTimeEnd;
	}

	public Long getPriceMorethan() {
		return priceMorethan;
	}

	public void setPriceMorethan(Long priceMorethan) {
		this.priceMorethan = priceMorethan;
	}

	public Long getPriceLessthan() {
		return priceLessthan;
	}

	public void setPriceLessthan(Long priceLessthan) {
		this.priceLessthan = priceLessthan;
	}

	public Long getExtendInfo() {
		return extendInfo;
	}

	public void setExtendInfo(Long extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getOrderType() {
		return orderType;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getApiMethodName() {
		return "/item/sellerSearchItemList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("pageIndex", String.valueOf(pageIndex));
		params.put("pageSize", String.valueOf(pageSize));
		params.put("itemName", itemName);
		params.put("itemTags", itemTags);
		params.put("categoryId", categoryId);
		params.put("itemState", String.valueOf(itemState));
		params.put("createTimeBegin", DateUtils.getFormatTime(createTimeBegin));
		params.put("createTimeEnd", DateUtils.getFormatTime(createTimeEnd));
		params.put("modifyTimeBegin", DateUtils.getFormatTime(modifyTimeBegin));
		params.put("modifyTimeEnd", DateUtils.getFormatTime(modifyTimeEnd));
		params.put("toSaleTimeBegin", DateUtils.getFormatTime(toSaleTimeBegin));
		params.put("toSaleTimeEnd", DateUtils.getFormatTime(toSaleTimeEnd));
		params.put("priceMorethan", String.valueOf(priceMorethan));
		params.put("priceLessthan", String.valueOf(priceLessthan));
		params.put("extendInfo", String.valueOf(extendInfo));
		params.put("orderType", String.valueOf(orderType));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerSearchItemListResponse> getResponseClass() {
		return SellerSearchItemListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
