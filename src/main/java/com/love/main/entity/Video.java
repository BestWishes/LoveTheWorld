package com.love.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.love.main.base.BaseEntity;

/**ӰƬentity
 * @author LJJ 2016��1��26�� ����3:07:15
 *
 */
@Table(name="VIDEO")
@Entity
public class Video extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * ӰƬ����
	 */
	private String name;
	/**
	 * ӰƬ·��
	 */
	private String path;
	/**
	 * �ۿ�ӰƬ������û�����(0:����Ա ,1:VIP��Ա ,2:���ڻ�Ա)
	 */
	private String level;
	/**
	 * ӰƬ����
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
