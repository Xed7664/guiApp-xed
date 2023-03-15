/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compig;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;






/**
 *
 * @author SCC-COLLEGE
 */
public class db_configuration {
    private Connection connection;
    
    public db_configuration(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
        
        
    }
    
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
    public void insertData(String sql){
    try{
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.executeUpdate();
        System.out.println("Inserted Succesfully");
        pstmt.close();
    
    }catch(SQLException e){
        System.out.println("Connection error: "+e);
        
    }
    }


    }

