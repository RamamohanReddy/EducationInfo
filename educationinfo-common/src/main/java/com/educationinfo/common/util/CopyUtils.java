/**
 * 
 */
package com.educationinfo.common.util;

import org.springframework.beans.BeanUtils;

/**
 * @author Admin
 *
 */
public class CopyUtils {

	/**
	 * copy
	 * 
	 * @param s
	 * @param t
	 */
	public static <S,T> void copy(S s,T t){
		BeanUtils.copyProperties(s, t);
	}
}
