/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - Ventana.java
 * 2 nov 2022 - 8:17:24
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private PanelTitulo panel1;
	private PanelButtons panel2;
	private PanelActivity panel3;
	private PanelEjercicio1 panelej1;
	private PanelEjercicio2 panelej2;
	private PanelEjercicio3 panelej3;
	private PanelEjercicio4 panelej4;
	private PanelEjercicio5 panelej5;
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
		panel3 = new PanelActivity();
		panelej1 = new PanelEjercicio1();
		panelej2 = new PanelEjercicio2();
		panelej3 = new PanelEjercicio3();
		panelej4 = new PanelEjercicio4();
		panelej5 = new PanelEjercicio5();
		
		//Añadimos una caja Vertical para el resto de paneles
		Box cajaV = Box.createVerticalBox();
		cajaV.add(panelej1);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(panelej2);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(panelej3);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(panelej4);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(panelej5);
		
		
		
		//Alineamos los paneles
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(panel3, BorderLayout.SOUTH);
		this.add(cajaV, BorderLayout.CENTER);
		
		
		//Hacemos visible
		this.setVisible(true);
	}

}
