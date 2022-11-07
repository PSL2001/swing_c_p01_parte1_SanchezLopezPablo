/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio3.java
 * 5 nov 2022 - 17:49:55
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * The Class PanelEjercicio3.
 *
 * @author Usuario
 */
public class PanelEjercicio3 extends JPanel {
	
	/** The ltexto 3. */
	private JLabel ltexto3;
	
	/** The bg radio. */
	private ButtonGroup bgRadio;
	
	/** The rb 4. */
	private JRadioButton rb1, rb2, rb3, rb4;
	
	/**
	 * Instantiates a new panel ejercicio 3.
	 */
	public PanelEjercicio3() {
		this.setLayout(new GridLayout(0, 1, 0, 0));
		ltexto3 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		bgRadio = new ButtonGroup();
		rb1 = new JRadioButton("Pequeño");
		rb2 = new JRadioButton("Mediano");
		rb3 = new JRadioButton("Grande");
		rb4 = new JRadioButton("Muy Grande");
		
		
		bgRadio.add(rb1);
		bgRadio.add(rb2);
		bgRadio.add(rb3);
		bgRadio.add(rb4);
		
		Box cajaV = Box.createVerticalBox();
		Box cajaH = Box.createHorizontalBox();
		cajaH.add(rb1);
		cajaH.add(rb2);
		cajaH.add(rb3);
		cajaH.add(rb4);
		cajaV.add(cajaH);
		
		
		this.add(ltexto3);
		this.add(cajaV);
	}

}
