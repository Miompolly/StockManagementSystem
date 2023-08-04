package com.UserReg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnecDB {

	String dburl="jdbc:mysql://localhost:3307/sms";
	String dbuser="root";
	String dbpwd="";
	String dbdriver="com.mysql.cj.jdbc.Driver";
	Connection con=null;
	
	public void loadDriver() {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	public Connection getCon() {
		try {
			con=DriverManager.getConnection(dburl,dbuser,dbpwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		System.out.println("DB not connected"+e.getMessage());
		}
		return con;
		
	}
	
	public String addUser(User user1) {
		String messag="Created Successfully";
		
		loadDriver();
		Connection cnx=getCon();
	
			
			String sql="INSERT INTO users (FullName,email,password,role)VALUES(?,?,?,?)";
			try {
				PreparedStatement stm=cnx.prepareStatement(sql);
				stm.setString(1,user1.getNames());
				stm.setString(2,user1.getEmail());
				stm.setString(3,user1.getPassword());
				stm.setString(4,user1.getRole());
				int rs=stm.executeUpdate();
				
				if(rs>0) {
					JOptionPane.showMessageDialog(null, "User Created Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "User not Created !!! Try again");
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
				System.out.println("User not created ,"+e.getMessage());
			}
			return messag;
		}
		
	public ResultSet getUser(Login loguser1) {
		ResultSet row=null;
		loadDriver();
		Connection cnx=getCon();
		String sql="SELECT * FROM users WHERE email=? AND password=?";
		try {
			PreparedStatement stm=cnx.prepareStatement(sql);
			stm.setString(1, loguser1.getEmail());
			stm.setString(2, loguser1.getPassword());
			row=stm.executeQuery();
	
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return row;
		
	}
	
	public String addStock(Stock stock1) {
		String messag="Created Successfully";
		
		loadDriver();
		Connection cnx=getCon();
	
			
			String sql="INSERT INTO Stock (ItemName,supplierName,description,quantity)VALUES(?,?,?,?)";
			try {
				PreparedStatement stm=cnx.prepareStatement(sql);
				stm.setString(1,stock1.getItemname());
				stm.setString(2,stock1.getSuppliername());
				
				stm.setString(3,stock1.getDesc());
				stm.setInt(4,stock1.getQty());
				int rs=stm.executeUpdate();
				
				if(rs>0) {
					JOptionPane.showMessageDialog(null, "Item added Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Item not added !!! Try again");
				}
			} catch (SQLException e) {
			
				e.printStackTrace();
				System.out.println("item not added ,"+e.getMessage());
			}
			return messag;
		}
	
	public ResultSet getItem() {
		ResultSet row=null;
		loadDriver();
		Connection cnx=getCon();
		String sql="SELECT * FROM Stock";
		try {
			PreparedStatement st=cnx.prepareStatement(sql);
			row=st.executeQuery();
		} catch (SQLException e) {
		
			e.printStackTrace();
			System.out.println("No data found !!"+e.getMessage() );
		}
		
		
		 return row;  
	}
		
}
