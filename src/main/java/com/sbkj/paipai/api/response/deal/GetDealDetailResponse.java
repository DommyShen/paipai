package com.sbkj.paipai.api.response.deal;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.deal.CodPay;
import com.sbkj.paipai.api.domain.deal.DealItemInfo;

/**
 * 本接口主要用于卖家根据拍拍网销售订单号列表查询（交易结束2个月内的）订单的详细信息
 * @author DOmmy
 * create:2014-08-08
 */
public class GetDealDetailResponse extends PaipaiResponse{

	private static final long serialVersionUID = -2817519375839882569L;
	
	private String buyerName;// string  买家名称 
	private String buyerUin;// number  买家QQ号 
	private String buyerRemark;// string  买家下订单时的备注 
	private String comboInfo;// string  促销信息 
	private String dealCode;// string  订单编码 
	private String dealDesc;// string  订单序列号，即是订单中的商品编码，多个商品时使用逗号隔开 
	private String dealDetailLink ;//string  订单的详情连接 
	private String dealNoteType ;//string  订单备注类型RED:红色YELLOW:黄色GREEN:绿色BLUE:蓝色PINK:粉红色UN_LABEL:未标注 
	private String dealNote;// string  订单的备注内容 
	private String dealState;// string  订单状态: dealState 
	private String dealStateDesc;// string  订单状态说明：dealState 
	private String propertymask;// string  订单属性串
	private String dealType;// string  订单类型 SELL_TYPE_ALL:所有类型SELL_TYPE_BIN:一口价SELL_TYPE_AUCTION_SINGLE:单件拍卖SELL_TYPE_B2C:b2c订单SELL_TYPE_TSHOP:店铺街 
	private String dealTypeDesc;// string  订单类型描述 
	private String dealPayType;// string  订单的支付方式 UNKNOW:未知类型TENPAY:财付通OFF_LINE:线下交易DEAL_BIZ_FLAG_HDFK:货到付款流程MOBILE_SCORE:移动积分WEIXIN_PAY:微信支付 
	private String dealPayTypeDesc;// string  订单支付方式说明 
	private String dealRateState;// string  订单的评价状态 DEAL_RATE_NO_EVAL:评价未到期
//	DEAL_RATE_BUYER_NO_SELLER_NO:买家未评，卖家未评
//	DEAL_RATE_BUYER_DONE_SELLER_NO:买家已评，卖家未评
//	DEAL_RATE_BUYER_NO_SELLER_DONE:卖家已评，买家未评
//	DEAL_RATE_BUYER_DONE_SELLER_DONE:买家已评，卖家已评
//	DEAL_RATE_DISABLE:不可评价 
	private String dealRateStateDesc;// string  订单的评价状态说明 
	private String createTime;// time  订单的创建时间 
	private String dealEndTime;// time  订单结束时间 
	private String lastUpStringTime;// time  订单的最后更新时间 
	private String payTime;// time  买家的付款时间 
	private String payReturnTime;// time  打款返回时间 
	private String recvfeeReturnTime;// time  退款返回时间 
	private String recvfeeTime;// time  退款时间 
	private String sellerConsignmentTime;// time  卖家发货时间 
	private String hasInvoice;// number  是否提供发票:0否,1是 
	private String invoiceContent;// string  发票内容 
	private String invoiceTitle;// string  发票标题 
	private String tenpayCode;// string  财付通付款单号(订单支付ID) 
	private String transportType;// string  运送类型
//	TRANSPORT_NONE：卖家包邮，无需买家关心运送
//	TRANSPORT_MAIL：邮政寄送
//	TRANSPORT_EXPRESS：快递
//	TRANSPORT_EMS：EMS
//	TRANSPORT_UNKNOWN：未知的运输方式 
	private String transportTypeDesc;// string  运费类型说明 
	private String whoPayShippingfee;// number  承担运费方式: 1卖家;2买家 
	private String wuliuId;// string  物流id 
	private String receiverAddress;// string  收货人详细地址 
	private String receiverMobile;// string  收货人手机号码 
	private String receiverName;// string  收货人姓名 
	private String receiverPhone;// string  收货人电话号码 
	private String receiverPostcode;// string  收货人邮编 
	private String sellerRecvRefund;// number  退款:卖家实收金额 
	private String buyerRecvRefund;// number  退款:买家收到的退款金额 
	private String couponFee;// number  折扣优惠金额 
	private String dealPayFeePoint;// number  实际积分支付金额 
	private String dealPayFeeTicket;// number  财付券支付金额 
	private String dealPayFeeTotal;// number  费用合计,一共要付的钱（包括可折合钱：积分、财付券之类） 
	private String freight;// number  支付的运费(单位:分) 
	private String shippingfeeCalc;// number  运费合计说明,列出运费最终的计算式，以便每次订单详情展示给买家看 
	private String totalCash;// number  买家支付现金总额，包括所有可折算为现金的部分 
	private String sellerCrm;// string  客服CRM 
	private String sellerName;// string  卖家名称 
	private String sellerNick;// string  卖家昵称 
	private String sellerUin;// number  卖家QQ号 
	private String expectArrivalTime;// time  预计到货时间 
	private String wuliuCompany;// string  物流公司 
	private String wuliuCode;// string  物流单号 
	private String wuliuDesc;// string  物流备注 
	private List<DealItemInfo> itemList;// list  订单的商品列表 
	
	private String dealPayFeeCommission;// string 大于等于0 手续费字段，大于0的时候，表示卖家承担的手续费 
	private String recvTime;// string  买家收到商品的签收时间，或者拒签时间 
	private List<CodPay> codPayList;// list  货到付款信息列表 
	
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
	public String getBuyerRemark() {
		return buyerRemark;
	}
	public void setBuyerRemark(String buyerRemark) {
		this.buyerRemark = buyerRemark;
	}
	public String getComboInfo() {
		return comboInfo;
	}
	public void setComboInfo(String comboInfo) {
		this.comboInfo = comboInfo;
	}
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getDealDesc() {
		return dealDesc;
	}
	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}
	public String getDealDetailLink() {
		return dealDetailLink;
	}
	public void setDealDetailLink(String dealDetailLink) {
		this.dealDetailLink = dealDetailLink;
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
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getDealTypeDesc() {
		return dealTypeDesc;
	}
	public void setDealTypeDesc(String dealTypeDesc) {
		this.dealTypeDesc = dealTypeDesc;
	}
	public String getDealPayType() {
		return dealPayType;
	}
	public void setDealPayType(String dealPayType) {
		this.dealPayType = dealPayType;
	}
	public String getDealPayTypeDesc() {
		return dealPayTypeDesc;
	}
	public void setDealPayTypeDesc(String dealPayTypeDesc) {
		this.dealPayTypeDesc = dealPayTypeDesc;
	}
	public String getDealRateState() {
		return dealRateState;
	}
	public void setDealRateState(String dealRateState) {
		this.dealRateState = dealRateState;
	}
	public String getDealRateStateDesc() {
		return dealRateStateDesc;
	}
	public void setDealRateStateDesc(String dealRateStateDesc) {
		this.dealRateStateDesc = dealRateStateDesc;
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
	public String getLastUpStringTime() {
		return lastUpStringTime;
	}
	public void setLastUpStringTime(String lastUpStringTime) {
		this.lastUpStringTime = lastUpStringTime;
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
	public String getHasInvoice() {
		return hasInvoice;
	}
	public void setHasInvoice(String hasInvoice) {
		this.hasInvoice = hasInvoice;
	}
	public String getInvoiceContent() {
		return invoiceContent;
	}
	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
	}
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public String getTenpayCode() {
		return tenpayCode;
	}
	public void setTenpayCode(String tenpayCode) {
		this.tenpayCode = tenpayCode;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public String getTransportTypeDesc() {
		return transportTypeDesc;
	}
	public void setTransportTypeDesc(String transportTypeDesc) {
		this.transportTypeDesc = transportTypeDesc;
	}
	public String getWhoPayShippingfee() {
		return whoPayShippingfee;
	}
	public void setWhoPayShippingfee(String whoPayShippingfee) {
		this.whoPayShippingfee = whoPayShippingfee;
	}
	public String getWuliuId() {
		return wuliuId;
	}
	public void setWuliuId(String wuliuId) {
		this.wuliuId = wuliuId;
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
	public String getSellerRecvRefund() {
		return sellerRecvRefund;
	}
	public void setSellerRecvRefund(String sellerRecvRefund) {
		this.sellerRecvRefund = sellerRecvRefund;
	}
	public String getBuyerRecvRefund() {
		return buyerRecvRefund;
	}
	public void setBuyerRecvRefund(String buyerRecvRefund) {
		this.buyerRecvRefund = buyerRecvRefund;
	}
	public String getCouponFee() {
		return couponFee;
	}
	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}
	public String getDealPayFeePoint() {
		return dealPayFeePoint;
	}
	public void setDealPayFeePoint(String dealPayFeePoint) {
		this.dealPayFeePoint = dealPayFeePoint;
	}
	public String getDealPayFeeTicket() {
		return dealPayFeeTicket;
	}
	public void setDealPayFeeTicket(String dealPayFeeTicket) {
		this.dealPayFeeTicket = dealPayFeeTicket;
	}
	public String getDealPayFeeTotal() {
		return dealPayFeeTotal;
	}
	public void setDealPayFeeTotal(String dealPayFeeTotal) {
		this.dealPayFeeTotal = dealPayFeeTotal;
	}
	public String getFreight() {
		return freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getShippingfeeCalc() {
		return shippingfeeCalc;
	}
	public void setShippingfeeCalc(String shippingfeeCalc) {
		this.shippingfeeCalc = shippingfeeCalc;
	}
	public String getTotalCash() {
		return totalCash;
	}
	public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}
	public String getSellerCrm() {
		return sellerCrm;
	}
	public void setSellerCrm(String sellerCrm) {
		this.sellerCrm = sellerCrm;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerNick() {
		return sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	public String getExpectArrivalTime() {
		return expectArrivalTime;
	}
	public void setExpectArrivalTime(String expectArrivalTime) {
		this.expectArrivalTime = expectArrivalTime;
	}
	public String getWuliuCompany() {
		return wuliuCompany;
	}
	public void setWuliuCompany(String wuliuCompany) {
		this.wuliuCompany = wuliuCompany;
	}
	public String getWuliuCode() {
		return wuliuCode;
	}
	public void setWuliuCode(String wuliuCode) {
		this.wuliuCode = wuliuCode;
	}
	public String getWuliuDesc() {
		return wuliuDesc;
	}
	public void setWuliuDesc(String wuliuDesc) {
		this.wuliuDesc = wuliuDesc;
	}
	public List<DealItemInfo> getItemList() {
		return itemList;
	}
	public void setItemList(List<DealItemInfo> itemList) {
		this.itemList = itemList;
	}
	public String getDealPayFeeCommission() {
		return dealPayFeeCommission;
	}
	public void setDealPayFeeCommission(String dealPayFeeCommission) {
		this.dealPayFeeCommission = dealPayFeeCommission;
	}
	public String getRecvTime() {
		return recvTime;
	}
	public void setRecvTime(String recvTime) {
		this.recvTime = recvTime;
	}
	public List<CodPay> getCodPayList() {
		return codPayList;
	}
	public void setCodPayList(List<CodPay> codPayList) {
		this.codPayList = codPayList;
	}

}
