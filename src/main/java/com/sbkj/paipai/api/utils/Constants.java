package com.sbkj.paipai.api.utils;

/**
 * 公用常量类
 * @author DOmmy
 * create:2014-08-08
 */
public abstract class Constants {

	/** TOP默认时间格式 **/
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/** UTF-8字符集 **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** GBK字符集 **/
	public static final String CHARSET_GBK = "GBK";

	/** TOP JSON 应格式 */
	public static final String FORMAT_JSON = "json";
	/** TOP XML 应格式 */
	public static final String FORMAT_XML = "xml";

	/** 请求地址 */
	public static final String REQUEST_URL = "http://api.paipai.com";
	
	public static final int CONNECT_TIMEOUT = 3000;//3秒
	
	public static final int READ_TIMEOUT = 15000;//15秒
	
	public static final String METHOD_POST = "POST";
	public static final String METHOD_GET = "GET";

}
