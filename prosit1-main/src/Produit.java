import java.util.Date;

public class Produit {

    int id;
  String lib;
  String marque;
   private float prix;
  Date dateExp;

    public Produit(int id, String lib, String marque, float prix) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit() {
        this.id = 0;
        this.lib = "";
        this.marque ="";
        this.prix = 0;
    }


    public void Afficher()
    {
        System.out.println("Id:" +this.id +"\nLib:"+this.lib+"\nMarque:"+this.marque+"\nPrix:"+prix);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", lib='" + lib + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }


}
