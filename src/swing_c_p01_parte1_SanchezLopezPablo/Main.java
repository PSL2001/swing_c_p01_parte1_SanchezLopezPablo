/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - Main.java
 * 2 nov 2022 - 8:16:59
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Dimension;

/**
 * @author usuario
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setMinimumSize(new Dimension(v.getWidth(), v.getHeight()));
	}

}
