package com.UserReg;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	    String messag = "Created Successfully";

	    loadDriver();
	    Connection cnx = getCon();

	    String sql = "INSERT INTO users (FullName, email, password, role) VALUES (?, ?, ?, ?)";
	    try {
	        PreparedStatement stm = cnx.prepareStatement(sql);
	        stm.setString(1, user1.getNames());
	        stm.setString(2, user1.getEmail());
	        
	        String hashedPassword = hashMD5(user1.getPassword()); 
	        stm.setString(3, hashedPassword); 
	        
	        stm.setString(4, user1.getRole());
	        int rs = stm.executeUpdate();
	        
	        if (rs > 0) {
	            JOptionPane.showMessageDialog(null, "User Created Successfully");
	        } else {
	            JOptionPane.showMessageDialog(null, "User not Created !!! Try again");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("User not created, " + e.getMessage());
	    }
	    return messag;
	}

		
	public ResultSet getUser(Login loguser1) {
	    ResultSet row = null;
	    loadDriver();
	    Connection cnx = getCon();
	    String sql = "SELECT * FROM users WHERE email=? AND password=?";
	    try {
	        PreparedStatement stm = cnx.prepareStatement(sql);
	        stm.setString(1, loguser1.getEmail());
	        String hashedPassword = hashMD5(loguser1.getPassword()); 
	        stm.setString(2, hashedPassword); 
	        row = stm.executeQuery();
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
	
	public boolean deleteItem(int itemID) {
		loadDriver();
	    Connection cnx = getCon();
	    
	    String sql="DELETE FROM Stock WHERE No=?";
	    try {
			PreparedStatement stm=cnx.prepareStatement(sql);
			stm.setLong(1, itemID);
			int rowsAffected=stm.executeUpdate();
			if(rowsAffected>0) {
				return true;
			}
		} catch (SQLException e) {
		    System.out.println("Failed to delete "+e.getMessage());
			e.printStackTrace();
		}
	    finally {
	        try {
	            cnx.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		return false;
	  
	}
	public String updateItem(String itemName,String supplierName,String description,int quantity,int itemID) {
		loadDriver();
	    Connection cnx = getCon();
	    String mss="updated";
	    String sql = "UPDATE Stock SET itemName=?, supplierName=?, description=?, quantity=? WHERE NO=?";

	    try {
			PreparedStatement stm=cnx.prepareStatement(sql);
			stm.setString(1,itemName);
			stm.setString(2,supplierName);
			stm.setString(3,description);
			stm.setInt(4,quantity);
			stm.setInt(5,itemID);
			int rowsAffected=stm.executeUpdate();
			if(rowsAffected>0) {
				JOptionPane.showMessageDialog(null, "Item Updated");
			}
		} catch (SQLException e) {
		    System.out.println("Failed to delete "+e.getMessage());
			e.printStackTrace();
		}
	    finally {
	        try {
	            cnx.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		return mss;
	  
	}
	
	public ResultSet getUsers() {
		ResultSet row=null;
		loadDriver();
		Connection cnx=getCon();
		String sql="SELECT * FROM users";
		try {
			PreparedStatement st=cnx.prepareStatement(sql);
			row=st.executeQuery();
		} catch (SQLException e) {
		
			e.printStackTrace();
			System.out.println("No data found !!"+e.getMessage() );
		}
		
		
		 return row;  
	}
	
	public boolean deleteUser(int userID) {
		loadDriver();
	    Connection cnx = getCon();
	    
	    String sql="DELETE FROM users WHERE ID=?";
	    try {
			PreparedStatement stm=cnx.prepareStatement(sql);
			stm.setLong(1, userID);
			int rowsAffected=stm.executeUpdate();
			if(rowsAffected>0) {
				return true;
			}
		} catch (SQLException e) {
		    System.out.println("Failed to delete "+e.getMessage());
			e.printStackTrace();
		}
	    finally {
	        try {
	            cnx.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		return false;
	  
	}
	
	
	public String addUserAd(User user1) {
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
	
	public String updateUser(String fullname,String email,String role,int userID) {
		loadDriver();
	    Connection cnx = getCon();
	    String mss="updated";
	    String sql = "UPDATE users SET FullName=?, email=?, role=? WHERE ID=?";

	    try {
			PreparedStatement stm=cnx.prepareStatement(sql);
			stm.setString(1,fullname);
			stm.setString(2,email);
			stm.setString(3,role);
			stm.setInt(4,userID);
		
			int rowsAffected=stm.executeUpdate();
			if(rowsAffected>0) {
				JOptionPane.showMessageDialog(null, "User Updated");
			}
		} catch (SQLException e) {
		    System.out.println("Failed to delete "+e.getMessage());
			e.printStackTrace();
		}
	    finally {
	        try {
	            cnx.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		return mss;
	  
	}
	
	
	private String hashMD5(String input) {
	    try {
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] messageDigest = md.digest(input.getBytes());
	        StringBuilder hexString = new StringBuilder();

	        for (byte b : messageDigest) {
	            hexString.append(String.format("%02x", b));
	        }

	        return hexString.toString();
	    } catch (NoSuchAlgorithmException e) {
	        throw new RuntimeException(e);
	    }
	}

	
	
}
