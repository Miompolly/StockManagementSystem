package com.UserReg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class StockServlet
 */
public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockServlet() {
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
		String qtyParam = request.getParameter("qty");
		int qty = Integer.parseInt(qtyParam);
		
		Stock stk=new Stock(itemname,supliername,desk,qty);
		ConnecDB db=new ConnecDB();
		db.getCon();
		String rs=db.addStock(stk);
		if(rs!=null) {
			response.sendRedirect("stock.jsp");
		}else {
			response.sendRedirect("sform.jsp");
		}


			}
		
		
	
	}

