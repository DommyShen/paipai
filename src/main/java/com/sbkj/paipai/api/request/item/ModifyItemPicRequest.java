package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.ModifyItemPicResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口上传图片到卖家图片存储空间（地址为[ http://ext.paipai.com/album/photomanage ]，
 * 具体的操作在左侧栏的新手帮助中有说明）并将商品图片添加或者修改为该空间的图片 post请求，http编码类型：enctype=multipart/form-data
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemPicRequest extends PaipaiBaseRequest
					implements PaipaiRequest<ModifyItemPicResponse>{
	
	/**商品编码
itemCode和itemLocalCode至少必须填写一个。
索引字段，不能修改。 */
	private String itemCode;
	/**商家编码
itemCode和itemLocalCode至少必须填写一个。
索引字段，不能修改。 */
	private String itemLocalCode;
	/**商品图片索引
第几张商品。取值只能是0到4之间
默认为0。一般商品拥有1-5张图片。 */
	private Integer index;
	/**图片二进制数据图片仅支持jpg和gif格式。  */
	private FileItem pic;
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemLocalCode() {
		return itemLocalCode;
	}

	public void setItemLocalCode(String itemLocalCode) {
		this.itemLocalCode = itemLocalCode;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public FileItem getPic() {
		return pic;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}

	public String getApiMethodName() {
		return "/item/modifyItemPic.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("index", String.valueOf(index));
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<ModifyItemPicResponse> getResponseClass() {
		return ModifyItemPicResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String,FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", pic);
		return params;
	}

}
