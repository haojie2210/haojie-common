package com.lianghaojie.common.utils;

/** 
 * @ClassName: FileUtil 
 * @Description: File 文件处理类
 * @author:单击开始
 * @date: 2019年9月20日 上午8:43:21  
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		
		String str = fileName.substring(fileName.lastIndexOf("."));
		return str;
	}

}
