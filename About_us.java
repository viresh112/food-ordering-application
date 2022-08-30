package com.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About_us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_us frame = new About_us();
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
	public About_us() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\fc0__1_-removebg (2).png"));
		lblNewLabel_1.setBounds(181, 11, 211, 199);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:   Viresh Shadakshari Hiremath");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(128, 231, 355, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("College: Government Polytechnic Solapur");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(25, 25, 112));
		lblNewLabel_4.setBounds(128, 262, 410, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Branch:  Computer  Technology");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(25, 25, 112));
		lblNewLabel_3.setBounds(128, 295, 363, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Class:     CM5I");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(25, 25, 112));
		lblNewLabel_5.setBounds(128, 326, 355, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enrollment No: 2000150081");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_6.setForeground(new Color(25, 25, 112));
		lblNewLabel_6.setBounds(128, 353, 355, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Topic: Online Food Delivery");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_7.setForeground(new Color(25, 25, 112));
		lblNewLabel_7.setBounds(128, 378, 355, 36);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d=new Dashboard();
				d.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\7421873-removebg-preview (1).png"));
		btnNewButton.setBounds(10, 11, 61, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel.setBounds(0, 0, 584, 462);
		contentPane.add(lblNewLabel);
	}
}
