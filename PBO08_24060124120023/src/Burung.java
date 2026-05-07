/**
 * File      : Burung.java
 * Deskripsi : Program berisi kelas Burung untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Burung extends Anabul{
    //Atribut
    //-

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Burung(){
        super();
    }

    //Konstruktor dengan parameter
    public Burung(String Nama){
        super(Nama);
    }

    //Method lain
    //Override method gerak
    @Override
    public void Gerak(){
        System.out.println("Terbang");
    }

    //override method suara
    @Override
    public void Suara(){
        System.out.println("Cuit");
    }
}