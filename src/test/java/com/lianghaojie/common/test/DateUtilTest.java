package com.lianghaojie.common.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

import com.lianghaojie.common.utils.DateUtils;
public class DateUtilTest {

	/**
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换， 将上面{2}的位置使用DateUtil
	 * 工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串
	 * 
	 * @Title: test1
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test1() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startDate = df.format(DateUtils.getDateByInitMonth(new Date()));
		String endDate = df.format(DateUtils.getDateByFullMonth(new Date()));

		String sql = "select * from t_order where create_time>='{1}'" + " and create_time<='{2}' ";

		String sql1 = sql.replace("{1}", startDate);
		String sql2 = sql1.replace("{2}", endDate);

		System.out.println(sql2);

	}

	@Test // 测试月末
	public void testGetDateByFullMonth() {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 1);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = DateUtils.getDateByFullMonth(c.getTime());
		System.out.println(df.format(date));

	}

	@Test // 测试月初
	public void testGetDateByInitMonth() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = DateUtils.getDateByInitMonth(new Date());
		System.out.println(df.format(date));

	}

	@Test
	public void testRandomDate() {
	}

}
