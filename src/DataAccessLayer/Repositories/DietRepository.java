/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import DataAccessLayer.DAL;
import DataAccessLayer.DTOClasses.Diet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hp
 */
public class DietRepository implements IRepository<Diet>{

      private final Connection connection;
    private PreparedStatement preparedStatement;

    public DietRepository() {
        connection = DAL.getDbConnection();
    }
    @Override
    public boolean Save(Diet obj) {
         try {
            preparedStatement = connection.prepareStatement("insert into Diet (DietName,carbsPercent,ProtienPercent,vitaminPercent,mineralsPercent,DietDescription) "
                    + "values(?,?,?,?,?,?)");
           
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setInt(2, obj.getCarbPercent());
            preparedStatement.setInt(3, obj.getProutinPercent());
            preparedStatement.setInt(4, obj.getVitaminPercent());
            preparedStatement.setInt(5, obj.getMineralsPercent());
             preparedStatement.setString(6, obj.getDescription());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Update(Diet obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int Id) {
         try {
            preparedStatement = connection.prepareStatement("delete from Diet where DietID=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Diet GetById(int Id) {
         try {
            String query = "SELECT * FROM Diet where DietID=" + Id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next())
            {
                Diet diet = new Diet();
                diet.setID(rs.getInt("DietID"));
                diet.setName(rs.getString("DietName"));
                diet.setCarbPercent(rs.getInt("carbsPercent"));
                diet.setProutinPercent(rs.getInt("ProtienPercent"));
                diet.setVitaminPercent(rs.getInt("vitaminPercent"));
                diet.setMineralsPercent(rs.getInt("mineralsPercent"));
                diet.setDescription(rs.getString("DietDescription"));
                return diet;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
          return null;
    }

    @Override
    public ArrayList<Diet> GetAll() {
         try {
            ArrayList<Diet> diets = new ArrayList<Diet>();
            String query = "SELECT * FROM Diet ";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               Diet diet = new Diet();
            
                diet.setID(rs.getInt("DietID"));
                diet.setName(rs.getString("DietName"));
                diet.setCarbPercent(rs.getInt("carbsPercent"));
                diet.setProutinPercent(rs.getInt("ProtienPercent"));
                diet.setVitaminPercent(rs.getInt("vitaminPercent"));
                diet.setMineralsPercent(rs.getInt("mineralsPercent"));
                diet.setDescription(rs.getString("DietDescription"));
                diets.add(diet);
            }
            return diets;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
