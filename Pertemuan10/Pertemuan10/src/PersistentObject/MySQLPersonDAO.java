package PersistentObject;

import java.sql.*;

 //Nama: Haydar Rafi' Sultansyah
 //NIM: 24060124120023
 //Lab: C1
 //Tanggal: 20 Mei 2026
 //File : MySQLPersonDAO.java
 //Deskripsi : implementasi PersonDAO untuk MySQL

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // membuat koneksi, nama db, user, password
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "Haydar1234"
        );
        
        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // tutup koneksi database
        con.close();
    }
}
