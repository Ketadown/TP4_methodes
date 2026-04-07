public class Main {
    static void main() {

        //Création d'une variable v1 :

        Voiture v1 = new Voiture("Peugeot",208,2021,14500);

        //Affichage d'une variable v1 avec la méthode :

        v1.afficherDescription ();

        //Utilisation de la méthode appliquerReduction et tests :

        v1.appliquerReduction(0.9);
        v1.appliquerReduction(0.8);
        v1.appliquerReduction(0.7);
        //
    }

}
