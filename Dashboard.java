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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\7421873-removebg-preview (1).png"));
		lblNewLabel_2.setBounds(45, 11, 49, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dashboard");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(32, 58, 84, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\images__1_-removebg-preview (2).png"));
		lblNewLabel_4.setBounds(10, 102, 34, 37);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_Page hp=new Home_Page();
				hp.setVisible(true);
				//setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setBounds(46, 106, 99, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\2720472-removebg-preview (1).png"));
		lblNewLabel_5.setBounds(10, 162, 34, 37);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu mm=new Main_Menu();
				mm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(219, 112, 147));
		btnNewButton_1.setBounds(46, 169, 99, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4822-removebg-preview (1).png"));
		lblNewLabel_6.setBounds(10, 223, 34, 37);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("About us");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_us au=new About_us();
				au.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(219, 112, 147));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton_2.setBounds(45, 227, 100, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\2-removebg-preview (1).png"));
		lblNewLabel_7.setBounds(10, 415, 34, 36);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_Page hp=new Home_Page();
				hp.setVisible(true);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(219, 112, 147));
		btnNewButton_3.setBounds(45, 422, 100, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\71NMEUlf43L._SL1500_.jpg"));
		lblNewLabel_1.setBackground(new Color(219, 112, 147));
		lblNewLabel_1.setBounds(-12, 0, 171, 462);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("GOOD FOOD GOOD MOOD");
		lblNewLabel_8.setBounds(217, 424, 316, 27);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(new Color(25, 25, 112));
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JLabel lblNewLabel_9 = new JLabel("Welcome to \r\n\r\n");
		lblNewLabel_9.setForeground(new Color(25, 25, 112));
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_9.setBounds(169, 11, 149, 45);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Eatland");
		lblNewLabel_10.setForeground(new Color(25, 25, 112));
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_10.setBounds(169, 44, 92, 37);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\3-removebg-preview (2).png"));
		lblNewLabel_11.setBounds(246, 41, 67, 54);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\5-removebg-preview (3).png"));
		lblNewLabel_13.setBounds(192, 102, 84, 90);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Pizza");
		lblNewLabel_14.setForeground(new Color(25, 25, 112));
		lblNewLabel_14.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_14.setBounds(213, 203, 74, 26);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12.setBounds(187, 67, 100, 159);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\burge-removebg-preview (1).png"));
		lblNewLabel_15.setBounds(320, 117, 89, 64);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Burger ");
		lblNewLabel_16.setForeground(new Color(25, 25, 112));
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_16.setBounds(331, 198, 78, 37);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_13_1 = new JLabel("New label");
		lblNewLabel_13_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_13_1.setBounds(309, 80, 100, 139);
		contentPane.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\dessert-removebg-preview (1).png"));
		lblNewLabel_17.setBounds(437, 113, 84, 79);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("New label");
		lblNewLabel_13_1_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_13_1_1.setBounds(433, 80, 100, 139);
		contentPane.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_18 = new JLabel("Dessert");
		lblNewLabel_18.setForeground(new Color(25, 25, 112));
		lblNewLabel_18.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_18.setBounds(455, 198, 78, 36);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\paneer-removebg-preview (1).png"));
		lblNewLabel_19.setBounds(201, 268, 84, 90);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_12_1 = new JLabel("New label");
		lblNewLabel_12_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_1.setBounds(192, 234, 100, 159);
		contentPane.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_20 = new JLabel("Paneer ");
		lblNewLabel_20.setForeground(new Color(25, 25, 112));
		lblNewLabel_20.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_20.setBounds(213, 369, 74, 27);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Butter");
		lblNewLabel_21.setForeground(new Color(25, 25, 112));
		lblNewLabel_21.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_21.setBounds(213, 391, 74, 22);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\chicken-removebg-preview (1).png"));
		lblNewLabel_22.setBounds(327, 275, 92, 77);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Chicken");
		lblNewLabel_23.setForeground(new Color(25, 25, 112));
		lblNewLabel_23.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_23.setBounds(331, 366, 88, 33);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_12_2 = new JLabel("New label");
		lblNewLabel_12_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_2.setBounds(319, 234, 100, 159);
		contentPane.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\fried-fish-removebg-preview (1).png"));
		lblNewLabel_24.setBounds(437, 268, 87, 90);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Fried ");
		lblNewLabel_25.setForeground(new Color(25, 25, 112));
		lblNewLabel_25.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_25.setBounds(456, 366, 53, 33);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_12_3 = new JLabel("New label");
		lblNewLabel_12_3.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_3.setBounds(433, 234, 100, 159);
		contentPane.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_26 = new JLabel("Fish");
		lblNewLabel_26.setForeground(new Color(25, 25, 112));
		lblNewLabel_26.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_26.setBounds(456, 391, 66, 23);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\242452 (1).png"));
		lblNewLabel_27.setBounds(520, 11, 41, 45);
		contentPane.add(lblNewLabel_27);
		
		JLabel lblNewLabel = new JLabel("Eatland");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\food\\bg.png"));
		lblNewLabel.setBounds(0, 0, 584, 462);
		contentPane.add(lblNewLabel);
						
	}
}
