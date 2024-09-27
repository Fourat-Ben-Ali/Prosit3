import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

      Magasin m1= new Magasin(0,"Bizerte", 50);
      m1.ajouterProduit(new Produit(1,"Yaghourt","Natilait",0));
        m1.ajouterProduit(new Produit(2,"Lait","Natilait",0));
      m1.afficherMagasin();



    }
}