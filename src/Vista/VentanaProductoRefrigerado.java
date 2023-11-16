package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import java.awt.Font;

public class ProductoRefrigerado extends JFrame {
	
	private Principal ventPrincipal;
	
	private JPanel contentPane;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JTextField textCodigo;
	private JTextField textTemperatura;
	private JTextField textGranjaOrigen;
	private JTextField textField;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JLabel lblCodigoDeOrganismo;
	private JLabel lblFechaDeEnvasado;
	private JLabel lblTemperaturaDeMantenimiento;
	private JLabel lblGranjaDeOrigen;
	private JLabel lblFechaDeVencimiento;
	private JLabel lblCostoDeTratamiento;
	private JTextField txtDescripcionProd;

	

	
	public ProductoRefrigerado() {
		setTitle("Refrigerado");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 468);
		iniciarComponentes();
	}
	
	private void iniciarComponentes () {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				ventPrincipal.setVisible(true);
				
			}
		});
		btnCancelar.setBounds(439, 349, 121, 38);
		contentPane.add(btnCancelar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnGuardar.setBounds(69, 349, 111, 38);
		contentPane.add(btnGuardar);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(333, 108, 186, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(333, 158, 186, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		textGranjaOrigen = new JTextField();
		textGranjaOrigen.setBounds(148, 264, 133, 20);
		contentPane.add(textGranjaOrigen);
		textGranjaOrigen.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(154, 205, 111, 20);
		contentPane.add(dateChooser);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(435, 205, 111, 20);
		contentPane.add(dateChooser_1);
		
		textField = new JTextField();
		textField.setBounds(462, 264, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblCodigoDeOrganismo = new JLabel("Codigo de organismo de supervision alimentaria:");
		lblCodigoDeOrganismo.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblCodigoDeOrganismo.setBounds(24, 108, 305, 23);
		contentPane.add(lblCodigoDeOrganismo);
		
		lblFechaDeEnvasado = new JLabel("Fecha de envasado:");
		lblFechaDeEnvasado.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblFechaDeEnvasado.setBounds(24, 205, 126, 23);
		contentPane.add(lblFechaDeEnvasado);
		
		lblTemperaturaDeMantenimiento = new JLabel("Temperatura de mantenimiento recomendada:");
		lblTemperaturaDeMantenimiento.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblTemperaturaDeMantenimiento.setBounds(24, 158, 299, 23);
		contentPane.add(lblTemperaturaDeMantenimiento);
		
		lblGranjaDeOrigen = new JLabel("Granja de origen:");
		lblGranjaDeOrigen.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblGranjaDeOrigen.setBounds(24, 264, 121, 23);
		contentPane.add(lblGranjaDeOrigen);
		
		lblFechaDeVencimiento = new JLabel("Fecha de vencimiento:");
		lblFechaDeVencimiento.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblFechaDeVencimiento.setBounds(294, 208, 150, 17);
		contentPane.add(lblFechaDeVencimiento);
		
		lblCostoDeTratamiento = new JLabel("Costo de tratamiento:");
		lblCostoDeTratamiento.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblCostoDeTratamiento.setBounds(312, 266, 140, 18);
		contentPane.add(lblCostoDeTratamiento);
		
		JLabel lblNuevoProductoCong = new JLabel("Nuevos Datos de Producto Refrigerado");
		lblNuevoProductoCong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNuevoProductoCong.setBounds(182, 11, 286, 31);
		contentPane.add(lblNuevoProductoCong);
		
		JLabel lblDescripcionProducto = new JLabel("Descripcion del Producto:");
		lblDescripcionProducto.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblDescripcionProducto.setBounds(22, 68, 170, 20);
		contentPane.add(lblDescripcionProducto);
		
		txtDescripcionProd = new JTextField();
		txtDescripcionProd.setBounds(223, 67, 195, 20);
		contentPane.add(txtDescripcionProd);
		txtDescripcionProd.setColumns(10);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventPrincipal=vent;
	}
}
