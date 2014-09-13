package com.sbkj.paipai.api.domain.deal;


/**
 * 货到付款信息对象 
 * @author DOmmy
 * create:2014-08-08
 */
public class CodPay {
	private Long SumFee;// int32 0--999999999 货到付款的商品总价 
	private String CodSignReturnTime;// string  拍拍签收返回时间 
	public Long getSumFee() {
		return SumFee;
	}
	public void setSumFee(Long sumFee) {
		SumFee = sumFee;
	}
	public String getCodSignReturnTime() {
		return CodSignReturnTime;
	}
	public void setCodSignReturnTime(String codSignReturnTime) {
		CodSignReturnTime = codSignReturnTime;
	}
	
}
