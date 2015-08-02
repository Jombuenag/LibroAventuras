package vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import popUps.Inventario;
import popUps.Opciones;
import popUps.Personaje;


public class BarraInferior extends JPanel {

		private Personaje personaje;
		private Inventario inventario;
		private Opciones opciones;
	
	public BarraInferior(VistaPrincipal vistaPrincipal) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), Color.LIGHT_GRAY, null, null));
	    setBounds(150,150,500,100);
	    setLayout(null);
	    
	    JButton btnPersonaje = new JButton("Personaje");
	    btnPersonaje.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Personaje popUpPersonaje =  new Personaje();
	    		popUpPersonaje.setVisible(true);
	    		
	    	}
	    });
	    btnPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
	    btnPersonaje.setBounds(0, 0, 100, 100);
	    btnPersonaje.setContentAreaFilled(false);
	    btnPersonaje.setBorderPainted(false);
	    add(btnPersonaje);
	    
	    JButton btnInventario = new JButton("Inventario");
	    btnInventario.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Inventario popUpInventario =  new Inventario();
	    		popUpInventario.setVisible(true);
	    	}
	    });
	    btnInventario.setHorizontalAlignment(SwingConstants.CENTER);
	    btnInventario.setBounds(100, 0, 100, 100);
	    btnInventario.setContentAreaFilled(false);
	    btnInventario.setBorderPainted(false);
	    add(btnInventario);
	    
	    JButton btnOpciones = new JButton("Opciones");
	    btnOpciones.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		Opciones popUpOpciones = new Opciones();
	    		popUpOpciones.setVisible(true);
	    	}
	    });
	    btnOpciones.setHorizontalAlignment(SwingConstants.CENTER);
	    btnOpciones.setBounds(400, 0, 100, 100);
	    btnOpciones.setContentAreaFilled(false);
	    btnOpciones.setBorderPainted(false);
	    add(btnOpciones);
	    
	    JButton btnDados = new JButton("Dados");
	    btnDados.setHorizontalAlignment(SwingConstants.CENTER);
	    btnDados.setBounds(200, 0, 100, 100);
	    btnDados.setContentAreaFilled(false);
	    btnDados.setBorderPainted(false);
	    add(btnDados);
	    
	    JButton btnGrimorio = new JButton("Grimorio");
	    btnGrimorio.setBounds(300, 0, 100, 100);
	    btnGrimorio.setContentAreaFilled(false);
	    btnGrimorio.setBorderPainted(false);
	    add(btnGrimorio);
		
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Opciones getOpciones() {
		return opciones;
	}

	public void setOpciones(Opciones opciones) {
		this.opciones = opciones;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
}
