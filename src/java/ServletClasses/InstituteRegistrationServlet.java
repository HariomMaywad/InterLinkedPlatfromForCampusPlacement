/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import DAOClasses.InstituteDetailsDAO;
import EntityClasses.InstituteDetails;
import EntityClasses.InstituteDetails;
import DAOClasses.InstituteDetailsDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
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
public class InstituteRegistrationServlet extends HttpServlet {

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
        
        InstituteDetails obj=new InstituteDetails();
        obj.setId(request.getParameter("instituteid"));
        obj.setName(request.getParameter("institutename"));
        String idname=request.getParameter("university-id");
        obj.setUniversity(idname.substring(idname.indexOf("-")+1,idname.length()));
        obj.setUniversityId(idname.substring(0,idname.indexOf("-")));
        obj.setInstituteregion(request.getParameter("instituteregion"));
        obj.setState(request.getParameter("institutestat"));
        obj.setCity(request.getParameter("institutecity"));
        obj.setAddress(request.getParameter("address"));
        obj.setDirector(request.getParameter("institutedirectorname"));
        obj.setWebsite(request.getParameter("institutewebsitelink"));
        obj.setPhone(request.getParameter("phone"));
        obj.setPwd(request.getParameter("pwd"));
        obj.setEmail(request.getParameter("email"));
        
        ServletContext sc=request.getServletContext();
        Connection conn=(Connection)sc.getAttribute("conn");
        try{
            boolean result=InstituteDetailsDAO.addInstitute(conn, obj);
            if(result==true)
            {
                System.out.println("Data inserted");
                RequestDispatcher rd=request.getRequestDispatcher("jsp/InstituteSuccessRegister.jsp");
                request.setAttribute("name",obj.getName());
                request.setAttribute("id", obj.getId());
                request.setAttribute("pwd",obj.getPwd());
                request.setAttribute("email", obj.getEmail());
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
