/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia.pkg1jdvc;

/**
 *
 * @author FAMILIA FELIZ
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Evidencia1JDVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/granmayoristaapp";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
       
        try {
            conexion = java.sql.DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            rs = statement.executeQuery("select * from usuario");
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
            
            //insertar datos
            statement.execute("INSERT INTO `usuario` (`idusuario`, `nombre`, `password`) VALUES ('2', 'maria', '345');"); 
             System.out.println("");
            rs = statement.executeQuery("select * from usuario");
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Evidencia1JDVC.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            
        } 
        
     
    }
    
    
