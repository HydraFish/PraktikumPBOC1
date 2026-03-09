/*Nama File     : MMahasiswa.java
 *Deskripsi     : berupa main yang berisi realisasi dari method yang ada dalam Class Mahasiswa, Dosen, MataKuliah, dan Kendaraan
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 5 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args){
        /******REALISASI CLASS Dosen******/ 
        System.out.println("/******REALISASI CLASS Dosen******/");
        //implementasi konstruktor class Dosen
        Dosen D1 = new Dosen(); //implementasi method konstruktor Dosen untuk membuat objek Dosen D1 dengan nilai default
        //implementasi method lain class Dosen
        System.out.println("identitas D1 sebelum set adalah");
        D1.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D1
        //implementasi mutator class Dosen
        D1.setNip("12345"); //implementasi method setNip untuk mengeset nip Dosen D1
        D1.setNama("Rahmat"); //implementasi method setNama untuk mengeset nama Dosen D1
        D1.setProdi("Informatika"); //implementasi method setProdi untuk mengeset prodi Dosen D1
        //implementasi method lain class Dosen
        System.out.println("identitas D1 sesudah set adalah");
        D1.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D1

        System.out.println("\n");
        //implementasi konstruktor class Dosen
        Dosen D2 = new Dosen("54321", "Megumi", "Biologi"); //implementasi method konstruktor Dosen untuk membuat objek Dosen D2 dengan nilai input
        //implementasi method lain class Dosen
        System.out.println("identitas D2 adalah");
        D2.printDosen(); //implementasi method printDosen untuk mencetak nilai nip, nama, dan prodi Dosen D2
        //implementasi selektor class Dosen
        System.out.println("nip D2 adalah: " + D2.getNip()); //implementasi method getNip untuk menampilkan nip Dosen D2
        System.out.println("nama D2 adalah: " + D2.getNama()); //implementasi method getNama untuk menampilkan nama Dosen D2
        System.out.println("prodi D2 adalah: " + D2.getProdi()); //implementasi method getProdi untuk menampilkan prodi Dosen D2
        System.out.println("/********************************/\n");
        

        /******REALISASI CLASS MataKuliah******/ 
        System.out.println("/******REALISASI CLASS MataKuliah******/");
        //implementasi konstruktor class MataKuliah
        MataKuliah MK1 = new MataKuliah(); //implementasi method konstruktor MataKuliah untuk membuat objek MataKuliah MK1 dengan nilai default
        //implementasi method lain class MataKuliah
        System.out.println("identitas MK1 sebelum set adalah");
        MK1.printMatKul(); //implementasi method printMatKul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK1
        //implementasi mutator class MataKuliah
        MK1.setIdMatkul("MK123"); //implementasi method setIdMatkul untuk mengeset idMatkul MataKuliah MK1
        MK1.setNama("Bahasa Inggris"); //implementasi method setNama untuk mengeset nama MataKuliah MK1
        MK1.setSks(2); //implementasi method setSks untuk mengeset sks MataKuliah MK1
        //implementasi method lain class MataKuliah
        System.out.println("identitas Mk1 sesudah set adalah");
        MK1.printMatKul(); //implementasi method printMatKul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK1

        System.out.println("\n");
        MataKuliah MK2 = new MataKuliah("MK345", "Pancasila", 4); //implementasi method konstruktor MataKuliah untuk membuat objek MataKuliah MK2 dengan nilai input
        //implementasi method lain class MataKuliah
        System.out.println("identitas MK2 adalah");
        MK2.printMatKul(); //implementasi method printMatkul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK2
        //implementasi selektor class MataKuliah
        System.out.println("idMatkul MK2 adalah: " + MK2.getIdMatkul()); //implementasi method getIdMatkul untuk menampilkan id MataKuliah MK2
        System.out.println("nama MK2 adalah: " + MK2.getNama()); //implementasi method getNama untuk menampilkan nama MataKuliah MK2
        System.out.println("sks MK2 adalah: " + MK2.getSks()); //implementasi method getSks untuk menampilkan sks MataKuliah MK2

        System.out.println("\n");
        MataKuliah MK3 = new MataKuliah("MK678", "Agama Islam", 3); //implementasi method konstruktor MataKuliah untuk membuat objek MataKuliah MK3 dengan nilai input
        //implementasi method lain class MataKuliah
        System.out.println("identitas MK3 adalah");
        MK3.printMatKul(); //implementasi method printMatkul untuk mencetak nilai idMatkul, nama, dan sks MataKuliah MK3
        //implementasi selektor class MataKuliah
        System.out.println("idMatkul MK3 adalah: " + MK3.getIdMatkul()); //implementasi method getIdMatkul untuk menampilkan id MataKuliah MK3
        System.out.println("nama MK3 adalah: " + MK3.getNama()); //implementasi method getNama untuk menampilkan nama MataKuliah MK3
        System.out.println("sks MK3 adalah: " + MK3.getSks()); //implementasi method getSks untuk menampilkan sks MataKuliah MK3
        System.out.println("/********************************/\n");

        /******REALISASI CLASS Kendaraan******/ 
        System.out.println("/******REALISASI CLASS Kendaraan******/");
        //implementasi konstruktor class Kendaraan
        Kendaraan K1 = new Kendaraan(); //implementasi method konstruktor Kendaraan untuk membuat objek Kendaraan K1 dengan nilai default
        //implementasi method lain class Kendaraan
        System.out.println("identitas K1 sebelum set adalah");
        K1.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K1
        //implementasi mutator class Kendaraan
        K1.setNoPlat("AA12345BC"); //implementasi method setNoPlat untuk mengeset noPlat Kendaraan K1
        K1.setJenis("Motor"); //implementasi method setJenis untuk mengeset jenis Kendaraan K1
        //implementasi method lain class Kendaraan
        System.out.println("identitas K1 sesudah set adalah");
        K1.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K1

        System.out.println("\n");
        Kendaraan K2 = new Kendaraan("B16273C", "Mobil"); //implementasi method konstruktor Kendaraan untuk membuat objek Kendaraan K2 dengan nilai input
        //implementasi method lain class Kendaraan
        System.out.println("identitas K2 adalah");
        K2.printKendaraan(); //implementasi method printKendaraan untuk mencetak nilai noPlat dan jenis Kendaraan K2
        //implementasi selektor class Kendaraan
        System.out.println("no plat K2 adalah: " + K2.getNoPlat()); //implementasi method getNoPlat untuk menampilkan noPlat Kendaraan K2
        System.out.println("jenis K2 adalah: " + K2.getJenis()); //implementasi method getJenis untuk menampilkan jenis Kendaraan K2
        System.out.println("/********************************/\n");


        /******REALISASI CLASS Mahasiswa******/
        System.out.println("/******REALISASI CLASS Mahasiswa******/");
        //implementasi konstruktor class Mahasiswa
        Mahasiswa M1 = new Mahasiswa(); //implementasi method konstruktor Mahasiswa untuk membuat objek Mahasiswa M1 dengan nilai default
        //implementasi method lain class Mahasiswa
        System.out.println("identitas M1 sebelum set adalah");
        M1.printMhs(); //implementasi printMhs untuk menampilkan nim, nama, dan prodi Mahasiswa M1
        System.out.println("identitas lengkap M1 sebelum set adalah");
        M1.printDetailMhs(); //implementasi printDetailMhs untuk menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, dan data kendaraan yang dimiliki Mahasiswa M1
        System.out.println("jumlah matkul yang diambil sebanyak:" + M1.getJumlahMatKul()); //implementasi getJumlahMatkul untuk mendapatkan jumlah mata kuliah yang diambil Mahasiswa M1
        System.out.println("jumlah sks yang diambil sebanyak:" + M1.getJumlahSKS()); //implementasi getJumlahSKS untuk mendapatkan jumlah sks mata kuliah yang diambil Mahasiswa M1
        //implementasi mutator class Mahasiswa
        M1.setNim("24060124120023"); //implementasi setNim untuk mengeset nim Mahasiswa M1
        M1.setNama("Kylian Mbappe"); //implementasi setNama untuk mengeset nama Mahasiswa M1
        M1.setProdi("Informatika"); //implementasi setProdi untuk mengeset prodi Mahasiswa M1
        M1.setDosenWali(D1); //implementasi setDosenWali untuk mengeset dosen wali Mahasiswa M1
        M1.setKendaraan(K1); //implementasi setKendaraan untuk mengeset kendaraan Mahasiswa M1
        M1.addMatKul(MK1); //implementasi addMatKul untuk menambahkan mata kuliah MK1 ke list mata kuliah Mahasiswa M1
        M1.addMatKul(MK2); //implementasi addMatKul untuk menambahkan mata kuliah MK2 ke list mata kuliah Mahasiswa M1
        //implementasi method lain class Mahasiswa
        System.out.println("identitas M1 sesudah set adalah");
        M1.printMhs(); //implementasi printMhs untuk menampilkan nim, nama, dan prodi Mahasiswa M1
        System.out.println("identitas lengkap M1 sesudah set adalah");
        M1.printDetailMhs(); //implementasi printDetailMhs untuk menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, dan data kendaraan yang dimiliki Mahasiswa M1
        System.out.println("jumlah matkul yang diambil sebanyak:" + M1.getJumlahMatKul()); //implementasi getJumlahMatkul untuk mendapatkan jumlah mata kuliah yang diambil Mahasiswa M1
        System.out.println("jumlah sks yang diambil sebanyak:" + M1.getJumlahSKS()); //implementasi getJumlahSKS untuk mendapatkan jumlah sks mata kuliah yang diambil Mahasiswa M1

        System.out.println("\n");
        //implementasi konstruktor class Mahasiswa
        Mahasiswa M2 = new Mahasiswa("24060124120073", "Max Verstappen", "Biologi", D2, K2); //implementasi method konstruktor Mahasiswa untuk membuat objek Mahasiswa M2 dengan nilai input
        M2.addMatKul(MK1); //implementasi addMatKul untuk menambahkan mata kuliah MK1 ke list mata kuliah Mahasiswa M2
        M2.addMatKul(MK2); //implementasi addMatKul untuk menambahkan mata kuliah MK2 ke list mata kuliah Mahasiswa M2
        M2.addMatKul(MK3); //implementasi addMatKul untuk menambahkan mata kuliah MK3 ke list mata kuliah Mahasiswa M2
        System.out.println("NIM M2 adalah: " + M2.getNim()); //implementasi method getNim untuk menampilkan nim Mahasiswa M2
        System.out.println("Nama M2 adalah: " + M2.getNama()); //implementasi method getNama untuk menampilkan nama Mahasiswa M2
        System.out.println("Prodi M2 adalah: " + M2.getProdi()); //implementasi method getProdi untuk menampilkan prodi Mahasiswa M2
        System.out.println("List matkul yang diambil M2 adalah: [");
        for(int i = 0; i < M2.getListMatKul().size(); i++) {
            System.out.println(M2.getListMatKul().get(i).getIdMatkul() + "," + M2.getListMatKul().get(i).getNama() + "," + M2.getListMatKul().get(i).getSks()); //implementasi method getListMatkul untuk menampilkan list mata kuliah Mahasiswa M2
        }
        System.out.println("]");
        System.out.println("Doswal M2 adalah: ");
        M2.getDosenWali().printDosen(); //implementasi method getDosenWali untuk menampilkan dosen wali Mahasiswa M2
        System.out.println("Kendaraan M2 adalah: ");
        M2.getKendaraan().printKendaraan(); //implementasi method getKendaraan untuk menampilkan kendaraan Mahasiswa M2
        //implementasi method lain class Mahasiswa
        System.out.println("identitas M2 adalah");
        M2.printMhs(); //implementasi printMhs untuk menampilkan nim, nama, dan prodi Mahasiswa M2
        System.out.println("identitas lengkap M2 adalah");
        M2.printDetailMhs(); //implementasi printDetailMhs untuk menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, dan data kendaraan yang dimiliki Mahasiswa M2
        System.out.println("jumlah matkul yang diambil sebanyak:" + M2.getJumlahMatKul()); //implementasi getJumlahMatkul untuk mendapatkan jumlah mata kuliah yang diambil Mahasiswa M2
        System.out.println("jumlah sks yang diambil sebanyak:" + M2.getJumlahSKS()); //implementasi getJumlahSKS untuk mendapatkan jumlah sks mata kuliah yang diambil Mahasiswa M2
        System.out.println("/********************************/\n");
    }
}