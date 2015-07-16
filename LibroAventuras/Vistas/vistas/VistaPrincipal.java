package vistas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import java.awt.TextArea;


public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private BarraInferior barraInferior;

	
	public VistaPrincipal() {
		setTitle("Libro Aventuras");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 575);
		
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		barraInferior = new BarraInferior(this);
		barraInferior.setBounds(0,450,445,100);
		contentPane.add(barraInferior);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 424, 397);
		contentPane.add(textArea);
	}
}
