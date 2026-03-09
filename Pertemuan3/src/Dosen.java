/*Nama File     : Dosen.java
 *Deskripsi     : berisi atribut dan method dalam class Dosen
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 5 Maret 2026
*/

public class Dosen {  
    /******ATRIBUT******/      
    private String nip;
    private String nama;
    private String prodi;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Dosen dengan nilai default
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //konstruktor untuk membuat objek Dosen dengan nilai input
    public Dosen(String newNip, String newNama, String newProdi){
        this.nip = newNip;
        this.nama = newNama;
        this.prodi = newProdi;
    }


    //SELEKTOR
    //mengembalikan nilai nip dosen
    public String getNip(){
        return nip;
    }

    //mengembalikan nilai nama Dosen
    public String getNama(){
        return nama;
    }

    //mengembalikan nilai prodi Dosen
    public String getProdi(){
        return prodi;
    }


    //MUTATOR
    //mengeset nilai nip dengan newNip
    public void setNip(String newNip){
        this.nip = newNip;
    }

    //mengeset nilai nama dengan newNama
    public void setNama(String newNama){
        this.nama = newNama;
    }

    //mengeset nilai prodi dengan newProdi
    public void setProdi(String newProdi){
        this.prodi = newProdi;
    }


    /******METHOD LAIN******/
    //mencetak nilai nip, nama, dan prodi Dosen
    public void printDosen(){
        System.out.println("NIP: " + nip + ", Nama: " + nama + ", Prodi: " + prodi);
    }
}
