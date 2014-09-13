package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 卖家通过调用本接口上传图片到卖家图片存储空间（地址为[ http://ext.paipai.com/album/photomanage ]，
 * 具体的操作在左侧栏的新手帮助中有说明）并将商品图片添加或者修改为该空间的图片 post请求，http编码类型：enctype=multipart/form-data
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemPicResponse extends PaipaiResponse{

	private static final long serialVersionUID = -3095180457739988542L;
	
	/**商品编码 */
	private String itemCode;
	/**上传图片后的URL */
	private String picLink;
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getPicLink() {
		return picLink;
	}
	public void setPicLink(String picLink) {
		this.picLink = picLink;
	}
	
}
