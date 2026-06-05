// Nama         : Haydar Rafi' Sultansyah
// NIM          : 24060124120023
// Nama File    : LambdaMap.java
// Deskripsi    : Program untuk menampilkan nama mahasiswa dari map dengan ekspresi lambda.
// Tanggal      : 5 Juni 2026

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123120001", "Adi");
        mahasiswaMap.put("24060123120002", "Bambang");
        mahasiswaMap.put("24060123120003", "Cici");
        mahasiswaMap.put("24060123120004", "Didi");

        // Menggunakan lambda untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}