/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - Ventana.java
 * 2 nov 2022 - 8:17:24
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 * The Class Ventana.
 *
 * @author usuario
 */
public class Ventana extends JFrame implements ActionListener {
	
	/** The panel 1. */
	private PanelTitulo panel1;
	
	/** The panel 2. */
	private PanelButtons panel2;
	
	/** The panel 3. */
	private PanelActivity panel3;
	
	/** The panelej 1. */
	private PanelEjercicio1 panelej1;
	
	/** The panelej 2. */
	private PanelEjercicio2 panelej2;
	
	/** The panelej 3. */
	private PanelEjercicio3 panelej3;
	
	/** The panelej 4. */
	private PanelEjercicio4 panelej4;
	
	/** The panelej 5. */
	private PanelEjercicio5 panelej5;
	
	/**
	 * Instantiates a new ventana.
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
		
		
		//Ponemos los paneles de los ejercicios invisibles
		panelej1.setVisible(false);
		panelej2.setVisible(false);
		panelej3.setVisible(false);
		panelej4.setVisible(false);
		panelej5.setVisible(false);
		
		//Listeners
		PanelButtons.btn1.addActionListener(this);
		PanelButtons.btn2.addActionListener(this);
		PanelButtons.btn3.addActionListener(this);
		PanelButtons.btn4.addActionListener(this);
		PanelButtons.btn5.addActionListener(this);
		PanelActivity.btnActivity.addActionListener(this);
		
		//Alineamos los paneles
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(panel3, BorderLayout.SOUTH);
		this.add(cajaV, BorderLayout.CENTER);
		
		
		
		//Hacemos visible y mostramos
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (PanelButtons.btn1.isSelected()) {
			panelej1.setVisible(true);
		} else {
			panelej1.setVisible(false);
		}
		
		if (PanelButtons.btn2.isSelected()) {
			panelej2.setVisible(true);
		} else {
			panelej2.setVisible(false);
		}
		
		if (PanelButtons.btn3.isSelected()) {
			panelej3.setVisible(true);
		} else {
			panelej3.setVisible(false);
		}
		
		if (PanelButtons.btn4.isSelected()) {
			panelej4.setVisible(true);
		} else {
			panelej4.setVisible(false);
		}
		
		if (PanelButtons.btn5.isSelected()) {
			panelej5.setVisible(true);
		} else {
			panelej5.setVisible(false);
		}
		
		this.pack();
		this.setMinimumSize(new Dimension(this.getWidth(), this.getHeight()));
		
		if (e.getSource() == PanelActivity.btnActivity) {
			mostrarActividades();
		}
		
		
	}
	
	/**
	 * Mostrar actividades.
	 */
	private void mostrarActividades() {
		int contador = 0;
		String resultado = "Los ejercicios activos son: \n";
		
		JToggleButton [] botones = {PanelButtons.btn1, PanelButtons.btn2, PanelButtons.btn3, PanelButtons.btn4, PanelButtons.btn5};
		
		for (int i = 0; i < botones.length; i++) {
			if (botones[i].isSelected()) {
				resultado += "Ejercicio " + (i + 1) + "\n";
				contador++;
			}
		}
		
		JOptionPane.showMessageDialog(this, "Ejercicios Activos: " + contador + "\n" + resultado);
		
		
		
	}

}
