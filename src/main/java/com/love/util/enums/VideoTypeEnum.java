package com.love.util.enums;

/**影片类型枚举
 * @author LJJ 2016年1月26日 下午3:17:13
 *
 */
public enum VideoTypeEnum {

	/**
	 * 大陆
	 */
	MOVIE("0"),
	/**
	 * 日韩
	 */
	HMOVIE("1"),
	/**
	 * H动漫
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
