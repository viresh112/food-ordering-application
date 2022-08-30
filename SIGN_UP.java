package com.login;
import com.dao.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SIGN_UP extends JFrame {

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
					SIGN_UP frame = new SIGN_UP();
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
	public SIGN_UP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(0, 0, 584, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\242452 (1).png"));
		lblNewLabel.setBounds(10, 11, 40, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ONLINE FOOD DELIVERY");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(148, 52, 304, 36);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 140, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("SIGN UP");
		lblNewLabel_5.setForeground(new Color(219, 112, 147));
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setBounds(247, 121, 95, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setForeground(new Color(219, 112, 147));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_4.setBounds(233, 121, 103, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("USERNAME");
		lblNewLabel_6.setForeground(new Color(219, 112, 147));
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_6.setBounds(118, 198, 93, 27);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(72, 61, 139), 2));
		textField.setBounds(237, 198, 171, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("PASSWORD");
		lblNewLabel_7.setForeground(new Color(219, 112, 147));
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_7.setBounds(118, 278, 93, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("*  please enter Username");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(273, 185, 148, 14);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("* please enter password");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setBounds(273, 265, 148, 14);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {									
				
				if (textField.getText().isEmpty()) {
					lblNewLabel_8.setVisible(true);
				}else {
					lblNewLabel_8.setVisible(false);
				}
				
				String pass=passwordField.getText();
				if (pass.isEmpty()) {
					lblNewLabel_9.setVisible(true);
				} else {
					lblNewLabel_9.setVisible(false);
				}	
				
				ArrayList<String> al = new ArrayList<String>();
				al.add(textField.getText());
				al.add(passwordField.getText());
				InsertOperation i=new InsertOperation();
				int row=i.insert_into_registration_table(al);
				if (row == 0 ||textField.getText().isEmpty()||pass.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Registration Failed! Try Again", "Failed",
							JOptionPane.ERROR_MESSAGE);
				} else {
									
					JOptionPane.showMessageDialog(null, "Registration Done Successfully", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					SIGN_IN si = new SIGN_IN();
					si.setLocationRelativeTo(null);
					si.setVisible(true);
					setVisible(false);
				}
									
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(166, 377, 103, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_Page HP=new Home_Page();
				HP.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(319, 376, 103, 36);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(72, 61, 139), 2));
		passwordField.setBounds(237, 278, 171, 27);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(new LineBorder(new Color(219, 112, 147), 3));
		lblNewLabel_3.setBounds(10, 132, 564, 330);
		contentPane.add(lblNewLabel_3);
				
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel_2.setBounds(0, 109, 584, 353);
		contentPane.add(lblNewLabel_2);
	}
}
