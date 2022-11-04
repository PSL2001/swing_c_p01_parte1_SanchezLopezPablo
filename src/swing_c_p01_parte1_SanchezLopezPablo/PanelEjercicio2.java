/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio2.java
 * 4 nov 2022 - 9:20:41
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.GraphicsEnvironment;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelEjercicio2 extends JPanel {
	private JComboBox cbFuentes;
	private JLabel lTexto;
	
	/**
	 * 
	 */
	public PanelEjercicio2() {
		String [] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		cbFuentes = new JComboBox()
	}

}
