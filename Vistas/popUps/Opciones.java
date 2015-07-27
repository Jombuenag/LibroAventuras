package popUps;

import javax.swing.JFrame;

public class Opciones extends JFrame {

	private Opciones opciones;
	
	public Opciones(){
		
		setTitle("Opciones");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(650, 300, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
	}
}
