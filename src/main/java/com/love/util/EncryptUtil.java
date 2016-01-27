package com.love.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**用户加密工具类
 * @author LJJ 2016年1月20日 上午10:54:11
 *
 */
public class EncryptUtil {
	public static String Encrypt(String info) {
		String result = "";
		char[] encryptChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'A', 'B', 'C', 'D', 'E', 'F' };
		byte[] infoBytes = info.getBytes();
		byte[] encryptBytes = null;
		int encryptBytesLength = 0;
		char[] resultChar = null;

		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			md5.update(infoBytes);
			encryptBytes = md5.digest();
			encryptBytesLength = encryptBytes.length;
			resultChar = new char[encryptBytesLength * 2];

			int k = 0;
			for (int i = 0; i < encryptBytesLength; i++) {
				byte byte0 = encryptBytes[i];
				resultChar[k++] = encryptChars[byte0 >>> 4 & 0xf];
				resultChar[k++] = encryptChars[byte0 & 0xf];
			}
			result = new String(resultChar); // 获取返回的字符串
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 获取MD5加密算法的对象

		return result;
	}
}
