<%-- 
    Document   : product.jsp
    Created on : Mar 4, 2022, 11:52:32 PM
    Author     : Le Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/mainstyle.css?v=1"  type="text/css"/> 
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/sanphamstyle.css?v=1"  type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" 
              integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>Sản phẩm</title>
    </head>
    <body>
        <%-- Header --%> 
        <div class="header row">
            <%-- logo spa --%> 
            <div class="logospa col-md-1">
                <%-- Header --%> 
                <img src="${pageContext.request.contextPath}/Img/logo.jpg" alt=""/>
            </div>
            <%-- Menu --%>

            <div class="menu col-md-8 ">

                <ul class="row">
                    <li class="col-md-2" >
                        <i style="color: greenyellow" class="fa fa-home" aria-hidden="true"></i>
                        <a href="${pageContext.request.contextPath}/home">TRANG CHỦ </a>           
                    </li>
                      <li class="col-md-2"><a href="${pageContext.request.contextPath}/gioithieu">GIỚI THIỆU</a></li>
                    <li class="col-md-2"><a href="${pageContext.request.contextPath}/dichvu">DỊCH VỤ</a></li>
                    <li class="col-md-2"><a href="${pageContext.request.contextPath}/sanpham">SẢN PHẨM</a></li>
                    <li class="col-md-2"><a href="${pageContext.request.contextPath}/lienhe">LIÊN HỆ</a></li>
                </ul>

            </div>
            <div class="search col-md-3">
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm..." aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                </form>
                </nav>
            </div>
        </div>
        
               <%-- List san pham --%> 
               
               <div class="container-fluid">
                    <div class="row">
                    <div class="col-md-3">
                        <h3>List Categories</h3>
                       
                            <c:forEach items="${requestScope.cateProducts}" var="c">
                                ${c.name}
                                
                            </c:forEach>
                        
                    </div>
                        
                        <div class="col-md-9">
                              <div
                            class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center"
                            >
                            <c:forEach items="${requestScope.products}" var="p">
                                <div class="col mb-5">
                                    ${P.id}
                                    <div class="card h-100">
                                        <!-- Sale badge-->
                                        <div
                                            class="badge bg-dark text-white position-absolute"
                                            style="top: 0.5rem; right: 0.5rem"
                                            >
                                            Sale
                                        </div>
                                        <!-- Product image-->
                                        <a href="#">
                                        <img
                                            class="card-img-top"
                                            src="${pageContext.request.contextPath}${p.image}"
                                            alt="..."
                                            />
                                        </a>
                                        <!-- Product details-->
                                        <div class="card-body p-4">
                                            <div class="text-center">
                                                <!-- Product name-->
                                                <h5 class="fw-bolder">${p.productname}</h5>
                                                <!-- Product reviews-->
                                                <div
                                                    class="d-flex justify-content-center small text-warning mb-2"
                                                    >
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                </div>
                                                <!-- Product price-->
                                                <span class="text-muted text-decoration-line-through"
                                                      >$20.00</span
                                                >
                                                $${p.price}
                                            </div>
                                        </div>
                                        <!-- Product actions-->
                                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                            <div class="text-center">
                                                <a class="btn btn-outline-dark mt-auto" href="add-to-cart?productId=${P.id}"
                                                   >Add to cart</a
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        </div>
                 
                   
               </div>
               </div>
               
               
               


        <%-- footer--%>
             <!--Footer starts here-->
        <div class="footer">
				
				<h1>Thúy Chung Spa</h1>
                                <div class="diachicuoi">
                                    <h6>KCN Định Liên,huyện Yên Định, tỉnh Thanh Hóa</h6>
				    <i class="fas fa-phone"> 0963170199</i>
                                    <a href="https://www.facebook.com/thuychungspa"><i class="fa-brands fa-facebook-f"></i></a>                                  
                                </div>
	</div>
       
        <%-- Java Script --%>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>    
        
    </body>
    
</html>
