package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Visual extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiqueta;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public Visual() {
		setTitle("MiniCalculadora");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Introduce un n\u00FAmero:");
		etiqueta.setBounds(30,64,154,20);
		contentPane.add(etiqueta);
		
		lblNewLabel = new JLabel("Introduce otro n\u00FAmero:");
		lblNewLabel.setBounds(183, 67, 147, 14);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(470, 67, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		textField = new JTextField();
		textField.setBounds(30, 95, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 95, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(470, 92, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Ésta aplicación es una minicaluladora hecha por Sergio Castilla");
			}
		});
		btnNewButton.setBounds(347, 181, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sumar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c = a+b;
				textField_2.setText(""+c);
			}
		});
		btnNewButton_1.setBounds(347, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Restar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c = a-b;
				textField_2.setText(""+c);
			}
		});
		btnNewButton_2.setBounds(347, 79, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Multiplicar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c = a*b;
				textField_2.setText(""+c);
			}
		});
		btnNewButton_3.setBounds(347, 113, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Dividir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				try {
					int c = a/b;
					textField_2.setText(""+c);
				}catch (Exception r) {
					System.out.println("Error: "+r);
					textField_2.setText("Error "+r.getMessage());
				}
			}
		});
		btnNewButton_4.setBounds(347, 147, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("Mini Calculadora");
		lblNewLabel_2.setBounds(263, 11, 119, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton_5.setBounds(535, 227, 89, 23);
		contentPane.add(btnNewButton_5);
		
		
		

		
	}
}
