/**
 * File      : Anggora.java
 * Deskripsi : Program berisi kelas Anggora untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

//1.b Kelas Anggora
class Anggora extends Kucing {
    //Atribut
    //-

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Anggora() {
        super();
    }

    //Konstruktor dengan parameter
    public Anggora(String Nama, double Bobot, String Panggilan) {
        super(Nama, Bobot, Panggilan);
    }
}