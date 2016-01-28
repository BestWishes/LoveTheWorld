package com.love.util.enums;

/**ӰƬ����ö��
 * @author LJJ 2016��1��26�� ����3:17:13
 *
 */
public enum VideoTypeEnum {

	/**
	 * ��½
	 */
	MOVIE("0"),
	/**
	 * �պ�
	 */
	HMOVIE("1"),
	/**
	 * H����
	 */
	HCOMIC("2"),
	/**
	 *H3D 
	 */
	H3D("3");
	
	private final String value;

	public String getValue() {
		return value;
	}

	private VideoTypeEnum(String value) {
		this.value = value;
	}

}
