package com.love.util.enums;

/**�û�״̬ö��
 * @author LJJ 2016��1��25�� ����10:35:07
 *
 */
public enum UserStatusEnum {

	/**
	 * ����ʹ����
	 */
	PASSED("0"),
	/**
	 * ���ᣨ��ʱ�ģ�
	 */
	FROZEN("1"),
	/**
	 * ��ͣ�����õģ�
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
