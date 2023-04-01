package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/navbar.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body p{\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.1)),url(aicte_banner.jpg);\">\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        <div style=\"border:5px solid black; text-align: center; background-color: white; opacity:0.65\">\n");
      out.write("            \n");
      out.write("    <h1>About Us</h1>\n");
      out.write("<p>Hello, Dear friends, Welcome to AICTE also, we are happy you want to know something more about our site</p>\n");
      out.write("<p>So, basically, nowadays people are more dependent on online products and services that's why we also, take forward a step to help you.</p>\n");
      out.write("<p>Our first wish is to provide you with a better solution to solve your problem. So, kindly if you don't get any solution then mention it in the comment section.</p>\n");
      out.write("<p>Also, we are trying to provide fresh & latest content that provides you ideas about all updated information that's happening in the world.</p>\n");
      out.write("<p>In the below section you can get more ideas about our site like our website category and content category.</p>\n");
      out.write("<p>If you have additional questions or require more information about our About Us Page, do not hesitate to contact us through email at <b>1234@aicte.com</b></p>\n");
      out.write("<h2><b>What is Our Goal?</b></h2>\n");
      out.write("<p>There are millions of websites created every day, also, there is much fake content spread on the internet.</p>\n");
      out.write("<p>So, Our main goal is to provide you with 100% Original and Safe content that provides you a great and better experience on the world wide web.</p>\n");
      out.write("<p>We mainly focus on our service so and improving it regularly to provide a better user experience to all users.</p>\n");
      out.write("<p>Basically, we focus on the Educational  niche so, our main priority is to search for new content and present it in front of you to learn something new. </p>\n");
      out.write("<h3><b>What is our Service?</b></h3>\n");
      out.write("<p>We are mainly focused on the Educational  category so, we provide Educational  related content if you are interested in the Educational  category then you can visit daily to get more latest information.</p>\n");
      out.write("<p>technical education and to promote development in the country in a coordinated and integrated manner.</p>\n");
      out.write("<p>On our website AICTE you get can all Educational  related information also, we focus on many other categories and we hope you like also, the content of other categories that are maintained on our website. So, you can visit our website homepage to know all category details here you can visit our homepage Click here --><a href\"AICTE.com\">AICTE</a>.</p>\n");
      out.write("<p>Also, we provide a Notification update service you can join by email and other Social Media Platforms, and all Links you can get on the Homepage visit now. <a href\"AICTE.com\">AICTE</a></p>\n");
      out.write("<h3><b>About AICTE</b></h3>\n");
      out.write("<p>As you can see already we mention what is our goal and Service again we repeat that we mainly focus on Educational  Category to help people.</p>\n");
      out.write("<p>This Website is Created By AICTE to help people because many people are still spending hours of time to get exact information so, this is the only motive to create <a href\"AICTE.com\">AICTE</a> to help people and provide them a better web experience. Also, This About Us Page is Generated With <a href=\"https://soumyahelp.com\">Soumya help</a>.</p>\n");
      out.write("<p>Now, the time is to know about the Admin Details of this website, so, now we have to go down to know about Admin details.</p>\n");
      out.write("<h3><b>Admin's Statement for AICTE</b></h3>\n");
      out.write("<p>As per my point of view, there are many people who visit the internet to get some information but 90% of the time they get wrong information so, the first priority of our website AICTE is to provide 100% legit and accurate information to our users, Also, I hope my dream comes true one day, and our website will provide Original Content to provide a better user experience. So, From my Side thanks for visiting our website.</p>\n");
      out.write("<h3><b>Admin's Contact Information</b></h3>\n");
      out.write("<p>Hi, this Heroic Abhiyanta, in the above paragraph you know about the website properly and now I am going to provide my contact details.</p>\n");
      out.write("<p>If you have any problem & suggestions for this website then you can contact me by using following contact details.</p>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <table><tbody><tr><td>Name</td><strong><td>Heroic Abhiyanta</strong></td></tr><tr><td>Email</td><td><strong>@HeroicAbhiyanta.com</strong></td></tr><tr><td>Facebook Id</td><td><a href=\"aicte.fb\"><strong>aicte.fb</a></strong></td></tr><tr><td>Twitter Id</td><td><strong><a href=\"aicte.twitter\">aicte.twitter</a></strong>/</td></tr><tr><td>Instagram Id</td><td><a href=\"aicte.insta\"><strong>aicte.insta</strong></a></td></tr></tbody></table>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<p>These details are my personal Account details if you want to contact me then you can contact me by the above platform.</p>\n");
      out.write("<p>Finally, this is our complete about us page about details are showing what is the motive to create AICTE. Also, this page is generated by Soumya Help <a href=\"https://soumyahelp.com/about-us-generator/\">About Us Generator</a></p>\n");
      out.write("<p>If you want to contact us then you can email us at 1234@aicte.com also, you can contact us by our contact us form. Go to homepage --> <a href=\"AICTE.com\">AICTE</a><a href=\"https://soumyahelp.com/about-us-generator/\">.</a></p>\n");
      out.write("<center>\n");
      out.write("<p>\"Thanks for visiting our About Us Page\"</p>\n");
      out.write("</center>\n");
      out.write("</div>\n");
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
