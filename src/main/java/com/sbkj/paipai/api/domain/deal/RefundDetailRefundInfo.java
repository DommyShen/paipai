package com.sbkj.paipai.api.domain.deal;

public class RefundDetailRefundInfo {
	private String dealSubCode;// string  子订单ID 
	private String tradeRefundId;// number  退款单ID, 
	private String refundReqTime;// time  退款申请时间 
	private String refundState;// string  退款状态: dealState 
	private String refundStateDesc;// string  退款状态描述 
	private String refundItemState;// number  货物状态 （买家选的“是否收到货”,0:没有收到货，1.已经收到货, 2.该子项已经包含了运费信息，3.已经收到货并且该子项已经包含了运费信息） 
	private String refundReqitemFlag;// number  是否需要退货，1需要退货，0不需要退货 
	private String refundToBuyerNum;// number  退还买家数量 
	private String refundToBuyer;// number  申请退还买家金额 
	private String refundToSeller;// number  支付给卖家金额 
	private String refundReasonType;// number  退款原因类型：
	private String sellerAgreeGivebackTime;// time  卖家同意退货时间 
	private String buyerConsignmentTime;// time  买家发送退货时间 
	private String refundEndTime;// time  退款结束时间 
	private String lastUpdateTime;// time  最后更新时间 
	private String sellerRefuseTime;// time  卖家拒绝时间 
	private String timeoutItemFlag;// number  超时标志
	private String refundReasonDesc;// string  退款原因描述 
	private String buyerConsignmentWuliu;// string  买家发送退货物流信息 
	private String buyerConsignmentDesc;// string  买家发送退货描述 
	private String sellerRefundAddr;// string  卖家退货地址 
	private String sellerAgreeMsg;// string  卖家同意退款附言 
	private String sellerAgreeItemMsg;// string  卖家同意退货附言 
	public String getDealSubCode() {
		return dealSubCode;
	}
	public void setDealSubCode(String dealSubCode) {
		this.dealSubCode = dealSubCode;
	}
	public String getTradeRefundId() {
		return tradeRefundId;
	}
	public void setTradeRefundId(String tradeRefundId) {
		this.tradeRefundId = tradeRefundId;
	}
	public String getRefundReqTime() {
		return refundReqTime;
	}
	public void setRefundReqTime(String refundReqTime) {
		this.refundReqTime = refundReqTime;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getRefundStateDesc() {
		return refundStateDesc;
	}
	public void setRefundStateDesc(String refundStateDesc) {
		this.refundStateDesc = refundStateDesc;
	}
	public String getRefundItemState() {
		return refundItemState;
	}
	public void setRefundItemState(String refundItemState) {
		this.refundItemState = refundItemState;
	}
	public String getRefundReqitemFlag() {
		return refundReqitemFlag;
	}
	public void setRefundReqitemFlag(String refundReqitemFlag) {
		this.refundReqitemFlag = refundReqitemFlag;
	}
	public String getRefundToBuyerNum() {
		return refundToBuyerNum;
	}
	public void setRefundToBuyerNum(String refundToBuyerNum) {
		this.refundToBuyerNum = refundToBuyerNum;
	}
	public String getRefundToBuyer() {
		return refundToBuyer;
	}
	public void setRefundToBuyer(String refundToBuyer) {
		this.refundToBuyer = refundToBuyer;
	}
	public String getRefundToSeller() {
		return refundToSeller;
	}
	public void setRefundToSeller(String refundToSeller) {
		this.refundToSeller = refundToSeller;
	}
	public String getRefundReasonType() {
		return refundReasonType;
	}
	public void setRefundReasonType(String refundReasonType) {
		this.refundReasonType = refundReasonType;
	}
	public String getSellerAgreeGivebackTime() {
		return sellerAgreeGivebackTime;
	}
	public void setSellerAgreeGivebackTime(String sellerAgreeGivebackTime) {
		this.sellerAgreeGivebackTime = sellerAgreeGivebackTime;
	}
	public String getBuyerConsignmentTime() {
		return buyerConsignmentTime;
	}
	public void setBuyerConsignmentTime(String buyerConsignmentTime) {
		this.buyerConsignmentTime = buyerConsignmentTime;
	}
	public String getRefundEndTime() {
		return refundEndTime;
	}
	public void setRefundEndTime(String refundEndTime) {
		this.refundEndTime = refundEndTime;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getSellerRefuseTime() {
		return sellerRefuseTime;
	}
	public void setSellerRefuseTime(String sellerRefuseTime) {
		this.sellerRefuseTime = sellerRefuseTime;
	}
	public String getTimeoutItemFlag() {
		return timeoutItemFlag;
	}
	public void setTimeoutItemFlag(String timeoutItemFlag) {
		this.timeoutItemFlag = timeoutItemFlag;
	}
	public String getRefundReasonDesc() {
		return refundReasonDesc;
	}
	public void setRefundReasonDesc(String refundReasonDesc) {
		this.refundReasonDesc = refundReasonDesc;
	}
	public String getBuyerConsignmentWuliu() {
		return buyerConsignmentWuliu;
	}
	public void setBuyerConsignmentWuliu(String buyerConsignmentWuliu) {
		this.buyerConsignmentWuliu = buyerConsignmentWuliu;
	}
	public String getBuyerConsignmentDesc() {
		return buyerConsignmentDesc;
	}
	public void setBuyerConsignmentDesc(String buyerConsignmentDesc) {
		this.buyerConsignmentDesc = buyerConsignmentDesc;
	}
	public String getSellerRefundAddr() {
		return sellerRefundAddr;
	}
	public void setSellerRefundAddr(String sellerRefundAddr) {
		this.sellerRefundAddr = sellerRefundAddr;
	}
	public String getSellerAgreeMsg() {
		return sellerAgreeMsg;
	}
	public void setSellerAgreeMsg(String sellerAgreeMsg) {
		this.sellerAgreeMsg = sellerAgreeMsg;
	}
	public String getSellerAgreeItemMsg() {
		return sellerAgreeItemMsg;
	}
	public void setSellerAgreeItemMsg(String sellerAgreeItemMsg) {
		this.sellerAgreeItemMsg = sellerAgreeItemMsg;
	}
	
	
	
}
