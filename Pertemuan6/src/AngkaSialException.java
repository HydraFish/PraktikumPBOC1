/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

//kelas untuk membuat exception sendiri yang nantinya akan dipanggil, menolak masukan angka 13
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}