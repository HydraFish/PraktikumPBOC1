/*Nama File     : Dosen.java
 *Deskripsi     : berisi atribut dan method dalam class Dosen
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai{
    /******ATRIBUT******/
    protected String fakultas;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Dosen dengan nilai default
    public Dosen(){
        super();
        this.fakultas = "";
    }

    //konstruktor untuk membuat objek Dosen dengan nilai input
    public Dosen(String newNip, String newNama, LocalDate newTglLahir, LocalDate newTmt, double newGajiPokok, String newFakultas){
        super(newNip, newNama, newTglLahir, newTmt, newGajiPokok);
        this.fakultas = newFakultas;
    }

    //SELEKTOR
    //selektor Fakultas
    public String getFakultas(){
        return this.fakultas;
    }

    //MUTATOR
    //mutator Fakultas
    public void setFakultas(String newFakultas){
        this.fakultas = newFakultas;
    }

    /******METHOD LAIN******/
    //menampilkan info dosen
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + this.fakultas);
    }
}