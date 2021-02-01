/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 *
 * @author Hp
 */
public class DAL {
    
    private static Connection connObj;
    private static String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=Healthy&Tasty;integratedSecurity=true";    
    public static Connection getDbConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connObj = DriverManager.getConnection(JDBC_URL);
//            if(connObj != null) {
//                DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
//                System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
//            }           
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
         return connObj;
    }
    
   public void DMLquery(String query ){ 
   
       
   }
   
}

        