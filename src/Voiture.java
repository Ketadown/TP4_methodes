public class Voiture {

    String Marque;
    int Modele;
    int Annee;
    int Prix;

    public Voiture(String Marque,int Modele,int Annee, int Prix){
        this.Marque=Marque;
        this.Modele=Modele;
        this.Annee=Annee;
        this.Prix=Prix;
    }

    public void afficherDescription() {
        System.out.println("Marque : " + Marque);
        System.out.println("Modèle : " + Modele);
        System.out.println("Année : " + Annee);
        System.out.println("Prix : " + Prix + " €");
    }

}
