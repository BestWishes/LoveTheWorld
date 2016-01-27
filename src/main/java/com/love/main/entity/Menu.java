package com.love.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.love.main.base.BaseEntity;

@Table(name="MENU")
@Entity
public class Menu extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 节点标识
	 */
	private String uId;
	/**
	 * 父节点标识
	 */
	private String parentId;
	/**
	 * 节点名称
	 */
	private String name;
	/**
	 * 节点代表url
	 */
	private String url;
	/**
	 * 是否已经删除
	 */
	private String deleted;
	/**
	 * 节点角色
	 */
	private String role;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
