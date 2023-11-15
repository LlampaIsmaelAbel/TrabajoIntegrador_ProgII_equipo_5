package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoRefrigerado extends JFrame {
	
	private Principal ventPrincipal;
	
	private JPanel contentPane;
	private JButton btnCancelar;

	
	public ProductoRefrigerado() {
		setTitle("Refrigerado");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 371);
		iniciarComponentes();
	}
	
	private void iniciarComponentes () {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				ventPrincipal.setVisible(true);
				
			}
		});
		btnCancelar.setBounds(394, 273, 89, 23);
		contentPane.add(btnCancelar);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventPrincipal=vent;
	}

}
