/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio4.java
 * 5 nov 2022 - 18:47:39
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 * @author Usuario
 *
 */
public class PanelEjercicio4 extends JPanel {
	private JSlider slider;
	private JLabel ltexto4;
	/**
	 * 
	 */
	public PanelEjercicio4() {
		slider = new JSlider(SwingConstants.HORIZONTAL,0,45,0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		ltexto4 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		
		Box cajaV = Box.createVerticalBox();
		cajaV.add(slider);
		cajaV.add(ltexto4);
		
		this.add(cajaV);
	}

}
