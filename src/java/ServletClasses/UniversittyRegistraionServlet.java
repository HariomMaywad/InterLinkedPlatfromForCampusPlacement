/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import DAOClasses.UniversityDetailsDAO;
import EntityClasses.UniversityDetails;
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
 * @author hmayw
 */
public class UniversittyRegistraionServlet extends HttpServlet {

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
        UniversityDetails obj=new UniversityDetails();
        obj.setId(request.getParameter("universityid"));
        obj.setName(request.getParameter("universityname"));
        obj.setVice_chancelor(request.getParameter("universityvisechancelor"));
        obj.setPhone(request.getParameter("phone"));
        obj.setAddress(request.getParameter("address"));
        obj.setRegion(request.getParameter("universityregion"));
        obj.setWebsite(request.getParameter("universitywebsite"));
        obj.setCity(request.getParameter("universitycity"));
        obj.setType(request.getParameter("univeristyType"));
        obj.setEmail(request.getParameter("email"));
        obj.setPwd(request.getParameter("pwd"));
        
        ServletContext sc=request.getServletContext();
        
        try{
             boolean result=UniversityDetailsDAO.addUniversity((Connection)sc.getAttribute("conn"), obj);
             if(result==true){
                 RequestDispatcher rd=request.getRequestDispatcher("jsp/UniversitySuccessRegister.jsp");
                request.setAttribute("name",obj.getName());
                request.setAttribute("id",obj.getId());
                request.setAttribute("pwd",obj.getPwd());
                request.setAttribute("email",obj.getEmail());
                rd.forward(request, response);
             }
             else{
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
