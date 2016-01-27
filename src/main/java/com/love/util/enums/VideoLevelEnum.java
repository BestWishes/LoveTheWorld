package com.love.util.enums;

/**影片等级枚举
 * @author LJJ 2016年1月26日 下午3:17:34
 *
 */
public enum VideoLevelEnum {

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

	private VideoLevelEnum(String value) {
		this.value = value;
	}

}
