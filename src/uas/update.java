/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import javax.swing.JOptionPane;

/**
 *
 * @author MAULANA PC
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(int nik, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update identitas set nama = '" + nama + "'where nim = '" + nik + "'";
            String sql_alamat = "update identitas set alamat = '" + alamat + "'where nim = '" + nik + "'";
            String sql_jk = "update identitas set jeniskelamin = '" + jk + "'where nim = '" + nik + "'";
            String sql_nim1 = "update identitas set nim = '" + nik + "'where nama = '" + nama + "'";
            String sql_nim2 = "update identitas set nim = '" + nik + "'where alamat = '" + alamat + "'";

            statement.executeUpdate(sql_nim1);
            statement.executeUpdate(sql_nim2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
