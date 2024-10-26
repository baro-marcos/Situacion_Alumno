/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Utilidades;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Baró
 */
public class Conexion {

    //Este objeto nos permite conectarnos a la BD
    private Connection conn;

    //Creamos el constructor que nos va a conectar con la BD
    public Conexion() {

        try {
            
            Properties propiedades = new Properties();
            
            InputStream archivoProp = null;
            archivoProp = new FileInputStream("data.properties");
            
            propiedades.load(archivoProp);
            
            String host = propiedades.getProperty("host");
            String nombreBBDD = propiedades.getProperty("nombreBBDD");
            String usuarioBBDD = propiedades.getProperty("usrBBDD");
            String contraseniaBBDD = propiedades.getProperty("passBBDD");
            
            //Para modificar
            //propiedades.setProperty("clave", "valor");
            //propiedades.store(new FileWriter("data.properties"), "comntario");
                        
            Class.forName("com.mysql.cj.jdbc.Driver"); //cargamos el Driver

            //el string de conección direccióndelservidor/nombrebd
            String db = "jdbc:mysql://" + host + "/" + nombreBBDD;

            //el nombre de la BD, usuario, pass
            conn = DriverManager.getConnection(db, usuarioBBDD, contraseniaBBDD);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD, \n"
                    //+ " salga de la aplicación e intentelo nuevamente"
                    + "Intente nuevamente."
            );
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

    public Connection getConexion() {
        return conn;
    }

    public Connection cerrarConexion() throws SQLException {
        conn.close();
        conn = null;
        return conn;
    }

}

