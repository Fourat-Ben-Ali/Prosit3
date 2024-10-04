import java.security.PublicKey;
import java.util.List;

public class Magasin {


    private int id;
    private String adresse;
    private int capacite;

    private Produit[] ensembleProduit;
    private   int cpt;





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
            if(this.chercherProduit(p)) {
                this.ensembleProduit[cpt] = p;
                cpt++;
            }
            else
                System.out.println("produit existe");

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


    public Boolean chercherProduit(Produit p) {
        for (int i = 0; i < cpt; i++) { // Parcours seulement jusqu'au nombre réel de produits ajoutés
            if (ensembleProduit[i] != null && ensembleProduit[i].Comparer(p)) { // Vérification si le produit n'est pas null
                return true; // Retourne true dès que le produit est trouvé
            }
        }
        return false;
    }


}
