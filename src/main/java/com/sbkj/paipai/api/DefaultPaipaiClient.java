package com.sbkj.paipai.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.google.gson.Gson;
import com.sbkj.paipai.api.utils.Base64Coder;
import com.sbkj.paipai.api.utils.Constants;
import com.sbkj.paipai.api.utils.WebUtils;


/**
 * 拍拍客户端的实现。
 * @author DOmmy
 * 2014-08-08
 */
public class DefaultPaipaiClient implements PaipaiClient {

	private String serverUrl;
	private String appOAuthID;
	private String appOAuthkey;
	private String uin;
    private String charset  = Constants.CHARSET_GBK;
    private String method   = Constants.METHOD_POST;
	
	private int connectTimeout = Constants.CONNECT_TIMEOUT;//3秒
	private int readTimeout = Constants.READ_TIMEOUT;//15秒

	public DefaultPaipaiClient(String serverUrl, String appOAuthID, String appOAuthkey,String uin) {
		this.serverUrl = serverUrl;
		this.appOAuthID = appOAuthID;
		this.appOAuthkey = appOAuthkey;
		this.uin = uin;
	}

	public <T extends PaipaiResponse> T execute(PaipaiRequest<T> request)
			throws OpenApiException {
		return execute(request,null);
	}

	public <T extends PaipaiResponse> T execute(PaipaiRequest<T> request,
			String sessionKey) throws OpenApiException {
		String url=this.serverUrl+request.getApiMethodName();
		
		String secret = this.appOAuthkey+"&";
	    if(request.getFileParams()!=null && request.getFileParams().size()>0){
	    	this.method = Constants.METHOD_POST;
	    }
		Map<String,String> params = request.getTextParams();
	    params.put("charset", this.charset);
	    params.put("timeStamp", System.currentTimeMillis()+"");
	    params.put("randomValue", (long)(Math.random()*100000000)+"");
		
	    params.put("appOAuthID", this.appOAuthID);
	    params.put("accessToken", sessionKey);
	    params.put("uin", this.uin);
	    String sign = makeSign(this.method, secret,request.getApiMethodName(), params, this.charset);
	    params.put("sign", sign);
		
		String response = "";
		try {
			if(request.getFileParams()!=null && request.getFileParams().size()>0){
				response = WebUtils.doPost(url, params, request.getFileParams(), this.charset, connectTimeout, readTimeout);
			}else if("POST".equalsIgnoreCase(this.method)){
				response = WebUtils.doPost(url, params, this.charset, this.connectTimeout, this.readTimeout);
			}else if("GET".equalsIgnoreCase(this.method)){
				response = WebUtils.doGet(url, params, this.charset);
			}else{
				throw new RuntimeException("method must be get or post");
			}
		} catch (IOException e) {
			// TODO log
			throw new OpenApiException(OpenApiException.NETWORK_ERROR,"网络请求错误:"+e.getMessage());
		}
		//System.out.println(response);
		
		T res = null;
		try{
			Gson gson = new Gson();
			res = gson.fromJson(response, request.getResponseClass());
			res.setBody(response);
		}catch (Exception e) {
			
			try {
				res = request.getResponseClass().newInstance();
				res.setBody(response);
			} catch (Exception e1) {
			}
		}
		return res;
	}


	/** 生成签名
     * @param method HTTP请求方法 "get" / "post"
     * @param url_path CGI名字, 
     * @param params URL请求参数
     * @param secret 密钥
     * @return 签名值
     * @throws OpensnsException 不支持指定编码以及不支持指定的加密方法时抛出异常。
     */
    private String makeSign(String method, String secret, String apiPath, Map<String, String> params, String charset) throws OpenApiException{
    	String sig ="";
        try{
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(charset), mac.getAlgorithm());
            mac.init(secretKey);
            String mk = makeSource(method, apiPath, params, charset);
            //System.out.println("用于计算sign的源串："+mk);
            byte[] hash = mac.doFinal(mk.getBytes(charset));
            sig = new String(Base64Coder.encode(hash));
            //sig = encodeUrl(sig);
        }catch(Exception e){
            throw new OpenApiException(OpenApiException.MAKE_SIGNATURE_ERROR, e);
        }
        return sig;
    }

    /** 
     * URL编码 (符合FRC1738规范)
     * @param input 待编码的字符串
     * @return 编码后的字符串
     * @throws OpenApiException 不支持指定编码时抛出异常。
     */
    private String encodeUrl(String input, String charset) throws OpenApiException{
        try{
            return URLEncoder.encode(input, charset).replace("+", "%20").replace("*", "%2A");
        }catch(UnsupportedEncodingException e){
            throw new OpenApiException(OpenApiException.MAKE_SIGNATURE_ERROR, e);
        }
    }

    /** 生成签名所需源串
     * @param method HTTP请求方法 "get" / "post"
     * @param url_path CGI名字, 
     * @param params URL请求参数
     * @return 签名所需源串
     */
    private String makeSource(String method, String url_path, Map<String, String> params, String charset) throws OpenApiException, UnsupportedEncodingException{
        Object[] keys = params.keySet().toArray();
        Arrays.sort(keys);  
        StringBuilder buffer = new StringBuilder(128);
        buffer.append(method.toUpperCase()).append("&").append(encodeUrl(url_path, charset)).append("&");
        StringBuilder buffer2= new StringBuilder();
        for(int i=0; i<keys.length; i++){  
        	if(null != params.get(keys[i])){
        		buffer2.append(keys[i]).append("=").append(params.get(keys[i]));
        		if (i!=keys.length-1){
        			buffer2.append("&");
        		}
        	}
        }   
        //System.out.println("请求的所有参数："+buffer2);
        buffer.append(encodeUrl(buffer2.toString(),charset));
        return buffer.toString();
    }

	public void setMethod(String method) {
		this.method = method;
	}

}
