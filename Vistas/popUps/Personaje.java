package popUps;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Personaje extends JFrame {
	
	
	private JTextField txtVida;
	private JTextField textFuerza;
	private JTextField textField;
	
	public Personaje() {
		setTitle("Personaje");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(650, 100, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblVida = new JLabel("Vida :");
		lblVida.setBounds(10, 90, 50, 50);
		getContentPane().add(lblVida);
		
		JLabel lblFuerza = new JLabel("Fuerza :");
		lblFuerza.setBounds(10, 125, 55, 50);
		getContentPane().add(lblFuerza);
		
		JLabel lblDestreza = new JLabel("Destreza :");
		lblDestreza.setBounds(10,160,65,50);
		getContentPane().add(lblDestreza);
		
		txtVida = new JTextField();
		txtVida.setEnabled(false);
		txtVida.setBounds(40, 105, 70, 20);
		getContentPane().add(txtVida);
		txtVida.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setToolTipText("");
		lblNombre.setBounds(10, 10, 70, 25);
		getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setToolTipText("");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEdad.setBounds(175, 10, 50, 25);
		getContentPane().add(lblEdad);
		
		JLabel lblRaza = new JLabel("Raza :");
		lblRaza.setToolTipText("");
		lblRaza.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRaza.setBounds(10, 40, 70, 25);
		getContentPane().add(lblRaza);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(0, 75, 345, 2);
		getContentPane().add(separator);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setToolTipText("");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenero.setBounds(175, 40, 70, 25);
		getContentPane().add(lblGenero);
		
		textFuerza = new JTextField();
		textFuerza.setEnabled(false);
		textFuerza.setColumns(10);
		textFuerza.setBounds(65, 140, 70, 20);
		getContentPane().add(textFuerza);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(80, 175, 70, 20);
		getContentPane().add(textField);
		
		
		Image imgPjSuperior = new ImageIcon(this.getClass().getResource("/Imgs/PersonajeSuperior.png")).getImage();
		JLabel lblImgPopUpPersonaje = new JLabel();
		lblImgPopUpPersonaje.setBounds(0, 0, 345, 75);
		lblImgPopUpPersonaje.setIcon(new ImageIcon(imgPjSuperior));
		getContentPane().add(lblImgPopUpPersonaje);


	
	}
}
