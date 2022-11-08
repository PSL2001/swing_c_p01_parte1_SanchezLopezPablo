/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelEjercicio4.java
 * 5 nov 2022 - 18:47:39
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
		//Instanciamos los objetos de swing
		slider = new JSlider(SwingConstants.HORIZONTAL,8,48,8);
		//Ponemos el espaciado mayor del tick a 48
		slider.setMajorTickSpacing(20);
		//Y el menor a 8
		slider.setMinorTickSpacing(8);
		//Pintamos los ticks
		slider.setPaintTicks(true);
		//Y pintamos los labels
		slider.setPaintLabels(true);
		
		ltexto4 = new JLabel("En un lugar de la Mancha, de cuyo nombre ...");
		
		//Listeners
		slider.addChangeListener(this);
		
		//Creamos la caja y añadimos los elementos en esta
		Box cajaH = Box.createHorizontalBox();
		Box cajaH2 = Box.createHorizontalBox();
		Box cajaV = Box.createVerticalBox();
		cajaH.add(slider);
		cajaH2.add(ltexto4);
		cajaV.add(cajaH);
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(cajaH2);
		
		this.add(cajaV);
		this.setBorder(BorderFactory.createTitledBorder("Ejercicio 4"));
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
