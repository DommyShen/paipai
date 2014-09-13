package com.sbkj.paipai.api.response.item;

import com.sbkj.paipai.api.PaipaiResponse;

/**
 * 本接口主要用于编辑商品的各个属性,如果不需要编辑某个属性,则无需编辑的属性不需要传值。 对于修改商品详情、修改商品价格、修改商品库存，
 * 请采用单独修改商品详情、修改商品库存和价格的接口 参考： 单独修改商品详情： http://pop.paipai.com/bin/view/Main/modifyItemDetailInfo 
 * 单独修改商品库存或价格： http://pop.paipai.com/bin/view/Main/modifyItemStock
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemResponse extends PaipaiResponse{

	private static final long serialVersionUID = -3700859296032798400L;
	/**商品编码 */
	private String itemCode;
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
}
