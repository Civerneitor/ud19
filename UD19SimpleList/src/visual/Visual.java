package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Visual extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiqueta;
	private JTextField textField;
	private JButton btn;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel;
	
	public Visual() {
		setTitle("SimpleList");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Escriba el título de una película");
		etiqueta.setBounds(65,29,200,20);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(65,60,188,20);
		contentPane.add(textField);
		
		btn = new JButton("Añadir película");
		btn.setBounds(65,102,127,20);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "¡Hola "+textField.getText() + "!");
				comboBox.addItem(textField.getText());
			}
			
		});
		contentPane.add(btn);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(328, 59, 188, 22);
		contentPane.add(comboBox);
		
		lblNewLabel = new JLabel("Películas");
		lblNewLabel.setBounds(328, 32, 113, 14);
		contentPane.add(lblNewLabel);
		
	}
}
