/**
 * 
 */
package com.educationinfo.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Admin
 *
 */
public class GsonUtil {

	/**
	 * getGson
	 * 
	 * @return
	 */
	public static Gson getGson() {
		return new GsonBuilder().create();
	}

	/**
	 * getGsonNull
	 * 
	 * @return
	 */
	public static Gson getGsonNull() {
		return new GsonBuilder().serializeNulls().create();
	}

	/**
	 * toJson
	 * 
	 * @param t
	 * @return
	 */
	public static <T> String toJson(T t) {
		return getGson().toJson(t);
	}
}
