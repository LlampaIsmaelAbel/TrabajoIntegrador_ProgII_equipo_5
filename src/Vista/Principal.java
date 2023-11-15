package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	
	//zona de ventanas
	private ProductoRefrigerado ventanaRefri;
	private MostrarEtiqueta ventanaMostrarEtiqueta;
	
	
	private JPanel contentPane;
	private JButton btnNewRefrigerado;
	private JButton btnMostrarDatos;
	private JButton btnNewCongelado;
	private JButton btnNewButton_3;
	

	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 483);
		iniciarComponentes();
		
	}
	
	private void iniciarComponentes() {
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewRefrigerado = new JButton("Agregar Producto Refrigerado");
		btnNewRefrigerado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {// estamos creando un evento para el boton
				ventanaRefri.setVisible(true);
				setVisible(false);
			}
		});
		btnNewRefrigerado.setBounds(134, 88, 182, 41);
		contentPane.add(btnNewRefrigerado);
		
		btnMostrarDatos = new JButton("Mostrar Datos");
		btnMostrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaMostrarEtiqueta.setVisible(true);
				setVisible(false);
			}
		});
		btnMostrarDatos.setBounds(550, 96, 182, 41);
		contentPane.add(btnMostrarDatos);
		
		btnNewCongelado = new JButton("Agregar Producto Congelado");
		btnNewCongelado.setBounds(134, 274, 182, 41);
		contentPane.add(btnNewCongelado);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(550, 274, 182, 41);
		contentPane.add(btnNewButton_3);
		
		
	}
	
	public void setVentanaRefrig(ProductoRefrigerado vent) {
		this.ventanaRefri=vent;
	}
	
	public void setVentanaMostrarDatos(MostrarEtiqueta vent) {
		this.ventanaMostrarEtiqueta=vent;
	}
}
