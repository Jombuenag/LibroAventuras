package vistas;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class BarraInferior extends JPanel {

	
	public BarraInferior(VistaPrincipal vistaPrincipal) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), Color.LIGHT_GRAY, null, null));
	    setBounds(150,150,445,100);
	    setLayout(null);
	    
	    JLabel lblPersonaje = new JLabel("Personaje");
	    lblPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
	    lblPersonaje.setBounds(0, 0, 100, 100);
	    add(lblPersonaje);
	    
	    JLabel lblInventario = new JLabel("Inventario");
	    lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
	    lblInventario.setBounds(100, 0, 100, 100);
	    add(lblInventario);
	    
	    JLabel lblOpciones = new JLabel("Opciones");
	    lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
	    lblOpciones.setBounds(345, 0, 100, 100);
	    add(lblOpciones);
		
	}
}
