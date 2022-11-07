/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio4.java
 * 5 nov 2022 - 18:47:39
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * The Class PanelEjercicio4.
 *
 * @author Usuario
 */
public class PanelEjercicio4 extends JPanel implements ChangeListener  {
	
	/** The slider. */
	private JSlider slider;
	
	/** The ltexto 4. */
	private JLabel ltexto4;
	
	/**
	 * Instantiates a new panel ejercicio 4.
	 */
	public PanelEjercicio4() {
		slider = new JSlider(SwingConstants.HORIZONTAL,0,48,0);
		slider.setMajorTickSpacing(48);
		slider.setMinorTickSpacing(8);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		ltexto4 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		
		//Listeners
		slider.addChangeListener(this);
		
		Box cajaV = Box.createVerticalBox();
		cajaV.add(slider);
		cajaV.add(ltexto4);
		
		this.add(cajaV);
	}

	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		int valor = slider.getValue();
		
		ltexto4.setFont(new Font("Times New Roman", Font.PLAIN, valor));
		
	}

}
