package popUps;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dados extends JFrame {

	
	public Dados(){
		setTitle("Dados");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(350, 400, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
		
		Image imgDados = new ImageIcon(this.getClass().getResource(("/Dados.png"))).getImage();
		JLabel lblImageDados = new JLabel("ImageDados");
		lblImageDados.setBounds(0,0,344,322);
		lblImageDados.setIcon(new ImageIcon(imgDados));
		getContentPane().add(lblImageDados);
	}
}

