package PersistentObject;

 //Nama: Haydar Rafi' Sultansyah
 //NIM: 24060124120023
 //Lab: C1
 //Tanggal: 20 Mei 2026
 //File : DAOManager.java
 //Deskripsi : pengelola DAO dalam aplikasi
 
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
