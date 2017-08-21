package cn.ynh.myproject.utils;

import java.security.MessageDigest;

/**
 * md5加密工具类
 *
 * Created by ynh on 2017/8/21.
 */
public class Md5Util {

	/**
	 * @param str 明码字符串
	 *
	 * @return md5 加密字符串
	 */
	public static String changeToMd5(String str){

		String md5 = null;

		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			md5 = toHexString(md.digest());

		} catch (Exception e){
			e.printStackTrace();

		}
		return md5;
	}

	/**
	 * @param in md5密码(byte)
	 *
	 * @return md5密码(16进位)
	 */
	private static String toHexString(byte[] in){

		StringBuilder hexString = new StringBuilder();

		for (byte anIn : in){
			String hex = Integer.toHexString(0xFF & anIn);
			if (hex.length() == 1){
				hexString.append('0');
			}
			hexString.append(hex);

		}
		return hexString.toString();
	}

}
