/**
 * File      : Anabul.java
 * Deskripsi : Program berisi kelas Anabul untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Anabul {
    //Atribut
    private String Nama;

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Anabul(){
        this.Nama = "n/a";
    }

    //Konstruktor dengan parameter
    public Anabul(String newNama){
        this.Nama = newNama;
    }

    //Setter
    //mengeset nama anabul
    public void setnama(String newNama){
        this.Nama = newNama;
    }

    //Getter
    //mengambil nama anabul
    public String getNama(){
        return Nama;
    }

    //Method lain
    //Method gerak anabul
    public void Gerak(){
        System.out.println("Anabul bergerak");
    }

    //Method suara anabul
    public void Suara(){
        System.out.println("Anabul bersuara");
    }
}