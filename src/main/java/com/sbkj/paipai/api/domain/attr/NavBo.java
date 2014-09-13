package com.sbkj.paipai.api.domain.attr;

import java.util.List;

public class NavBo {
	private NavNode NavNode;
	private List<NavNode> FullPath;
	private List<NavNode> MetaSearchPath;
	private List<NavNode> ChildNode;
	public NavNode getNavNode() {
		return NavNode;
	}
	public void setNavNode(NavNode navNode) {
		NavNode = navNode;
	}
	public List<NavNode> getFullPath() {
		return FullPath;
	}
	public void setFullPath(List<NavNode> fullPath) {
		FullPath = fullPath;
	}
	public List<NavNode> getMetaSearchPath() {
		return MetaSearchPath;
	}
	public void setMetaSearchPath(List<NavNode> metaSearchPath) {
		MetaSearchPath = metaSearchPath;
	}
	public List<NavNode> getChildNode() {
		return ChildNode;
	}
	public void setChildNode(List<NavNode> childNode) {
		ChildNode = childNode;
	}
	
}
