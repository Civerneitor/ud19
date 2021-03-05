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
	
	public Visual() {
		setTitle("Saludador");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Escriba un nombre para saludar");
		etiqueta.setBounds(200,20,300,20);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(150,60,300,20);
		contentPane.add(textField);
		
		btn = new JButton("¡Saludar!");
		btn.setBounds(250,80,100,20);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "¡Hola "+textField.getText() + "!");
			}
			
		});
		contentPane.add(btn);
		
	}
}
