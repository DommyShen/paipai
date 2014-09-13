package com.sbkj.paipai.api.request.deal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.deal.SellerModifyDealPriceResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家可以使用本接口给买家付款之前的订单修改订单中的商品价格、或者修改运费价格
 * @author DOmmy
 * create:2014-08-08
 */
public class SellerModifyDealPriceRequest extends PaipaiBaseRequest
					implements PaipaiRequest<SellerModifyDealPriceResponse>{
	
	/**订单编码 */
	private String dealCode;
	/**调整后的订单运费（单位为分） */
	private Long adjustShipFee;
	/**子订单ID列表，多个子订单时可多次重复出现参数名值对 */
	private List<String> dealSubCode;
	/**订单的调整价格（加价或减价，单位为分）个子订单时可多次重复出现参数名值对，参数的顺序和格式必须与dealSubCode一致 */
	private List<Long> adjustPrice;
	
	public String getApiMethodName() {
		return "/deal/sellerModifyDealPrice.xhtml";
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public void setAdjustShipFee(Long adjustShipFee) {
		this.adjustShipFee = adjustShipFee;
	}

	public void setDealSubCode(List<String> dealSubCode) {
		this.dealSubCode = dealSubCode;
	}

	public void setAdjustPrice(List<Long> adjustPrice) {
		this.adjustPrice = adjustPrice;
	}

	public String getDealCode() {
		return dealCode;
	}

	public Long getAdjustShipFee() {
		return adjustShipFee;
	}

	public List<String> getDealSubCode() {
		return dealSubCode;
	}

	public List<Long> getAdjustPrice() {
		return adjustPrice;
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("dealCode", dealCode);
		params.put("adjustShipFee", String.valueOf(adjustShipFee));
		if(null != dealSubCode && dealSubCode.size() > 0){
			StringBuilder parm = new StringBuilder();
			parm.append(dealSubCode.get(0));
			if(dealSubCode.size()>1){
				for(int i=1;i<dealSubCode.size();i++){
					parm.append("&dealSubCode="+dealSubCode.get(i));
				}
			}
			params.put("dealSubCode", parm.toString());
		}
		if(null != adjustPrice && adjustPrice.size() > 0){
			StringBuilder parm = new StringBuilder();
			parm.append(adjustPrice.get(0));
			if(adjustPrice.size()>1){
				for(int i=1;i<adjustPrice.size();i++){
					parm.append("&adjustPrice="+adjustPrice.get(i));
				}
			}
			params.put("adjustPrice", parm.toString());
		}
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<SellerModifyDealPriceResponse> getResponseClass() {
		return SellerModifyDealPriceResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
