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
 * The Class imageRes.
 *
 * @author usuario
 */
public class imageRes {
	
	/** The recurso. */
	private ImageIcon recurso;
	
	/**
	 * Instantiates a new image res.
	 *
	 * @param recurso the recurso
	 */
	public imageRes(String recurso) {
		this.recurso = new ImageIcon(getClass().getResource(recurso));
	}
	
	/**
	 * Devolver imagen.
	 *
	 * @param ancho the ancho
	 * @param largo the largo
	 * @return the image icon
	 */
	public ImageIcon devolverImagen(int ancho, int largo) {
		ImageIcon imagenSinRes = this.recurso;
		Image imagenImage = imagenSinRes.getImage();
		imagenImage.getScaledInstance(ancho, largo ,Image.SCALE_SMOOTH);
		ImageIcon imageRes = new ImageIcon(imagenImage);
		return imageRes;
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		ImageIcon imagen = this.recurso;
		return imagen.getIconWidth();
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		ImageIcon imagen = this.recurso;
		return imagen.getIconHeight();
	}

}
