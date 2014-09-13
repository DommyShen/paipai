package com.sbkj.paipai.api.response.item;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.request.item.ModifyResult;

/**
 * 本接口主要用于上下架商品
 * @author DOmmy
 * create:2014-08-08
 */
public class ModifyItemStateResponse extends PaipaiResponse{

	private static final long serialVersionUID = -155895293943392595L;
	
	private List<ModifyResult> modifyResultList;

	public List<ModifyResult> getModifyResultList() {
		return modifyResultList;
	}

	public void setModifyResultList(List<ModifyResult> modifyResultList) {
		this.modifyResultList = modifyResultList;
	}
	
}
