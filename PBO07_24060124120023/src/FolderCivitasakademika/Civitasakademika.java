package FolderCivitasakademika;

/**
 * File      : Civitasakademika.java
 * Deskripsi : Program berisi kelas Civitasakademika untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public abstract class Civitasakademika {
    //Atribut
    private String Nama;
    
    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Civitasakademika(){
        this.Nama = "n/a";
    }

    //Konstruktor dengan parameter
    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    //Setter
    //mengeset nama civitas akademika
    public void setNama(String newNama){
        this.Nama = newNama;
    }

    //getter
    //mengambil nama civitas akademika
    public String getNama(){
        return Nama;
    }

    //Method lain
    //Metode abstrak untuk mengambil nomor NIM/NIP
    public abstract String getNomor();
}
