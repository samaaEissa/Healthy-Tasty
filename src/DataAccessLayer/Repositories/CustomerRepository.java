/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class CustomerRepository implements IRepository<Customer> {

    private final Connection connection;
    private PreparedStatement preparedStatement;

    public CustomerRepository() {
        connection = DAL.getDbConnection();
    }

    @Override
    public boolean Save(Customer obj) {

        try {
            preparedStatement = connection.prepareStatement("insert into Users (fullName,age,address,e_mail,phone,weight,hight,medicalState,FreePoints,DietID,free_meals) values(?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, obj.getFulltName());
            preparedStatement.setInt(2, obj.getAge());
            preparedStatement.setString(3, obj.getAddress());
            preparedStatement.setString(4, obj.getE_mail());
            preparedStatement.setString(5, obj.getPhone());
            preparedStatement.setDouble(6,obj.getWeight());
            preparedStatement.setDouble(7,obj.getHeight());
            preparedStatement.setString(8, obj.getMedicalStatus());
            preparedStatement.setInt(9,0);
            preparedStatement.setInt(10,obj.getDietID());
            preparedStatement.setInt(11,obj.getFree_meals());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Update(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//     public boolean Update(int Id, HashMap<String,Object>values) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public boolean Delete(int Id) {
        try {
            preparedStatement = connection.prepareStatement("delete from Users where customerID=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Customer GetById(int Id) {
        try {
            String query = "SELECT * FROM Users where customerID=" + Id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next())
            {
                Customer customer = new Customer();
                customer.setID(rs.getInt("customerID"));
                customer.setFulltName(rs.getString("fullName"));
                customer.setAge(rs.getInt("age"));
                customer.setAddress(rs.getString("address"));
                customer.setE_mail(rs.getString("e_mail"));
                customer.setPhone(rs.getString("phone"));
                customer.setWeight(rs.getDouble("weight"));
                customer.setHeight(rs.getDouble("hight"));
                customer.setMedicalStatus(rs.getString("medicalState"));
                customer.setFreePoint(rs.getInt("FreePoints"));
                customer.setDietID(rs.getInt("DietID"));
                customer.setDietID(rs.getInt("free_meals"));
                return customer;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public void addpoint(int id){
        try {
            int FreePoints=0;
            String query = "select FreePoints from Users where customerID=" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                 FreePoints=rs.getInt("FreePoints");
            }
            FreePoints=FreePoints + 1;
            preparedStatement = connection.prepareStatement("update Users set FreePoints ="+FreePoints+" where customerID ="+id);
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void setpoint(int id){
        try {
            int FreePoints=0;
            String query = "select FreePoints from Users where customerID=" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                 FreePoints=rs.getInt("FreePoints");
            }
            FreePoints=0;
            preparedStatement = connection.prepareStatement("update Users set FreePoints ="+FreePoints+" where customerID ="+id);
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addfree_meal(int id){
        try {
            int Free_meal=0;
            String query = "select free_meals from Users where customerID=" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                 Free_meal=rs.getInt("free_meals");
            }
            Free_meal=Free_meal + 1;
            preparedStatement = connection.prepareStatement("update Users set FreePoints ="+Free_meal+" where customerID ="+id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void setfree_meal(int id){
        try {
            int Free_meal=0;
            String query = "select free_meals from Users where customerID=" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                 Free_meal=rs.getInt("free_meals");
            }
            Free_meal=0;
            preparedStatement = connection.prepareStatement("update Users set FreePoints ="+Free_meal+" where customerID ="+id);
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<Customer> GetAll() {
        try {
            ArrayList<Customer> customers = new ArrayList<Customer>();
            String query = "SELECT * FROM Users ";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setID(rs.getInt("customerID"));
                customer.setFulltName(rs.getString("fullName"));
                customer.setAge(rs.getInt("age"));
                customer.setAddress(rs.getString("address"));
                customer.setE_mail(rs.getString("e_mail"));
                customer.setPhone(rs.getString("phone"));
                customer.setWeight(rs.getDouble("weight"));
                customer.setHeight(rs.getDouble("hight"));
                customer.setMedicalStatus(rs.getString("medicalState"));
                customer.setFreePoint(rs.getInt("FreePoints"));
                customer.setDietID(rs.getInt("DietID"));
                customer.setDietID(rs.getInt("free_meals"));
                customers.add(customer);
            }
            return customers;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public Customer GetByPhone(String phone) {
        try {
            String query = "SELECT * FROM Users where phone=" +phone;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next())
            {
                Customer customer = new Customer();
                customer.setID(rs.getInt("customerID"));
                customer.setFulltName(rs.getString("fullName"));
                customer.setAge(rs.getInt("age"));
                customer.setAddress(rs.getString("address"));
                customer.setE_mail(rs.getString("e_mail"));
                customer.setPhone(rs.getString("phone"));
                customer.setWeight(rs.getDouble("weight"));
                customer.setHeight(rs.getDouble("hight"));
                customer.setMedicalStatus(rs.getString("medicalState"));
                customer.setFreePoint(rs.getInt("FreePoints"));
                customer.setDietID(rs.getInt("DietID"));
                customer.setFree_meals(rs.getInt("free_meals"));
                return customer;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     return null;
    
    }

}
