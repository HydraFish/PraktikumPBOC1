/**
 * File      : Teman.java
 * Deskripsi : Program berisi kelas Teman yanag merupakan koleksi kelas dasar
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

import java.util.*;

public class Teman{
    //Atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    //Method 
    //Konstruktor
    //Konstruktor kelas teman tanpa parameter
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    //Getter
    //1.a Fungsi getNBelm() untuk mendapatkan banyak elemen
    public int getNbelm(){
        return this.nbelm;
    }

    //1.b Fungsi getNama(indeks) untuk mendapatkan nama teman yang berada di posisi indeks
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    //Setter
    //1.c Prosedur setNama(indeks, nama) untuk mengeset nama teman yang berada di posisi indeks
    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    //1.d Prosedur addNama(nama) untuk menambahkan nama ke list teman
    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm = this.nbelm + 1;
    }

    //1.e Prosedur delNama(nama) untuk menghapus nama di list teman
    public void delNama(String nama){
        if (Lnama.contains(nama) == true){
            Lnama.remove(nama);
            this.nbelm = this.nbelm - 1;
        }
    }

    //1.f Fungsi isMember(nama) untuk memeriksa apakah nama berada dalam koleksi objek teman
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    //1.g Prosedur gantiNama(nama, namabaru) untuk mengganti nama suatu objek di koleksi objek teman
    public void gantiNama(String nama,String  namabaru){
        if (Lnama.contains(nama) == true){
            setNama(Lnama.indexOf(nama), namabaru);
        }
    }

    //1.h Fungsi countNama(nama) untuk menghitung banyaknya kemunculan nama yang sama
    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < Lnama.size(); i++){
            if (Lnama.get(i).equals(nama)){
                count++;
            }
        }
        return count;
    }

    //1.i Prosedur showTeman() untuk menampilkan isi koleksi objek teman
    public void showTeman() {
        System.out.println("Daftar nama teman:");
        for (int i = 0; i < Lnama.size(); i++){
            System.out.println(Lnama.get(i));
        }
    }
}