package com.lianghaojie.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/** 
 * @ClassName: StreamUtil 
 * @Description: Stream 流处理工具类
 * @author:单击开始
 * @date: 2019年9月20日 上午8:46:09  
 */
public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(AutoCloseable...autoCloseables){
		if (null != autoCloseables) {
			for (AutoCloseable c : autoCloseables) {
				try {
					//关闭流
					c.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte [] b = new byte[1024];
		int i = 0;
		while((i = src.read(b)) != -1) {
			out.write(b);
		}
		closeAll(src);
		return out.toString("utf-8");
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws IOException{
		InputStream src = new FileInputStream(txtFile);
		String file = readTextFile(src);
		return file;
	}

}
