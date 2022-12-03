package Jframe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author VuThanhLong
 */
public class DBConnecton {
    static Connection conn = null;
    
    public static Connection getConnection(){
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_library","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
