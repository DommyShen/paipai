package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerCancelDealResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口取消订单(买家付款之后只能走申请退款接口，不能调用该接口取消订单) 只有状态为“等待买家付款”的订单才能进行此操作
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerCancelDealRequest extends PaipaiBaseRequest
						implements PaipaiRequest<SellerCancelDealResponse>{
	/**订单编码 */
	private String dealCode;
	/**
	 * 填写的取消说明
	 * 0：无法联系上买家
	 * 1：买家误拍或重拍了
	 * 2：买家无诚意完成交易
	 * 3：已通过银行线下汇款
	 * 4：已通过同城见面交易
	 * 5：已通过货到付款交易
	 * 6：已通过网上银行直接汇款
	 * 7：已经缺货无法交易
	 */
	private String closeReason;
	
	
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getDealCode() {
		return dealCode;
	}

	public String getCloseReason() {
		return closeReason;
	}

	public String getApiMethodName() {
		return "/deal/sellerCancelDeal.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("closeReason", closeReason);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerCancelDealResponse> getResponseClass() {
		return SellerCancelDealResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
