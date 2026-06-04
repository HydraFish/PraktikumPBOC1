package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;


//Nama: Haydar Rafi' Sultansyah
//NIM: 24060124120023
//Lab: C1
//Tanggal: 20 Mei 2026
//File : MysqlMahasiswaService.java
//Deskripsi : Kelas CRUD untuk menambah/menghapus/memodifikasi database mahasiswa

public class MysqlMahasiswaService {
    Connection koneksi = null;

    //Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    //Membuat objek mahasiswa
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    //Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Gagal tambah data: " + e.getMessage());
        }
    }

    //Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil diubah!");
        } catch (SQLException e) {
            System.out.println("Gagal ubah data: " + e.getMessage());
        }
    }

    //Delete data mahasiswa sesuai id
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil dihapus!");
        } catch (SQLException e) {
            System.out.println("Gagal hapus data: " + e.getMessage());
        }
    }

    //Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mhs = makeMhsObject();
                    mhs.setId(rs.getInt("id"));
                    mhs.setNama(rs.getString("nama"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return mhs;
    }

    //Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil semua data: " + e.getMessage());
        }
        return listMhs;
    }
}