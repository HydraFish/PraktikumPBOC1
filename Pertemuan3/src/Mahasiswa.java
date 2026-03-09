/* Nama File    : Mahasiswa.java
   Deskripsi    : berisi atribut dan method dalam class Mahasiswa
   Pembuat      : Haydar Rafi' Sultansyah 
   Tanggal      : 5 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {
    /******ATRIBUT******/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    /******METHOD******/
    //KONSTRUKTOR
    //konstruktor untuk membuat objek Mahasiswa
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    //konstruktor untuk membuat objek Mahasiswa dengan nilai input
    public Mahasiswa(String newNim, String newNama, String newProdi, Dosen newDoswal, Kendaraan newKendaraan){
        this.nim = newNim;
        this.nama = newNama;
        this.prodi = newProdi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = newDoswal;
        this.kendaraan = newKendaraan;
    }


    //SELEKTOR
    //mengembalikan nilai nim Mahasiswa
    public String getNim() {
        return nim;
    }

    //mengembalikan nilai nama Mahasiswa
    public String getNama() {
        return nama;
    }

    //mengembalikan nilai prodi Mahasiswa
    public String getProdi() {
        return prodi;
    }

    //mengembalikan nilai listMatkul Mahasiswa
    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    //mengembalikan nilai dosenWali Mahasiswa
    public Dosen getDosenWali() {
        return dosenWali;
    }

    //mengembalikan nilai kendaraan Mahasiswa
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //MUTATOR
    //mengeset nilai nim dengan newNim
    public void setNim(String newNim) {
        this.nim = newNim;
    }

    //mengeset nilai nama dengan newNama
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    //mengeset nilai prodi dengan newProdi
    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }

    //mengeset nilai dosenWali dengan newDosenWali
    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    //mengeset nilai kendaraan dengan newKendaraan
    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }


    /******METHOD LAIN******/
    //menambahkan mata kuliah baru berupa newMatkul ke dalam listMatKul
    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    //mendapatkan jumlah sks mata kuliah yang diambil Mahasiswa
    public int getJumlahSKS() {
        int total;
        total = 0;
        for (MataKuliah mk : listMatKul) {
            total += mk.getSks();
        }
        return total;
    }

    //mendapatkan jumlah mata kuliah yang diambil Mahasiswa
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    //menampilkan nim, nama, dan prodi Mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, dan data kendaraan yang dimiliki Mahasiswa
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen walinya adalah:");
        dosenWali.printDosen();
        System.out.println("Kendaraannya adalah:");
        kendaraan.printKendaraan();
    }
}
