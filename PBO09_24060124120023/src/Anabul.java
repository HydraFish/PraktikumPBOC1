/**
 * File      : Anabul.java
 * Deskripsi : Program berisi kelas Anabul untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Anabul {
    //Atribut
    private String Nama;
    private String Panggilan;  //2.a tambahan atribut panggilan di kelas Anabul

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Anabul(){
        this.Nama = "n/a";
        this.Panggilan = "n/a";
    }

    //Konstruktor dengan parameter
    public Anabul(String newNama, String newPanggilan){
        this.Nama = newNama;
        this.Panggilan = newPanggilan;
    }

    //Setter
    //mengeset nama anabul
    public void setnama(String newNama){
        this.Nama = newNama;
    }

    //2.a tambahan prosedur setPanggilan untuk mengeset panggilan Anabul
    //mengeset panggilan anabul
    public void setPanggilan(String newPanggilan){
        this.Panggilan = newPanggilan;
    }

    //Getter
    //mengambil nama anabul
    public String getNama(){
        return Nama;
    }

    //2.a tambahan fungsi getPanggilan untuk mangambil nilai atribut panggilan Anabul
    //mengambil panggilan anabul
    public String getPanggilan(){
        return Panggilan;
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