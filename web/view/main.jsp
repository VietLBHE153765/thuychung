<%-- 
    Document   : main
    Created on : Feb 15, 2022, 4:17:46 PM
    Author     : Le Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SpaThuyChung</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
            integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="../CSS/mainstyle.css?v=1"  type="text/css"/> 
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" 
            integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==" 
            crossorigin="anonymous" referrerpolicy="no-referrer" />
      
    </head>
    <body>
        <%-- Header --%> 
        <div class="header row">
             <%-- logo spa --%> 
            <div class="logospa col-md-1">
                    <%-- Header --%> 
             <img src="../Img/logo.jpg" alt=""/>
            </div>
             <%-- Menu --%>

             <div class="menu col-md-8 ">

                 <ul class="row">
                     <li class="col-md-2" >
                         <i class="fa fa-home" aria-hidden="true"></i>
                         <a href="index.html">TRANG CHỦ </a>           
                     </li>
                     <li class="col-md-2"><a href="gioithieu.html">GIỚI THIỆU</a></li>
                     <li class="col-md-2"><a href="#">DỊCH VỤ</a></li>
                     <li class="col-md-2"><a href="sanpham.html">SẢN PHẨM</a></li>
                     <li class="col-md-2"><a href="contact.html">LIÊN HỆ</a></li>

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
           <%-- Java Script --%>
           <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
