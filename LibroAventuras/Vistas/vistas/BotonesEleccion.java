package vistas;

import javax.swing.JPanel;
import javax.swing.JButton;

public class BotonesEleccion extends JPanel {
	
	public BotonesEleccion(VistaPrincipal vistaPrincipal){
		setBounds(150,100,450,40);
		setLayout(null);
		
		JButton btnEleccionA = new JButton("Opci\u00F3n A");
		btnEleccionA.setBounds(0, 0, 225, 40);
		add(btnEleccionA);
		
		JButton btnEleccionB = new JButton("Opci\u00F3n B");
		btnEleccionB.setBounds(225, 0, 225, 40);
		add(btnEleccionB);
		
		
	}
}
