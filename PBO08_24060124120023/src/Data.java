/**
 * File      : Data.java
 * Deskripsi : Program berisi Kelas Data
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Data<T> {
    //Atribut
    private T[] ruang;
    private int banyak;

    //Method
    //Konstruktor
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    //Getter 
    //4. cMengambil isi elemen pada posisi tertentu
    public T getIsi(int posisi){
        if (posisi < 1 || posisi > 100){
            System.out.println("Posisi harus di antara 1 sampai 100");
            return null;
        }
        return ruang[posisi - 1];
    }

    //Setter 
    //4.b Mengeset isi elemen pada posisi tertentu
    public void setIsi(int posisi, T isiBaru){
        if (posisi < 1 || posisi > 100){
            System.out.println("Posisi harus di antara 1 sampai 100");
            return;
        }
        if (ruang[posisi - 1] == null && isiBaru != null){
            banyak++;
        } else if (ruang[posisi - 1] != null && isiBaru == null){
            banyak--;
        }
        ruang[posisi - 1] = isiBaru;
    }

    //4.d Mengambil banyak elemen efektif
    public int getSize(){
        return banyak;
    }
}