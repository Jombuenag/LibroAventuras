package vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


public class BarraInferior extends JPanel {

		private Personaje personaje;
	
	public BarraInferior(VistaPrincipal vistaPrincipal) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), Color.LIGHT_GRAY, null, null));
	    setBounds(150,150,445,100);
	    setLayout(null);
	    
	    JButton btnPersonaje = new JButton("Personaje");
	    btnPersonaje.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Personaje frame =  new Personaje();
	    		frame.setVisible(true);
	    	}
	    });
	    btnPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
	    btnPersonaje.setBounds(0, 0, 100, 100);
	    btnPersonaje.setContentAreaFilled(false);
	    btnPersonaje.setBorderPainted(false);
	    add(btnPersonaje);
	    
	    JButton btnInventario = new JButton("Inventario");
	    btnInventario.setHorizontalAlignment(SwingConstants.CENTER);
	    btnInventario.setBounds(100, 0, 100, 100);
	    btnInventario.setContentAreaFilled(false);
	    btnInventario.setBorderPainted(false);
	    add(btnInventario);
	    
	    JButton btnOpciones = new JButton("Opciones");
	    btnOpciones.setHorizontalAlignment(SwingConstants.CENTER);
	    btnOpciones.setBounds(345, 0, 100, 100);
	    btnOpciones.setContentAreaFilled(false);
	    btnOpciones.setBorderPainted(false);
	    add(btnOpciones);
	    
	    JButton btnDados = new JButton("Dados");
	    btnDados.setHorizontalAlignment(SwingConstants.CENTER);
	    btnDados.setBounds(200, 0, 100, 100);
	    btnDados.setContentAreaFilled(false);
	    btnDados.setBorderPainted(false);
	    add(btnDados);
		
	}
}
