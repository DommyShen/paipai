package com.sbkj.paipai.api;

import java.io.Serializable;

/**
 * 拍拍响应
 * @author DOmmy
 * create:2014-08-08
 */
public abstract class PaipaiResponse implements Serializable {

	private static final long serialVersionUID = -5528390943429713546L;
	/**返回码。 返回码为0，代表接口成功返回，其他非0值表示错误。 */
	private String errorCode;
	/**错误描述。 返回码errorCode不为0，表示对错误码的描述信息； 返回码errorCode为0，表示额外的提示信息，一般为空。 */
	private String errorMessage;
	
	private String body;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public boolean isSuccess(){
		return "0".equals(errorCode);
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
