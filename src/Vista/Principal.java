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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	
	
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
		
		JButton btnNewRefrigerado = new JButton("New button");
		btnNewRefrigerado.setBounds(134, 88, 124, 41);
		contentPane.add(btnNewRefrigerado);
		
		JButton btnMostrarDatos = new JButton("New button");
		btnMostrarDatos.setBounds(550, 96, 124, 41);
		contentPane.add(btnMostrarDatos);
		
		JButton btnNewCongelado = new JButton("New button");
		btnNewCongelado.setBounds(134, 274, 124, 41);
		contentPane.add(btnNewCongelado);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(550, 274, 124, 41);
		contentPane.add(btnNewButton_3);
		
		
	}
}
