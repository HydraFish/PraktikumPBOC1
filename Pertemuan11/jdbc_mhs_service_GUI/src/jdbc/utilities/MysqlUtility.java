package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Nama: Haydar Rafi' Sultansyah
//NIM: 24060124120023
//Lab: C1
//Tanggal: 20 Mei 2026
//File : MysqlUtility.java
//Deskripsi : pengelola koneksi dengan mysql

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                String url = "jdbc:mysql://localhost:3306/prakPBO"; 
                String user = "root"; 
                String password = "Haydar1234";

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke Database Berhasil!");
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal Koneksi: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
