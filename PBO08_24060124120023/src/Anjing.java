/**
 * File      : Anjing.java
 * Deskripsi : Program berisi kelas Anjing untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Anjing extends Anabul{
    //Atribut
    //-

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Anjing(){
        super();
    }

    //Konstruktor dengan parameter
    public Anjing(String Nama){
        super(Nama);
    }

    //Method lain
    //Override method gerak
    @Override
    public void Gerak(){
        System.out.println("Melata");
    }

    //Override method suara
    @Override
    public void Suara(){
        System.out.println("Guk-guk");
    }
}