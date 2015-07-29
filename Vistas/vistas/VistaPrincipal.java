package vistas;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private BarraInferior barraInferior;
	private BotonesEleccion botonesEleccion;

	
	public VistaPrincipal() {
		setTitle("Libro Aventuras");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 625);
		
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(20, 35, 450, 400);
		contentPane.add(textArea);
		
		barraInferior = new BarraInferior(this);
		barraInferior.setBounds(0,496,500,101);
		contentPane.add(barraInferior);
		
		botonesEleccion = new BotonesEleccion(this);
		botonesEleccion.setBounds(0,440,494,45);
		contentPane.add(botonesEleccion);
		
		
		
		
		
	}
}
