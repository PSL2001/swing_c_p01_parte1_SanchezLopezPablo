/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelButtons.java
 * 2 nov 2022 - 10:16:58
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * @author usuario
 *
 */
public class PanelButtons extends JPanel {
	private JToggleButton btn1, btn2, btn3, btn4, btn5;
	/**
	 * 
	 */
	public PanelButtons() {
		btn1 = new JToggleButton("Ejercicio 1");
		btn2 = new JToggleButton("Ejercicio 2");
		btn3 = new JToggleButton("Ejercicio 3");
		btn4 = new JToggleButton("Ejercicio 4");
		btn5 = new JToggleButton("Ejercicio 5");
	}

}
