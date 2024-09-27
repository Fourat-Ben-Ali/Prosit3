import java.security.PublicKey;
import java.util.List;

public class Magasin {


    private int id;
    private String adresse;
    private int capacite;

    private Produit[] ensembleProduit;
    private  int cpt;


    public Magasin(int id , String adresse , int capacite )
    {
        this.id=id;
        this.adresse=adresse;
        this.capacite=capacite;
        this.ensembleProduit= new Produit[capacite];
        this.cpt=0;

    }


    public void ajouterProduit(Produit p)
    {
        if(cpt<capacite)
        {
            this.ensembleProduit[cpt]=p;
            cpt++;
        }
        else
            System.out.println("Magasin complet");
    }


    public void afficherMagasin()
    {
        System.out.println("Id:"+ this.id+
                           "\nAdresse:"+ this.adresse+
                           "\nCapcité:"+this.capacite);

        for(int i=0;i<cpt;i++)
        {
            this.ensembleProduit[i].Afficher();
        }
    }

}
