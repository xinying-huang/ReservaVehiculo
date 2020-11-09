package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import ILF.Cliente;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

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
	private JLabel lblGama;
	private JComboBox comboBox_1;
	private JTextField textField_8;
	private JLabel lblCambioDeMarcha;
	private JComboBox comboBox_2;
	private JLabel lblEstado;
	private JComboBox comboBox_3;
	private JLabel lblCantidad;
	private JTextField textField_7;
	private JPanel panel_exito;
	private JLabel lblSeHaDado;
	private JLabel lblDnicif;
	private JTextField textField_9;
	private JLabel lblCampos;
	private JLabel lblCampos_1;
	static AltaCliente ac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					ac=new AltaCliente();					
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
		//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				try {
					ac.Close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);

			}
		});
		setBounds(100, 100, 943, 572);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblGrupo = new JLabel("Grupo 06");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblGrupo.setForeground(Color.WHITE);
		lblGrupo.setBounds(5, 5, 84, 23);
		contentPane.add(lblGrupo);

		lblReservaDeVehiculo = new JLabel("Sistema de Reserva");
		lblReservaDeVehiculo.setForeground(Color.WHITE);
		lblReservaDeVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblReservaDeVehiculo.setBounds(307, 5, 335, 71);
		contentPane.add(lblReservaDeVehiculo);

		panel_alta_vehiculo = new JPanel();
		panel_alta_vehiculo.setBackground(SystemColor.activeCaption);
		panel_alta_vehiculo.setBounds(200, 71, 536, 431);
		panel_alta_vehiculo.setBorder(new LineBorder(Color.WHITE, 2, true));
		contentPane.add(panel_alta_vehiculo);
		panel_alta_vehiculo.setLayout(null);

		lblMatricula = new JLabel("Matr\u00EDculas(*) : ");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setBounds(10, 11, 114, 25);
		panel_alta_vehiculo.add(lblMatricula);

		lblMarca = new JLabel("Marca(*) : ");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(10, 47, 93, 25);
		panel_alta_vehiculo.add(lblMarca);

		btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.setForeground(Color.WHITE);
		btnDarDeAlta.setBorder(new LineBorder(Color.WHITE, 2, true));

		btnDarDeAlta.setBackground(SystemColor.activeCaption);
		btnDarDeAlta.setBounds(10, 363, 516, 23);
		panel_alta_vehiculo.add(btnDarDeAlta);

		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(SystemColor.activeCaption);
		btnVolver.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolver.setBounds(10, 397, 516, 23);
		panel_alta_vehiculo.add(btnVolver);

		textField_4 = new JTextField();
		textField_4.setBounds(134, 13, 392, 20);
		panel_alta_vehiculo.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(134, 49, 392, 20);
		panel_alta_vehiculo.add(textField_5);
		textField_5.setColumns(10);

		lblModelo = new JLabel("Modelo(*) : ");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setBounds(10, 83, 114, 25);
		panel_alta_vehiculo.add(lblModelo);

		textField_6 = new JTextField();
		textField_6.setBounds(134, 85, 392, 20);
		panel_alta_vehiculo.add(textField_6);
		textField_6.setColumns(10);

		lblGama = new JLabel("Gama(*) : ");
		lblGama.setForeground(Color.WHITE);
		lblGama.setBounds(10, 124, 114, 23);
		panel_alta_vehiculo.add(lblGama);

		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "bajo", "medio", "alto"}));
		comboBox_1.setBounds(134, 124, 392, 22);
		panel_alta_vehiculo.add(comboBox_1);

		JLabel lblOpcinDeModelo = new JLabel("Opci\u00F3n de modelo : ");
		lblOpcinDeModelo.setForeground(Color.WHITE);
		lblOpcinDeModelo.setBounds(10, 226, 114, 25);
		panel_alta_vehiculo.add(lblOpcinDeModelo);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE, 2));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(134, 226, 392, 104);
		panel_alta_vehiculo.add(panel);
		panel.setLayout(null);

		JLabel lblCapacidadDeAforo = new JLabel("Capacidad de Aforo : ");
		lblCapacidadDeAforo.setForeground(Color.WHITE);
		lblCapacidadDeAforo.setBounds(10, 70, 128, 23);
		panel.add(lblCapacidadDeAforo);

		JRadioButton rdbtnTechoSolar = new JRadioButton("Techo Solar");
		rdbtnTechoSolar.setForeground(Color.WHITE);
		rdbtnTechoSolar.setBackground(SystemColor.activeCaption);
		rdbtnTechoSolar.setBounds(10, 5, 111, 23);
		panel.add(rdbtnTechoSolar);

		textField_8 = new JTextField();
		textField_8.setBounds(148, 71, 234, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);

		lblCambioDeMarcha = new JLabel("Cambio de Marcha : ");
		lblCambioDeMarcha.setForeground(Color.WHITE);
		lblCambioDeMarcha.setBounds(10, 35, 118, 24);
		panel.add(lblCambioDeMarcha);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "cambio manual", "cambio autom\u00E1tico"}));
		comboBox_2.setBounds(148, 36, 234, 22);
		panel.add(comboBox_2);

		lblEstado = new JLabel("Estado : ");
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setBounds(10, 158, 114, 23);
		panel_alta_vehiculo.add(lblEstado);

		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"disponible"}));
		comboBox_3.setBounds(134, 158, 392, 22);
		panel_alta_vehiculo.add(comboBox_3);

		lblCantidad = new JLabel("Cantidad(*) : ");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBounds(10, 192, 114, 23);
		panel_alta_vehiculo.add(lblCantidad);

		textField_7 = new JTextField();
		textField_7.setBounds(134, 193, 392, 20);
		panel_alta_vehiculo.add(textField_7);
		textField_7.setColumns(10);

		lblCampos_1 = new JLabel("(*) : campos obligatorios.");
		lblCampos_1.setForeground(Color.WHITE);
		lblCampos_1.setBounds(10, 337, 516, 25);
		panel_alta_vehiculo.add(lblCampos_1);
		panel_alta_vehiculo.setVisible(false);				

		panel_alta_cliente = new JPanel();
		panel_alta_cliente.setBounds(200, 116, 536, 310);
		contentPane.add(panel_alta_cliente);
		panel_alta_cliente.setLayout(null);
		panel_alta_cliente.setBackground(SystemColor.activeCaption);
		panel_alta_cliente.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnNewButton = new JButton("Dar de alta");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(new LineBorder(Color.WHITE, 2, true));

		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(39, 245, 453, 23);
		panel_alta_cliente.add(btnNewButton);

		lblNombreYApellido = new JLabel("Nombre y Apellido(*) : ");
		lblNombreYApellido.setForeground(Color.WHITE);
		lblNombreYApellido.setBounds(39, 11, 131, 23);
		panel_alta_cliente.add(lblNombreYApellido);

		lblTarjeta = new JLabel("Tarjeta bancario(*) : ");
		lblTarjeta.setForeground(Color.WHITE);
		lblTarjeta.setBounds(39, 110, 131, 23);
		panel_alta_cliente.add(lblTarjeta);

		lblTelefono = new JLabel("Tel\u00E9fono(*) : ");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(39, 76, 131, 23);
		panel_alta_cliente.add(lblTelefono);

		lblEmail = new JLabel("Email : ");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(39, 144, 131, 23);
		panel_alta_cliente.add(lblEmail);

		textField = new JTextField();
		textField.setBounds(180, 12, 312, 20);
		panel_alta_cliente.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(180, 77, 312, 20);
		panel_alta_cliente.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(180, 111, 312, 20);
		panel_alta_cliente.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(180, 145, 312, 20);
		panel_alta_cliente.add(textField_3);
		textField_3.setColumns(10);

		btnVolver_cliente = new JButton("Volver");
		btnVolver_cliente.setForeground(Color.WHITE);
		btnVolver_cliente.setBackground(SystemColor.activeCaption);
		btnVolver_cliente.setBorder(new LineBorder(Color.WHITE, 2, true));

		btnVolver_cliente.setBounds(39, 276, 453, 23);
		panel_alta_cliente.add(btnVolver_cliente);

		btnVolver_empleado = new JButton("Volver");
		btnVolver_empleado.setForeground(Color.WHITE);
		btnVolver_empleado.setBackground(SystemColor.activeCaption);
		btnVolver_empleado.setBounds(39, 276, 453, 23);
		panel_alta_cliente.add(btnVolver_empleado);
		btnVolver_empleado.setBorder(new LineBorder(Color.WHITE, 2, true));

		JLabel lblTipoDeCliente = new JLabel("Tipo de cliente(*) : ");
		lblTipoDeCliente.setForeground(Color.WHITE);
		lblTipoDeCliente.setBounds(39, 178, 131, 23);
		panel_alta_cliente.add(lblTipoDeCliente);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "cliente individual", "cliente de negocio"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(180, 176, 312, 22);
		panel_alta_cliente.add(comboBox);

		lblDnicif = new JLabel("DNI/CIF(*) : ");
		lblDnicif.setForeground(Color.WHITE);
		lblDnicif.setBounds(39, 45, 131, 20);
		panel_alta_cliente.add(lblDnicif);

		textField_9 = new JTextField();
		textField_9.setBounds(180, 43, 312, 20);
		panel_alta_cliente.add(textField_9);
		textField_9.setColumns(10);

		lblCampos = new JLabel("(*) : campos obligatorios.");
		lblCampos.setForeground(Color.WHITE);
		lblCampos.setBounds(39, 212, 453, 22);
		panel_alta_cliente.add(lblCampos);
		//------------------------------------------------------------------------------
		panel_alta_cliente.setVisible(false);		

		panel_exito = new JPanel();
		panel_exito.setBackground(SystemColor.activeCaption);
		panel_exito.setBounds(5, 93, 914, 431);
		contentPane.add(panel_exito);
		panel_exito.setLayout(null);

		lblSeHaDado = new JLabel("Se ha dado de alta con \u00E9xito !!!!");
		lblSeHaDado.setForeground(Color.WHITE);
		lblSeHaDado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeHaDado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblSeHaDado.setBounds(197, 92, 522, 108);
		panel_exito.add(lblSeHaDado);

		JButton btnVolver_3 = new JButton("Volver");
		btnVolver_3.setForeground(Color.WHITE);
		btnVolver_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVolver_3.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolver_3.setBackground(SystemColor.activeCaption);
		btnVolver_3.setBounds(380, 211, 152, 40);
		panel_exito.add(btnVolver_3);
		panel_exito.setVisible(false);		

		panel_empleado = new JPanel();
		panel_empleado.setBounds(5, 93, 914, 431);
		contentPane.add(panel_empleado);
		panel_empleado.setLayout(null);
		panel_empleado.setBackground(SystemColor.activeCaption);

		button = new JButton("Dar alta cliente");
		button.setForeground(Color.WHITE);

		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(96, 128, 234, 126);
		button.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel_empleado.add(button);

		btnDarAltaVehiculo = new JButton("Dar alta vehiculo");
		btnDarAltaVehiculo.setForeground(Color.WHITE);
		btnDarAltaVehiculo.setBorder(new LineBorder(Color.WHITE, 2, true));

		btnDarAltaVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnDarAltaVehiculo.setBackground(SystemColor.activeCaption);
		btnDarAltaVehiculo.setBounds(564, 128, 261, 126);
		panel_empleado.add(btnDarAltaVehiculo);

		btnVolver_2 = new JButton("Volver");
		btnVolver_2.setForeground(Color.WHITE);
		btnVolver_2.setBackground(SystemColor.activeCaption);
		btnVolver_2.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnVolver_2.setBounds(10, 397, 894, 23);
		panel_empleado.add(btnVolver_2);
		panel_empleado.setVisible(false);		

		panel_cliente = new JPanel();
		panel_cliente.setBounds(5, 93, 914, 431);
		contentPane.add(panel_cliente);
		panel_cliente.setLayout(null);
		panel_cliente.setBackground(SystemColor.activeCaption);

		btnDarAlta = new JButton("Dar alta cliente");
		btnDarAlta.setForeground(Color.WHITE);

		btnDarAlta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnDarAlta.setBackground(SystemColor.activeCaption);
		btnDarAlta.setBounds(96, 128, 234, 126);
		btnDarAlta.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel_cliente.add(btnDarAlta);

		btnReservaVehiculo = new JButton("Reserva vehiculo");
		btnReservaVehiculo.setForeground(Color.WHITE);
		btnReservaVehiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnReservaVehiculo.setBackground(SystemColor.activeCaption);
		btnReservaVehiculo.setBounds(564, 128, 261, 126);
		btnReservaVehiculo.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel_cliente.add(btnReservaVehiculo);

		btnVolver_1 = new JButton("Volver");
		btnVolver_1.setForeground(Color.WHITE);
		btnVolver_1.setBackground(SystemColor.activeCaption);
		btnVolver_1.setBorder(new LineBorder(Color.WHITE, 2, true));

		btnVolver_1.setBounds(10, 397, 894, 23);
		panel_cliente.add(btnVolver_1);
		panel_cliente.setVisible(false);		

		panel_inicio = new JPanel();
		panel_inicio.setBackground(SystemColor.activeCaption);
		panel_inicio.setBounds(5, 93, 914, 431);
		contentPane.add(panel_inicio);
		panel_inicio.setLayout(null);

		btnCliente = new JButton("Cliente");
		btnCliente.setForeground(Color.WHITE);

		btnCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnCliente.setBackground(SystemColor.activeCaption);
		btnCliente.setBounds(177, 128, 153, 126);
		panel_inicio.add(btnCliente);
		btnCliente.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnEmpleado = new JButton("Empleado");
		btnEmpleado.setForeground(Color.WHITE);

		btnEmpleado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnEmpleado.setBackground(SystemColor.activeCaption);
		btnEmpleado.setBounds(564, 128, 153, 126);
		panel_inicio.add(btnEmpleado);
		btnEmpleado.setBorder(new LineBorder(Color.WHITE, 2, true));
		//------------------------------------------------------------------------------
		panel_inicio.setVisible(true);
		panel_cliente.setVisible(false);
		panel_exito.setVisible(false);
		panel_empleado.setVisible(false);
		panel_alta_cliente.setVisible(false);
		panel_alta_vehiculo.setVisible(false);
		//------------------------------------------------------------------------------		
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(true);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);	
			}
		});//inicio->cliente
		btnEmpleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(true);
				panel_exito.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);	
				panel_inicio.setVisible(false);
				panel_empleado.setVisible(true);
			}
		});//inicio->empleado
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(true);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//alta vehiculo->empleado
		btnVolver_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				panel_inicio.setVisible(true);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//exito->inicio
		btnVolver_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				panel_inicio.setVisible(true);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//cliente -> inicio
		btnDarAlta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(true);
				panel_alta_vehiculo.setVisible(false);
				btnVolver_cliente.setVisible(true);
			}
		});//cliente->alta cliente
		btnVolver_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				panel_inicio.setVisible(true);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//empleado a inicio
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(true);
				panel_alta_vehiculo.setVisible(false);
				btnVolver_empleado.setVisible(true);
			}
		});//empleado->alta cliente
		btnDarAltaVehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(true);
			}
		});//empleado->alta vehiculo
		btnVolver_cliente.setVisible(false);
		btnVolver_empleado.setVisible(false);
		btnVolver_cliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_alta_cliente.setVisible(false);
				panel_cliente.setVisible(true);
				btnVolver_cliente.setVisible(false);
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(true);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//alta cliente->cliente
		btnVolver_empleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(false);
				panel_empleado.setVisible(true);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
				btnVolver_empleado.setVisible(false);
				// cliente				
				textField.setText("");
				textField_9.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
				//vehiculo
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_7.setText("");
				rdbtnTechoSolar.setSelected(false);
				comboBox_2.setSelectedIndex(0);
				textField_8.setText("");
				panel_exito.setVisible(false);
				panel_inicio.setVisible(true);
			}
		});//alta cliente->empleado
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			

				String IDCliente = textField_9.getText();
				String nombre = textField.getText();
				String tipo = (String)comboBox.getSelectedItem();
				String tarjetaBancaria = textField_2.getText();
				String telefono = textField_1.getText();
				String email=textField_3.getText();
				Cliente c = new Cliente(IDCliente, tipo, nombre, tarjetaBancaria, telefono, email);
				ac.Alta(c);

				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(true);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//alta cliente->exito
		btnDarDeAlta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicio.setVisible(false);
				panel_cliente.setVisible(false);
				panel_exito.setVisible(true);
				panel_empleado.setVisible(false);
				panel_alta_cliente.setVisible(false);
				panel_alta_vehiculo.setVisible(false);
			}
		});//alta vehiculo->exito
	}
	
	// cliente
	//Nombre=textField
	//DNI=textFiel_9
	//telefono=textFiel_1
	//Tarjeta=textFiel_2
	//email=textFiel_3
	//Tipo=comboBox
	//vehiculo
	//matricula=textFiel_4
	//marca=textFiel_5
	//modelo=textFiel_6
	//gama=comboBox_1
	//Estado=comboBox_3
	//Cantidad=textFiel_7
	//Techosolar=rdbtnTechosolar
	//CambioMarcha=comboBox_2
	//capacidadAforo=textFiel_8

}
