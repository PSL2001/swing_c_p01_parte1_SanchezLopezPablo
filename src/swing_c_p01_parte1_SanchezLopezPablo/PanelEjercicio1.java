/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio1.java
 * 3 nov 2022 - 12:55:53
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

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
public class PanelEjercicio1 extends JPanel implements ActionListener {

	/** The ltexto 1. */
	private JLabel ltexto1;

	/** The cb cursiva. */
	private JCheckBox cbNegrita, cbCursiva;

	/**
	 * Instantiates a new panel ejercicio 1.
	 */
	public PanelEjercicio1() {
		this.setLayout(new GridLayout(0, 1, 0, 0));
		// Declaramos los campos
		ltexto1 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		cbNegrita = new JCheckBox("Negrita");
		cbCursiva = new JCheckBox("Cursiva");

		// Y añadimos la fuente
		ltexto1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		// Añadimos listeners
		cbNegrita.addActionListener(this);
		cbCursiva.addActionListener(this);

		// Y lo añadimos al panel
		Box cajaV = Box.createVerticalBox();
		Box cajaH = Box.createHorizontalBox();

		cajaH.add(cbNegrita);
		cajaH.add(cbCursiva);
		cajaV.add(cajaH);

		this.add(ltexto1);
		this.add(cajaV);
		this.setBorder(
				BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.YELLOW, Color.GRAY, Color.BLACK));

	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Font fuentedefault = ltexto1.getFont();
		if (cbNegrita.isSelected() && cbCursiva.isSelected()) {
			// cambio el texto a negrita y cursiva
			ltexto1.setFont( new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		} else if (cbCursiva.isSelected()) {
			// Cambie el texto a cursiva
			ltexto1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		} else if (cbNegrita.isSelected()) {
			ltexto1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		} else {
			ltexto1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		}

	}

}
