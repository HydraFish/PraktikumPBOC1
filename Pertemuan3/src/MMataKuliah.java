public class MMataKuliah {
    public static void main(String[] args){
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
    }
}
