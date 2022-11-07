/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio3.java
 * 5 nov 2022 - 17:49:55
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class PanelEjercicio3 extends JPanel implements ActionListener {
	
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
		//Creamos el layout
		this.setLayout(new GridLayout(0, 1, 0, 0));
		ltexto3 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		bgRadio = new ButtonGroup();
		rb1 = new JRadioButton("Pequeño");
		rb2 = new JRadioButton("Mediano");
		rb3 = new JRadioButton("Grande");
		rb4 = new JRadioButton("Muy Grande");
		
		//Añadimos los radiobuttons al grupo
		bgRadio.add(rb1);
		bgRadio.add(rb2);
		bgRadio.add(rb3);
		bgRadio.add(rb4);
		
		//Listeners
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
		
		//Añadimos
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

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			ltexto3.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		}
		if (rb2.isSelected()) {
			ltexto3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		}
		if (rb3.isSelected()) {
			ltexto3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		}
		if (rb4.isSelected()) {
			ltexto3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		}
		
		
	}

}
