package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerSignDealOutOfStockResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家标记订单缺货 只能整个订单所有的商品都同时标记缺货 只有状态为“买家已付款，等待卖家发货”的订单才能进行此操作 当订单中全部商品被标记缺货后，
 * 订单的状态变为：DS_CLOSED（订单已关闭），系统立即自动退款给买家； 当订单中部分商品被标记为缺货后，订单的状态不变（买家已付款等待卖家发货），
 * 退款部分需要等待交易完成后才真正退回给买家；
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerSignDealOutOfStockRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerSignDealOutOfStockResponse>{
	
	/**订单编码 */
	private String dealCode;
	/**子订单编号列表如果订单中有多个子单，可用下划线_间隔开来 */
	private String dealSubCode;
	
	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getDealSubCode() {
		return dealSubCode;
	}

	public void setDealSubCode(String dealSubCode) {
		this.dealSubCode = dealSubCode;
	}

	public String getApiMethodName() {
		return "/deal/sellerSignDealOutOfStock.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("dealSubCode", dealSubCode);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerSignDealOutOfStockResponse> getResponseClass() {
		return SellerSignDealOutOfStockResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
