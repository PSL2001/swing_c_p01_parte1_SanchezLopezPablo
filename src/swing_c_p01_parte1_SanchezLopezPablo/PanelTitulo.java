/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelTitulo.java
 * 2 nov 2022 - 8:23:26
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 * @author usuario
 *
 */
public class PanelTitulo extends JPanel {
	private imageRes logo;
	private JLabel lalumno, lnombreAlumno, lImagen;
	/**
	 * 
	 */
	public PanelTitulo() {
		//Declaramos los paneles
		logo = new imageRes("recursos/LogoInstiLayout.jpg");
		lImagen = new JLabel(logo.devolverImagen(logo.getWidth(), logo.getHeight()), SwingConstants.CENTER);
		lalumno = new JLabel("Alumno: ", SwingConstants.CENTER);
		lnombreAlumno = new JLabel("Pablo Sánchez López", SwingConstants.CENTER);
		
		//Añadimos los colores para cada label
		lalumno.setForeground(new Color(255, 0, 0));
		lnombreAlumno.setForeground(new Color(0, 255, 0));
		
		//Añadimos los bordes
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.BLACK, Color.CYAN, Color.BLACK));
		
		//Añadimos
		this.add(lImagen);
		this.add(lalumno);
		this.add(lnombreAlumno);
		
	}

}
