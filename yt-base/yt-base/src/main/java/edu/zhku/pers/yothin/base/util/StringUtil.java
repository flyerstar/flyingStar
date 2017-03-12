package edu.zhku.pers.yothin.base.util;

public class StringUtil {

	public final static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		String s = str.trim();
		if (s.length() == 0) {
			return true;
		}
		return false;
	}
}
