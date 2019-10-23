/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class conexion {
    public conexion(){
       
    }
    /*
    @param metodo que realiza la conexion con la base de datos
    */
    public static Connection conectar(){
        Connection con = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controlgastos", "root", "root");
        } catch (Exception e) {
        }
       
        return con;
    }
}