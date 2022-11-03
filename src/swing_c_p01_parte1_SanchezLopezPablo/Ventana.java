/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - Ventana.java
 * 2 nov 2022 - 8:17:24
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private PanelTitulo panel1;
	private PanelButtons panel2;
	/**
	 * 
	 */
	public Ventana() {
		super("Swing Compendio Parte 1 Pablo Sánchez López");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Definimos layout en la ventana
		this.setLayout(new BorderLayout());
		
		
		//Declaramos paneles
		panel1 = new PanelTitulo();
		panel2 = new PanelButtons();
		
		//Alineamos los paneles
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		
		//Hacemos visible
		this.setVisible(true);
	}

}
