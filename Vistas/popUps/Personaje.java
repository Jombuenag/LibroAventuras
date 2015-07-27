package popUps;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Personaje extends JFrame {
	
	
	private JTextField textField;
	
	public Personaje() {
		setTitle("Personaje");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(650, 100, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setBounds(10, 11, 62, 50);
		getContentPane().add(lblVida);
		
		JLabel lblAtaque = new JLabel("Ataque");
		lblAtaque.setBounds(10, 55, 62, 50);
		getContentPane().add(lblAtaque);
		
		JLabel lblDestreza = new JLabel("Destreza");
		lblDestreza.setBounds(10,75,75,50);
		getContentPane().add(lblDestreza);
		
		textField = new JTextField();
		textField.setBounds(39, 26, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);


	
	}
}
