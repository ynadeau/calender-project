/**
 * File Name: DisplayConvertArray.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 27, 2016
 */
package com.sqa.yn.util.helpers;

// import org.testng.annotations.Test;
/**
 * DisplayConvertArray //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods) //DATA PROVIDER Google -> search java
 * iterate 2d array
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class DisplayConvertArray {

	// incomplete
	// static Object[][] data2;
	public static Object[][] convertIntArray(int[][] data) {
		Object[][] newData = new Object[data[0].length][];
		return newData;
		// return null;
		// throw new RunTimeException("Test not implemented");
	}

	public static void display2DArray(Object[][] data) {
		// Object[][] data2 = new Object[2][2];
		for (int i = 0; i < data[0].length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println("Data Display" + i + j + data[i][j]);
			}
		}
		// throw new RunTimeException("Test not implemented");
	}
}
