package com.sbkj.paipai.api;

import java.util.Map;

import com.sbkj.paipai.api.utils.FileItem;

/**
 * 拍拍请求
 * @author DOmmy
 * create:2014-08-08
 * @param <T>
 */
public interface PaipaiRequest<T extends PaipaiResponse> {

	/**
	 * 获取TOP的API名称。
	 * 
	 * @return API名称
	 */
	public String getApiMethodName();

	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, String> getTextParams();

	public Class<T> getResponseClass();
	
	public Map<String, FileItem> getFileParams();
	
}
