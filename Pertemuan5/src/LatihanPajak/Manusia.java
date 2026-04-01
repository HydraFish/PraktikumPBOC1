/*Nama File     : Manusia.java
 *Deskripsi     : berisi atribut dan method dalam class abstrak Manusia
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 30 Maret 2026
*/

package LatihanPajak;

import java.time.LocalDate;

public abstract class Manusia {
    /******ATRIBUT******/  
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Manusia dengan nilai default
    public Manusia() {
        counterMns++;
    }

    //konstruktor untuk membuat objek Manusia dengan nilai input
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }


    //SELEKTOR
    //mengembalikan nama Manusia
    public String getNama() {
        return nama;
    }

    //mengembalikan tanggal mulai kerja Manusia
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    //mengembalikan alamat Manusia
    public String getAlamat() {
        return alamat;
    }

    //mengembalikan pendapatan Manusia
    public double getPendapatan() {
        return pendapatan;
    }

    //mengembalikan jumlah objek Manusia yang sudah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    //MUTATOR
    //mengeset nama Manusia
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset tanggal mulai kerja Manusia
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    //mengeset alamat Manusia
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //mengeset pendapatan Manusia
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /******METHOD LAIN******/
    //mencetak info Manusia berupa nama, tanggal mulai kerja, alamat, dan pendapatan
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    //method abstrak untuk subclass, berfungsi untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}