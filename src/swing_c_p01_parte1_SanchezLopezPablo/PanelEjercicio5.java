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
		ltexto5 = new JLabel("¿Cuantas Imágenes quieres mostrar?");
		spinner = new JSpinner(new SpinnerNumberModel(0, 0, 4, 1));
		
		img1 = new imageRes("recursos/imagen.jpg", 0, 0);
		img2 = new imageRes("recursos/imagen2.jpg", 0, 0);
		img3 = new imageRes("recursos/imagen3.jpg", 0, 0);
		img4 = new imageRes("recursos/imagen4.jpg", 0, 0);
		
		img2.setAncho(img2.getAncho()/2);
		img2.setLargo(img2.getLargo()/2);
		
		img3.setAncho(img3.getAncho()/2);
		img3.setLargo(img3.getLargo()/2);
		
		limg1 = new JLabel(img1.devolverImagen());
		limg2 = new JLabel(img2.devolverImagen());
		limg3 = new JLabel(img3.devolverImagen());
		limg4 = new JLabel(img4.devolverImagen());
		
		//Listeners
		spinner.addChangeListener(this);
		
		Box cajaH = Box.createHorizontalBox();
		Box cajaV = Box.createVerticalBox();
		Box cajaH2 = Box.createHorizontalBox();
		
		//Hacemos las imagenes invisibles
		limg1.setVisible(false);
		limg2.setVisible(false);
		limg3.setVisible(false);
		limg4.setVisible(false);
		
		cajaH.add(ltexto5);
		cajaH.add(spinner);
		
		cajaH2.add(limg1);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg3);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(limg4);
		
		cajaV.add(cajaH);
		cajaV.add(cajaH2);
		
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
