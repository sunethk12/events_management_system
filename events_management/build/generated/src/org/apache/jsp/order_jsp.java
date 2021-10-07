package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

try{
   String food = request.getParameter("food_name");
   String type= request.getParameter("food_type");
   int qty= Integer.parseInt(request.getParameter("qty"));
   String d_date= request.getParameter("d_date");
   
   
   
    
   Class.forName("com.mysql.jdbc.Driver");
   
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
   String data = "INSERT INTO order_details(food_name, food_type,qty, d_date) VALUES(?,?,?,?)";
   PreparedStatement stat = conn.prepareStatement(data);
                    stat.setString(1, food);
                    stat.setString(2, type);
                    stat.setInt(3, qty);
                    stat.setString(4, d_date);
                    
                    

                    stat.executeUpdate(); 
                    response.sendRedirect("order.html");
                    System.out.println("successfuly inserted");
                    stat.close();
                    conn.close();
                } catch (Exception e) {
                    out.println(e.getMessage());
                }

            

      out.write('\n');
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
