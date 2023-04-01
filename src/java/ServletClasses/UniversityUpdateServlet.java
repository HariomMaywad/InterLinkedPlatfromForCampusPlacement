/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import DAOClasses.UniversityDetailsDAO;
import EntityClasses.UniversityDetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hmayw
 */
public class UniversityUpdateServlet extends HttpServlet {

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
        
        obj.setId(request.getParameter("id"));
        obj.setName(request.getParameter("name"));
        obj.setVice_chancelor(request.getParameter("chanceler_name"));
        obj.setAddress(request.getParameter("address"));
        obj.setYear(request.getParameter("year"));
        obj.setRegion(request.getParameter("region"));
        obj.setCity(request.getParameter("city"));
        obj.setState(request.getParameter("state"));
        obj.setType(request.getParameter("type"));
        obj.setWebsite(request.getParameter("website"));
        obj.setPhone(request.getParameter("phone"));
        obj.setEmail(request.getParameter("email"));
        obj.setPwd(request.getParameter("pwd"));
        
        ServletContext sc=request.getServletContext();
        Connection conn=(Connection)sc.getAttribute("conn");
        
        try{
            boolean result=UniversityDetailsDAO.updateUniversity(conn, obj);
            if(result==true){
               response.setContentType("text/html");
               PrintWriter pw=response.getWriter();
               pw.println("<script>");
               pw.println("function message(){alert('Data successfully Updated')}");
               pw.println("message();");
               pw.println("</script>");
             //  RequestDispatcher rd=request.getRequestDispatcher("")
            }
            else{
                System.out.println("NOt Updated");
            }
        }
        catch(SQLException ex){
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
