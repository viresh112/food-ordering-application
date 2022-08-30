package com.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(0, 0, 584, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\242452 (1).png"));
		lblNewLabel_1.setBounds(10, 21, 43, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAYMENT");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_2.setBounds(226, 54, 130, 26);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("ONLINE FOOD DELIVERY");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(147, 11, 303, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(new Color(219, 112, 147));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(118, 106, 73, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mob");
		lblNewLabel_4.setForeground(new Color(219, 112, 147));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4.setBounds(118, 153, 73, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(219, 112, 147));
		lblNewLabel_5.setBounds(118, 195, 83, 24);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		textArea.setForeground(new Color(219, 112, 147));
		textArea.setFont(new Font("Segoe UI", Font.BOLD, 20));
		textArea.setBounds(201, 192, 208, 63);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Card");
		lblNewLabel_7.setForeground(new Color(219, 112, 147));
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_7.setBounds(118, 306, 73, 24);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Type");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_8.setForeground(new Color(219, 112, 147));
		lblNewLabel_8.setBounds(118, 325, 73, 31);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		//comboBox.setToolTipText();
		comboBox.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		comboBox.setBounds(201, 308, 208, 31);
		contentPane.add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("Visa");
		comboBox.addItem("Rupay");
		comboBox.addItem("Master card");
		
		JButton btnNewButton_1 = new JButton("PAY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Card c=new Card();
				c.setVisible(true);
				setVisible(false);
								
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnNewButton_1.setForeground(new Color(219, 112, 147));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(208, 420, 89, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu mm=new Main_Menu();
				mm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		btnNewButton_2.setBackground(new Color(240, 240, 240));
		btnNewButton_2.setForeground(new Color(219, 112, 147));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_2.setBounds(307, 419, 89, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Pin Code");
		lblNewLabel_6.setForeground(new Color(219, 112, 147));
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_6.setBounds(118, 264, 83, 24);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		textField_2.setBounds(201, 266, 208, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
				
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		textField_1.setForeground(new Color(219, 112, 147));
		textField_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		textField_1.setBounds(201, 150, 208, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(new Color(219, 112, 147));
		textField.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		textField.setBounds(201, 108, 208, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBackground(new Color(25, 25, 112));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\buildtools\\Maha-Vaccination-Drive\\src\\resources\\bg.png"));
		lblNewLabel.setBounds(0, 0, 584, 462);
		contentPane.add(lblNewLabel);
	}
}
