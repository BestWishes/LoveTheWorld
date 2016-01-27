package com.love.util.enums;

/**用户状态枚举
 * @author LJJ 2016年1月25日 上午10:35:07
 *
 */
public enum UserStatusEnum {

	/**
	 * 正常使用中
	 */
	PASSED("0"),
	/**
	 * 冻结（暂时的）
	 */
	FROZEN("1"),
	/**
	 * 封停（永久的）
	 */
	SUSPENDED("2");
	
	private final String value;

	public String getValue() {
		return value;
	}

	private UserStatusEnum(String value) {
		this.value = value;
	}
	
}
