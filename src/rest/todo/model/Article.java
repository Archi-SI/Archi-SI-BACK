package model;


public class Article {
    private int id_Article;
    private String libelle;
    private String marque;
    private float prix;
    private Categorie categorie;
    private Photo photo;

    public int getId_Article() {
        return id_Article;
    }

    public void setId_Article(int id_Article) {
        this.id_Article = id_Article;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Article(int id_Article, String libelle, String marque, float prix, Categorie categorie, Photo photo) {
        this.id_Article = id_Article;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.categorie = categorie;
        this.photo = photo;
    }


}