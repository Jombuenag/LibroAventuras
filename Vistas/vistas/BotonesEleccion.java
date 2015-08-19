package vistas;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BotonesEleccion extends JPanel {
	
	
	public BotonesEleccion(VistaPrincipal vistaPrincipal){
		setBounds(150,100,500,40);
		setLayout(null);
		
		JButton btnEleccionA = new JButton("Opci\u00F3n A");
		btnEleccionA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				vistaPrincipal.cambiaFase("a");
			}
		});
		btnEleccionA.setBounds(0, 0, 250, 40);
		add(btnEleccionA);
		
		JButton btnEleccionB = new JButton("Opci\u00F3n B");
		btnEleccionB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaPrincipal.cambiaFase("b");
			}
		});
		btnEleccionB.setBounds(250, 0, 250, 40);
		add(btnEleccionB);
		
		
	}
}
