package com.sbkj.paipai.api.domain.attr;

public class Navigation {
	private String navigationId;
	private String navigationName;
	private String isClass;//0或1
	private String navProp;
	
	public String getNavigationId() {
		return navigationId;
	}
	public void setNavigationId(String navigationId) {
		this.navigationId = navigationId;
	}
	public String getNavigationName() {
		return navigationName;
	}
	public void setNavigationName(String navigationName) {
		this.navigationName = navigationName;
	}
	public String getIsClass() {
		return isClass;
	}
	public void setIsClass(String isClass) {
		this.isClass = isClass;
	}
	public String getNavProp() {
		return navProp;
	}
	public void setNavProp(String navProp) {
		this.navProp = navProp;
	}
	
}
