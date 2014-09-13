package com.sbkj.paipai.api.domain.deal;

import java.util.List;

/**
 * 手机端订单
 * @author DOmmy
 * create:2014-08-08
 */
public class PhoneDeal {
	private String dealCode;// string  订单ID 
	private String dealCreateTime;// string  订单生成时间 
	private String dealEndTime;// string  订单结束时间 
	private String lastModifyTime;// string  订单最后修改时间 
	private String dealDesc;// string  订单描述 
	private String substate;// number  订单在手机paipai货到付款流程的状态:1：待买家确认2：待卖家确认3：待卖家发货6：待确认收货7：交易成功8：买家拒收 9：交易关闭 
	private String closeReason;// string  当订单支付方式为货到付款时，卖家关闭订单时的原因取值如下：
	private String refuseReason;// string  买家拒收原因：
	private String smBeginTime;// string  短信确认开始时间 
	private String payType;// string  支付方式 
	private String sellerUin;// number  卖家QQ 
	private String buyerUin;// number  买家QQ 
	private String buyerNickName;// string  买家QQ名称 
	private String buyerNote;// string  买家留言 
	private String referer;// string  订单来源信息 
	private String itemTitleList;// string  订单商品名称列表 
	private String itemCode;// string  商品编码 
	private String skuId;// number  商品的库存唯一标识码,由拍拍平台生成 
	private String stockAttr;// string  商品库存属性 
	private String buyAmount;// number  购买数量 
	private String payFeeCash;// number  订单现金支付金额 
	private String payFeeTicket;// number  订单财富券支付金额 
	private String payFeeScore;// number  订单积分支付金额 
	private String payFeeShipping;// number  订单运费支付金额 
	private String payFeeCommission;// number  货到付款手续费 
	private String couponFee;// number  订单优惠金额 
	private String payFeeTotal;// number  总支付费用 
	private String buyerFeeTotal;// number  向买家显示的订单总金额 
	private String recvScore;// number  获得积分额 
	private String dealCftPayId;// string  财付通支付ID 
	private String payId;// number  支付单编号 
	private String hasInnovice;// number  是否有发票 
	private String dealInnoviceTitle;// string  发票抬头 
	private String dealInnoviceContent;// string  发票内容 
	private String recvAddrId;// string  收货地址编号 
	private String recvAddrName;// string  收货人姓名 
	private String recvAddrDetail;// string  收货人地址 
	private String recvAddrPostcode;// string  收货人邮编 
	private String recvAddrPhone;// string  收货人电话 
	private String recvAddrMobile;// string  收货人手机号 
	private String wuliuId;// number  物流号 
	private String mailType;// number  邮递类型 
	private String payTime;// string  支付完成时间 
	private String payReturnTime;// string  支付返回时间 
	private String recvFeeTime;// string  打款完成时间 
	private String recvFeeReturnTime;// string  打款返回时间 
	private List<PhoneDealItem> itemList;
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getDealCreateTime() {
		return dealCreateTime;
	}
	public void setDealCreateTime(String dealCreateTime) {
		this.dealCreateTime = dealCreateTime;
	}
	public String getDealEndTime() {
		return dealEndTime;
	}
	public void setDealEndTime(String dealEndTime) {
		this.dealEndTime = dealEndTime;
	}
	public String getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getDealDesc() {
		return dealDesc;
	}
	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}
	public String getSubstate() {
		return substate;
	}
	public void setSubstate(String substate) {
		this.substate = substate;
	}
	public String getCloseReason() {
		return closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public String getRefuseReason() {
		return refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getSmBeginTime() {
		return smBeginTime;
	}
	public void setSmBeginTime(String smBeginTime) {
		this.smBeginTime = smBeginTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	public String getBuyerUin() {
		return buyerUin;
	}
	public void setBuyerUin(String buyerUin) {
		this.buyerUin = buyerUin;
	}
	public String getBuyerNickName() {
		return buyerNickName;
	}
	public void setBuyerNickName(String buyerNickName) {
		this.buyerNickName = buyerNickName;
	}
	public String getBuyerNote() {
		return buyerNote;
	}
	public void setBuyerNote(String buyerNote) {
		this.buyerNote = buyerNote;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public String getItemTitleList() {
		return itemTitleList;
	}
	public void setItemTitleList(String itemTitleList) {
		this.itemTitleList = itemTitleList;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getStockAttr() {
		return stockAttr;
	}
	public void setStockAttr(String stockAttr) {
		this.stockAttr = stockAttr;
	}
	public String getBuyAmount() {
		return buyAmount;
	}
	public void setBuyAmount(String buyAmount) {
		this.buyAmount = buyAmount;
	}
	public String getPayFeeCash() {
		return payFeeCash;
	}
	public void setPayFeeCash(String payFeeCash) {
		this.payFeeCash = payFeeCash;
	}
	public String getPayFeeTicket() {
		return payFeeTicket;
	}
	public void setPayFeeTicket(String payFeeTicket) {
		this.payFeeTicket = payFeeTicket;
	}
	public String getPayFeeScore() {
		return payFeeScore;
	}
	public void setPayFeeScore(String payFeeScore) {
		this.payFeeScore = payFeeScore;
	}
	public String getPayFeeShipping() {
		return payFeeShipping;
	}
	public void setPayFeeShipping(String payFeeShipping) {
		this.payFeeShipping = payFeeShipping;
	}
	public String getPayFeeCommission() {
		return payFeeCommission;
	}
	public void setPayFeeCommission(String payFeeCommission) {
		this.payFeeCommission = payFeeCommission;
	}
	public String getCouponFee() {
		return couponFee;
	}
	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}
	public String getPayFeeTotal() {
		return payFeeTotal;
	}
	public void setPayFeeTotal(String payFeeTotal) {
		this.payFeeTotal = payFeeTotal;
	}
	public String getBuyerFeeTotal() {
		return buyerFeeTotal;
	}
	public void setBuyerFeeTotal(String buyerFeeTotal) {
		this.buyerFeeTotal = buyerFeeTotal;
	}
	public String getRecvScore() {
		return recvScore;
	}
	public void setRecvScore(String recvScore) {
		this.recvScore = recvScore;
	}
	public String getDealCftPayId() {
		return dealCftPayId;
	}
	public void setDealCftPayId(String dealCftPayId) {
		this.dealCftPayId = dealCftPayId;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getHasInnovice() {
		return hasInnovice;
	}
	public void setHasInnovice(String hasInnovice) {
		this.hasInnovice = hasInnovice;
	}
	public String getDealInnoviceTitle() {
		return dealInnoviceTitle;
	}
	public void setDealInnoviceTitle(String dealInnoviceTitle) {
		this.dealInnoviceTitle = dealInnoviceTitle;
	}
	public String getDealInnoviceContent() {
		return dealInnoviceContent;
	}
	public void setDealInnoviceContent(String dealInnoviceContent) {
		this.dealInnoviceContent = dealInnoviceContent;
	}
	public String getRecvAddrId() {
		return recvAddrId;
	}
	public void setRecvAddrId(String recvAddrId) {
		this.recvAddrId = recvAddrId;
	}
	public String getRecvAddrName() {
		return recvAddrName;
	}
	public void setRecvAddrName(String recvAddrName) {
		this.recvAddrName = recvAddrName;
	}
	public String getRecvAddrDetail() {
		return recvAddrDetail;
	}
	public void setRecvAddrDetail(String recvAddrDetail) {
		this.recvAddrDetail = recvAddrDetail;
	}
	public String getRecvAddrPostcode() {
		return recvAddrPostcode;
	}
	public void setRecvAddrPostcode(String recvAddrPostcode) {
		this.recvAddrPostcode = recvAddrPostcode;
	}
	public String getRecvAddrPhone() {
		return recvAddrPhone;
	}
	public void setRecvAddrPhone(String recvAddrPhone) {
		this.recvAddrPhone = recvAddrPhone;
	}
	public String getRecvAddrMobile() {
		return recvAddrMobile;
	}
	public void setRecvAddrMobile(String recvAddrMobile) {
		this.recvAddrMobile = recvAddrMobile;
	}
	public String getWuliuId() {
		return wuliuId;
	}
	public void setWuliuId(String wuliuId) {
		this.wuliuId = wuliuId;
	}
	public String getMailType() {
		return mailType;
	}
	public void setMailType(String mailType) {
		this.mailType = mailType;
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
	public String getRecvFeeTime() {
		return recvFeeTime;
	}
	public void setRecvFeeTime(String recvFeeTime) {
		this.recvFeeTime = recvFeeTime;
	}
	public String getRecvFeeReturnTime() {
		return recvFeeReturnTime;
	}
	public void setRecvFeeReturnTime(String recvFeeReturnTime) {
		this.recvFeeReturnTime = recvFeeReturnTime;
	}
	public List<PhoneDealItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<PhoneDealItem> itemList) {
		this.itemList = itemList;
	}

}
