/*Nama File     : MMahasiswa.java
 *Deskripsi     : berupa main yang berisi realisasi dari method yang ada dalam Class Mahasiswa, Dosen, MataKuliah, dan Kendaraan
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 5 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args){
        /******REALISASI CLASS Dosen******/ 
        //implementasi konstruktor class Dosen
        Dosen D1 = new Dosen(); //implementasi method konstruktor Dosen untuk membuat objek Dosen D1 dengan nilai default
        //implementasi method lain class Dosen
        D1.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D1
        //implementasi mutator class Dosen
        D1.setNip("12345"); //implementasi method setNip untuk mengeset nip Dosen D1
        D1.setNama("Rahmat"); //implementasi method setNama untuk mengeset nama Dosen D1
        D1.setProdi("Biologi"); //implementasi method setProdi untuk mengeset prodi Dosen D1
        //implementasi method lain class Dosen
        D1.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D1

        //implementasi konstruktor class Dosen
        Dosen D2 = new Dosen("54321", "Tahalu", "Kimia"); //implementasi method konstruktor Dosen untuk membuat objek Dosen D2 dengan nilai input
        //implementasi method lain class Dosen
        D2.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D2
        //implementasi selektor class Dosen
        System.out.println("nip D2 adalah: " + D2.getNip()); //implementasi method getNip untuk menampilkan nip Dosen D2
        System.out.println("nama D2 adalah: " + D2.getNama()); //implementasi method getNama untuk menampilkan nama Dosen D2
        System.out.println("prodi D2 adalah: " + D2.getProdi()); //implementasi method getProdi untuk menampilkan prodi Dosen D2
        

        /******REALISASI CLASS MataKuliah******/ 
        //implementasi konstruktor class MataKuliah
        MataKuliah MK1 = new MataKuliah(); //implementasi method konstruktor MataKuliah untuk membuat objek MataKuliah MK1 dengan nilai default
        //implementasi method lain class MataKuliah
        MK1.printMatKul(); //implementasi method printMatKul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK1
        //implementasi mutator class MataKuliah
        MK1.setIdMatkul("MK123"); //implementasi method setIdMatkul untuk mengeset idMatkul MataKuliah MK1
        MK1.setNama("daspro"); //implementasi method setNama untuk mengeset nama MataKuliah MK1
        MK1.setSks(4); //implementasi method setSks untuk mengeset sks MataKuliah MK1
        //implementasi method lain class MataKuliah
        MK1.printMatKul(); //implementasi method printMatKul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK1

        MataKuliah MK2 = new MataKuliah("MK345", "dasis", 4); //implementasi method konstruktor MataKuliah untuk membuat objek MataKuliah MK2 dengan nilai input
        //implementasi method lain class MataKuliah
        MK2.printMatKul(); //implementasi method printMatkul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK2
        //implementasi selektor class MataKuliah
        System.out.println("idMatkul MK2 adalah: " + MK2.getIdMatkul()); //implementasi method getIdMatkul untuk menampilkan id MataKuliah MK2
        System.out.println("nama MK2 adalah: " + MK2.getNama()); //implementasi method getNama untuk menampilkan nama MataKuliah MK2
        System.out.println("sks MK2 adalah: " + MK2.getSks()); //implementasi method getSks untuk menampilkan sks MataKuliah MK2


        /******REALISASI CLASS Kendaraan******/ 
        //implementasi konstruktor class Kendaraan
        Kendaraan K1 = new Kendaraan(); //implementasi method konstruktor Kendaraan untuk membuat objek Kendaraan K1 dengan nilai default
        //implementasi method lain class Kendaraan
        K1.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K1
        //implementasi mutator class Kendaraan
        K1.setNoPlat("AA12345BC"); //implementasi method setNoPlat untuk mengeset noPlat Kendaraan K1
        K1.setJenis("Motor"); //implementasi method setJenis untuk mengeset jenis Kendaraan K1
        //implementasi method lain class Kendaraan
        K1.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K1

        Kendaraan K2 = new Kendaraan("B16273C", "Mobil"); //implementasi method konstruktor Kendaraan untuk membuat objek Kendaraan K2 dengan nilai input
        //implementasi method lain class Kendaraan
        K2.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K2
        //implementasi selektor class Kendaraan
        System.out.println("no plat K2 adalah: " + K2.getNoPlat()); //implementasi method getNoPlat untuk menampilkan noPlat Kendaraan K2
        System.out.println("jenis K2 adalah: " + K2.getJenis()); //implementasi method getJenis untuk menampilkan jenis Kendaraan K2


        /******REALISASI CLASS Mahasiswa******/
        Mahasiswa M1 = new Mahasiswa();
        M1.printMhs();
        M1.printDetailMhs();
        M1.getJumlahMatKul();
        M1.getJumlahSKS();
        M1.setNim("24060124120023");
        M1.setNama("Kylian Mbappe");
        M1.setProdi("Informatika");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(MK1);
        M1.addMatKul(MK2);
        M1.printMhs();
        M1.printDetailMhs();
        M1.getJumlahMatKul();
        M1.getJumlahSKS();
    }
}
