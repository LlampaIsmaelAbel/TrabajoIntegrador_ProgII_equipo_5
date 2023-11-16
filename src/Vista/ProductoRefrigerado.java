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
import javax.swing.JLabel;

public class ProductoRefrigerado extends JFrame {
	
	private Principal ventPrincipal;
	
	private JPanel contentPane;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JTextField textCodigo;
	private JTextField textTemperatura;
	private JTextField textGranjaOrigen;
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
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(43, 244, 95, 20);
		contentPane.add(dateChooser_1);
		
		textField = new JTextField();
		textField.setBounds(417, 244, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCodigoDeOrganismo = new JLabel("Codigo de organismo de supervision alimentaria:");
		lblCodigoDeOrganismo.setBounds(43, 37, 237, 23);
		contentPane.add(lblCodigoDeOrganismo);
		
		JLabel lblFechaDeEnvasado = new JLabel("Fecha de envasado:");
		lblFechaDeEnvasado.setBounds(417, 37, 106, 23);
		contentPane.add(lblFechaDeEnvasado);
		
		JLabel lblTemperaturaDeMantenimiento = new JLabel("Temperatura de mantenimiento recomendada:");
		lblTemperaturaDeMantenimiento.setBounds(43, 131, 231, 23);
		contentPane.add(lblTemperaturaDeMantenimiento);
		
		JLabel lblGranjaDeOrigen = new JLabel("Granja de origen:");
		lblGranjaDeOrigen.setBounds(417, 131, 86, 23);
		contentPane.add(lblGranjaDeOrigen);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento:");
		lblFechaDeVencimiento.setBounds(43, 215, 109, 17);
		contentPane.add(lblFechaDeVencimiento);
		
		JLabel lblCostoDeTratamiento = new JLabel("Costo de tratamiento:");
		lblCostoDeTratamiento.setBounds(417, 214, 106, 18);
		contentPane.add(lblCostoDeTratamiento);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventPrincipal=vent;
	}
}
