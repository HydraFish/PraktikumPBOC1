/**
 * File      : Kembangtelon.java
 * Deskripsi : Program berisi kelas Kembangtelon untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

//1.b Kelas Kembangtelon
class Kembangtelon extends Kucing {
    //Atribut
    //-

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Kembangtelon() {
        super();
    }

    //Konstruktor dengan parameter
    public Kembangtelon(String Nama, double Bobot, String Panggilan) {
        super(Nama, Bobot, Panggilan);
    }
}