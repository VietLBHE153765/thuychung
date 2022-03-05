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
import model.CategoryService;
import model.Employee;
import model.Position;

/**
 *
 * @author Le Viet
 */
public class EmployeeDBContext extends DBContext{
     public ArrayList<Employee> getEmployees(){
             ArrayList<Employee> employees = new ArrayList<>();
        try {
  
            String sql = "SELECT [Employee].[employeeID]\n" +
                            "      ,[employeename]\n" +
                            "      ,[phonenumber]\n" +
                            "      ,[address]\n" +
                            "      ,[username]\n" +
                            "      ,[image]\n" +
                            "	  ,positionname\n" +
                            "	  ,facebook\n" +
                            "  FROM [Employee] join [Employee Position] on Employee.employeeID = [Employee Position].employeeID\n" +
                            "  join Position on [Employee Position].positionID = Position.positionID";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                 Employee e = new Employee();
                e.setEmployeeID(rs.getInt("employeeID"));
                e.setEmployeename(rs.getString("employeename"));
                e.setPhonenumber(rs.getString("phonenumber"));
                e.setAddress(rs.getString("address"));
                e.setImage(rs.getString("image"));
                e.setFacebook(rs.getString("facebook"));
                Position p = new Position();
                p.setPositionname(rs.getString("positionname"));
                e.setPosition(p);
                employees.add(e);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees ;
    }
}
