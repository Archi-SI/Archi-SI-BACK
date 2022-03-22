package model;


public class Categorie {
    private String libelle;
    private int id;

    public Categorie() {
    }

    public Categorie(String libelle) {
        this.libelle = libelle;
    }

    public Categorie(Integer id, String ) {
        this.id = id;
        this.libelle = libelle;
    }

    public String getlibelle() {
        return libelle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setlibelle(String libelle) {
        this.libelle = libelle;
    }

}