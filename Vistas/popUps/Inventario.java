package popUps;

import javax.swing.JFrame;

public class Inventario extends JFrame {


	public Inventario() {
		setTitle("Inventario");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(650, 200, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
		
	}

}
