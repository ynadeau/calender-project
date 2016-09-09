/**
 * File Name: CalendarApp.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Sep 9, 2016
 */
package com.sqa.yn;

/**
 * CalendarApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class CalendarApp extends BasicJavaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicJavaApp calApp = new CalendarApp();
		calApp.setAppName("Calendar Change");
		start(calApp);
	}

	@Override
	public void main() {
		System.out.println("Create core code for app...");
	}
}
