package com.sbkj.paipai.api.request.attr;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.attr.GetNavByNavMapIdResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 获取指定类目的全路径
 * @author DOmmy
 * create:2014-08-09
 */
public class GetNavByNavMapIdRequest extends PaipaiBaseRequest
				implements PaipaiRequest<GetNavByNavMapIdResponse>{
	
	/**类目导航ID */
	private Long navId;
	/**发布地图mapId=0 搜索地图mapId=11 */
	private Long mapId;
	
	public Long getNavId() {
		return navId;
	}

	public void setNavId(Long navId) {
		this.navId = navId;
	}

	public Long getMapId() {
		return mapId;
	}

	public void setMapId(Long mapId) {
		this.mapId = mapId;
	}

	public String getApiMethodName() {
		return "/attr/getNavByNavMapId.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("navId", String.valueOf(navId));
		params.put("mapId", String.valueOf(mapId));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<GetNavByNavMapIdResponse> getResponseClass() {
		return GetNavByNavMapIdResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		return null;
	}

}
