package com.bartlett.esccontrol.domain;

import org.springframework.stereotype.Repository;

@Repository
public class Menus {
	private int menuId;
	private String menuLabel;
	private String menuUrl;
	
	public Menus(){}
	
	public Menus(int menuId, String menuLabel, String menuUrl) {
		super();
		this.menuId = menuId;
		this.menuLabel = menuLabel;
		this.menuUrl = menuUrl;
	}

	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuLabel() {
		return menuLabel;
	}
	public void setMenuLabel(String menuLabel) {
		this.menuLabel = menuLabel;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
}
