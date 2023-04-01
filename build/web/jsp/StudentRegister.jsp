<%-- 
    Document   : StudentRegister
    Created on : 20 Aug, 2022, 7:58:36 PM
    Author     : soura
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        String first_name=request.getParameter("firstname");
        String last_name=request.getParameter("lastname");
//        String city_name=request.getParameter("city_name");
//        String email=request.getParameter("email");
        try
        {
                 Class.forName("com.mysql.jdbc.Driver");
                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sih", "root", "1234");
                   Statement st=conn.createStatement();
                   int i=st.executeUpdate("INSERT INTO `sih`.`student_details`(`student_id`,`student_fname`,`student_lname`,)values('"+first_name+"','"+last_name+")");
                out.println("Data is successfully inserted!");
                }
                catch(Exception e)
                {
                System.out.print(e);
                e.printStackTrace();
                }
         %>
        <h1>Hello World!</h1>
        <p>Firstname : </p>
        
    </body>
</html>