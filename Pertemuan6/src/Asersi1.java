/**
 * File      : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 * Tanggal   : 16 April 2026
 */

// kelas Asersi1 memeriksa apakah nilai x positif atau negatif. Akan mengeluarkan asersi jika x adalah 0 (bukan positif atau negatif)
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0; //inisialisasi nilai x
        if (x > 0) { //memeriksa apakah x>0
            System.out.println("x bilangan positif"); //mencetak bahwa x adalah positif karena x>0 true
        } else { //kondisi ketika x>0 bernilai false
            assert (x < 0) : "ada kesalahan kode"; //asersi untuk mengecek kondisi x<0, jika saat run menggunakan asersi -ea, program akan berhenti jika x=0
            System.out.println("x bilangan negatif"); //mencetak bahwa x adalah negatif karena x < 0
        }
    }
}

//output dari java -ea  Asersi1 adalah
// Exception in thread "main" java.lang.AssertionError: ada kesalahan kode
//        at Asersi1.main(Asersi1.java:15)
// karena x bernilai 0, ketika dicek dengan asersi x<0 bernilai false