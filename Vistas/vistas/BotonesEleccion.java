package vistas;

import javax.swing.JPanel;
import javax.swing.JButton;

public class BotonesEleccion extends JPanel {
	
	public BotonesEleccion(VistaPrincipal vistaPrincipal){
		setBounds(150,100,500,40);
		setLayout(null);
		
		JButton btnEleccionA = new JButton("Opci\u00F3n A");
		btnEleccionA.setBounds(0, 0, 250, 40);
		add(btnEleccionA);
		
		JButton btnEleccionB = new JButton("Opci\u00F3n B");
		btnEleccionB.setBounds(250, 0, 250, 40);
		add(btnEleccionB);
		
		
	}
}
