package com.love.util.enums;

/**ӰƬ�ȼ�ö��
 * @author LJJ 2016��1��26�� ����3:17:34
 *
 */
public enum VideoLevelEnum {

	/**
	 * ����Ա
	 */
	ADMIN("0"),
	/**
	 * vip��Ա
	 */
	VIP_REGISTER("1"),
	/**
	 * ���ڻ�Ա
	 */
	REGISTER("2");
	
	private final String value;

	public String getValue() {
		return value;
	}

	private VideoLevelEnum(String value) {
		this.value = value;
	}

}
