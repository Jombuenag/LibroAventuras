package vistas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Personaje extends JFrame {
	
	private Personaje personaje;
	private JTextField textField;
	
	public Personaje() {
		setTitle("Personaje");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(350, 100, 350, 350);
		getContentPane().setLayout(null);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setBounds(10, 11, 62, 50);
		getContentPane().add(lblVida);
		
		JLabel lblAsdf = new JLabel("ASDF");
		lblAsdf.setBounds(10, 55, 62, 50);
		getContentPane().add(lblAsdf);
		
		textField = new JTextField();
		textField.setBounds(39, 26, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);


	
	}
}
