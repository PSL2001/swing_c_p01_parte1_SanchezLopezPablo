/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio1.java
 * 3 nov 2022 - 12:55:53
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * The Class PanelEjercicio1.
 *
 * @author usuario
 */
public class PanelEjercicio1 extends JPanel {
	
	/** The ltexto 1. */
	private JLabel ltexto1;
	
	/** The cb cursiva. */
	private JCheckBox cbNegrita, cbCursiva;
	
	/**
	 * Instantiates a new panel ejercicio 1.
	 */
	public PanelEjercicio1() {
		this.setLayout(new GridLayout(0, 1, 0, 0));
		//Declaramos los campos
		ltexto1 = new JLabel();
		cbNegrita = new JCheckBox("Negrita");
		cbCursiva = new JCheckBox("Cursiva");
		
		//Añadimos el texto al label
		ltexto1.setText("En un lugar de la Mancha, de cuyo nombre ...");
		//Y añadimos la fuente
		Font fuente = ltexto1.getFont();
		ltexto1.setFont(new Font(fuente.getFontName(), Font.PLAIN, 20));
		
		//Y lo añadimos al panel
		Box cajaV = Box.createVerticalBox();
		Box cajaH = Box.createHorizontalBox();

		cajaH.add(cbNegrita);
		cajaH.add(cbCursiva);
		cajaV.add(cajaH);
		
		this.add(ltexto1);
		this.add(cajaV);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.YELLOW, Color.GRAY, Color.BLACK));
		
	}

}
