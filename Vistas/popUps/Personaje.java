package popUps;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Personaje extends JFrame {
	
	
	private JTextField txtVida;
	private JTextField txtFuerza;
	private JTextField txtField;

	
	public Personaje() {
		setTitle("Personaje");
		setType(Type.POPUP);
		this.setVisible(true);
		setBounds(650, 100, 350, 350);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setToolTipText("");
		lblNombre.setBounds(10, 10, 70, 30);
		getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setForeground(new Color(255, 255, 255));
		lblEdad.setToolTipText("");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEdad.setBounds(175, 10, 50, 30);
		getContentPane().add(lblEdad);
		
		JLabel lblRaza = new JLabel("Raza :");
		lblRaza.setForeground(new Color(255, 255, 255));
		lblRaza.setToolTipText("");
		lblRaza.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRaza.setBounds(10, 40, 70, 30);
		getContentPane().add(lblRaza);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setToolTipText("");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGenero.setBounds(175, 40, 70, 30);
		getContentPane().add(lblGenero);
		
		JLabel lblVida = new JLabel("Vida :");
		lblVida.setBounds(10, 90, 50, 50);
		getContentPane().add(lblVida);
		
		txtVida = new JTextField();
		txtVida.setEnabled(false);
		txtVida.setBounds(40, 105, 70, 20);
		getContentPane().add(txtVida);
		txtVida.setColumns(10);
		
		JLabel lblFuerza = new JLabel("Fuerza :");
		lblFuerza.setBounds(10, 125, 55, 50);
		getContentPane().add(lblFuerza);
		
		txtFuerza = new JTextField();
		txtFuerza.setEnabled(false);
		txtFuerza.setColumns(10);
		txtFuerza.setBounds(65, 140, 70, 20);
		getContentPane().add(txtFuerza);
		
		JLabel lblDestreza = new JLabel("Destreza :");
		lblDestreza.setBounds(10,160,65,50);
		getContentPane().add(lblDestreza);
		
		txtField = new JTextField();
		txtField.setEnabled(false);
		txtField.setColumns(10);
		txtField.setBounds(80, 175, 70, 20);
		getContentPane().add(txtField);
		
		Image imgPersonaje = new ImageIcon(this.getClass().getResource(("/PersonajeSuperior.png"))).getImage();
		JLabel lblImageSup = new JLabel("ImageSup");
		lblImageSup.setBounds(0, 0, 345, 75);
		lblImageSup.setIcon(new ImageIcon(imgPersonaje));
		getContentPane().add(lblImageSup);
		
		
		Image imgPersonaje2 = new ImageIcon(this.getClass().getResource(("/PersonajeInferior.png"))).getImage();
		JLabel lblImageInf = new JLabel("ImageInf");
		lblImageInf.setBounds(0, 75, 345, 250);
		lblImageInf.setIcon(new ImageIcon(imgPersonaje2));
		getContentPane().add(lblImageInf);
		
		

	}
}
