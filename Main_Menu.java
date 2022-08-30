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

public class Main_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu frame = new Main_Menu();
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
	public Main_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Main Menu");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(30, 1, 125, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\2720472-removebg-preview (1).png"));
		lblNewLabel_2.setBounds(0, 0, 31, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Veg");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(true);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton.setBounds(10, 45, 91, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Non-Veg");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Non_veg nv=new Non_veg();
				nv.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(219, 112, 147));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(111, 45, 142, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Dessert");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desserts d=new Desserts();
				d.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_4.setBackground(new Color(219, 112, 147));
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBounds(263, 45, 105, 26);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\dal-makhani-removebg-preview (1).png"));
		lblNewLabel_3.setBounds(53, 92, 87, 72);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12.setBounds(40, 49, 100, 159);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_4 = new JLabel("Dal ");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setForeground(new Color(25, 25, 112));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4.setBounds(70, 182, 51, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Paneer");
		lblNewLabel_4_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(171, 176, 76, 26);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Dosa");
		lblNewLabel_4_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(281, 182, 76, 26);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Aalo ");
		lblNewLabel_4_3.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(395, 182, 61, 26);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Idali ");
		lblNewLabel_4_4.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(508, 182, 61, 26);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Kashmiri ");
		lblNewLabel_4_5.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_5.setBounds(49, 382, 91, 26);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Aloo");
		lblNewLabel_4_6.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_6.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_6.setBounds(176, 382, 61, 26);
		contentPane.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Palak ");
		lblNewLabel_4_7.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_7.setBounds(283, 382, 61, 26);
		contentPane.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("Paneer ");
		lblNewLabel_4_8.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_8.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_8.setBounds(383, 382, 76, 26);
		contentPane.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_9 = new JLabel("Kaju ");
		lblNewLabel_4_9.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_9.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_9.setBounds(495, 382, 61, 26);
		contentPane.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_5 = new JLabel("Makhani");
		lblNewLabel_5.setForeground(new Color(25, 25, 112));
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setBounds(53, 199, 87, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Tikka");
		lblNewLabel_4_2_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_4_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4_2_1.setBounds(171, 199, 76, 26);
		contentPane.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\paneer-tikka-removebg-preview (1).png"));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(149, 93, 100, 72);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_12_1 = new JLabel("New label");
		lblNewLabel_12_1.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_1.setBounds(150, 49, 100, 159);
		contentPane.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\images__3_-removebg-preview (1).png"));
		lblNewLabel_7.setBounds(260, 93, 91, 72);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_12_2 = new JLabel("New label");
		lblNewLabel_12_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_2.setBounds(257, 50, 100, 159);
		contentPane.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\2-500x500-removebg-preview (1).png"));
		lblNewLabel_8.setBounds(365, 93, 98, 72);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_12_3 = new JLabel("New label");
		lblNewLabel_12_3.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_3.setBounds(365, 50, 100, 159);
		contentPane.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_9 = new JLabel("Tikki");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_9.setForeground(new Color(25, 25, 112));
		lblNewLabel_9.setBackground(new Color(240, 240, 240));
		lblNewLabel_9.setBounds(393, 196, 61, 32);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\idli-sambarr-removebg-preview (1).png"));
		lblNewLabel_10.setBounds(479, 92, 90, 72);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12_4 = new JLabel("New label");
		lblNewLabel_12_4.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_4.setBounds(474, 50, 100, 159);
		contentPane.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\kashmiri.pulao-removebg-preview (1).png"));
		lblNewLabel_11.setBounds(42, 308, 96, 63);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12_5 = new JLabel("New label");
		lblNewLabel_12_5.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_5.setBounds(40, 260, 100, 159);
		contentPane.add(lblNewLabel_12_5);
		
		JLabel lblNewLabel_13 = new JLabel("Pulao");
		lblNewLabel_13.setForeground(new Color(25, 25, 112));
		lblNewLabel_13.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_13.setBounds(64, 405, 76, 32);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\alu-parotha-removebg-preview (1).png"));
		lblNewLabel_14.setBounds(159, 308, 91, 63);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_12_6 = new JLabel("New label");
		lblNewLabel_12_6.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_6.setBounds(150, 260, 100, 159);
		contentPane.add(lblNewLabel_12_6);
		
		JLabel lblNewLabel_13_1 = new JLabel("Paratha");
		lblNewLabel_13_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_13_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_13_1.setBounds(171, 402, 76, 32);
		contentPane.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\download__1_-removebg-preview (1).png"));
		lblNewLabel_15.setBounds(265, 308, 85, 72);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_12_7 = new JLabel("New label");
		lblNewLabel_12_7.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_7.setBounds(257, 263, 100, 159);
		contentPane.add(lblNewLabel_12_7);
		
		JLabel lblNewLabel_16 = new JLabel("Paneer ");
		lblNewLabel_16.setForeground(new Color(25, 25, 112));
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_16.setBounds(280, 405, 77, 32);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_16_1 = new JLabel("Butter");
		lblNewLabel_16_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_16_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_16_1.setBounds(383, 405, 77, 32);
		contentPane.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\paneer-removebg-preview (1).png"));
		lblNewLabel_17.setBounds(375, 299, 87, 86);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_12_8 = new JLabel("New label");
		lblNewLabel_12_8.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_8.setBounds(365, 263, 100, 159);
		contentPane.add(lblNewLabel_12_8);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\images__4_-removebg-preview (1).png"));
		lblNewLabel_18.setBounds(482, 313, 69, 63);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_12_9 = new JLabel("New label");
		lblNewLabel_12_9.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\4-removebg-preview (2).png"));
		lblNewLabel_12_9.setBounds(469, 263, 100, 159);
		contentPane.add(lblNewLabel_12_9);
		
		JLabel lblNewLabel_16_1_1 = new JLabel("Curry");
		lblNewLabel_16_1_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_16_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_16_1_1.setBounds(492, 405, 77, 32);
		contentPane.add(lblNewLabel_16_1_1);
		
		JButton btnNewButton_5 = new JButton("₹150");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBackground(new Color(219, 112, 147));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5.setBounds(50, 226, 76, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("₹350");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_1.setForeground(Color.WHITE);
		btnNewButton_5_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_1.setBorderPainted(false);
		btnNewButton_5_1.setBackground(new Color(219, 112, 147));
		btnNewButton_5_1.setBounds(171, 226, 76, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("₹100");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_2.setForeground(Color.WHITE);
		btnNewButton_5_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_2.setBorderPainted(false);
		btnNewButton_5_2.setBackground(new Color(219, 112, 147));
		btnNewButton_5_2.setBounds(277, 226, 76, 23);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("₹200");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_3.setForeground(Color.WHITE);
		btnNewButton_5_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_3.setBorderPainted(false);
		btnNewButton_5_3.setBackground(new Color(219, 112, 147));
		btnNewButton_5_3.setBounds(380, 229, 76, 23);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("₹100");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_4.setForeground(Color.WHITE);
		btnNewButton_5_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_4.setBorderPainted(false);
		btnNewButton_5_4.setBackground(new Color(219, 112, 147));
		btnNewButton_5_4.setBounds(493, 229, 76, 23);
		contentPane.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("₹150");
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_5.setForeground(Color.WHITE);
		btnNewButton_5_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_5.setBorderPainted(false);
		btnNewButton_5_5.setBackground(new Color(219, 112, 147));
		btnNewButton_5_5.setBounds(53, 440, 76, 23);
		contentPane.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("₹150");
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_6.setForeground(Color.WHITE);
		btnNewButton_5_6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_6.setBorderPainted(false);
		btnNewButton_5_6.setBackground(new Color(219, 112, 147));
		btnNewButton_5_6.setBounds(171, 440, 76, 23);
		contentPane.add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("₹120");
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_7.setForeground(Color.WHITE);
		btnNewButton_5_7.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_7.setBorderPainted(false);
		btnNewButton_5_7.setBackground(new Color(219, 112, 147));
		btnNewButton_5_7.setBounds(281, 440, 76, 23);
		contentPane.add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("₹120");
		btnNewButton_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_8.setForeground(Color.WHITE);
		btnNewButton_5_8.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_8.setBorderPainted(false);
		btnNewButton_5_8.setBackground(new Color(219, 112, 147));
		btnNewButton_5_8.setBounds(383, 440, 82, 23);
		contentPane.add(btnNewButton_5_8);
		
		JButton btnNewButton_5_9 = new JButton("₹120");
		btnNewButton_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment p=new Payment();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_9.setForeground(Color.WHITE);
		btnNewButton_5_9.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_5_9.setBorderPainted(false);
		btnNewButton_5_9.setBackground(new Color(219, 112, 147));
		btnNewButton_5_9.setBounds(479, 440, 76, 23);
		contentPane.add(btnNewButton_5_9);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d=new Dashboard();
				d.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\india\\Pictures\\7421873-removebg-preview (1).png"));
		btnNewButton_2.setBounds(518, 1, 51, 53);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(219, 112, 147));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\india\\Desktop\\buildtools\\Maha-Vaccination-Drive\\src\\resources\\bg.png"));
		lblNewLabel.setBounds(0, 1, 584, 462);
		contentPane.add(lblNewLabel);
	}
}
