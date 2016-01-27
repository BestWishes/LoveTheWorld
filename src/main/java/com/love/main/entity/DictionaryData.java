package com.love.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.love.main.base.BaseEntity;

/**
 * 	�ֵ����ݱ�entity 	2016-1-18 17:36:33
 * @author Ljj
 *
 */
@Table(name="DICTIONARY_DATA")
@Entity
public class DictionaryData extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * �ֵ�ֵ
	 */
	private String dictValue;
	/**
	 * �ֵ�����ֵ
	 */
	private String dictDataValue;
	/**
	 * �ֵ���������
	 */
	private String dictDataName;
	/**
	 * ����;�ֶ�
	 */
	private String variableValue;
	/**
	 * �Ƿ�̶�
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
	public String getDictDataValue() {
		return dictDataValue;
	}
	public void setDictDataValue(String dictDataValue) {
		this.dictDataValue = dictDataValue;
	}
	public String getDictDataName() {
		return dictDataName;
	}
	public void setDictDataName(String dictDataName) {
		this.dictDataName = dictDataName;
	}
	public String getVariableValue() {
		return variableValue;
	}
	public void setVariableValue(String variableValue) {
		this.variableValue = variableValue;
	}
	public String getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}
	
}
