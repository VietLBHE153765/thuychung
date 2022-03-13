/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.ProductDBContext;
import database.customerDBContext;
import database.orderDBContext;
import database.orderdetailDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Customer;
import model.Order;

/**
 *
 * @author Le Viet
 */
public class checkoutController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
         Map<Integer,Cart> carts = (Map<Integer,Cart>) session.getAttribute("carts");
        if(carts ==null){
            carts = new LinkedHashMap<>();
        }
        //carculator the total price
        double totalMoney =0;
        for (Map.Entry<Integer, Cart> c : carts.entrySet()) {
            Integer productID = c.getKey();
            Cart cart = c.getValue();
            totalMoney += cart.getQuantity()* cart.getProduct().getPrice();
        }
        request.setAttribute("totalmoney", totalMoney);
        request.getSession().setAttribute("totalmoney", totalMoney);
        request.getSession().setAttribute("urlhistory2","thanhtoan");
        request.getRequestDispatcher("view/thanhtoan.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
      String name = request.getParameter("name");
      String phonenumber = request.getParameter("phonenumber");
      String address = request.getParameter("address");
      String note =  request.getParameter("note");
     
      
      //add customer to database and return id of customer
       Customer cu = new Customer();
       cu.setName(name);
       cu.setPhone(phonenumber);
       cu.setAddress(address);
        customerDBContext cdb = new customerDBContext();
        HttpSession session = request.getSession();
         Map<Integer,Cart> carts = (Map<Integer,Cart>) session.getAttribute("carts");
        if(carts ==null){
            carts = new LinkedHashMap<>();
        }
        //carculator the total price
        double totalprice =0;
        for (Map.Entry<Integer, Cart> c : carts.entrySet()) {
            Integer productID = c.getKey();
            Cart cart = c.getValue();
            totalprice += cart.getQuantity()* cart.getProduct().getPrice();
        }
        int id = (Integer) cdb.createCustomerReturnID(cu); // id of customer 
         
        Order order = new Order();
        order.setTotalprice(totalprice);
        order.setNote(note);
        order.setCustomerid(id);
        System.out.println(order);
        orderDBContext odb = new orderDBContext();
        int orderID = (Integer)odb.createOrderReturnID(order);
        //add to order details
        new orderdetailDBContext().addCarts(orderID,carts);
        //clear cart in session
        session.removeAttribute("carts");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
