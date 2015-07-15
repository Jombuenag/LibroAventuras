import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class VistaPrincipal extends JFrame {

	private JPanel contentPane;

	
	public VistaPrincipal() {
		setTitle("Libro Aventuras");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHola = new JLabel("HOLA!");
		lblHola.setBounds(184, 35, 46, 14);
		contentPane.add(lblHola);
	}
}
