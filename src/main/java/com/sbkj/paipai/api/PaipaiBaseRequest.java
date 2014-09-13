package com.sbkj.paipai.api;

import com.sbkj.paipai.api.utils.Constants;

public abstract class PaipaiBaseRequest {
	/**用于指定返回格式,默认值为xml */
	private String format = Constants.FORMAT_JSON;
	/**
	 * 默认值为0。
	 * 该参数只有format=json时才有意义。pureData=1时，
	 * json格式只会包含一个纯粹的json数据对象，
	 * 而不会包含其他js代码，如try...catch、回调函数等。
	 * 非paipai.com和qq.com的web页面引用时，pureData必定为1。
	 */
	private Integer pureData;
	/**该参数只有format=json时才有意义,是否需要返回json根节点(接口名称),0-需要根节点(默认),1-不需要根节点 */
	private Integer needRoot = 1;
	/**该参数只有format=json时才有意义,是否需要返回json根节点(接口名称),0-需要根节点(默认),1-不需要根节点 */
	private String sellerUin;
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Integer getPureData() {
		if(Constants.FORMAT_JSON.equalsIgnoreCase(format)){
			return 1;
		}else{
			return pureData;
		}
	}
	public void setPureData(Integer pureData) {
		this.pureData = pureData;
	}
	public Integer getNeedRoot() {
		return needRoot;
	}
	public void setNeedRoot(Integer needRoot) {
		this.needRoot = needRoot;
	}
	public String getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(String sellerUin) {
		this.sellerUin = sellerUin;
	}
	
}
