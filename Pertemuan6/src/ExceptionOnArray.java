/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 * Tanggal   : 16 April 2026
 */

//kelas untuk menunjukkan exception pada array jika mencoba 
//mengakses index yang diluar batas yang telah ditentukan
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4]; //membuat objek array integer dengan panjang 4 elemen 0 sampai 3
        try {
            arrayInteger[2] = 11; //mencoba memasukkan nilai 11 ke indeks kedua
            arrayInteger[4] = 10; //mencoba memasukkan nilai 10 ke indeks keempat(out of bonds)
        } catch (ArrayIndexOutOfBoundsException exception) { //menangkap exception jika ada kesalahan indeks array di luar batas
            exception.printStackTrace(); //mencetak riwayat kesalahan//
        } finally { //finally akan selalu dieksekusi
            System.out.println("clean up code..."); //mencetak "clean up code..." sebagai penanda akhir
        }
    }
}

//output dari java ExceptionOnArray adalah
// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//        at ExceptionOnArray.main(ExceptionOnArray.java:16)
// clean up code...
//karena ada try untuk memasukkan nilai ke indeks ke 4, padahal indeks hanya dari 0 sampai 3 