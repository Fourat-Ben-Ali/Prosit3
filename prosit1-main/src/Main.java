import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit p = new Produit(0,"Natilaitt","Yaghourtt",2);
        Produit c= new Produit(0,"Natilait","Yaghourt",2);

/*
        if(Produit.Comparer(p,c))
        {
            System.out.println("produit identique ");
        }

        else
            System.out.println("produit different");


        if(p.Comparer(c))
        {
            System.out.println("produit identique ");
        }

        else
            System.out.println("produit different");

            */

Magasin m= new Magasin(0,"tunis", 20);
m.ajouterProduit(p);
m.afficherMagasin();
if(m.chercherProduit(p))
{
    System.out.println("produit identique");
}
else
    System.out.println("produit different");
    }
}