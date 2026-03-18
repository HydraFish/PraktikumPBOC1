/*Nama File     : Pegawai.java
 *Deskripsi     : berisi atribut dan method dalam class Pegawai
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Pegawai{
    /******ATRIBUT******/  
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Pegawai dengan nilai default
    public Pegawai(){
        this.nip = "";
        this.nama = "";
        this.tglLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gajiPokok = 0;
    }

    //konstruktor untuk membuat objek Pegawai dengan nilai input
    public Pegawai(String newNip, String newNama, LocalDate newTglLahir, LocalDate newTmt, double newGajiPokok){
        this.nip = newNip;
        this.nama = newNama;
        this.tglLahir = newTglLahir;
        this.tmt = newTmt;
        this.gajiPokok = newGajiPokok;
    }

    //SELEKTOR
    //selektor NIP
    public String getNip(){
        return this.nip;
    }

    //selektor Nama
    public String getNama(){
        return this.nama;
    }

    //selektor Tanggal Lahir
    public LocalDate getTglLahir(){
        return this.tglLahir;
    }

    //selektor TMT
    public LocalDate getTmt(){
        return this.tmt;
    }

    //selektor Gaji
    public double getGajiPokok(){
      return this.gajiPokok;
    }

    //MUTATOR
    //mutator NIP
    public void setNip(String newNip){
        this.nip = newNip;
    }

    //mutator Nama
    public void setNama(String newNama){
        this.nama = newNama;
    }

    //mutator Tanggal Lahir
    public void setTglLahir(LocalDate newTglLahir){
        this.tglLahir = newTglLahir;
    }

    //mutator TMT
    public void setTmt(LocalDate newTmt){
        this.tmt = newTmt;
    }

    //mutator Gaji
    public void setGajiPokok(double newGajiPokok){
        this.gajiPokok = newGajiPokok;
    }

    /******METHOD LAIN******/
    //mengubah format tanggal menjadi d MMMM yyyy
    public String formatTanggal(LocalDate tanggal){
        DateTimeFormatter formatTgl;
        formatTgl= DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(formatTgl);
    }

    //menghitung masa kerja pegawai
    public String hitungMasaKerja(){
        Period p;
        p = Period.between(tmt, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    //menampilkan info pegawai
    public void printInfo(){
        System.out.println("NIP: " + this.nip);
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(this.tglLahir));
        System.out.println("TMT: " + formatTanggal(this.tmt));
        System.out.println("Gaji Pokok: " + this.gajiPokok);
    }
}