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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class MostrarEtiqueta extends JFrame {
	
	private Principal ventanaPrincipal;
	
	private JPanel contentPane;
	private JTable tablaStock;

	public MostrarEtiqueta() {
		setUndecorated(true);
		setTitle("Etiqueta del Producto");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 383);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 71, 536, 214);
		contentPane.add(scrollPane);
		
		tablaStock = new JTable();
		tablaStock.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Nro de Lote", "Fecha de Vencimiento"
			}
		));
		tablaStock.getColumnModel().getColumn(0).setPreferredWidth(202);
		tablaStock.getColumnModel().getColumn(1).setPreferredWidth(103);
		tablaStock.getColumnModel().getColumn(2).setPreferredWidth(125);
		scrollPane.setViewportView(tablaStock);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(true);
				setVisible(false);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSalir.setBounds(424, 308, 109, 41);
		contentPane.add(btnSalir);
		
		JLabel lblEtiquetaDelProducto = new JLabel("Etiqueta del Producto");
		lblEtiquetaDelProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiquetaDelProducto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEtiquetaDelProducto.setBounds(194, 28, 229, 32);
		contentPane.add(lblEtiquetaDelProducto);
		
		JButton btnVerificar = new JButton("Verificar vencimientos");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnVerificar.setBounds(37, 308, 180, 41);
		contentPane.add(btnVerificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEliminar.setBounds(262, 308, 109, 41);
		contentPane.add(btnEliminar);
	}
	
	public void setVentanaPrincipal(Principal vent) {
		this.ventanaPrincipal=vent;
	}
}
