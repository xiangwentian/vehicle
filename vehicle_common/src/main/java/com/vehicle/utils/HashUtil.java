package com.vehicle.utils;

/**
 * 获取ascii、hash工具
 * 
 * @author liuzhuang
 */
public class HashUtil {

	/**
	 * invoke method like:getAscii("冀B851LP", 0, 1)
	 * 
	 * @param str
	 * @param index
	 * @param len
	 * @return
	 */
	public static int getAscii(String str, int index, int len) {
		char[] chinese = new char[str.length()];
		chinese = str.substring(index, len).toCharArray();
		// System.out.println("chinese:" + chinese);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			// for (int i = 0; i < chinese.length; i++) {
			System.out.print((int) chinese[i] + " ");
			// sb.append((int) chinese[i] + ",");
			sb.append((int) chinese[i]);
		}

		System.out.println();
		// System.out.println(sb.toString());
		Integer res = Integer.valueOf(sb.toString());
		System.out.println(res);
		return Integer.parseInt(sb.toString());
	}
	
}
