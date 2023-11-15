package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class ProductoRefrigerado extends JFrame {
	
	private Principal ventPrincipal;
	
	private JPanel contentPane;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JTextField txtCodigoDeOrganismo;
	private JTextField txtFechaDeEnvasado;
	private JTextField txtTemperaturaDeMantenimiento;
	private JTextField txtGranjaDeOrigen;
	private JTextField textCodigo;
	private JTextField textTemperatura;
	private JTextField textGranjaOrigen;
	private JTextField txtFechaDeVencimiento;
	private JTextField txtCostoDeTratamiento;
	private JTextField textField;

	
	public ProductoRefrigerado() {
		setTitle("Refrigerado");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 395);
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
		btnCancelar.setBounds(481, 310, 89, 23);
		contentPane.add(btnCancelar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(63, 310, 89, 23);
		contentPane.add(btnGuardar);
		
		txtCodigoDeOrganismo = new JTextField();
		txtCodigoDeOrganismo.setText("Codigo de organismo de supervision alimentaria:");
		txtCodigoDeOrganismo.setBounds(32, 33, 242, 23);
		contentPane.add(txtCodigoDeOrganismo);
		txtCodigoDeOrganismo.setColumns(10);
		
		txtFechaDeEnvasado = new JTextField();
		txtFechaDeEnvasado.setText("Fecha de envasado:");
		txtFechaDeEnvasado.setBounds(417, 33, 106, 23);
		contentPane.add(txtFechaDeEnvasado);
		txtFechaDeEnvasado.setColumns(10);
		
		txtTemperaturaDeMantenimiento = new JTextField();
		txtTemperaturaDeMantenimiento.setText("Temperatura de mantenimiento recomendada:");
		txtTemperaturaDeMantenimiento.setBounds(32, 127, 230, 23);
		contentPane.add(txtTemperaturaDeMantenimiento);
		txtTemperaturaDeMantenimiento.setColumns(10);
		
		txtGranjaDeOrigen = new JTextField();
		txtGranjaDeOrigen.setText("Granja de origen:");
		txtGranjaDeOrigen.setBounds(417, 127, 94, 23);
		contentPane.add(txtGranjaDeOrigen);
		txtGranjaDeOrigen.setColumns(10);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(99, 67, 86, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(99, 161, 86, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		textGranjaOrigen = new JTextField();
		textGranjaOrigen.setBounds(417, 161, 86, 20);
		contentPane.add(textGranjaOrigen);
		textGranjaOrigen.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(417, 67, 95, 20);
		contentPane.add(dateChooser);
		
		txtFechaDeVencimiento = new JTextField();
		txtFechaDeVencimiento.setText("Fecha de vencimiento:");
		txtFechaDeVencimiento.setBounds(30, 212, 122, 23);
		contentPane.add(txtFechaDeVencimiento);
		txtFechaDeVencimiento.setColumns(10);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(30, 246, 95, 20);
		contentPane.add(dateChooser_1);
		
		txtCostoDeTratamiento = new JTextField();
		txtCostoDeTratamiento.setText("Costo de Tratamiento:");
		txtCostoDeTratamiento.setBounds(417, 213, 116, 20);
		contentPane.add(txtCostoDeTratamiento);
		txtCostoDeTratamiento.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(417, 244, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventPrincipal=vent;
	}
}
