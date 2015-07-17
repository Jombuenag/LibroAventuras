package vistas;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private BarraInferior barraInferior;
	private BotonesEleccion botonesEleccion;

	
	public VistaPrincipal() {
		setTitle("Libro Aventuras");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 600);
		
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(20, 35, 425, 400);
		contentPane.add(textArea);
		
		barraInferior = new BarraInferior(this);
		barraInferior.setBounds(0,475,470,100);
		contentPane.add(barraInferior);
		
		botonesEleccion = new BotonesEleccion(this);
		botonesEleccion.setBounds(10,435,470,100);
		contentPane.add(botonesEleccion);
		
		
		
		
		
	}
}
