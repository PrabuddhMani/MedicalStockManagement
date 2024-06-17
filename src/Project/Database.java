package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Database {
    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
     public Database(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            statement = conn.createStatement();  // Initialize the statement object here
            System.out.println("Connected successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public Connection getConn() {
        return conn;
    }

    //Login verification method
    public boolean checkLogin(String email, String password){
        String query = "SELECT * FROM users WHERE Email='"
                + email
                + "' AND Password='"
                + password + "'";
        try {
            resultSet = statement.executeQuery(query);
            if(resultSet.next()) return true;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
    
   public boolean InsertInfo(String email, String name, String phone, String password) {
    String query = "INSERT INTO users (Email, Name, Phone, Password) VALUES ('" + email + "', '" + name + "', '" + phone + "', '" + password + "')";
    try {
        statement = conn.createStatement();
        int result = statement.executeUpdate(query);
        return result > 0;
    } catch (SQLException e) {
        System.out.println(e);
    }
    return false;
}
   public boolean UpdateInfo(String email, String password) {
        String query = "UPDATE users SET Password = ? WHERE Email = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, email);
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    public void closeResources() {
     try {
         if (preparedStatement != null) {
             preparedStatement.close();
         }
         if (conn != null) {
             conn.close();
         }
     } catch (SQLException e) {
         System.out.println(e);
     }
 }
}
