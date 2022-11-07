/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelButtons.java
 * 2 nov 2022 - 10:16:58
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * The Class PanelButtons.
 *
 * @author usuario
 */
public class PanelButtons extends JPanel {
	
	/** The btn 5. */
	public static JToggleButton btn1, btn2, btn3, btn4, btn5;
	
	/**
	 * Instantiates a new panel buttons.
	 */
	public PanelButtons() {
		//Declaramos los botones
		btn1 = new JToggleButton("Ejercicio 1");
		btn2 = new JToggleButton("Ejercicio 2");
		btn3 = new JToggleButton("Ejercicio 3");
		btn4 = new JToggleButton("Ejercicio 4");
		btn5 = new JToggleButton("Ejercicio 5");
		//Creamos una caja vertical (Vertical Box)
		Box cajaV = Box.createVerticalBox();
		cajaV.add(Box.createVerticalStrut(70));
		cajaV.add(btn1);
		cajaV.add(Box.createVerticalStrut(70));
		cajaV.add(btn2);
		cajaV.add(Box.createVerticalStrut(70));
		cajaV.add(btn3);
		cajaV.add(Box.createVerticalStrut(70));
		cajaV.add(btn4);
		cajaV.add(Box.createVerticalStrut(70));
		cajaV.add(btn5);
		
		this.add(cajaV);
	}

}
