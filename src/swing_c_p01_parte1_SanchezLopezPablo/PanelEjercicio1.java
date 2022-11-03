/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio1.java
 * 3 nov 2022 - 12:55:53
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class PanelEjercicio1 extends JPanel {
	private JLabel ltexto;
	private JCheckBox cbNegrita, cbCursiva;
	/**
	 * 
	 */
	public PanelEjercicio1() {
		this.setLayout(new BorderLayout());
		//Declaramos los campos
		ltexto = new JLabel();
		cbNegrita = new JCheckBox("Negrita");
		cbCursiva = new JCheckBox("Cursiva");
		
		//Añadimos el texto al label
		ltexto.setText("En un lugar de la Mancha, de cuyo nombre ...");
		//Y añadimos la fuente
		Font fuente = ltexto.getFont();
		ltexto.setFont(new Font(fuente.getFontName(), Font.PLAIN, 20));
		
		//Y lo añadimos al panel
//		Box cajaV = Box.createVerticalBox();
		Box cajaH = Box.createHorizontalBox();
//		cajaV.add(ltexto);
//		cajaV.add(Box.createVerticalStrut(75));
		cajaH.add(cbNegrita);
		cajaH.add(cbCursiva);
//		cajaH.add(Box.createHorizontalStrut(75));
		
		
//		this.add(cajaH);
//		this.add(cajaV);
		
		this.add(ltexto, BorderLayout.NORTH);
		this.add(cajaH, BorderLayout.SOUTH);
		
	}

}
