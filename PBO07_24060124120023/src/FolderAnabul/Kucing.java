package FolderAnabul;

/**
 * File      : Kucing.java
 * Deskripsi : Program berisi kelas Kucing untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Kucing extends Anabul {
    //Atribut
    //-

    //Method
    //Konstruktor tanpa parameter
    public Kucing(){
        super();
    }

    //Konstruktor dengan parameter
    public Kucing(String Nama){
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
        System.out.println("Meong");
    }
}
