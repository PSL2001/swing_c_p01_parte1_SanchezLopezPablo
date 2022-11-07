/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio5.java
 * 6 nov 2022 - 10:52:54
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;


/**
 * The Class PanelEjercicio5.
 *
 * @author Usuario
 */
public class PanelEjercicio5 extends JPanel {
	
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
		spinner = new JSpinner();
		
		img1 = new imageRes("recursos/imagen.jpg");
		img2 = new imageRes("recursos/imagen2.jpg");
		img3 = new imageRes("recursos/imagen3.jpg");
		img4 = new imageRes("recursos/imagen4.jpg");
		
		limg1 = new JLabel(img1.devolverImagen(10, 10));
		limg2 = new JLabel(img2.devolverImagen(10, 10));
		limg3 = new JLabel(img3.devolverImagen(10, 10));
		limg4 = new JLabel(img4.devolverImagen(10, 10));
		
		Box cajaH = Box.createHorizontalBox();
		Box cajaV = Box.createVerticalBox();
		Box cajaH2 = Box.createHorizontalBox();
		
		cajaH.add(ltexto5);
		cajaH.add(spinner);
		
		cajaH2.add(limg1);
		cajaH2.add(limg2);
		cajaH2.add(limg3);
		cajaH2.add(limg4);
		
		cajaV.add(cajaH);
		cajaV.add(cajaH2);
		
		this.add(cajaV);
		
	}

}
