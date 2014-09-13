package com.sbkj.paipai.api.response.attr;

import com.sbkj.paipai.api.PaipaiResponse;
import com.sbkj.paipai.api.domain.attr.NavBo;

/**
 * 获取指定类目的全路径
 * @author DOmmy
 * create:2014-08-09
 */
public class GetNavByNavMapIdResponse extends PaipaiResponse{

	private static final long serialVersionUID = -7620124898922974347L;

	private String rootName;
	private NavBo navBo;
	
	public String getRootName() {
		return rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}
	public NavBo getNavBo() {
		return navBo;
	}
	public void setNavBo(NavBo navBo) {
		this.navBo = navBo;
	}
	
}
