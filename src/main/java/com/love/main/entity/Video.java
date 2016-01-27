package com.love.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.love.main.base.BaseEntity;

/**影片entity
 * @author LJJ 2016年1月26日 下午3:07:15
 *
 */
@Table(name="VIDEO")
@Entity
public class Video extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 影片名称
	 */
	private String name;
	/**
	 * 影片路径
	 */
	private String path;
	/**
	 * 观看影片所需的用户级别(0:管理员 ,1:VIP会员 ,2:大众会员)
	 */
	private String level;
	/**
	 * 影片类型
	 */
	private String type;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
