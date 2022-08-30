package com.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Insertop {
	public static String INSERT_USER_QUERY = "INSERT INTO card_info (card_no, cvv,pno) VALUES (?,?,?)";
	public static String url = "jdbc:mysql://localhost:3306/jdbc1";
	public static String driver = "com.mysql.jdbc.Driver";
	public static String username = "root";
	public static String password = "";
	
	public int insert_into_card_info_table(ArrayList<String> al) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			ps = con.prepareStatement(INSERT_USER_QUERY);
			if (ps != null) {
				ps.setString(1, al.get(0));
				ps.setString(2, al.get(1));	
				ps.setString(3, al.get(2));	
				return ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		return 0;
	}
	
}
