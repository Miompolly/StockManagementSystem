package com.UserReg;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUser
 */
public class StockServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String names=request.getParameter("fname");
String email=request.getParameter("email");
String password=request.getParameter("password");
String role="user";

User user1=new User(names,email,password,role);

ConnecDB db=new ConnecDB();
db.getCon();

String exist=db.addUser(user1);
if(exist!=null) {
	JOptionPane.showMessageDialog(null, "Item Added");
	response.sendRedirect("addItem.jsp");
	
}else {
	response.sendRedirect("addItem.jsp");
}


	}

}
