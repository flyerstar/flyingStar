package edu.zhku.pers.yothin.base.util;

import org.apache.log4j.Logger;

public class LogUtil {

	private static final Logger logger = Logger.getLogger(LogUtil.class);
	
	public static void logException(String errorTitle,Exception e){
		StringBuilder sb = new StringBuilder();
		sb.append(errorTitle).append(":").append(e);
		logger.error(sb);
	}
}
