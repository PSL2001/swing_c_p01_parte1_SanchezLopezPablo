/**
 * swing_c_p01_parte1_SanchezLopezPablo - swing_c_p01_parte1_SanchezLopezPablo - PanelActivity.java
 * 3 nov 2022 - 12:52:28
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte1_SanchezLopezPablo;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * The Class PanelActivity.
 *
 * @author usuario
 */
public class PanelActivity extends JPanel {
	
	/** The btn activity. */
	public static JButton btnActivity;
	
	/**
	 * Instantiates a new panel activity.
	 */
	public PanelActivity() {
		btnActivity = new JButton("Ejercicios Activos");
		
		this.add(btnActivity);
	}

}
