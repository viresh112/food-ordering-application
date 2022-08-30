package com.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setBackground(new Color(240,230,140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 584, 98);
		panel.setBackground(new Color(219, 112, 147));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ONLINE FOOD DELIVERY");
		lblNewLabel_1.setBounds(148, 56, 303, 31);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 0, 42, 58);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\242452 (1).png"));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\images (1).jpg"));
		lblNewLabel_2.setBounds(114, 221, 360, 203);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("GOOD FOOD GOOD MOOD");
		lblNewLabel_4.setBounds(148, 435, 316, 27);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(25, 25, 112));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SIGN_IN SI=new SIGN_IN();
				SI.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setBounds(433, 128, 98, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SIGN_UP SU=new SIGN_UP();
				SU.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(219, 112, 147));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_1.setBounds(318, 128, 105, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(0, 95, 584, 367);
		contentPane.add(lblNewLabel);
		//setUndecorated(true);
	}
}
