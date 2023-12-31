package com.UserReg;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdate() {
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
	
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String role=request.getParameter("role");
	
		    int userID = 0;
		    String userIDdStr = request.getParameter("userID");
		    if (userIDdStr != null && !userIDdStr.isEmpty()) {
		        try {
		        	userID = Integer.parseInt(userIDdStr);
		        } catch (NumberFormatException e) {
		          
		            e.printStackTrace(); 
		        }
		    }
		    
		
		ConnecDB db=new ConnecDB();
		db.getCon();
		String rs=db.updateUser(fullname,email,role,userID);;
		if(rs!=null) {
			response.sendRedirect("user.jsp");
		}else {
			response.sendRedirect("updateUser.jsp");
		}
		
		
		
	}

}
