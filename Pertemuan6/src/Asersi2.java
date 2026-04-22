/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

// class Lingkaran
class Lingkaran {
    // ATRIBUT
    private double jariJari;

    // METHOD
    // Konstruktor
    // Konstruktor untuk membuat objek lingkaran dengan nilai input jariJari
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method lain
    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
// kelas untuk mencetak keliling lingkaran dan memperlihatkan asersi bahwa jarijari lingkaran tidak boleh 0
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0; // inisialisasi nilai jariJari lingkaran
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!"; //Asersi untuk memeriksa nilai input jariJari. Program akan berhenti jika jariJari=0, karena jariJari lingkaran tidak boleh 0
        Lingkaran l = new Lingkaran(jariJari); //membuat objek lingkaran l
        double kelilingLingkaran = l.hitungKeliling(); //menghitung keliling lingkaran l dan menyimpannya di variabel kelilingLingkaran
        System.out.println("keliling lingkaran = " + kelilingLingkaran); //mencetak keliling lingkaran
    }
}

// PERTANYAAN
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
// Jelaskan pada lembar laporan praktikum!
// JAWABAN
// Saat kode dijalankan, jika jariJari diassign dengan nilai 0, 
// maka program akan berjalan dan menghasilkan output "Keliling lingkaran = 0.0". 
// Hal ini tidak sesuai dengan konsep asersi yang didefinisikan di kode tersebut 
// dimana jariJari tidak boleh bernilai 0. Karena saat eksekusi kode harus mengaktifkan asersi, 
// maka perlu menambahkan -ea saat eksekusi kode. Sehingga jika jariJari di assign dengan nilai 0, 
// maka program akan berhenti dan menghasilkan output "Exception in thread "main" java.lang.AssertionError: jari jari tidak boleh nol!!!". 
// Solusi dari kesalahan tersebut adalah dengan menggunakan if else statement untuk mengecek 
// apakah jariJari bernilai 0. Hal ini akan memudahkan user agar tidak perlu mengaktifkan asersi 
// pada saat eksekusi kode.
// REKOMENDASI PERBAIKAN
// public class Asersi2 {
//  public static void main(String[] args) {
//      double jariJari = 0;
//      if (jariJari > 0) {
//          Lingkaran l = new Lingkaran(jariJari);
//          double kelilingLingkaran = l.hitungKeliling();
//          System.out.println("keliling lingkaran = " + kelilingLingkaran);
//      } 
//      else {
//          assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
//          System.out.println("Error: jari jari harus lebih besar dari nol!");
//      }
//  }
// }

// output dari java -ea  Asersi2 adalah
// Exception in thread "main" java.lang.AssertionError: jari jari tidak boleh nol!!!
//        at Asersi2.main(Asersi2.java:34)
// alasannya karena input jariJari bernilai 0, tidak memenuhi syarat asersi yaitu jariJari > 0