/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio5.java
 * 6 nov 2022 - 10:52:54
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * The Class PanelEjercicio5.
 *
 * @author Usuario
 */
public class PanelEjercicio5 extends JPanel implements ChangeListener {
	
	/** The limg 4. */
	private JLabel ltexto5, limg1, limg2, limg3, limg4;
	
	/** The spinner. */
	private JSpinner spinner;
	
	/** The img 4. */
	private imageRes img1, img2, img3, img4;
	
	/**
	 * Instantiates a new panel ejercicio 5.
	 */
	public PanelEjercicio5() {
		//Creamos un label texto
		ltexto5 = new JLabel("¿Cuantas Imágenes quieres mostrar?");
		//Y un spinner numérico que empieza en 0, termina en 4 y pasa de 1 en 1
		spinner = new JSpinner(new SpinnerNumberModel(0, 0, 4, 1));
		
		//Declaramos una imageRes (una clase que hize) y le pasamos la localizacion del recurso y que utilize ancho y largo por defecto (o 0, 0 en este caso)
		img1 = new imageRes("recursos/imagen.jpg", 0, 0);
		img2 = new imageRes("recursos/imagen2.jpg", 0, 0);
		img3 = new imageRes("recursos/imagen3.jpg", 0, 0);
		img4 = new imageRes("recursos/imagen4.jpg", 0, 0);
		
		//Algunas imagenes que he escogido son un poco grandes para mi gusto, cambio su alto y ancho aqui
		img2.setAncho(img2.getAncho()/2);
		img2.setLargo(img2.getLargo()/2);
		
		img3.setAncho(img3.getAncho()/2);
		img3.setLargo(img3.getLargo()/2);
		
		//Añadimos las imagenes a los labels con la nueva resolucion (Mira en imageRes para ver este funcionamiento)
		limg1 = new JLabel(img1.devolverImagen());
		limg2 = new JLabel(img2.devolverImagen());
		limg3 = new JLabel(img3.devolverImagen());
		limg4 = new JLabel(img4.devolverImagen());
		
		//Listeners
		spinner.addChangeListener(this);
		
		//Creamos unas cajas para guardar los elementos
		Box cajaH = Box.createHorizontalBox();
		Box cajaV = Box.createVerticalBox();
		Box cajaH2 = Box.createHorizontalBox();
		
		//Hacemos las imagenes invisibles
		limg1.setVisible(false);
		limg2.setVisible(false);
		limg3.setVisible(false);
		limg4.setVisible(false);
		
		//Añadimos tanto el texto como el spinner en 1 caja
		cajaH.add(ltexto5);
		cajaH.add(Box.createHorizontalStrut(10));
		cajaH.add(spinner);
		
		//Añadimos en la 2da caja las imagenes
		cajaH2.add(limg1);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg3);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg4);
		
		//Por ultimo a la caja vertical le añadimos las 2 horizontales
		cajaV.add(cajaH);
		cajaV.add(cajaH2);
		
		//Añadimos al panel y creamos el borde
		this.add(cajaV);
		this.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
		
	}

	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		int cantidad = (int) spinner.getValue();
		JLabel [] labels = {limg1,limg2,limg3,limg4};
		
		for (int i = 0; i < labels.length; i++) {
			labels[i].setVisible(false);
		}
		
		for (int i = 0; i < cantidad; i++) {
			labels[i].setVisible(true);
		}
	}

}
