package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.oop.util.DbConnect;

public final class UpdateMarks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 70%;\n");
      out.write("   margin-left:15%;\n");
      out.write("  margin-bottom:15%;\n");
      out.write(" margin-top:5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 15px;\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("           \n");
      out.write("\t\t<table>\n");
      out.write("                    <form method=\"POST\" action=\"UpdateMarksServlet\">\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                                <td>Student Id</td>\n");
      out.write("                                ");

                                    
                                   String studentid=request.getParameter("id2");
                                   String SubName=request.getParameter("id1");
                                   
 
                                  try {
                                     DbConnect db=new DbConnect();
                                     Connection connection = db.getDBConnection();
                                     Statement myStm=connection.createStatement();
                                     String query = "select * from marks where StudentId='"+studentid+"' and SubjectName='"+SubName+"'";
                                    
                                    ResultSet resultSet = myStm.executeQuery(query);
                                   while(resultSet.next()){
                                      
      out.write("\n");
      out.write("                                      \n");
      out.write("                                      <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(resultSet.getString(2) );
      out.write("\">\n");
      out.write("                                          <input type=\"text\" name=\"id\" value=\"");
      out.print(resultSet.getString(2) );
      out.write("\"></td></tr>\n");
      out.write("                                                            <tr>\n");
      out.write("                                <td>Subject Name</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(resultSet.getString(3) );
      out.write("\">\n");
      out.write("                                    <input type=\"text\" name=\"id\" value=\"");
      out.print(resultSet.getString(3) );
      out.write("\"</td>\n");
      out.write("                        </tr>\n");
      out.write("                                \n");
      out.write("                      \n");
      out.write("                         ");

      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                           <tr>\n");
      out.write("                                <td>Assignment Marks</td>\n");
      out.write("                                <td><input type=\"text\" name=\"Assignment\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                         <tr>\n");
      out.write("                                <td>Mid Marks</td>\n");
      out.write("                                <td><input type=\"text\" name=\"MidMarks\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                         <tr>\n");
      out.write("                                <td>Final Marks</td>\n");
      out.write("                                <td><input type=\"text\" name=\"FinalMarks\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                </table>\n");
      out.write("                        </div>        \n");
      out.write("        <div style=\"margin-top:-210px;\">\n");
      out.write("                          <table>\n");
      out.write("                           <tr>\n");
      out.write("                               <td><input type=\"submit\" value=\"Update\"  /></td>\n");
      out.write("                               <td><input type=\"reset\" value=\"Reset\" /></td> \n");
      out.write("                           </tr></form>\n");
      out.write("                          \n");
      out.write("                   \n");
      out.write("                </table>\n");
      out.write("        </div>\n");
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
