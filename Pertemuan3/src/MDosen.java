public class MDosen {
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
    }
}
