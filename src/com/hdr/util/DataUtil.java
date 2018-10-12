package com.hdr.util;

import java.math.BigDecimal;

public class DataUtil {
	/**
	 * Datatype: Converts Byte Stream to String
	 */
	protected static String covertBytesToString(byte[] value){
		if(value!=null){
			return new String(value);
		}
		return null;
	}
	
	/**
	 * Datatype: Converts Big Decimal to Long
	 */

	protected static Long convertBigDecimalToLong(BigDecimal value) {
		if(value!=null){
			return Long.getLong(String.valueOf(value)); 
		}
		return null;
	}

	
}
