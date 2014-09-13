package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 根据商品编码查询单个商品详情描述的接口
 * @author DOmmy
 * create:2014-08-09
 */
public class GetItemDetailInfoResponse extends PaipaiResponse{

	private static final long serialVersionUID = -6005296654743358016L;
	/**商品的详情内容 */
	private String detailInfo;

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
		
}
