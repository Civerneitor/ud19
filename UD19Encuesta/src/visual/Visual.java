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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public Visual() {
		setTitle("Encuesta");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Sistema operativo:");
		etiqueta.setBounds(65,29,200,20);
		contentPane.add(etiqueta);
		
		lblNewLabel = new JLabel("Especialidad:");
		lblNewLabel.setBounds(193, 32, 113, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programador");
		chckbxNewCheckBox.setBounds(193, 56, 135, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setSelected(true);
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(65, 56, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(65, 82, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(65, 108, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxNewCheckBox_1.setBounds(193, 82, 135, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administraci\u00F3n");
		chckbxNewCheckBox_2.setBounds(193, 108, 135, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_1.setBounds(367, 32, 200, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(357, 86, 13, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("10");
		lblNewLabel_3.setBounds(567, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado:");
		lblNewLabel_4.setBounds(295, 188, 97, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(10, 213, 614, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("0 horas");
		lblNewLabel_6.setForeground(Color.GRAY);
		lblNewLabel_6.setBounds(438, 112, 61, 14);
		contentPane.add(lblNewLabel_6);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblNewLabel_6.setText(slider.getValue()+" horas");
			}
		});
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(367, 79, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.BLUE);
		lblNewLabel_5_1.setBounds(10, 230, 614, 20);
		contentPane.add(lblNewLabel_5_1);
		
		JButton btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String res = "Ha escogido ";
				String res2 = "";
				if(rdbtnNewRadioButton.isSelected()) {
					res+="Windows";
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					res+="Linux";
				}else if(rdbtnNewRadioButton_2.isSelected()) {
					res+="Mac";
				}
				res+=" especializado como ";
				if(chckbxNewCheckBox.isSelected()) {
					res+="Programador";
					if(chckbxNewCheckBox_1.isSelected()) {
						res+=", Diseñador gráfico";
						if(chckbxNewCheckBox_2.isSelected()) {
							res+=" y";
							res2+="Administrador";
						}
					}else if(chckbxNewCheckBox_2.isSelected()) {
						res+=", Administrador";
					}
				}else if(chckbxNewCheckBox_1.isSelected()) {
					res+="Diseñador gráfico";
					if(chckbxNewCheckBox_2.isSelected()) {
						res+=", Administrador";
					}
				}else if(chckbxNewCheckBox.isSelected()) {
					res+="Administrador";
				}else {
					res+="nada";
				}
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					res2+=" con un total de "+slider.getValue()+" horas.";
				}else {
					res+=" con un total de "+slider.getValue()+" horas.";
				}
				
				lblNewLabel_5.setText(res);
				lblNewLabel_5_1.setText(res2);
			}
		});
		btnNewButton.setBounds(272, 154, 89, 23);
		contentPane.add(btnNewButton);
		
		
		

		
	}
}
