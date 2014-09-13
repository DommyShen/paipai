package com.sbkj.paipai.api.domain.deal;

public class RefundInfo {
	private String buyerConsignmentDesc;// string  买家发送退货描述 
	private String buyerConsignmentTime;// number  买家发送退货时间 
	private String buyerConsignmentWuliu;// string  买家发送退货物流信息 
	private String dealCode_TODO;// string  订单编号 
	private String dealCreateTime;// number  订单生成时间 
	private String dealSubCode;// string  子订单编号 
	private String lastUpdateTime;// time  最后更新时间 
	private String preRefundState;// string  之前的退款状态: dealState 
	private String refundEndTime;// time  退款结束时间 
	private String refundItemState;// number  货物状态（买家选的“是否收到货”,0:没有收到货，1.已经收到货） 
	private String refundReasonDesc;// string  申请退款附言 
	private String refundReasonType;// number  退款原因类型：
	private String refundReqitemFlag;// time  是否需要退货，1需要退货，0不需要退货， 
	private String refundReqTime;// number  申请退款时间 
	private String refundState;// string  退款状态: dealState 
	private String refundToBuyer;// number  申请退还买家金额 
	private String refundToBuyerNum;// number  申请退还买家数量 
	private String refundToSeller;// number  支付给卖家金额 
	private String sellerAgreeGivebackTime;// time  卖家同意退货时间 
	private String sellerAgreeItemMsg;// string  卖家同意退货附言 
	private String sellerAgreeMsg;// string  卖家同意退款附言 
	private String sellerRefundAddr;// string  卖家退货地址 
	private String sellerRefuseTime;// time  拒绝协议时间 
	private String sellerUin;// number  商家编号 
	private String timeoutItemFlag;// number  子订单超时标志1 诚保代充48小时发货(超时用)2 诚保代充10分钟发货(超时用)3 卖家发货快递(超时用)4 临时表订单删除标识 
	private String tradePropertymask;// number  子订单属性 
	private String tradeRefundId;// number  退款协议ID 
	
	public String getBuyerConsignmentDesc() {
		return buyerConsignmentDesc;
	}
	public void setBuyerConsignmentDesc(String buyerConsignmentDesc) {
		this.buyerConsignmentDesc = buyerConsignmentDesc;
	}
	public String getBuyerConsignmentTime() {
		return buyerConsignmentTime;
	}
	public void setBuyerConsignmentTime(String buyerConsignmentTime) {
		this.buyerConsignmentTime = buyerConsignmentTime;
	}
	public String getBuyerConsignmentWuliu() {
		return buyerConsignmentWuliu;
	}
	public void setBuyerConsignmentWuliu(String buyerConsignmentWuliu) {
		this.buyerConsignmentWuliu = buyerConsignmentWuliu;
	}
	public String getDealCode_TODO() {
		return dealCode_TODO;
	}
	public void setDealCode_TODO(String dealCode_TODO) {
		this.dealCode_TODO = dealCode_TODO;
	}
	public String getDealCreateTime() {
		return dealCreateTime;
	}
	public void setDealCreateTime(String dealCreateTime) {
		this.dealCreateTime = dealCreateTime;
	}
	public String getDealSubCode() {
		return dealSubCode;
	}
	public void setDealSubCode(String dealSubCode) {
		this.dealSubCode = dealSubCode;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getPreRefundState() {
		return preRefundState;
	}
	public void setPreRefundState(String preRefundState) {
		this.preRefundState = preRefundState;
	}
	public String getRefundEndTime() {
		return refundEndTime;
	}
	public void setRefundEndTime(String refundEndTime) {
		this.refundEndTime = refundEndTime;
	}
	public String getRefundItemState() {
		return refundItemState;
	}
	public void setRefundItemState(String refundItemState) {
		this.refundItemState = refundItemState;
	}
	public String getRefundReasonDesc() {
		return refundReasonDesc;
	}
	public void setRefundReasonDesc(String refundReasonDesc) {
		this.refundReasonDesc = refundReasonDesc;
	}
	public String getRefundReasonType() {
		return refundReasonType;
	}
	public void setRefundReasonType(String refundReasonType) {
		this.refundReasonType = refundReasonType;
	}
	public String getRefundReqitemFlag() {
		return refundReqitemFlag;
	}
	public void setRefundReqitemFlag(String refundReqitemFlag) {
		this.refundReqitemFlag = refundReqitemFlag;
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
	public String getRefundToBuyer() {
		return refundToBuyer;
	}
	public void setRefundToBuyer(String refundToBuyer) {
		this.refundToBuyer = refundToBuyer;
	}
	public String getRefundToBuyerNum() {
		return refundToBuyerNum;
	}
	public void setRefundToBuyerNum(String refundToBuyerNum) {
		this.refundToBuyerNum = refundToBuyerNum;
	}
	public String getRefundToSeller() {
		return refundToSeller;
	}
	public void setRefundToSeller(String refundToSeller) {
		this.refundToSeller = refundToSeller;
	}
	public String getSellerAgreeGivebackTime() {
		return sellerAgreeGivebackTime;
	}
	public void setSellerAgreeGivebackTime(String sellerAgreeGivebackTime) {
		this.sellerAgreeGivebackTime = sellerAgreeGivebackTime;
	}
	public String getSellerAgreeItemMsg() {
		return sellerAgreeItemMsg;
	}
	public void setSellerAgreeItemMsg(String sellerAgreeItemMsg) {
		this.sellerAgreeItemMsg = sellerAgreeItemMsg;
	}
	public String getSellerAgreeMsg() {
		return sellerAgreeMsg;
	}
	public void setSellerAgreeMsg(String sellerAgreeMsg) {
		this.sellerAgreeMsg = sellerAgreeMsg;
	}
	public String getSellerRefundAddr() {
		return sellerRefundAddr;
	}
	public void setSellerRefundAddr(String sellerRefundAddr) {
		this.sellerRefundAddr = sellerRefundAddr;
	}
	public String getSellerRefuseTime() {
		return sellerRefuseTime;
	}
	public void setSellerRefuseTime(String sellerRefuseTime) {
		this.sellerRefuseTime = sellerRefuseTime;
	}
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	public String getTimeoutItemFlag() {
		return timeoutItemFlag;
	}
	public void setTimeoutItemFlag(String timeoutItemFlag) {
		this.timeoutItemFlag = timeoutItemFlag;
	}
	public String getTradePropertymask() {
		return tradePropertymask;
	}
	public void setTradePropertymask(String tradePropertymask) {
		this.tradePropertymask = tradePropertymask;
	}
	public String getTradeRefundId() {
		return tradeRefundId;
	}
	public void setTradeRefundId(String tradeRefundId) {
		this.tradeRefundId = tradeRefundId;
	}
	
}
