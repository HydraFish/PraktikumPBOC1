/*Nama File     : DosenTamu.java
 *Deskripsi     : berisi atribut dan method dalam class DosenTamu
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 12 Maret 2026
*/

import java.time.*;

public class DosenTamu extends Dosen{
    /******ATRIBUT******/
    private String nidk;
    private LocalDate akhirKontrak;

    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek DosenTamu  dengan nilai default
        public DosenTamu(){
        super();
        this.nidk = "";
        this.akhirKontrak = LocalDate.now();
    }

    //konstruktor untuk membuat objek DosenTamu  dengan nilai input
    public DosenTamu(String newNip, String newNidk, String newNama, LocalDate newTglLahir, LocalDate newTmt, double newGajiPokok, String newFakultas, LocalDate newAkhirKontrak){
        super(newNip, newNama, newTglLahir, newTmt, newGajiPokok, newFakultas);
        this.nidk = newNidk;
        this.akhirKontrak = newAkhirKontrak;
    }

    //SELEKTOR
    //selektor NIDK 
    public String getNidk(){
        return this.nidk;
    }

    //selektor akhir kontrak
    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }

    //MUTATOR
    //mutator NIDK
    public void setNidk(String newNidk){
        this.nidk = newNidk;
    }

    //mutator akhir kontrak
    public void setAkhirKontrak(LocalDate newAkhirKontrak){
        this.akhirKontrak = newAkhirKontrak;
    }

    /******METHOD LAIN******/
    //menghitung tunjangan dosen tamu
    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    //menampilkan info dosen tamu
    @Override
    public void printInfo(){
        super.printInfo(); // dari Pegawai + Fakultas dari Dosen
        System.out.println("NIDK: " + nidk);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Akhir Kontrak: " + formatTanggal(akhirKontrak));
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}