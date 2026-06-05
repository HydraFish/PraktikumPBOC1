// Nama         : Haydar Rafi' Sultansyah
// NIM          : 24060124120023
// Nama File    : LambdaList.java
// Deskripsi    : Program untuk menampilkan nama mahasiswa dari List dengan ekspresi lambda.
// Tanggal      : 5 Juni 2026

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}