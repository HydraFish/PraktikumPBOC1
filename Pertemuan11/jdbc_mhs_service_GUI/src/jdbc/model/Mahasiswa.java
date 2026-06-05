package jdbc.model;

//Nama: Haydar Rafi' Sultansyah
//NIM: 24060124120023
//Lab: C1
//Tanggal: 20 Mei 2026
//File : Mahasiswa.java
//Deskripsi : persistent object mahasiswa

public class Mahasiswa {
    // Atribut sesuai dengan kolom di tabel database
    private int id;
    private String nama;

    // Constructor Kosong (Default Constructor)
    public Mahasiswa() {
    }

    // Constructor dengan Parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }

    // Setter untuk ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Setter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method toString() untuk mencetak data objek Mahasiswa
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}