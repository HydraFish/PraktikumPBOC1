/**
 * File      : Datum.java
 * Deskripsi : Datum adalah kelas generik yang dapat menampung berbagai tipe data
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

//2. Kelas Generik Datum
class Datum<T> {
    //Atribut
    private T isi;

    //Method
    //Konstruktor
    public Datum(T isi){
        this.isi = isi;
    }

    //Setter
    //Method untuk mengubah nilai isi
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    //Getter
    //Method untuk mendapatkan nilai Isi
    public T getIsi() {
        return this.isi;
    }
}