/**
 * File      : Mahasiswa.java
 * Deskripsi : Program berisi kelas Mahasiswa untuk menunjukkan overloading
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Mahasiswa {
    //a. Realisasi kelas mahasiswa beserta atribut dan operator
    //Atribut
    private String NIM;
    private String Nama;
    private String Programstudi;
    
    //Method
    //Konstruktor
    //c. Konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    //d. Konstruktor dengan 3 parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    //e. Konstruktor dengan input Mahasiswa lain (kloning)
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }


    //Varian mutator khusus program studi
    //Varian 1 tanpa parameter
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    //Varian 2 dengan parameter String
    public void setProgramStudi(String ps){
        this.Programstudi = ps;
    }

    //Varian 3 dengan parameter objek Mahasiswa
    public void setProgramStudi(Mahasiswa m){
        this.Programstudi = m.Programstudi;
    }

    //Mutator lain
    //Untuk mengubah NIM Mahasiswa
    public void setNIM(String newNIM){
        this.NIM = newNIM;
    }

    //Untuk mengubah Nama Mahasiswa
    public void setNama(String newNama){
        this.Nama = newNama;
    }

    
    //Selektor
    //Untuk mengambil NIM Mahasiswa
    public String getNIM(){
        return NIM;
    }

    //Untuk mengambil Nama Mahasiswa
    public String getNama(){
        return Nama;
    }

    //Untuk mengambil Programstudi Mahasiswa
    public String getProgramstudi(){
        return Programstudi;
    }

    //Method lain
    //Untuk mencetak info Mahasiswa
    public void cetak(){
        System.out.println("NIM             : " + NIM);
        System.out.println("Nama            : " + Nama);
        System.out.println("Program studi   : " + Programstudi);
        System.out.println("---------------------------------");
    }
}
