public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String inpNoPlat, String inpJenis){
        this.noPlat = inpNoPlat;
        this.jenis = inpJenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String inpNoPlat){
        noPlat = inpNoPlat;
    }

    public void setJenis(String inpJenis){
        jenis = inpJenis;
    }

    public void printKendaraan(){
        System.out.println("no plat: " + noPlat + ", jenis: " + jenis);
    }
}
