package com.dao;
import com.login.*;
import java.sql.*;

public class SelectOperation {
    private static String SELECT_QUERY = "select username,password from registrationtable where username=(?)";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/jdbc1";
    private static String user = "root";
    private static String pass = "";
    static boolean flag;
    static String username;
	static String pwd;
       
    public static boolean selectque(String username,String pwd2) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet r=null;
                
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            pst = con.prepareStatement(SELECT_QUERY);
            pst.setString(1, username);
            r=pst.executeQuery();            
            r.next();
            username=r.getString(1);
            pwd=r.getString(2);
         if(pwd.equals(pwd2)) {
        	  flag = true;
         }
         else {
        	 {
            	  flag = false;
             }
         }
        } catch (ClassNotFoundException e0) {
            e0.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException e3) {
                e3.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e4) {
                e4.printStackTrace();
            }
        }
		return flag;

    }
}