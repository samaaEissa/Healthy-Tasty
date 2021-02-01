/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Hp
 */
public class AdminRepository implements IRepository<Admin>{

     private final Connection connection;
     private PreparedStatement preparedStatement;
    
     public AdminRepository(){
     connection=DAL.getDbConnection();
     }
    @Override
    public boolean Save(Admin obj) {
         try {
             preparedStatement=connection.prepareStatement("insert into Admin (UserName,Password) values (?,?)");
             preparedStatement.setString(1, obj.getUserName());
             preparedStatement.setString(2, obj.getPassword());
              preparedStatement.executeUpdate();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
    }

    @Override
    public boolean Update(Admin obj) {
//        if (obj.getUserName()==null)
//        {
//            try {
//                preparedStatement=connection.prepareStatement("update Admin set UserName= ? ,Password=? ");
//                preparedStatement.setString(1, obj.setUserName());
//                preparedStatement.setString(2, obj.setPassword(Password));
//            } catch (SQLException ex) {
//                Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin GetById(int Id) {
         try {
             String query="select* from Admin where ID="+Id;
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             if (rs.next())
             {
                 Admin admin = new Admin();
                 admin.setID(rs.getInt("ID"));
                 admin.setUserName(rs.getString("UserName"));
                 admin.setPassword(rs.getString("Password"));
                 
                 return admin;
             }
         } catch (SQLException ex) {
             Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         return null;
    }

     public boolean checkUser(String userName, String password) {
         try {
             String query="select* from Admin where UserName='"+userName+"' and Password='"+password+"'";
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             if (rs.next())
             {
                
               return true;
             }
         } catch (SQLException ex) {
             Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
         return false;
    }
    @Override
    public ArrayList<Admin> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
