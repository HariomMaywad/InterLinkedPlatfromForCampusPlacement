package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SuccessRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Registration Success</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/success.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <img src=\"../images/approve.png\" />\n");
      out.write("      <h2>Registration Success</h2>\n");
      out.write("\n");
      out.write("      <div class=\"details\">\n");
      out.write("          Your Collage/university Name : <span>");
      out.print(request.getAttribute("name") );
      out.write("</span>\n");
      out.write("        <br />\n");
      out.write("        Id : <span>");
      out.print(request.getAttribute("id"));
      out.write("</span><br />\n");
      out.write("        password <span>");
      out.print(request.getAttribute("pwd"));
      out.write("</span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"greet\">\n");
      out.write("        <span> <img src=\"../images/approve.png\" /></span>\n");
      out.write("        <p>\n");
      out.write("          Thank you, We have sent all other information to your registered email\n");
      out.write("          <span>");
      out.print(request.getAttribute("email"));
      out.write("</span>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("        <p id=\"desc\">Now you can login By Clicking the below button</p>\n");
      out.write("        <a href=\"index.html\">Home Page</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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