package co.jjog.parqueader.conection;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    private static  String url = "jdbc:mysql://localhost:3306/parqueadero?useSSL=false";
    private static  String user = "root";
    private static  String password = "jhon0223";



    public static void main (String []a){

        Connection conexion = darConexion();

    }




    public static Connection darConexion(){


        try {


            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion=(Connection) DriverManager.getConnection(url,user,password);

            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            return conexion;


        }catch (Exception e){

            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }

    }



}
