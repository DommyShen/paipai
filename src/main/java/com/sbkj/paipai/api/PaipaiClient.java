package com.sbkj.paipai.api;


/**
 * 拍拍请求客户端
 * @author DOmmy
 * create:2014-08-08
 */
public interface PaipaiClient {
	
	/**
	 * 执行拍拍公开API请求。
	 * @param <T>
	 * @param request 具体的请求
	 * @return
	 * @throws OpenApiException
	 */
	public <T extends PaipaiResponse> T execute(PaipaiRequest<T> request) throws OpenApiException ;
	/**
	 * 执行拍拍隐私API请求。
	 * @param <T>
	 * @param request 具体的请求
	 * @param sessionKey 用户会话授权码
	 * @return
	 * @throws OpenApiException
	 */
	public <T extends PaipaiResponse> T execute(PaipaiRequest<T> request, String sessionKey) throws OpenApiException ;
	
	public void setMethod(String method);
	
}
