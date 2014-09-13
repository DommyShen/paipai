package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口删除商品主图，采用post请求
 * @author DOmmy
 * create:2014-08-08
 */
public class DeleteItemPicResponse extends PaipaiResponse{

	private static final long serialVersionUID = 3993250783191318651L;
	
	/**商品编码 */
	private String itemCode;
	/**被删除主图的索引 */
	private String pictureIndex;
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getPictureIndex() {
		return pictureIndex;
	}
	public void setPictureIndex(String pictureIndex) {
		this.pictureIndex = pictureIndex;
	}
	
}
