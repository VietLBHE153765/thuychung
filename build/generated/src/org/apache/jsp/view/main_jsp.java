package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.CategoryService;
import database.CategoryServiceDBContext;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SpaThuyChung</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../CSS/mainstyle.css?v=1\"  type=\"text/css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" \n");
      out.write("              integrity=\"sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==\" \n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        ");
 CategoryServiceDBContext db = new CategoryServiceDBContext();
        ArrayList<CategoryService> cateServices = db.getCateServices();
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write(" \n");
      out.write("        <div class=\"header row\">\n");
      out.write("            ");
      out.write(" \n");
      out.write("            <div class=\"logospa col-md-1\">\n");
      out.write("                ");
      out.write(" \n");
      out.write("                <img src=\"../Img/logo.jpg\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"menu col-md-8 \">\n");
      out.write("\n");
      out.write("                <ul class=\"row\">\n");
      out.write("                    <li class=\"col-md-2\" >\n");
      out.write("                        <i style=\"color: greenyellow\" class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("                        <a href=\"index.html\">TRANG CHỦ </a>           \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"col-md-2\"><a href=\"gioithieu.html\">GIỚI THIỆU</a></li>\n");
      out.write("                    <li class=\"col-md-2\"><a href=\"#\">DỊCH VỤ</a></li>\n");
      out.write("                    <li class=\"col-md-2\"><a href=\"sanpham.html\">SẢN PHẨM</a></li>\n");
      out.write("                    <li class=\"col-md-2\"><a href=\"contact.html\">LIÊN HỆ</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"search col-md-3\">\n");
      out.write("                <form class=\"form-inline\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Tìm kiếm...\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                </form>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"../Img/slide1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h1>Thúy Chung Spa</h1>\n");
      out.write("                        <p>Thiên đường của sắc đẹp!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"../Img/slide2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h1>Thúy Chung Spa</h1>\n");
      out.write("                        <p>Thiên đường của sắc đẹp!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"../Img/slide3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h1>Thúy Chung Spa</h1>\n");
      out.write("                        <p>Thiên đường của sắc đẹp!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class= \"container-fluid\">\n");
      out.write("            <div class= \" gioithieu row\">\n");
      out.write("                <div class =\"anhchung col-sm-6\">\n");
      out.write("                    <h1>Thúy Chung Spa</h1>\n");
      out.write("                    <p>Thiên đường của sắc đẹp!</p>\n");
      out.write("                    <center><img src=\"../Img/hinhanhspa01.jpg\" alt=\"\"/></center>\n");
      out.write("                </div>\n");
      out.write("                <div class =\"dichvu col-sm-6\">\n");
      out.write("                    <div class=\"datdichvu\">\n");
      out.write("                        <h1>ĐĂNG KÝ TƯ VẤN</h1>\n");
      out.write("                        <form action=\"categoryservice\" method=\"POST\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"name\">Họ Và Tên</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"phonenumber\">Số Điện Thoại</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"phone\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"diachi\">Địa chỉ</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"address\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"dichvu\">Chọn dịch vụ cần tư vấn</label>\n");
      out.write("                                    <select name=\"service\" class=\"form-control\">\n");
      out.write("                                        ");
 for (CategoryService c : cateServices) { 
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( c.getCategorysid() );
      out.write('"');
      out.write('>');
      out.print( c.getCategorysname() );
      out.write("</option>                             \n");
      out.write("                                           ");
 } 
      out.write("\n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-lg btn-block\">ĐĂNG KÝ</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class= \"container-fluid\">\n");
      out.write("            ");
      out.write(" \n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("            ");
      out.write("\n");
      out.write("             <!--Footer starts here-->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<h1>Thúy Chung Spa</h1>\n");
      out.write("                                <div class=\"diachicuoi\">\n");
      out.write("                                    <h6>KCN Định Liên,huyện Yên Định, tỉnh Thanh Hóa</h6>\n");
      out.write("\t\t\t\t    <i class=\"fas fa-phone\"> 0963170199</i>\n");
      out.write("                                    <a href=\"https://www.facebook.com/thuychungspa\"><i class=\"fa-brands fa-facebook-f\"></i></a>                                  \n");
      out.write("                                </div>\n");
      out.write("\t</div>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
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
