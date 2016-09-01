package com.sqa.yn.util.helpers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DisplayConvertArrayTest {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, new Object[] { 2, "b" }, };
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		DisplayConvertArray.display2DArray(dp());
	}
}
