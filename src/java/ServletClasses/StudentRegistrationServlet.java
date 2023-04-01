/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import EntityClasses.StudentDetails;
import DAOClasses.StudentDetailsDAO;
import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class StudentRegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StudentDetails obj=new StudentDetails();
        
        obj.setId(request.getParameter("studentid"));
        obj.setInstitute_id(request.getParameter("institute-id"));
        obj.setGender(request.getParameter("gender"));
        obj.setFname(request.getParameter("firstname"));
        obj.setLname(request.getParameter("lastname"));
        obj.setMname(request.getParameter("middlename"));
        obj.setFather_name(request.getParameter("fathername"));
        obj.setMother_name(request.getParameter("mothername"));
        obj.setCourse("course");
        obj.setPwd(request.getParameter("pwd"));
        obj.setCourse(request.getParameter("course"));
        obj.setAddress(request.getParameter("address"));
        obj.setEmail(request.getParameter("email"));
        obj.setPhone(Long.parseLong(request.getParameter("phone")));
        obj.setXthPercent(Double.parseDouble(request.getParameter("10th")));
        obj.setXiiPercent(Double.parseDouble(request.getParameter("12th")));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        try{
             Date d=sdf.parse(request.getParameter("addmission_date"));
             long ms=d.getTime();
             java.sql.Date newDate=new java.sql.Date(ms);
             obj.setAdmissionDate(newDate);
        }
        catch(ParseException ex)
        {
            ex.printStackTrace();
        }
        
        
        obj.setBranch(request.getParameter("branch"));
        obj.setDeg_percent(Double.parseDouble(request.getParameter("Graduation")));     
        
         ServletContext sc=request.getServletContext();
        Connection conn=(Connection)sc.getAttribute("conn");
        try{
            boolean result=StudentDetailsDAO.addStudent(conn, obj);
            if(result==true)
            {
                System.out.println("Data inserted");
                RequestDispatcher rd=request.getRequestDispatcher("jsp/StudentSuccessRegister.jsp");
                request.setAttribute("name",obj.getFname()+" "+obj.getMname()+" "+obj.getLname());
                request.setAttribute("id",obj.getId());
                request.setAttribute("pwd",obj.getPwd());
                request.setAttribute("email",obj.getEmail());
                rd.forward(request, response);
            }
            else{
                 System.out.println("Data is not inserted");
                RequestDispatcher rd=request.getRequestDispatcher("error.html");
                rd.forward(request, response);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("Server is facing some issue");
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
