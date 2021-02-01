/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.Bell;
import DataAccessLayer.DTOClasses.Order;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Map;
/**
 *
 * @author Hp
 */
public class BellRepository implements IRepository<Bell>{

    private final Connection connection;
    private PreparedStatement preparedStatement;
    private Map<String, Class<?>> Order;
    public BellRepository(){
    connection=DAL.getDbConnection();
    }
    @Override
    public boolean Save(Bell obj) {
        try {
            preparedStatement=connection.prepareStatement("inser into Bell(OrderID,date,totalcost ) values (?,?,?) ");
            preparedStatement.setInt(1, obj.getOrder().getID());
            preparedStatement.setDate(2, (Date) obj.getDate());
            preparedStatement.setDouble(3,obj.getTotalCost());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BellRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }

    @Override
    public boolean Update(Bell obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int Id) {
         try {
            preparedStatement = connection.prepareStatement("delete from Bell where customerID=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Bell GetById(int Id) {
        try {
            String query="select * from Bell where BellID="+Id;
            Statement stmt= connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                Bell bell=new  Bell();
                bell.setID(rs.getInt("BellID"));
                bell.setDate(rs.getDate("date"));
               // bell.setOrder(rs.getObject("OrderID", Order));
                bell.setTotalCost(rs.getDouble("totalcost"));
                return bell;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    @Override
    public ArrayList<Bell> GetAll() {
         try {
            ArrayList<Bell> bells = new ArrayList<Bell>();
            String query = "SELECT * FROM Bell ";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Bell bell = new Bell();
               bell.setID(rs.getInt("BellID"));
                bell.setDate(rs.getDate("date"));
               // bell.setOrder(rs.getObject("OrderID", Order));
                bell.setTotalCost(rs.getFloat("totalcost"));
                bells.add(bell);
            }
            return bells;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
