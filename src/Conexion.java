
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;

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

    Connection conexion = null;

    public int Conexion() {
        BasicDataSource bdSource = new BasicDataSource();
        bdSource.setUrl("jdbc:mysql://192.168.182.142/discografica?serverTimezone=UTC");
        bdSource.setUsername("root");
        bdSource.setPassword("");

        try {
            conexion = bdSource.getConnection();
            if (conexion != null) {
                System.out.println("todo ok ");
            } else {
                System.out.println("todo mal");
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public void closeConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
