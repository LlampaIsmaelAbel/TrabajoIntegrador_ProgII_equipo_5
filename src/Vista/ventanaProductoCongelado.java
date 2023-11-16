package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoCongelado extends JFrame {
	
	private ButtonGroup grupRadioBut;
	private Principal ventPrincipal;

//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblTipoDeProducto;
	private JRadioButton rdbtnNitrogeno;
	private JRadioButton rdbtnAire;
	private JRadioButton rdbtnAgua;
	private JLabel label_7;
	private JLabel label_6;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JDateChooser dateChooser_1;
	private JLabel label_2;
	private JDateChooser dateChooser;
	private JLabel label_1;
	private JLabel label;
	private JButton button_1;
	private JButton button;
	private JLabel lblDeNitrogeno;
	private JSpinner spnNitrogeno;
	private JLabel lblOxigeno;
	private JSpinner spnOxigeno;
	private JSpinner spnCarbono;
	private JLabel lblDioxidoDe;
	private JLabel lblGrlSal;
	private JSpinner spnSal;
	private JLabel lblCantidadSal;
	private JLabel lblTiempo;
	private JSpinner spnTiempo;


	public VentanaProductoCongelado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 476);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		button = new JButton("Cancelar");
		button.setFont(new Font("Sitka Small", Font.BOLD, 14));
		button.setBounds(458, 376, 121, 38);
		contentPane.add(button);
		
		button_1 = new JButton("Guardar");
		button_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		button_1.setBounds(104, 376, 111, 38);
		contentPane.add(button_1);
		
		label = new JLabel("Granja de origen:");
		label.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label.setBounds(296, 251, 121, 23);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(420, 251, 133, 20);
		contentPane.add(textField);
		
		label_1 = new JLabel("Costo de tratamiento:");
		label_1.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_1.setBounds(31, 256, 140, 18);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 254, 93, 20);
		contentPane.add(textField_1);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(442, 205, 111, 20);
		contentPane.add(dateChooser);
		
		label_2 = new JLabel("Fecha de vencimiento:");
		label_2.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_2.setBounds(301, 208, 150, 17);
		contentPane.add(label_2);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(161, 205, 111, 20);
		contentPane.add(dateChooser_1);
		
		label_3 = new JLabel("Fecha de envasado:");
		label_3.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_3.setBounds(31, 205, 126, 23);
		contentPane.add(label_3);
		
		label_4 = new JLabel("Temperatura de mantenimiento recomendada:");
		label_4.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_4.setBounds(31, 158, 299, 23);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(340, 158, 213, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(340, 108, 213, 20);
		contentPane.add(textField_3);
		
		label_5 = new JLabel("Codigo de organismo de supervision alimentaria:");
		label_5.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_5.setBounds(31, 108, 305, 23);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(230, 67, 195, 20);
		contentPane.add(textField_4);
		
		label_6 = new JLabel("Descripcion del Producto:");
		label_6.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_6.setBounds(29, 68, 170, 20);
		contentPane.add(label_6);
		
		label_7 = new JLabel("Nuevos Datos de Producto Congelado");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(189, 11, 286, 31);
		contentPane.add(label_7);
		
		rdbtnAgua = new JRadioButton("Agua");
		rdbtnAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCantidadSal.setVisible(true);
				spnSal.setVisible(true);
				lblGrlSal.setVisible(true);
				
				lblDeNitrogeno.setVisible(false);
				lblDioxidoDe.setVisible(false);
				lblOxigeno.setVisible(false);
				spnCarbono.setVisible(false);
				spnNitrogeno.setVisible(false);
				spnOxigeno.setVisible(false);
				
				lblTiempo.setVisible(false);
				spnTiempo.setVisible(false);
			}
		});
		rdbtnAgua.setBounds(621, 67, 109, 23);
		contentPane.add(rdbtnAgua);
		
		rdbtnAire = new JRadioButton("Aire");
		rdbtnAire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDeNitrogeno.setVisible(true);
				lblDioxidoDe.setVisible(true);
				lblOxigeno.setVisible(true);
				spnCarbono.setVisible(true);
				spnNitrogeno.setVisible(true);
				spnOxigeno.setVisible(true);
				
				lblCantidadSal.setVisible(false);
				spnSal.setVisible(false);
				lblGrlSal.setVisible(false);
				
				lblTiempo.setVisible(false);
				spnTiempo.setVisible(false);
			}
		});
		rdbtnAire.setBounds(621, 93, 109, 23);
		contentPane.add(rdbtnAire);
		
		rdbtnNitrogeno = new JRadioButton("Nitrogeno");
		rdbtnNitrogeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTiempo.setVisible(true);
				spnTiempo.setVisible(true);
				
				lblDeNitrogeno.setVisible(false);
				lblDioxidoDe.setVisible(false);
				lblOxigeno.setVisible(false);
				spnCarbono.setVisible(false);
				spnNitrogeno.setVisible(false);
				spnOxigeno.setVisible(false);
				
				lblCantidadSal.setVisible(false);
				spnSal.setVisible(false);
				lblGrlSal.setVisible(false);
				
			}
		});
		rdbtnNitrogeno.setBounds(621, 116, 109, 23);
		contentPane.add(rdbtnNitrogeno);
		
		grupRadioBut=new ButtonGroup();
		grupRadioBut.add(rdbtnAgua);
		grupRadioBut.add(rdbtnNitrogeno);
		grupRadioBut.add(rdbtnAire);
		
		
		lblTipoDeProducto = new JLabel("Producto Congelado por :");
		lblTipoDeProducto.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblTipoDeProducto.setBounds(454, 66, 176, 24);
		contentPane.add(lblTipoDeProducto);
		
		lblDeNitrogeno = new JLabel("% de Nitrogeno");
		lblDeNitrogeno.setVisible(false);
		lblDeNitrogeno.setBounds(602, 171, 93, 20);
		contentPane.add(lblDeNitrogeno);
		
		spnNitrogeno = new JSpinner();
		spnNitrogeno.setVisible(false);
		spnNitrogeno.setBounds(730, 171, 33, 20);
		contentPane.add(spnNitrogeno);
		
		lblOxigeno = new JLabel("% oxigeno");
		lblOxigeno.setVisible(false);
		lblOxigeno.setBounds(602, 204, 83, 14);
		contentPane.add(lblOxigeno);
		
		spnOxigeno = new JSpinner();
		spnOxigeno.setVisible(false);
		spnOxigeno.setBounds(730, 201, 33, 20);
		contentPane.add(spnOxigeno);
		
		spnCarbono = new JSpinner();
		spnCarbono.setVisible(false);
		spnCarbono.setBounds(730, 232, 33, 20);
		contentPane.add(spnCarbono);
		
		lblDioxidoDe = new JLabel("% dioxido de Carbono");
		lblDioxidoDe.setVisible(false);
		lblDioxidoDe.setBounds(602, 234, 121, 17);
		contentPane.add(lblDioxidoDe);
		
		lblGrlSal = new JLabel("gr/L");
		lblGrlSal.setVisible(false);
		lblGrlSal.setBounds(730, 146, 33, 20);
		contentPane.add(lblGrlSal);
		
		spnSal = new JSpinner();
		spnSal.setVisible(false);
		spnSal.setBounds(689, 146, 41, 20);
		contentPane.add(spnSal);
		
		lblCantidadSal = new JLabel("Cantidad de sal/litro");
		lblCantidadSal.setVisible(false);
		lblCantidadSal.setBounds(572, 146, 113, 20);
		contentPane.add(lblCantidadSal);
		
		lblTiempo = new JLabel("Tiempo de Exposicion");
		lblTiempo.setVisible(false);
		lblTiempo.setBounds(583, 254, 140, 23);
		contentPane.add(lblTiempo);
		
		spnTiempo = new JSpinner();
		spnTiempo.setVisible(false);
		spnTiempo.setBounds(734, 251, 29, 26);
		contentPane.add(spnTiempo);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventPrincipal=vent;
	}
}
