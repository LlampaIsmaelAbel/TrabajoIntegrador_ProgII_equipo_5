package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MostrarEtiqueta extends JFrame {
	
	private Principal ventanaPrincipal;
	
	private JPanel contentPane;
	private JTable table;

	public MostrarEtiqueta() {
		setUndecorated(true);
		setTitle("Etiqueta del Producto");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 477);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 103, 564, 296);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				setVisible(false);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSalir.setBounds(492, 425, 109, 41);
		contentPane.add(btnSalir);
		
		JLabel lblEtiquetaDelProducto = new JLabel("Etiqueta del Producto");
		lblEtiquetaDelProducto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEtiquetaDelProducto.setBounds(194, 28, 229, 32);
		contentPane.add(lblEtiquetaDelProducto);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventanaPrincipal=vent;
	}
}
