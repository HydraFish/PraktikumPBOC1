/*Nama File     : MainPegawai.java
 *Deskripsi     : main driver untuk class Pegawai, Dosen, DosenTetap, DosenTamu, dan Tendik
 *Pembuat       : Haydar Rafi' Sultansyah
 *Tanggal       : 18 Maret 2026
*/

import java.time.LocalDate;

public class MainPegawai{
    public static void main(String[] args){

        /******REALISASI CLASS DosenTetap******/
        System.out.println("\n/******REALISASI CLASS DosenTetap******/");
        DosenTetap DT1 = new DosenTetap("001", "00100", "Iwan", LocalDate.of(1980,5,10), LocalDate.of(2010,1,1), 5000000, "Hukum"); //membuat objek dosen tetap DT1 dengan nilai input
        System.out.println("NIP DT1: " + DT1.getNip()); //mengambil nip dari DT1
        System.out.println("NIDN DT1: " + DT1.getNidn()); //mengambil nidn dari DT1
        System.out.println("Nama DT1: " + DT1.getNama()); //mengambil nama dari DT1
        System.out.println("Tanggal Lahir DT1: " + DT1.getTglLahir()); //mengambil tanggal lahir dari DT1
        System.out.println("TMT DT1: " + DT1.getTmt()); //mengambil tmt dari DT1
        System.out.println("Gaji Pokok DT1: " + DT1.getGajiPokok()); //mengambil gaji pokok dari DT1
        System.out.println("Fakultas DT1: " + DT1.getFakultas()); //mengambil fakultas dari DT1
        System.out.println("Tunjangan DT1: " + DT1.hitungTunjangan()); //mengambil tunjangan dari DT1
        System.out.println("Tanggal Pensiun DT1: " + DT1.hitungPensiun()); //mengambil tanggal pensiun dari DT1

        System.out.println("\n");

        DosenTetap DT2 = new DosenTetap(); //membuat objek dosen tetap DT2 dengan nilai default
        DT2.setNip("002"); //mengeset nip DT2
        DT2.setNidn("00200"); //mengeset nidn DT2
        DT2.setNama("Andikha"); //mengeset nama DT2
        DT2.setTglLahir(LocalDate.of(1985,3,15)); //mengeset tanggal lahir DT2
        DT2.setTmt(LocalDate.of(2015,2,1)); //mengeset tmt DT2
        DT2.setGajiPokok(6000000); //mengeset gaji pokok DT2
        DT2.setFakultas("Teknik"); //mengeset fakultas DT2
        DT2.printInfo(); //menampilkan info DT2


        /******REALISASI CLASS DosenTamu******/
        System.out.println("\n/******REALISASI CLASS DosenTamu******/");
        DosenTamu DM1 = new DosenTamu("003", "00100", "Rahmawati", LocalDate.of(1990,7,20), LocalDate.of(2020,1,1), 4000000, "FSM", LocalDate.of(2027,12,31)); //membuat objek dosen tamu DM1 dengan nilai input
        System.out.println("NIP DM1: " + DM1.getNip()); //mengambil nip dari DM1
        System.out.println("NIDK DM1: " + DM1.getNidk()); //mengambil nidk dari DM1
        System.out.println("Nama DM1: " + DM1.getNama()); //mengambil nama dari DM1
        System.out.println("Tanggal Lahir DM1: " + DM1.getTglLahir()); //mengambil tanggal lahir dari DM1
        System.out.println("TMT DM1: " + DM1.getTmt()); //mengambil tmt dari DM1
        System.out.println("Gaji Pokok DM1: " + DM1.getGajiPokok()); //mengambil gaji pokok dari DM1
        System.out.println("Fakultas DM1: " + DM1.getFakultas()); //mengambil fakultas dari DM1
        System.out.println("Akhir Kontrak DM1: " + DM1.getAkhirKontrak()); //mengambil tanggal akhir kontrak dari DM1
        System.out.println("Tunjangan DM1: " + DM1.hitungTunjangan()); //mengambil tunjangan dari DM1

        System.out.println("\n");

        DosenTamu DM2 = new DosenTamu(); //membuat objek dosen tamu DM2 dengan nilai default
        DM2.setNip("004"); //mengeset nip DM2
        DM2.setNidk("00200"); //mengeset nidk DM2
        DM2.setNama("Raisya"); //mengeset nama DM2
        DM2.setTglLahir(LocalDate.of(1992,6,10)); //mengeset tanggal lahir DM2
        DM2.setTmt(LocalDate.of(2022,1,1)); //mengeset tmt DM2
        DM2.setGajiPokok(3500000); //mengeset gapok DM2
        DM2.setFakultas("FEB"); //mengeset fakultas DM2
        DM2.setAkhirKontrak(LocalDate.of(2026,12,31)); //mengeset tanggal akhir kontrak DM2
        DM2.printInfo(); //menampilkan info DM2


        /******REALISASI CLASS Tendik******/
        System.out.println("\n/******REALISASI CLASS Tendik******/");
        Tendik T1 = new Tendik("005", "Alucard", LocalDate.of(1988,4,12), LocalDate.of(2012,1,1), 3000000, "SUmber Daya"); //membuat objek Tendik T1 dengan nilai input
        System.out.println("NIP T1: " + T1.getNip()); //mengambil nip dari T1
        System.out.println("Nama T1: " + T1.getNama()); //mengambil nama dari T1
        System.out.println("Tanggal Lahir T1: " + T1.getTglLahir()); //mengambil tanggal lahir dari T1
        System.out.println("TMT T1: " + T1.getTmt()); //mengambil tmt dari T1
        System.out.println("Gaji Pokok T1: " + T1.getGajiPokok()); //mengambil gapok dari T1
        System.out.println("Bidang T1: " + T1.getBidang()); //mengambil bidang dari T1
        System.out.println("Tunjangan T1: " + T1.hitungTunjangan()); //mengambil tunjangan dari T1
        System.out.println("Tanggal Pensiun T1: " + T1.hitungPensiun()); //mengambil tanggal pensiun dari T1

        System.out.println("\n");

        Tendik T2 = new Tendik(); //membuat objek tendik T2 dengan nilai default
        T2.setNip("006"); //mengeset nip T2
        T2.setNama("Anna"); //mengeset nama T2
        T2.setTglLahir(LocalDate.of(1990,8,8)); //mengeset tanggal lahir T2
        T2.setTmt(LocalDate.of(2018,1,1)); //mengeset tmt T2
        T2.setGajiPokok(3200000); //mengeset gapok T2
        T2.setBidang("Kemahasiswaan"); //mengeset bidang T2
        T2.printInfo();  //menampilkan info T2


        /******REALISASI CLASS Dosen******/
        Dosen D1 = new DosenTetap("008", "00120", "Mahoraga", LocalDate.of(1978, 1, 1), LocalDate.of(2008, 1, 1), 6500000, "Kedokteran"); //membuat objek dosen D1 berupa dosen tetap dengan nilai input
        System.out.println("NIP D1: " + D1.getNip()); //mengambil nip dari D1
        System.out.println("Nama D1: " + D1.getNama()); //mengambil nama dari D1
        System.out.println("Tanggal Lahir D1: " + D1.getTglLahir()); //mengambil tanggal lahir dari D1
        System.out.println("TMT D1: " + D1.getTmt()); //mengambil tmt dari D1
        System.out.println("Gaji Pokok D1: " + D1.getGajiPokok()); //mengambil gapok dari D1
        System.out.println("Fakultas D1: " + D1.getFakultas()); //mengambil fakultas dari D1
        System.out.println("NIDN D1: " + ((DosenTetap) D1).getNidn()); //mengambil nidn dari D1
        System.out.println("Tunjangan D1: " + ((DosenTetap) D1).hitungTunjangan()); //mengambil tunjangan dari D1
        D1.printInfo(); //menampilkan info D1

        System.out.println("\n");

        System.out.println("\n/******REALISASI CLASS Dosen******/"); 
        Dosen D2 = new DosenTetap(); //membuat objek Dosen D2 berupa dosen tetap dengan nilai default
        D2.setNip("007"); //mengeset nip D2
        D2.setNama("Baskara"); //mengeset nama D2
        D2.setTglLahir(LocalDate.of(1982, 2, 2)); //mengeset tanggal lahir D2
        D2.setTmt(LocalDate.of(2012, 1, 1)); //mengeset tmt D2
        D2.setGajiPokok(5500000); //mengeset gapok D2
        D2.setFakultas("K3"); //mengeset fakultas D2
        ((DosenTetap) D2).setNidn("00110"); //mengeset nidn D2 dengan casting
        D2.printInfo(); //menampilkan info D2
    

        /******REALISASI Class Pegawai******/
        System.out.println("\n/******REALISASI CLASS Pegawai******/");
        Pegawai P1 = new DosenTetap("009", "00333", "Argus", LocalDate.of(1975,2,2), LocalDate.of(2005,1,1), 7000000,  "Fisip"); //membuat objek pegawai P1 berupa dosen tetap dengan nilai input
        System.out.println("NIP: " + P1.getNip()); //mengambil nip dari P1
        System.out.println("Nama: " + P1.getNama()); //mengambil nama dari P1
        System.out.println("Tanggal Lahir: " + P1.getTglLahir()); //mengambil tanggal lahir dari P1
        System.out.println("TMT: " + P1.getTmt()); //mengambil tmt dari P1
        System.out.println("Gaji Pokok: " + P1.getGajiPokok()); //mengambil gapok dari P1
        System.out.println("NIDN: " + ((DosenTetap) P1).getNidn()); //mengambil nidn dari P1
        System.out.println("Fakultas: " + ((DosenTetap) P1).getFakultas()); //mengambil fakultas dari P1
        System.out.println("Tunjangan: " + ((DosenTetap) P1).hitungTunjangan()); //mengambil tunjangan dari P1
        P1.printInfo(); //menampilkan info P1

        System.out.println("\n");

        Pegawai P2 = new Tendik(); //membuat objek Pegawai P2 berupa tendik dengan nilai default
        P2.setNip("010"); //mengeset nip P2
        P2.setNama("Sakamoto"); //mengeset nama P2
        P2.setTglLahir(LocalDate.of(1995,9,9)); //mengeset tanggal lahir P2
        P2.setTmt(LocalDate.of(2020,1,1)); //mengeset tmt P2
        P2.setGajiPokok(2800000); //mengeset gapok P2
        ((Tendik) P2).setBidang("Akademik"); //mengeset bidang P2 dengan casting
        P2.printInfo(); //menampilkan info P2

    }
}