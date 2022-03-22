package model;

public class Boutique{
    String name;
    String boutique_description;
    string adress;
    string contact;

    public Boutique(String name, String boutique_description, string adress, string contact) {
        this.name = name;
        this.boutique_description = boutique_description;
        this.adress = adress;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoutique_description() {
        return boutique_description;
    }

    public void setBoutique_description(String boutique_description) {
        this.boutique_description = boutique_description;
    }

    public string getAdress() {
        return adress;
    }

    public void setAdress(string adress) {
        this.adress = adress;
    }

    public string getContact() {
        return contact;
    }

    public void setContact(string contact) {
        this.contact = contact;
    }
}