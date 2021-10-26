/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectarMySQL;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Conexion {

    Connection con = null;
    private static String baseDeDatos = "usuarios_pbe";//NOMBRE BASE DE DATOS

    //DATOS PARA LA CONECCION
    private static String USER = "user";
    private static String PASS = "pass";
    private static final String URL = "jdbc:mysql://localhost:3306/" + baseDeDatos
            + "?useTimezone=true&serverTimezone=UTC";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//declarar el driver  
            //aqui definimos que base de datos usaremos
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion Exitosa!!");
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return con;
    }
}
