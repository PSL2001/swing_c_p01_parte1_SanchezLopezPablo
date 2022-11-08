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

		// Y lo añadimos al panel con cajas
		Box cajaV = Box.createVerticalBox();
		Box cajaH = Box.createHorizontalBox();
		/*
		 * Introduzco la caja horizontal dentro de la vertical para que se añada directamente al centro
		 * si no hago esto, se queda descentrada la actividad
		 */
		cajaH.add(cbNegrita);
		cajaH.add(cbCursiva);
		cajaV.add(cajaH);
		
		//Añadimos al panel y ponemos un borde
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
		//1º se comprueba si ambos estan seleccionados
		if (cbNegrita.isSelected() && cbCursiva.isSelected()) {
			// Si se da ese caso, cambio el texto a negrita y/o cursiva
			ltexto1.setFont( new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		} else if (cbCursiva.isSelected()) { //En otro caso si solo esta activa la cursiva
			// Cambiamos el texto a cursiva
			ltexto1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		} else if (cbNegrita.isSelected()) { //Hacemos lo mismo para negrita
			ltexto1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		} else {
			//Y si ninguno esta activado dejamos la fuente en plano
			ltexto1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		}

	}

}
