/**
 * File      : overloadingMain.java
 * Deskripsi : Program untuk menunjukkan overloading
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class overloadingMain {
    public static void main(String[] args){

        //b. Aplikasi varian operator kelas Mahasiswa
        System.out.println("=== contoh aplikasi semua varian operator kelas Mahasiswa ===");
        //c. Varian 1 tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1: ");
        m1.cetak();

        //d. Varian 2 dengan 3 parameter
        Mahasiswa m2 = new Mahasiswa("24060124120023", "Pep Guardiola", "Informatika");
        System.out.println("Mahasiswa 2: ");
        m2.cetak();

        //e. Varian 3 dengan parameter input mahasiswa lain (kloning)
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3: ");
        m3.cetak();


        System.out.println("\n=== setProgramStudi overloading ===");
        //Varian 1 tanpa parameter
        System.out.println("Mengubah Programstudi m1 (tanpa parameter)");
        m1.setProgramStudi();
        m1.cetak();

        //Varian 2 dengan parameter String
        System.out.println("Mengubah Programstudi m1 (Parameter string = Teknik Komputer)");
        m1.setProgramStudi("Teknik Komputer");
        m1.cetak();

        //Varian 3 dengan parameter objek Mahasiswa
        System.out.println("Mengubah Programstudi m2 (Parameter objek mahasiswa m1)");
        m2.setProgramStudi(m1);
        m2.cetak();


        System.out.println("\n=== Aplikasi Lain ===");
        System.out.println("Mengubah NIM m2 (Parameter String = 24060124120083)");
        m2.setNIM("24060124120083");
        m2.cetak();

        System.out.println("Mengubah Nama m2 (Parameter String = Jose Mourinho)");
        m2.setNama("Jose Mourinho");
        m2.cetak();

        System.out.println("Menampilkan NIM m3");
        System.out.println("NIM m3: " + m3.getNIM());

        System.out.println("Menampilkan Nama m3");
        System.out.println("Nama m3: " + m3.getNama());

        System.out.println("Menampilkan Program Studi m3");
        System.out.println("Program studi m3: " + m3.getProgramstudi());
    }
}
