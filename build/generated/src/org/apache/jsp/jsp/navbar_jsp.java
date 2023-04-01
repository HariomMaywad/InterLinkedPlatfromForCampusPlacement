package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"aicte.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("        <a href=\"https://www.therockshivam.blogspot.com\" style=\"padding-left:2%;\"><img\n");
      out.write("                style=\"width:7vh; border-radius:30px; border:2px solid red\" src=\"aicte logo.jpg\"></a>\n");
      out.write("        <h1 style=\"color: white; font-size:40px;\">AICTE</h1>\n");
      out.write("        <label class=\"search\" for=\"search\">Search\n");
      out.write("            <input type=\"search\" class=\"searchh\" id=\"search\" name=\"search\" placeholder=\"Use Me...\"\n");
      out.write("                style=\"font-size:16px\"> </label>\n");
      out.write("\n");
      out.write("        <div id=\"mee\" class=\"mee\" onclick=\"myfun()\">\n");
      out.write("            <div class=\"mee1\"></div>\n");
      out.write("            <div class=\"mee2\"></div>\n");
      out.write("            <div class=\"mee3\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h1 class=\"close\" id=\"close\" onclick=\"close()\">X</h1>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("        <menu class=\"menu\" id=\"menu\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li><a href=\"index.jsp\">\n");
      out.write("                    Home\n");
      out.write("                </a></li>\n");
      out.write("\n");
      out.write("                <li> <a href=\"about.jsp\">\n");
      out.write("                    About Us\n");
      out.write("                </a></li>\n");
      out.write("\n");
      out.write("                <li><a href=\"privacypolicy.html\">\n");
      out.write("                    Privacy Policy\n");
      out.write("                </a></li>\n");
      out.write("\n");
      out.write("                <li><a href=\"desclaimer.html\">\n");
      out.write("                    Disclaimer\n");
      out.write("                </a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#notice\">\n");
      out.write("                    Notices\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    FAQ\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    Contact Us\n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                    Terms and Condition\n");
      out.write("                </a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </menu>\n");
      out.write("    </body>\n");
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
