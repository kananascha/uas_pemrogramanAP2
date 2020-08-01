/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MAULANA PC
 */
public class Koneksi {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Koneksi teskoneksi = new Koneksi();
        teskoneksi.koneksi();
    }

    Connection con = null;

    String statuskoneksi;
    String statuskone0ksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/kana";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statuskoneksi = "Berhasil";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
             statuskoneksi = "Gagal";
            System.exit(0);
        }
    }
}
