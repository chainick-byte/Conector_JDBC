
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
 * @author igorr
 */
public class Conexion {
    Connection conexion=null;
    public int Conexion(){
    String url="jdbc:mysql://192.168.182.129/discografica?serverTimeZone=UTC";
    String user="root";
    String password="";
    
        try {
            conexion = DriverManager.getConnection(url,user,password);
            if(conexion!=null){
                System.out.println("todo ok ");
            }else{
                System.out.println("todo mal");
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public void closeConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
