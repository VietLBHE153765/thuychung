package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SpaThuyChung</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" \n");
      out.write("            integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" href=\"../CSS/mainstyle.css?v=1\"  type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" \n");
      out.write("            integrity=\"sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==\" \n");
      out.write("            crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write(" \n");
      out.write("        <div class=\"header row\">\n");
      out.write("             ");
      out.write(" \n");
      out.write("            <div class=\"logospa col-md-4\">\n");
      out.write("                    ");
      out.write(" \n");
      out.write("             <img src=\"../Img/logo.jpg\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("             <div class=\"menu col-md-4 row\">\n");
      out.write("\n");
      out.write("                 <ul>\n");
      out.write("                     <li ><a href=\"index.html\">TRANG CHỦ</a></li>\n");
      out.write("                     <li><a href=\"gioithieu.html\">GIỚI THIỆU</a></li>\n");
      out.write("                     <li><a href=\"#\">DỊCH VỤ</a></li>\n");
      out.write("                     <li><a href=\"sanpham.html\">SẢN PHẨM</a></li>\n");
      out.write("                     <li><a href=\"contact.html\">LIÊN HỆ</a></li>\n");
      out.write("\n");
      out.write("                 </ul>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-md-4\">\n");
      out.write("                 <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("                 <form class=\"form-inline\">\n");
      out.write("                     <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Tìm kiếm...\" aria-label=\"Search\">\n");
      out.write("                     <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                 </form>\n");
      out.write("                 </nav>\n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("         </div>   \n");
      out.write("           ");
      out.write("\n");
      out.write("           <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
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
