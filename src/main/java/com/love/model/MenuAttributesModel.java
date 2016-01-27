package com.love.model;

import java.io.Serializable;

/**
 * 菜单节点属性
 * @author LJJ 2016年1月22日 下午3:25:00
 *
 */
public class MenuAttributesModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private String url;
	private String role;
	private String parentId;
	private String deleted;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	
}
