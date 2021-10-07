package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <link rel = \"stylesheet\" type = \"text/css\" href = \"css/footer.css\">\r\n");
      out.write("  <link rel = \"stylesheet\" type = \"text/css\" href = \"css/admin_page.css\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <title>Robo Battle</title>\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">     \r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("p.heading{\r\n");
      out.write("       text-align : center;\t\r\n");
      out.write("\t   \r\n");
      out.write("\t   font-size : 50px;\r\n");
      out.write("\t   color : #00FFFF;\r\n");
      out.write("\t   font-family: HeadFont;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("body{\r\n");
      out.write("       background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('Image/Robo3.jpg');\r\n");
      out.write("\t   background-size: cover;\r\n");
      out.write("\t   background-repeat: no-repeat;\r\n");
      out.write("       background-attachment:fixed;\r\n");
      out.write("\t   background-position : center center;\r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("input[type=text], input[type=password], input[type=email] , input[type=number], input[type=tel]{\r\n");
      out.write("\t   width: 90%;\r\n");
      out.write("\t   padding: 5px 2px;\r\n");
      out.write("\t   margin: 10px 0;\r\n");
      out.write("\t   display: inline-block;\r\n");
      out.write("\t   border: 1px solid #ccc;\r\n");
      out.write("\t   border-radius: 5px;\r\n");
      out.write("\t   \r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write(".start_login{\r\n");
      out.write("\t   padding: 16px;\r\n");
      out.write("\t   text-align : center;\r\n");
      out.write("\t  \r\n");
      out.write("\t}\r\n");
      out.write("a:hover.decorate{\r\n");
      out.write("\t   background: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5));\r\n");
      out.write("\t   text-decoration : none;\r\n");
      out.write("\t   display: block;\r\n");
      out.write("\t   color: #00FFFF;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(".active{\r\n");
      out.write("     background: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5));\r\n");
      out.write("     text-decoration : none;\r\n");
      out.write("     display: block;\r\n");
      out.write("     color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("\t   text-decoration : none;\r\n");
      out.write("\t   color : #FFFFFF;\r\n");
      out.write("\t   font-size : 22px;\r\n");
      out.write("\t   font-family: side_Bar_Font;\r\n");
      out.write("\t   \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("*{\r\n");
      out.write("       box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("      font-family: NavFont;\r\n");
      out.write("      src: url(Fonts/fon4.otf);\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("@font-face{\r\n");
      out.write("\t   font-family: TextFont;\r\n");
      out.write("\t   src: url(Fonts/font1.otf);;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("   \t   font-family: HeadFont;\r\n");
      out.write("   \t   src: url(Fonts/font2.otf);\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t   <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li><a href=\"Index.html\">Home</a></li>\r\n");
      out.write("      <li><a href=\"rools.html\">Rules </a></li>\r\n");
      out.write("      <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"Login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("     <p class = \"heading\"><b>ROBO BATTLE</b><br><b>2020</b></p>\r\n");
      out.write("   \r\n");
      out.write("           <div class = \" col-2\"> \r\n");
      out.write("\t\t   <table cellpadding = \"10\">\r\n");
      out.write("\t\t\t<tr><td height = \"40\"><a class = \"decorate active\" target = \"top\" href = \"Admin.html\" >Team Details</a></td></tr>\r\n");
      out.write("\t\t\t<tr><td height = \"40\"><a class = \"decorate\" target = \"top\" href = \"order.html\">Order food</a></td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\r\n");
      out.write("\t\t   <div class = \"col-10\">\r\n");
      out.write("           <table style=\"color: white; font-size: 15px;\" class = \"table table-bordered\" >\r\n");
      out.write("        \t   <thead>\r\n");
      out.write("        \t\t  <tr>\r\n");
      out.write("        \t\t    <th>Team name</th>\r\n");
      out.write("        \t\t\t<th>Leader name</th>\r\n");
      out.write("        \t\t\t<th>Team Member1 Name</th>\r\n");
      out.write("                                <th>Team Member1 Name</th>\r\n");
      out.write("        \t\t\t<th>No of non veg food</th>\r\n");
      out.write("        \t\t\t<th>No of veg food</th>\r\n");
      out.write("        \t\t\t<th>Address</th>\r\n");
      out.write("        \t\t\t<th>Contact_No</th>\r\n");
      out.write("        \t\t  </tr>\r\n");
      out.write("        \t\t</thead> \r\n");
      out.write("                        <tbody>\r\n");
      out.write("  ");
                          

   Class.forName("com.mysql.jdbc.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
   String data = "SELECT * FROM student ORDER BY t_name desc";
   Statement stat = conn.createStatement();
//   PreparedStatement stat = conn.prepareStatement(data);
   ResultSet res = stat.executeQuery(data);
   
   while(res.next()){
   
      out.write("\r\n");
      out.write("       \r\n");
      out.write("                  <tr>\r\n");
      out.write("         \t\t\t<td>");
      out.print(res.getString("t_name"));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(res.getString("l_name"));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(res.getString("t_mate1"));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(res.getString("t_mate2"));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(Integer.parseInt(res.getString("non_veg")));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(Integer.parseInt(res.getString("veg")));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(res.getString("address"));
      out.write("</td>\r\n");
      out.write("         \t\t\t<td>");
      out.print(Integer.parseInt(res.getString("c_no")));
      out.write("</td>\r\n");
      out.write("         \t\t\t\r\n");
      out.write("         \t\t\t\r\n");
      out.write("\r\n");
      out.write("         \t\t  </tr>\r\n");
 
}

      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("           </table>\r\n");
      out.write("        </div>");
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
