package com.love.util.enums;

/**用户角色枚举
 * @author LJJ 2016年1月25日 上午10:34:48
 *
 */
public enum UserRoleEnum {

	/**
	 * 管理员
	 */
	ADMIN("0"),
	/**
	 * vip会员
	 */
	VIP_REGISTER("1"),
	/**
	 * 大众会员
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
