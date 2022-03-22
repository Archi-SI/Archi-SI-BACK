
package model
import java.util.ArrayList;
import java.util.List;

public class Panier {
    private int id;
    private Utilisateur user ;
    private List<Article> articles = new ArrayList<>();
    private float prixTotal(){return this.articles.stream().mapToDouble(a -> a.getPrix()).reduce(0, float::sum);}

    public Panier(Utilisateur user) {
        this.user = user;
    }

    public Panier(int id,Utilisateur user) {
        this.id = id;
        this.setUser(user);
    }

    public Panier() {

    }

    public Panier(boolean confirme, Utilisateur user) {
        this.confirme = confirme;
        this.setUser(user);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    };

    public void addArticle(Article article)  {
        this.articles.add(article);
    }

    public void removeArticle(int n)  {
        this.articles.remove(n);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public int countArticle(Article art){
        return this.articles.stream().filter(a-> a.getLibelle().equals(art.getLibelle()).collect(Collectors.toList()));
    }


}