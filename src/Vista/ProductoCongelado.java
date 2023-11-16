package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class ProductoCongelado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public ProductoCongelado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 469);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Cancelar");
		button.setFont(new Font("Sitka Small", Font.BOLD, 14));
		button.setBounds(446, 349, 121, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Guardar");
		button_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		button_1.setBounds(76, 349, 111, 38);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("Granja de origen:");
		label.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label.setBounds(31, 264, 121, 23);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 264, 133, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Costo de tratamiento:");
		label_1.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_1.setBounds(319, 266, 140, 18);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(469, 264, 140, 20);
		contentPane.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(442, 205, 111, 20);
		contentPane.add(dateChooser);
		
		JLabel label_2 = new JLabel("Fecha de vencimiento:");
		label_2.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_2.setBounds(301, 208, 150, 17);
		contentPane.add(label_2);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(161, 205, 111, 20);
		contentPane.add(dateChooser_1);
		
		JLabel label_3 = new JLabel("Fecha de envasado:");
		label_3.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_3.setBounds(31, 205, 126, 23);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Temperatura de mantenimiento recomendada:");
		label_4.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_4.setBounds(31, 158, 299, 23);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(340, 158, 186, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(340, 108, 186, 20);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("Codigo de organismo de supervision alimentaria:");
		label_5.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_5.setBounds(31, 108, 305, 23);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(230, 67, 195, 20);
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("Descripcion del Producto:");
		label_6.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		label_6.setBounds(29, 68, 170, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Nuevos Datos de Producto Congelado");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(189, 11, 286, 31);
		contentPane.add(label_7);
	}
}
