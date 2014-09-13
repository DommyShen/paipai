package com.sbkj.paipai.api.request.item;

import java.util.HashMap;
import java.util.Map;

import com.sbkj.paipai.api.PaipaiBaseRequest;
import com.sbkj.paipai.api.PaipaiRequest;
import com.sbkj.paipai.api.response.item.UploadItemStockImageResponse;
import com.sbkj.paipai.api.utils.FileItem;

/**
 * 卖家通过调用本接口上传商品库存图片，如原来库存图片已经存在则新上传图片会覆盖原有图片 post请求，http编码类型：enctype=multipart/form-data
 * @author DOmmy
 * create:2014-08-08
 */
public class UploadItemStockImageRequest extends PaipaiBaseRequest
				implements PaipaiRequest<UploadItemStockImageResponse>{

	/**商品编码 */
	private String itemCode;
	/**商品私有编码 */
	private String itemLocalCode;
	/**库存串，如：颜色:红 */
	private String stockStr;
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

	public String getStockStr() {
		return stockStr;
	}

	public void setStockStr(String stockStr) {
		this.stockStr = stockStr;
	}

	public FileItem getPic() {
		return pic;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}

	public String getApiMethodName() {
		return "/item/uploadItemStockImage.xhtml";
	}

	public Map<String, String> getTextParams() {
		Map<String,String> params = new HashMap<String, String>();
		params.put("itemCode", itemCode);
		params.put("itemLocalCode", itemLocalCode);
		params.put("stockStr", stockStr);
		
		params.put("format", getFormat());
		params.put("pureData", String.valueOf(getPureData()));
		params.put("needRoot", String.valueOf(getNeedRoot()));
		params.put("sellerUin", String.valueOf(getSellerUin()));
		return params;
	}

	public Class<UploadItemStockImageResponse> getResponseClass() {
		return UploadItemStockImageResponse.class;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String,FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", pic);
		return params;
	}

}
