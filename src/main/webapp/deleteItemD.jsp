<%@page import="javax.swing.JOptionPane"%>
<%@ page import="com.UserReg.ConnecDB" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>

<%
try {
    int ItemIdToDelete = Integer.parseInt(request.getParameter("id"));
    ConnecDB db = new ConnecDB();
    db.getCon();
    boolean deleted = db.deleteItem(ItemIdToDelete);
    
    if (deleted) {
        response.sendRedirect("userDashboard.jsp"); 
    } else {
        out.println("Deletion failed. Please try again.");
    }
} catch (Exception e) {
    e.printStackTrace();
    System.out.println("Failed "+e.getMessage());
}

%>