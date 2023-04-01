package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAOClasses.UniversityDetailsDAO;
import java.util.ArrayList;
import java.util.List;
import EntityClasses.UniversityDetails;
import java.sql.Connection;

public final class UniversityDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/../htmlPages/MultipleLanguage.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"http://translate.google.com/translate_a/element.js?cb=loadGoogleTranslator\">\n");
      out.write("            </script>\n");
      out.write("            <script>\n");
      out.write("                  function loadGoogelTranslator(){\n");
      out.write("                      new google.translate.TranslateElement(\"google_element\");\n");
      out.write("                  }\n");
      out.write("                </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"google_element\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>University details</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/studentdashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/deshboard.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"bg\">\n");
      out.write("        <div id=\"left\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <div id = \"smaldiv\">\n");
      out.write("                    <!-- <img src=\"https://www.kindpng.com/picc/m/133-1337806_job-vector-seeker-job-logo-magnifying-glass-png.png\" alt=\"\"> -->\n");
      out.write("                    <h2>J</h2>\n");
      out.write("                </div>\n");
      out.write("                <h4>Inter <span>linkded</span></h4>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"leftHalf\">\n");
      out.write("                <div id=\"list\">\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"Institute_detail.html\"><h5 id=\"dash\" >University Info</h5></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"downList\">\n");
      out.write("                    <img src=\"https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png\" alt=\"\">\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"center\">\n");
      out.write("            <nav>\n");
      out.write("                <div id=\"one\">\n");
      out.write("                    <i class=\"ri-search-line\"></i>\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\">\n");
      out.write("                </div>\n");
      out.write("                <div id=\"two\">\n");
      out.write("                    <i class=\"ri-notification-2-fill\"></i>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div id=\"detailList\">\n");
      out.write("                <h3>Institute Information</h3>\n");
      out.write("            </div>\n");
      out.write("            ");

                UniversityDetails obj=new UniversityDetails();
                HttpSession mySession=request.getSession();
//                String id=(String)mySession.getAttribute("id");
//                System.out.println(id);
                obj=UniversityDetailsDAO.getUniversityDetails((Connection)application.getAttribute("conn"),"234534");
             
      out.write("\n");
      out.write("            <div><br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>University id</th>\n");
      out.write("                        <td>");
      out.print( obj.getId() );
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>University Name</th>\n");
      out.write("                        <td>");
      out.print( obj.getName() );
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <th>University vice-chancelor Name</th>\n");
      out.write("                        <td>");
      out.print( obj.getVice_chancelor() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Esimated Year</th>\n");
      out.write("                        <td>");
      out.print(obj.getYear() );
      out.write("  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <td> ");
      out.print(obj.getAddress() );
      out.write("</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>Region</th>\n");
      out.write("                        <td>");
      out.print( obj.getRegion() );
      out.write(" </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>State</th>\n");
      out.write("                        <td> ");
      out.print( obj.getState() );
      out.write("</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>City</th>\n");
      out.write("                        <td> ");
      out.print( obj.getCity() );
      out.write("  </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>University Type</th>\n");
      out.write("                        <td> ");
      out.print( obj.getType() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <th>Website</th>\n");
      out.write("                        <td> ");
      out.print( obj.getWebsite() );
      out.write("  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Contact No.</th>\n");
      out.write("                        <td>");
      out.print( obj.getPhone() );
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Email Id</th>\n");
      out.write("                        <td> ");
      out.print( obj.getEmail() );
      out.write(" </td>\n");
      out.write("                    </tr>            \n");
      out.write("                    <th>Password</th>\n");
      out.write("                    <td> ");
      out.print( obj.getPwd() );
      out.write(" </td>\n");
      out.write("                    </tr>            \n");
      out.write("                </table></div>\n");
      out.write("                <div class=\"edit\"><br>\n");
      out.write("                    <a href=\"Unyversity_detail update.html\"><button>Edit</button></a>\n");
      out.write("                    <button>Save</button>\n");
      out.write("                <!-- <div id=\"about\">\n");
      out.write("                    <a href=\"#\">About US</a>\n");
      out.write("                    <a href=\"#\"> Help</a>\n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
