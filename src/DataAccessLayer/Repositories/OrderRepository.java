/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class OrderRepository implements IRepository<Order> {

    private final Connection connection;
    private PreparedStatement preparedStatement;

    public OrderRepository() {
        connection = DAL.getDbConnection();
    }

    /**
     *
     * @param obj
     * @return
     */
//  
//    public boolean Save(Order obj) {
//        try {
//            preparedStatement = connection.prepareStatement("insert into Order (CustomerID,mealID,date,state,comment) values(?,?,?,?,?)");
//            preparedStatement.setInt(1, obj.getCustomerId());
//            preparedStatement.setInt(2, obj.getMealId());
//            preparedStatement.setDate(3, obj.getDate());
//            preparedStatement.setString(4, obj.getState());
//            preparedStatement.setString(5, obj.getComment());
//            preparedStatement.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }

    @Override
    public boolean Update(Order obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int Id) {
        try {
            preparedStatement = connection.prepareStatement("delete from Order where ID=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Order GetById(int Id) {
        try {
            String query = "SELECT * FROM Order where ID=" + Id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                Order order = new Order();
                order.setID(rs.getInt("ID"));
                order.setCustomerId(rs.getInt("CustomerID"));
                order.setMealId(rs.getInt("mealID"));
                order.setState(rs.getString("state"));
                order.setDate(rs.getDate("date"));
                order.setComment(rs.getString("comment"));
                return order;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    @Override
    public ArrayList<Order> GetAll() {
        try {
            ArrayList<Order> orders = new ArrayList<Order>();
            String query = "SELECT * FROM Order ";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                Order order = new Order();
                order.setID(rs.getInt("ID"));
                order.setCustomerId(rs.getInt("CustomerID"));
                order.setMealId(rs.getInt("mealID"));
                order.setState(rs.getString("state"));
                order.setDate(rs.getDate("date"));
                order.setComment(rs.getString("comment"));

                orders.add(order);
            }
            return orders;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Save(Order obj) {
        try {
            preparedStatement = connection.prepareStatement("insert into [dbo].[Order] (CustomerID,mealID,state,comment) values(?,?,?,?)");       
            preparedStatement.setInt(1, obj.getCustomerId());
            preparedStatement.setInt(2, obj.getMealId());
//            preparedStatement.setDate(3, obj.getDate());
            preparedStatement.setString(3, obj.getState());
            preparedStatement.setString(4, obj.getComment());
            preparedStatement.executeUpdate();
            return true;
           
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    

}
