package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public VentanaPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNroLegajo = new JLabel("Nro Legajo:");
		lblNroLegajo.setBounds(37, 38, 64, 14);
		getContentPane().add(lblNroLegajo);
		
		JLabel lblNombreResponsable = new JLabel("Nombre Responsable:");
		lblNombreResponsable.setBounds(37, 63, 119, 14);
		getContentPane().add(lblNombreResponsable);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(40, 89, 46, 14);
		getContentPane().add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(113, 35, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 60, 136, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 88, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegistrarPersona = new JButton("Registrar Persona");
		btnRegistrarPersona.setBounds(33, 152, 136, 23);
		getContentPane().add(btnRegistrarPersona);
		
	}
	
	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
