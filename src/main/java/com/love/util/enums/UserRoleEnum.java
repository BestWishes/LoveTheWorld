package com.love.util.enums;

/**�û���ɫö��
 * @author LJJ 2016��1��25�� ����10:34:48
 *
 */
public enum UserRoleEnum {

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

	private UserRoleEnum(String value) {
		this.value = value;
	}

}
