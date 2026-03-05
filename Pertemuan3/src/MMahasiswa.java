public class MMahasiswa {
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        D1.setNip("12345");
        D1.setNama("Rahmat");
        D1.setProdi("Biologi");
        D1.printDosen();

        Dosen D2 = new Dosen("54321", "Tahalu", "Kimia");
        D2.printDosen();
        System.out.println("nip D2 adalah: " + D2.getNip());
        System.out.println("nama D2 adalah: " + D2.getNama());
        System.out.println("prodi D2 adalah: " + D2.getProdi());
        

        Dosen D3 = new Dosen("76432", "Asyik", "Fisika");
        D3.printDosen();
        System.out.println("nip D3 adalah: " + D3.getNip());
        System.out.println("nama D3 adalah: " + D3.getNama());
        System.out.println("prodi D3 adalah: " + D3.getProdi());

        MataKuliah MK1 = new MataKuliah();
        MK1.setIdMatkul("MK123");
        MK1.setNama("daspro");
        MK1.setSks(4);
        MK1.printMatKul();

        MataKuliah MK2 = new MataKuliah("MK345", "dasis", 4);
        MK2.printMatKul();
        System.out.println("idMatkul MK2 adalah: " + MK2.getidMatkul());
        System.out.println("nama MK2 adalah: " + MK2.getNama());
        System.out.println("sks MK2 adalah: " + MK2.getSks());

        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("AA12345BC");
        K1.setJenis("Motor");
        K1.printKendaraan();

        Kendaraan K2 = new Kendaraan("B16273C", "Mobil");
        K2.printKendaraan();
        System.out.println("no plat K2 adalah: " + K2.getNoPlat());
        System.out.println("jenis K2 adalah: " + K2.getJenis());
    }
}
