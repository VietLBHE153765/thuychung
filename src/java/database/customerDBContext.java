/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author Le Viet
 */
public class customerDBContext extends DBContext{

    public int createCustomerReturnID(Customer c) {
        try {
         String sql ="INSERT INTO [Customer]\n" +
                "           ([name]\n" +
                "           ,[address]\n" +
                "           ,[phone])\n" +
                "     VALUES\n" +
                "           (?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, c.getName());
            stm.setString(2, c.getAddress());
            stm.setString(3, c.getPhone());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            
            if(rs.next()){
                return rs.getInt(1); // return id on postition 1 (id)
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(customerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
 return 0;
 }
    
}
