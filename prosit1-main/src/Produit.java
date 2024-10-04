import java.util.Date;


public class Produit {
    int id;
    String lib;
    String marque;
    private float prix;
    Date dateExp;

   private static int nbre_prduits=0;

    public static int getNbre_prduits() {
        return nbre_prduits;
    }

    public Produit(int id, String lib, String marque, float prix) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
        this.nbre_prduits++;
    }

    public Produit() {
        this.id = 0;
        this.lib = "";
        this.marque ="";
        this.prix = 0;
        this.nbre_prduits++;
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

 public Boolean Comparer(Produit p)
 {
     if((this.prix==p.prix)&&(this.lib==p.lib)&&(this.id==p.id))
     {
         return true;
     }
     else
         return false;
 }
    public  static Boolean Comparer( Produit p, Produit c)
    {
    if(p.Comparer(c))
    {
        return true;
    }
    else return
            false;
    }


}
