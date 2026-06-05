// Nama         : Haydar Rafi' Sultansyah
// NIM          : 24060124120023
// Nama File    : DiskonLambda.java
// Deskripsi    : Ekspresi lambda dasar untuk menghitung diskon
// Tanggal      : 5 Juni 2026


// Interface yang menghitung diskon
interface IDiskon {
    public double hitungDiskon(int harga);
}

// Class main untuk menampilkan output diskon
public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa menggunakan Lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan memakai Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // Dengan memakai Lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        IDiskon diskonBertingkat = (harga) -> {
            if (harga >= 100000) {
                return harga - (harga * 0.3);
            } else if (harga >= 50000) {
                return harga - (harga * 0.15);
            } else {
                return harga;
            }
        };

        // Mengeprint hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));
    }
}