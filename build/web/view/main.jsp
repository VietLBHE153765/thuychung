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
        <link href="../CSS/mainstyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%-- Header --%> 
        <div class="header">
             <%-- logo spa --%> 
            <div class="logospa">
                <img src="../Img/logo.jpg" alt=""/>
            </div>
             <%-- Menu --%>
             
	<div class="menu">
	
		<ul>
			<li><a href="index.html">TRANG CHỦ</a></li>
			<li><a href="gioithieu.html">GIỚI THIỆU</a></li>
			<li><a href="#">DỊCH VỤ</a></li>
			<li><a href="sanpham.html">SẢN PHẨM</a></li>
			<li><a href="contact.html">LIÊN HỆ</a></li>
	
		</ul>
	
	</div>
             <div class="search">
                 <form class="">
			<input type="text" placeholder="Search.." name="search2">
                        <button type="submit"><i class="bi bi-search-heart"></i></button>
		</form>
	
	     </div>
            
         </div>   
           <%-- Java Script --%>
           <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
