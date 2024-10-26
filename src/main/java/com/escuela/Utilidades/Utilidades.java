/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Utilidades;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Baró
 */
public class Utilidades {

    public static boolean isNumInt(String cadena) {
        try {
            Integer.valueOf(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static String formatDate(Date fecha) {

        if (fecha == null) {
            fecha = new Date();
        }

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        return formatoDelTexto.format(fecha);
    }

    public static String formatDateAnio(Date fecha) {

        if (fecha == null) {
            fecha = new Date();
        }

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy");
        return formatoDelTexto.format(fecha);
    }

    public static String getformatDateToString(Date fecha) {

        if (fecha == null) {
            fecha = new Date();
        }

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        return formatoDelTexto.format(fecha);
    }

    public static void mensaje(JButton boton, String cadena) {
        String mensaje = cadena;
        JOptionPane.showMessageDialog(boton, mensaje);
    }

    public static void msg(Component comp, String cadena) {
        String mensaje = cadena;
        JOptionPane.showMessageDialog(comp, mensaje);
    }

    public static boolean existe(Connection con, String consulta) {
        try {
            String sql = consulta;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    public static void llenarComboBox(Connection con, String consulta, DefaultComboBoxModel modeloCombo) {
        try {
            PreparedStatement verCombo = con.prepareStatement(consulta);
            ResultSet ver = verCombo.executeQuery();
            modeloCombo.addElement("--");
            while (ver.next()) {
                modeloCombo.addElement(ver.getString(1));
            }
        } catch (SQLException ex) {
            Utilidades.msg(null, "Error al cargar Combo");
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

