package com.UserReg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class updateServlet2
 */
@WebServlet("/updateServlet2")
public class updateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet2() {
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
		
		String itemname=request.getParameter("itemname");
		String supliername=request.getParameter("suppliername");
		String desk=request.getParameter("desc");
		 int quantity = 0;
		    try {
		        quantity = Integer.parseInt(request.getParameter("qty"));
		    } catch (NumberFormatException e) {
		      
		        e.printStackTrace(); 
		    }
		    
		    int itemID = 0;
		    String foodIdStr = request.getParameter("itemID");
		    if (foodIdStr != null && !foodIdStr.isEmpty()) {
		        try {
		        	itemID = Integer.parseInt(foodIdStr);
		        } catch (NumberFormatException e) {
		          
		            e.printStackTrace(); 
		        }
		    }
		    
		
		ConnecDB db=new ConnecDB();
		db.getCon();
		String rs=db.updateItem(itemname,supliername,desk,quantity,itemID);;
		if(rs!=null) {
			response.sendRedirect("userDashboard.jsp");
		}else {
			response.sendRedirect("updateUseD.jsp");
		}
	}

}
