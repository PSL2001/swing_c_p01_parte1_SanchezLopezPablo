/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio2.java
 * 4 nov 2022 - 9:20:41
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelEjercicio2 extends JPanel {
	private JComboBox<String> cbFuentes;
	private JLabel ltexto2;
	
	/**
	 * 
	 */
	public PanelEjercicio2() {
		//Obtenemos las fuentes del sistema
		String [] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//Las añadimos al comboBox
		cbFuentes = new JComboBox<String>(fuentes);
		//Creamos el label con el texto
		ltexto2 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		
		//Creamos las constrains para cada item y las añadimos al panel
		Box cajaV = Box.createVerticalBox();
		cajaV.add(cbFuentes);
		cajaV.add(ltexto2);
		
		
		this.add(cajaV);
		
		
		
	}

}
