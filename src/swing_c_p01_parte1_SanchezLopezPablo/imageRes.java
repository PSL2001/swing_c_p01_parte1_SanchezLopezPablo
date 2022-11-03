/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - imageRes.java
 * 2 nov 2022 - 9:21:58
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author usuario
 *
 */
public class imageRes {
	private ImageIcon recurso;
	/**
	 * 
	 */
	public imageRes(String recurso) {
		this.recurso = new ImageIcon(getClass().getResource(recurso));
	}
	
	/**
	 * @param recurso2
	 */
	public ImageIcon devolverImagen() {
		ImageIcon imagenSinRes = this.recurso;
		Image imagenImage = imagenSinRes.getImage();
		imagenImage.getScaledInstance(imagenSinRes.getIconWidth(),imagenSinRes.getIconHeight() ,Image.SCALE_SMOOTH);
		ImageIcon imageRes = new ImageIcon(imagenImage);
		return imageRes;
	}

}
