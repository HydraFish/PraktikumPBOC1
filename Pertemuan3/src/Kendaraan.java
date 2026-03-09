/*Nama File     : Kendaraan.java
 *Deskripsi     : berisi atribut dan method dalam class Kendaraan
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 5 Maret 2026
*/

public class Kendaraan {
    /******ATRIBUT******/ 
    private String noPlat;
    private String jenis;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Kendaraan dengan nilai default
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //konstruktor untuk membuat objek Kendaraan dengan nilai input
    public Kendaraan(String newNoPlat, String newJenis){
        this.noPlat = newNoPlat;
        this.jenis = newJenis;
    }


    //SELEKTOR
    //mengembalikan nilai noPlat Kendaraan
    public String getNoPlat(){
        return noPlat;
    }

    //mengembalikan nilai jenis Kendaraan
    public String getJenis(){
        return jenis;
    }


    //MUTATOR
    //mengeset nilai noPlat dengan newNoPlat
    public void setNoPlat(String newNoPlat){
        this.noPlat = newNoPlat;
    }

    //mengeset nilai jenis dengan newJenis
    public void setJenis(String newJenis){
        this.jenis = newJenis;
    }


    /******METHOD LAIN******/
    //mencetak nilai noPlat dan jenis Kendaraan
    public void printKendaraan(){
        System.out.println("no plat: " + noPlat + ", jenis: " + jenis);
    }
}
