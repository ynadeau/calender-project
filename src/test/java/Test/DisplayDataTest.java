/**
 * File Name: DisplaydataTest.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 27, 2016
 */
/**
 * DisplaydataTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
package Test;

import org.testng.annotations.Test;

import com.sqa.yn.util.helpers.DisplayConvertArray;

public class DisplayDataTest {

	// @DataProvider
	// Get This
	@Test(enabled = false)
	public void convertIntArray() {
		Object[][] newObjectData = DisplayConvertArray.convertIntArray(intData());
		DisplayConvertArray.display2DArray(newObjectData);
	}

	// public Object[][] data() {
	// // TODO Return a Object[][], not null
	// return null;
	// }
	// 6X4 array
	public Object[][] data() {
		return new Object[][] { new Object[] { "Sample Test 1", 3.25, 6, 9L }, new Object[] { "Sample Test 2", 15.75, 4, 19L }, new Object[] { "Sample Test 3", -15.0, -5, -20L }, new Object[] { "Sample Test 4", 100.5, -100, 0L },
				new Object[] { "Sample Test 5", -100.75, 200, 100L }, new Object[] { "Sample Test 6", 300.9, 900000, 910000L } };
	}

	// public Object[][] intData() {
	// public int[][] intData() {
	// // TODO Return a int[][], not null
	// return null;
	// }
	public int[][] intData() {
		return new int[][] { new int[] { 3, 6, 9 }, new int[] { 15, 4, 19 }, new int[] { -15, -5, -20 }, new int[] { 100, -100, 0 }, new int[] { -100, 200, 100 }, new int[] { 10000, 900000, 910000 } };
	}

	@Test
	public void objectArray() {
		DisplayConvertArray.display2DArray(data());
	}
	// public static Object[][] display2DArray(int[][] is) {
	// data2 = new Object[2][2];
	// throw new RunTimeException("Test not implemented");
	// }
}