/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CategoryProduct;
import model.Product;

/**
 *
 * @author Le Viet
 */
public class ProductDBContext extends DBContext{
     public ArrayList<Product> getProducts(){
             ArrayList<Product> products = new ArrayList<>();
        try {
  
            String sql = "SELECT [productID]\n" +
                            "      ,[productname]\n" +
                            "      ,[image]\n" +
                            "      ,[price]\n" +
                            "      ,[quantity]\n" +
                            "      ,[categoryname]\n" +
                            "  FROM [Product] inner join CategoryProduct on Product.categoryPID = CategoryProduct.categoryPID";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                 Product d = new Product();
                d.setProductid(rs.getInt("productID"));
                d.setProductname(rs.getString("productname"));
                d.setImage(rs.getString("image"));
                d.setPrice(rs.getInt("price"));
                d.setQuantity(rs.getInt("quantity"));
                CategoryProduct c = new CategoryProduct();
                c.setName(rs.getString("categoryname"));
                d.setCateProduct(c);
                products.add(d);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products ;
    }
    
}
