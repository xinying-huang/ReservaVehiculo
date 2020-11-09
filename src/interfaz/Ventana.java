package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblGrupo;
	private JLabel lblReservaDeVehiculo;
	private JPanel panel_inicio;
	private JPanel panel_alta_cliente;
	private JPanel panel_empleado;
	private JPanel panel_cliente;
	private JButton btnDarAlta;
	private JButton btnReservaVehiculo;
	private JButton button;
	private JButton btnDarAltaVehiculo;
	private JLabel lblNombreYApellido;
	private JButton btnNewButton;
	private JLabel lblTarjeta;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JButton btnCliente;
	private JButton btnEmpleado;
	private JButton btnVolver_cliente;
	private JButton btnVolver_1;
	private JButton btnVolver_2;
	private JButton btnVolver_empleado;
	private JPanel panel_alta_vehiculo;
	private JLabel lblMatricula;
	private JLabel lblMarca;
	private JButton btnDarDeAlta;
	private JButton btnVolver;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblModelo;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 572);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblGrupo = new JLabel("Grupo 06");
		lblGrupo.setForeground(Color.ORANGE);
		lblGrupo.setBounds(5, 5, 84, 23);
		contentPane.add(lblGrupo);

		lblReservaDeVehiculo = new JLabel("Reserva de Vehiculo");
		lblReservaDeVehiculo.setForeground(Color.ORANGE);
		lblReservaDeVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblReservaDeVehiculo.setBounds(350, 5, 218, 71);
		contentPane.add(lblReservaDeVehiculo);

		panel_alta_vehiculo = new JPanel();
		panel_alta_vehiculo.setBackground(Color.WHITE);
		panel_alta_vehiculo.setBounds(200, 143, 536, 283);
		contentPane.add(panel_alta_vehiculo);
		panel_alta_vehiculo.setLayout(null);

		lblMatricula = new JLabel("Matricula : ");
		lblMatricula.setBounds(45, 43, 79, 25);
		panel_alta_vehiculo.add(lblMatricula);

		lblMarca = new JLabel("Marca : ");
		lblMarca.setBounds(45, 79, 58, 25);
		panel_alta_vehiculo.add(lblMarca);

		btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.setBounds(45, 213, 450, 23);
		panel_alta_vehiculo.add(btnDarDeAlta);

		btnVolver = new JButton("Volver");

		btnVolver.setBounds(45, 249, 450, 23);
		panel_alta_vehiculo.add(btnVolver);

		textField_4 = new JTextField();
		textField_4.setBounds(134, 45, 361, 20);
		panel_alta_vehiculo.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(134, 81, 361, 20);
		panel_alta_vehiculo.add(textField_5);
		textField_5.setColumns(10);

		lblModelo = new JLabel("Modelo : ");
		lblModelo.setBounds(45, 115, 79, 25);
		panel_alta_vehiculo.add(lblModelo);

		textField_6 = new JTextField();
		textField_6.setBounds(134, 117, 361, 20);
		panel_alta_vehiculo.add(textField_6);
		textField_6.setColumns(10);

		panel_alta_cliente = new JPanel();
		panel_alta_cliente.setBounds(200, 143, 536, 283);
		contentPane.add(panel_alta_cliente);
		panel_alta_cliente.setLayout(null);
		panel_alta_cliente.setBackground(Color.WHITE);

		btnNewButton = new JButton("Dar de alta");
		btnNewButton.setBounds(39, 201, 453, 23);
		panel_alta_cliente.add(btnNewButton);

		lblNombreYApellido = new JLabel("Nombre y Apellido : ");
		lblNombreYApellido.setBounds(39, 44, 131, 23);
		panel_alta_cliente.add(lblNombreYApellido);

		lblTarjeta = new JLabel("Tarjeta bancario : ");
		lblTarjeta.setBounds(39, 112, 131, 23);
		panel_alta_cliente.add(lblTarjeta);

		lblTelefono = new JLabel("Telefono : ");
		lblTelefono.setBounds(39, 78, 131, 23);
		panel_alta_cliente.add(lblTelefono);

		lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(39, 146, 131, 23);
		panel_alta_cliente.add(lblEmail);

		textField = new JTextField();
		textField.setBounds(180, 45, 312, 20);
		panel_alta_cliente.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(180, 79, 312, 20);
		panel_alta_cliente.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(180, 113, 312, 20);
		panel_alta_cliente.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(180, 147, 312, 20);
		panel_alta_cliente.add(textField_3);
		textField_3.setColumns(10);

		btnVolver_cliente = new JButton("Volver");

		btnVolver_cliente.setBounds(39, 232, 453, 23);
		panel_alta_cliente.add(btnVolver_cliente);

		btnVolver_empleado = new JButton("Volver");
		btnVolver_empleado.setBounds(39, 232, 453, 23);
		panel_alta_cliente.add(btnVolver_empleado);
		//------------------------------------------------------------------------------
		panel_alta_cliente.setVisible(false);

		btnVolver_cliente.setVisible(false);
		btnVolver_empleado.setVisible(false);
		btnVolver_cliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_cliente.setVisible(false);
				panel_cliente.setVisible(true);
				btnVolver_cliente.setVisible(false);

				if(btnVolver_empleado.isVisible()) {
					panel_empleado.setVisible(true);
					btnVolver_empleado.setVisible(false);
				}

			}
		});//alta cliente->cliente
		btnVolver_empleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_cliente.setVisible(false);
				panel_empleado.setVisible(true);
				btnVolver_empleado.setVisible(false);


			}
		});//alta cliente->empleado


		panel_empleado = new JPanel();
		panel_empleado.setBounds(5, 93, 914, 431);
		contentPane.add(panel_empleado);
		panel_empleado.setLayout(null);
		panel_empleado.setBackground(Color.WHITE);

		button = new JButton("Dar alta cliente");

		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(Color.ORANGE);
		button.setBounds(96, 128, 234, 126);
		panel_empleado.add(button);

		btnDarAltaVehiculo = new JButton("Dar alta vehiculo");

		btnDarAltaVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnDarAltaVehiculo.setBackground(Color.ORANGE);
		btnDarAltaVehiculo.setBounds(564, 128, 261, 126);
		panel_empleado.add(btnDarAltaVehiculo);

		btnVolver_2 = new JButton("Volver");

		btnVolver_2.setBounds(10, 397, 894, 23);
		panel_empleado.add(btnVolver_2);
		panel_empleado.setVisible(false);

		panel_cliente = new JPanel();
		panel_cliente.setBounds(5, 93, 914, 431);
		contentPane.add(panel_cliente);
		panel_cliente.setLayout(null);
		panel_cliente.setBackground(Color.WHITE);

		btnDarAlta = new JButton("Dar alta cliente");

		btnDarAlta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnDarAlta.setBackground(Color.ORANGE);
		btnDarAlta.setBounds(96, 128, 234, 126);
		panel_cliente.add(btnDarAlta);

		btnReservaVehiculo = new JButton("Reserva vehiculo");
		btnReservaVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnReservaVehiculo.setBackground(Color.ORANGE);
		btnReservaVehiculo.setBounds(564, 128, 261, 126);
		panel_cliente.add(btnReservaVehiculo);

		btnVolver_1 = new JButton("Volver");

		btnVolver_1.setBounds(10, 397, 894, 23);
		panel_cliente.add(btnVolver_1);
		panel_cliente.setVisible(false);


		panel_inicio = new JPanel();
		panel_inicio.setBackground(Color.WHITE);
		panel_inicio.setBounds(5, 93, 914, 431);
		contentPane.add(panel_inicio);
		panel_inicio.setLayout(null);

		btnCliente = new JButton("Cliente");

		btnCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCliente.setBackground(Color.ORANGE);
		btnCliente.setBounds(177, 128, 153, 126);
		panel_inicio.add(btnCliente);

		btnEmpleado = new JButton("Empleado");

		btnEmpleado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnEmpleado.setBackground(Color.ORANGE);
		btnEmpleado.setBounds(564, 128, 153, 126);
		panel_inicio.add(btnEmpleado);
		panel_alta_vehiculo.setVisible(false);
		//------------------------------------------------------------------------------
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(true);
			}
		});//inicio->cliente
		btnVolver_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(true);
				panel_cliente.setVisible(false);
			}
		});//cliente -> inicio
		btnDarAlta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_cliente.setVisible(false);
				panel_alta_cliente.setVisible(true);
				btnVolver_cliente.setVisible(true);
			}
		});//cliente->alta cliente
		btnEmpleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_empleado.setVisible(true);
			}
		});//inicio->empleado
		btnVolver_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(true);
				panel_empleado.setVisible(false);
			}
		});//empleado a inicio
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_cliente.setVisible(true);
				panel_empleado.setVisible(false);
				btnVolver_empleado.setVisible(true);
			}
		});//empleado->alta cliente
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_vehiculo.setVisible(false);
				panel_empleado.setVisible(true);
			}
		});//alta vehiculo->empleado
		btnDarAltaVehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_vehiculo.setVisible(true);
				panel_empleado.setVisible(false);
			}
		});//empleado->alta vehiculo
	}
}
