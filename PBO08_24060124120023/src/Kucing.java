/**
 * File      : Kucing.java
 * Deskripsi : Program berisi kelas Kucing untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Kucing extends Anabul {
    //Atribut
    //1.a Tambahan atribut bobot dalam kelas Kucing yang menyatakan berat dalam kilogram
    private double Bobot;

    //Method
    //Konstruktor tanpa parameter
    public Kucing(){
        super();
        this.Bobot = 0.0;
    }

    //Konstruktor dengan parameter
    public Kucing(String Nama, double Bobot){
        super(Nama);
        this.Bobot = Bobot;
    }

    //Setter
    //mengeset bobot kucing
    public void setBobot(double newBobot){
        this.Bobot = newBobot;
    }

    //Getter
    //mengambil bobot kucing
    public double getBobot(){
        return Bobot;
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