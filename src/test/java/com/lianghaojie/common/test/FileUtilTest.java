package com.lianghaojie.common.test;

import org.junit.Test;
import com.lianghaojie.common.utils.FileUtil;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {

		String name = FileUtil.getExtendName("a.aa.pngjsp");
		System.out.println(name);

	}

}
