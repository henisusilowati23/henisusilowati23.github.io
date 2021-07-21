import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Koneksi {
    private Connection connect;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String url ="jdbc:mysql://localhost:3306/crud";
    private String username ="root";
    private String password ="";
    public Connection getKoneksi(){
        if (connect == null){
            try {
                Class.forName(driverName);
                System.out.println("Class driver di temukan");
                connect = DriverManager.getConnection(url, username, password);
                
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return connect;
    }
   
}
    
