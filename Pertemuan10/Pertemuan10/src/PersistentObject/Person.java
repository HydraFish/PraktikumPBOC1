package PersistentObject;

 //Nama: Haydar Rafi' Sultansyah
 //NIM: 24060124120023
 //Lab: C1
 //Tanggal: 20 Mei 2026
 //File : Person.java
 //Deskripsi : Person database model

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
