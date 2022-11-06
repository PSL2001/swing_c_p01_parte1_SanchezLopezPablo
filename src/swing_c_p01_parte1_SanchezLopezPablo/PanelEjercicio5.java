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
 * @author Usuario
 *
 */
public class PanelEjercicio5 extends JPanel {
	private JLabel labelTexto, limg1, limg2, limg3, limg4;
	private JSpinner spinner;
	private imageRes img1, img2, img3, img4;
	/**
	 * 
	 */
	public PanelEjercicio5() {
		labelTexto = new JLabel("¿Cuantas Imágenes quieres mostrar?");
		spinner = new JSpinner();
		
		img1 = new imageRes("recursos/imagen.jpg");
		img2 = new imageRes("recursos/imagen2.jpg");
		img3 = new imageRes("recursos/imagen3.jpg");
		img4 = new imageRes("recursos/imagen4.jpg");
		
		limg1 = new JLabel(img1.devolverImagen());
		limg2 = new JLabel(img2.devolverImagen());
		limg3 = new JLabel(img3.devolverImagen());
		limg4 = new JLabel(img4.devolverImagen());
		
		Box cajaH = Box.createHorizontalBox();
		Box cajaV = Box.createVerticalBox();
		
		cajaH.add(labelTexto);
		cajaH.add(spinner);
		
		cajaV.add(limg1);
		cajaV.add(limg2);
		cajaV.add(limg3);
		cajaV.add(limg4);
		
		cajaV.add(cajaH);
		
		this.add(cajaV);
		
	}

}
