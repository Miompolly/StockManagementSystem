package com.UserReg;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/userServletAd")
public class userServletAd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServletAd() {
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
String names=request.getParameter("fullname");
String email=request.getParameter("email");
String password=request.getParameter("password");
String role=request.getParameter("role");

User user1=new User(names,email,password,role);

ConnecDB db=new ConnecDB();
db.getCon();

String exist=db.addUserAd(user1);
if(exist!=null) {
	response.sendRedirect("user.jsp");
}else {
	response.sendRedirect("uform.jsp");
}


	}

}
