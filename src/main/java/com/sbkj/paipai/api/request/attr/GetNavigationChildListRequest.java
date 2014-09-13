package com.sbkj.paipai.api.request.attr;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.attr.GetNavigationChildListResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 查询发布导航子类目列表
 * @author DOmmy
 * create:2014-08-09
 */
public class GetNavigationChildListRequest extends PaipaiBaseRequest
					implements PaipaiRequest<GetNavigationChildListResponse>{
	/**导航类目ID */
	private Long navigationId;
	
	public Long getNavigationId() {
		return navigationId;
	}

	public void setNavigationId(Long navigationId) {
		this.navigationId = navigationId;
	}

	public String getApiMethodName() {
		return "/attr/getNavigationChildList.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("navigationId", String.valueOf(navigationId));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetNavigationChildListResponse> getResponseClass() {
		return GetNavigationChildListResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
