package com.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.dao.Id;
import com.dao.InsertOperation;
import com.dao.Insertop;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Card extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card frame = new Card();
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
	public Card() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Card No.");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_1.setBounds(141, 90, 98, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		textField.setForeground(new Color(219, 112, 147));
		textField.setFont(new Font("Segoe UI", Font.BOLD, 20));
		textField.setBounds(296, 90, 198, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Expiration Date");
		lblNewLabel_2.setForeground(new Color(219, 112, 147));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(141, 153, 165, 23);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Segoe UI", Font.BOLD, 20));
		dateChooser.setForeground(new Color(219, 112, 147));
		dateChooser.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		dateChooser.setBounds(296, 153, 198, 37);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("CVV");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(219, 112, 147));
		lblNewLabel_3.setBounds(141, 211, 98, 23);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(25, 25, 112), 2));
		passwordField.setFont(new Font("Segoe UI", Font.BOLD, 20));
		passwordField.setForeground(new Color(219, 112, 147));
		passwordField.setBounds(296, 217, 198, 37);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("PAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Id i=new Id();
				String idn=i.getid();
						
				char[] pwd=(passwordField.getPassword());
				String st=new String(pwd);	
				ArrayList<String> al = new ArrayList<String>();
				al.add(textField.getText());
				al.add(st);
				al.add(idn);
				Insertop io=new Insertop();
				int row=io.insert_into_card_info_table(al);
				if (textField.getText().isEmpty()||st.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Payment Failed! Try Again", "Failed",
							JOptionPane.ERROR_MESSAGE);
				} else {
									
					JOptionPane.showMessageDialog(null, "Payment Done Successful\nPayment id:"+idn);					
					
				}
			}
		});
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setBounds(141, 302, 120, 30);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(0, 0, 584, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 11, 43, 45);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\242452 (1).png"));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("ONLINE FOOD DELIVERY");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(153, 26, 303, 31);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(219, 112, 147));
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(324, 302, 120, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("PAY");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel.setBounds(0, 0, 584, 462);
		contentPane.add(lblNewLabel);
	}
}
