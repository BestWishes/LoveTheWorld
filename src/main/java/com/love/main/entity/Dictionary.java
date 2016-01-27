package com.love.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.love.main.base.BaseEntity;

/**
 * ×Öµäentity 2016-1-18 14:57:47
 * @author LJJ
 *
 */
@Table(name="DICTIONARY")
@Entity
public class Dictionary extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * ×ÖµäÖµ
	 */
	@Column
	private String dictValue;
	/**
	 * ×ÖµäÃû³Æ
	 */
	private String dictName;
	/**
	 * ÊÇ·ñ¹Ì¶¨
	 */
	private String isFixed;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}
	
}
