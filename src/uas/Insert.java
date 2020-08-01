/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MAULANA PC
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nik, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into uas values('" + nik + "','" + nama + "','" + alamat + "','"+ jk + "')";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
