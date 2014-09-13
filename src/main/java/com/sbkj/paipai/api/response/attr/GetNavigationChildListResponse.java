package com.sbkj.paipai.api.response.attr;

import java.util.List;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.attr.Navigation;

/**
 * 查询发布导航子类目列表
 * @author DOmmy
 * create:2014-08-09
 */
public class GetNavigationChildListResponse extends PaipaiResponse{

	private static final long serialVersionUID = -8259462870672797640L;
	
	private Long childCount;
	private List<Navigation> childList;
	
	public Long getChildCount() {
		return childCount;
	}
	public void setChildCount(Long childCount) {
		this.childCount = childCount;
	}
	public List<Navigation> getChildList() {
		return childList;
	}
	public void setChildList(List<Navigation> childList) {
		this.childList = childList;
	}
	
}
