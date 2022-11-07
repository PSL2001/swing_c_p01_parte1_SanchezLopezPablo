/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio2.java
 * 4 nov 2022 - 9:20:41
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Class PanelEjercicio2.
 *
 * @author usuario
 */
public class PanelEjercicio2 extends JPanel implements ActionListener {
	
	/** The cb fuentes. */
	private JComboBox<String> cbFuentes;
	
	/** The ltexto 2. */
	private JLabel ltexto2;
	
	/**
	 * Instantiates a new panel ejercicio 2.
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
		
		//Listeners
		cbFuentes.addActionListener(this);
		
		this.add(cajaV);
		
		
		
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object opcion = cbFuentes.getSelectedItem();
		ltexto2.setFont(new Font(opcion.toString(), Font.PLAIN, 20));
		
	}

}
