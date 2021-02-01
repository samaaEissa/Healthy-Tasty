/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Meal;
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
public class MealRepository implements IRepository<Meal>{
     private final Connection connection;
    private PreparedStatement preparedStatement;

    public MealRepository() {
        connection = DAL.getDbConnection();
    }


    @Override
    public boolean Save(Meal obj) {
        try {
            preparedStatement = connection.prepareStatement("insert into Meal (Mname,price,ingrdiants,type,DietID,image) values(?,?,?,?,?,?)");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setFloat(2,obj.getPrice());
            preparedStatement.setString(3, obj.getIngredients());
            preparedStatement.setString(4, obj.getType());
            preparedStatement.setInt(5, obj.getDietID());
            preparedStatement.setBytes(6,obj.getImage());            
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Update(Meal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int Id) {
         try {
            preparedStatement = connection.prepareStatement("delete from Meal where mealID=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
    @Override
    public Meal GetById(int Id) {
        try {
            String query = "SELECT * FROM Meal where customerID=" + Id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next())
            {
                Meal meal=new Meal();
                meal.setID(rs.getInt("mealID"));
                meal.setName(rs.getString("Mname"));
                meal.setPrice(rs.getFloat("price"));
                meal.setIngredients(rs.getString("ingrdiants"));
                meal.setType(rs.getString("type"));
//              meal.setDiet(rs.getObject("DietID", Diet));
                meal.setImage(rs.getBytes("image"));
                return meal;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
         return null;
    }

    @Override
    public ArrayList<Meal> GetAll() {
       try {
            ArrayList<Meal> meals = new ArrayList<Meal>();
            String query = "SELECT * FROM Meal ";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                 Meal meal=new Meal();
                meal.setID(rs.getInt("mealID"));
                meal.setName(rs.getString("Mname"));
                meal.setPrice(rs.getFloat("price"));
                meal.setIngredients(rs.getString("ingrdiants"));
                meal.setType(rs.getString("type"));
                meal.setDietID(rs.getInt("DietID"));
                meal.setImage(rs.getBytes("image"));
                meals.add(meal);
            }
            return meals;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       
    }
   public ArrayList<Meal> GetMealsByDietID(int DietID){
   
   try {
            ArrayList<Meal> meals = new ArrayList<Meal>();
            String query = "SELECT * FROM Meal where DietID = "+DietID;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                 Meal meal=new Meal();
                meal.setID(rs.getInt("mealID"));
                meal.setName(rs.getString("Mname"));
                meal.setPrice(rs.getFloat("price"));
                meal.setIngredients(rs.getString("ingrdiants"));
                meal.setType(rs.getString("type"));
                meal.setDietID(rs.getInt("DietID"));
                meal.setImage(rs.getBytes("image"));
                meals.add(meal);
            }
            return meals;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   
   
   
   }
    
}
