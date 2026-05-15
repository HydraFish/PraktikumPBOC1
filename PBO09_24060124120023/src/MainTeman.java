/**
 * File      : MainTeman.java
 * Deskripsi : Program berisi Main untuk mengetes kelas Teman
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        //Menambahkan nama
        t.addNama("Andi");
        t.addNama("Benjamin Netanyahu");
        t.addNama("Citra");
        t.addNama("Andi");

        //Menampilkan semua nama
        System.out.println("===== Nama Teman (showTeman()) =====");
        t.showTeman();

        //Menampilkan jumlah elemen
        System.out.println("===== Jumlah Teman (getNbelm()) =====");
        System.out.println("Jumlah teman: " + t.getNbelm());

        //Mengambil nama berdasarkan indeks
        System.out.println("===== Nama Teman Ke 1 (getNama(1)) =====");
        System.out.println("Nama pada indeks ke-1: " + t.getNama(1));

        //Mengubah nama berdasarkan indeks
        System.out.println("===== Set Nama =====");
        t.setNama(1, "Donald Trump");
        System.out.println("Setelah setNama:");
        t.showTeman();

        //Mengecek anggota
        System.out.println("===== Cek isMember =====");
        System.out.println("Apakah Citra anggota? " + t.isMember("Citra"));

        //Mengganti nama tertentu
        System.out.println("===== Mengganti Nama Teman Citra =====");
        t.gantiNama("Citra", "Xi Jinping");
        System.out.println("Setelah gantiNama:");
        t.showTeman();

        //Menghitung jumlah kemunculan nama
        System.out.println("===== Banyak Nama Andi =====");
        System.out.println("Jumlah nama Andi: " + t.countNama("Andi"));

        //Menghapus nama
        System.out.println("===== Menghapus Nama Andi =====");
        t.delNama("Andi");
        System.out.println("Setelah delNama Andi:");
        t.showTeman();

        //Menampilkan jumlah teman
        System.out.println("===== Jumlah Teman =====");
        System.out.println("Jumlah teman sekarang: " + t.getNbelm());
    }
}