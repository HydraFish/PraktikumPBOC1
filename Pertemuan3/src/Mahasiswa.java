/* Nama File    : Mahasiswa.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Haydar Rafi' Sultansyah 
   Tanggal      : 26 Februari 2026
   */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    //public Mahasiswa(String newNim, String newNama, String newProdi, Dosen newDoswal, Kendaraan newKendaraan){

    //}

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Doswal: " + dosenWali);
        System.out.println("Kendaraan: " + kendaraan);
    }
}
