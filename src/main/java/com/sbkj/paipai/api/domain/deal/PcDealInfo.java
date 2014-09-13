package com.sbkj.paipai.api.domain.deal;

import java.util.List;

/**
 * 拍拍网订单
 * @author DOmmy
 * create:2014-08-08
 */
public class PcDealInfo {
	private String dealCode;// string  定单编码 
	private String dealDetailLink;// string  订单的详情连接 
	private String buyerRemark;// string  买家下单时的留言内容 
	private String dealPayType;// string  订单的付款类型：1-财付通 2-线下交易3-货到付款流程 4-移动积分5-微信支付 
	private String dealRateState;// string  订单的评价状态
//	DEAL_RATE_NO_EVAL=评价未到期
//	DEAL_RATE_BUYER_NO_SELLER_NO=买家未评，卖家未评
//	DEAL_RATE_BUYER_DONE_SELLER_NO=买家已评，卖家未评
//	DEAL_RATE_BUYER_NO_SELLER_DONE=卖家已评，买家未评
//	DEAL_RATE_BUYER_DONE_SELLER_DONE=买家已评，卖家已评
//	DEAL_RATE_DISABLE=不可评价
//	UNKNOW=未知评价状态 
	private String tenpayCode;// string  财付通付款单号 
	private String wuliuId;// string  物流的编码 
	private String ppCodId;// string 如:PPCOD123456789 货到付款ppcod号,预约后产生:PPCOD前缀 + 数字 
	private String receiverAddress;// string  收货人地址信息 
	private String receiverMobile;// string  收货人手机号码 
	private String receiverName;// string  收货人姓名 
	private String receiverPhone;// string  收货人电话号码 
	private String receiverPostcode;// string  收货人邮编 
	private String buyerName;// string  买家名称 
	private String buyerUin;// string  买家QQ号 
	private String freight;// string  运费 
	private String transportType;// string  运送类型
//	TRANSPORT_NONE：卖家包邮，无需买家关心运送
//	TRANSPORT_MAIL：邮政寄送
//	TRANSPORT_EXPRESS：快递
//	TRANSPORT_EMS：EMS
//	TRANSPORT_UNKNOWN：未知的运输方式 
	private String dealPayFeeTotal;// number  费用合计,一共要付的钱（包括可折合钱：积分、财付券之类） 
	private String totalCash;// string  总支付现金 
	private String dealPayFeeTicket;// number  财付券支付金额 
	private String comboInfo;// string  促销信息 
	private String couponFee;// number  折扣优惠金额 
	private String dealState;// string  订单状态: dealState 
	private String dealStateDesc;// string  订单状态说明：dealState 
	private String propertymask;// string  订单属性串：各个属性之间用下划线_隔开
	private String createTime;// time  下单时间 
	private String dealEndTime;// time  订单结束时间 
	private String payTime;// time  买家付款时间 
	private String payReturnTime;// time  付款返款时间 
	private String recvfeeReturnTime;// time  收到返款的时间 
	private String recvfeeTime;// time  返款时间 
	private String sellerConsignmentTime;// time  卖家标记发货时间 
	private String lastUpdateTime;// time  最后修改时间 
	private String dealNoteType;// string  订单的备注类型 
	private String dealNote;// string  订单的备注内容 
	private List<PcItemInfo> itemList;// list  订单的商品列表 
	
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getDealDetailLink() {
		return dealDetailLink;
	}
	public void setDealDetailLink(String dealDetailLink) {
		this.dealDetailLink = dealDetailLink;
	}
	public String getBuyerRemark() {
		return buyerRemark;
	}
	public void setBuyerRemark(String buyerRemark) {
		this.buyerRemark = buyerRemark;
	}
	public String getDealPayType() {
		return dealPayType;
	}
	public void setDealPayType(String dealPayType) {
		this.dealPayType = dealPayType;
	}
	public String getDealRateState() {
		return dealRateState;
	}
	public void setDealRateState(String dealRateState) {
		this.dealRateState = dealRateState;
	}
	public String getTenpayCode() {
		return tenpayCode;
	}
	public void setTenpayCode(String tenpayCode) {
		this.tenpayCode = tenpayCode;
	}
	public String getWuliuId() {
		return wuliuId;
	}
	public void setWuliuId(String wuliuId) {
		this.wuliuId = wuliuId;
	}
	public String getPpCodId() {
		return ppCodId;
	}
	public void setPpCodId(String ppCodId) {
		this.ppCodId = ppCodId;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverMobile() {
		return receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getReceiverPostcode() {
		return receiverPostcode;
	}
	public void setReceiverPostcode(String receiverPostcode) {
		this.receiverPostcode = receiverPostcode;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerUin() {
		return buyerUin;
	}
	public void setBuyerUin(String buyerUin) {
		this.buyerUin = buyerUin;
	}
	public String getFreight() {
		return freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public String getDealPayFeeTotal() {
		return dealPayFeeTotal;
	}
	public void setDealPayFeeTotal(String dealPayFeeTotal) {
		this.dealPayFeeTotal = dealPayFeeTotal;
	}
	public String getTotalCash() {
		return totalCash;
	}
	public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}
	public String getDealPayFeeTicket() {
		return dealPayFeeTicket;
	}
	public void setDealPayFeeTicket(String dealPayFeeTicket) {
		this.dealPayFeeTicket = dealPayFeeTicket;
	}
	public String getComboInfo() {
		return comboInfo;
	}
	public void setComboInfo(String comboInfo) {
		this.comboInfo = comboInfo;
	}
	public String getCouponFee() {
		return couponFee;
	}
	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}
	public String getDealState() {
		return dealState;
	}
	public void setDealState(String dealState) {
		this.dealState = dealState;
	}
	public String getDealStateDesc() {
		return dealStateDesc;
	}
	public void setDealStateDesc(String dealStateDesc) {
		this.dealStateDesc = dealStateDesc;
	}
	public String getPropertymask() {
		return propertymask;
	}
	public void setPropertymask(String propertymask) {
		this.propertymask = propertymask;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDealEndTime() {
		return dealEndTime;
	}
	public void setDealEndTime(String dealEndTime) {
		this.dealEndTime = dealEndTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayReturnTime() {
		return payReturnTime;
	}
	public void setPayReturnTime(String payReturnTime) {
		this.payReturnTime = payReturnTime;
	}
	public String getRecvfeeReturnTime() {
		return recvfeeReturnTime;
	}
	public void setRecvfeeReturnTime(String recvfeeReturnTime) {
		this.recvfeeReturnTime = recvfeeReturnTime;
	}
	public String getRecvfeeTime() {
		return recvfeeTime;
	}
	public void setRecvfeeTime(String recvfeeTime) {
		this.recvfeeTime = recvfeeTime;
	}
	public String getSellerConsignmentTime() {
		return sellerConsignmentTime;
	}
	public void setSellerConsignmentTime(String sellerConsignmentTime) {
		this.sellerConsignmentTime = sellerConsignmentTime;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getDealNoteType() {
		return dealNoteType;
	}
	public void setDealNoteType(String dealNoteType) {
		this.dealNoteType = dealNoteType;
	}
	public String getDealNote() {
		return dealNote;
	}
	public void setDealNote(String dealNote) {
		this.dealNote = dealNote;
	}
	public List<PcItemInfo> getItemList() {
		return itemList;
	}
	public void setItemList(List<PcItemInfo> itemList) {
		this.itemList = itemList;
	}
	
	
	
}
