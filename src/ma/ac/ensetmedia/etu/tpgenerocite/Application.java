package ma.ac.ensetmedia.etu.tpgenerocite;


import java.util.Scanner;
import ma.ac.ensetmedia.etu.tpgenerocite.metier.IMetier;
import ma.ac.ensetmedia.etu.tpgenerocite.metier.MetierProduitImpl;
import ma.ac.ensetmedia.etu.tpgenerocite.model.Produit;

public class Application {

  private final IMetier<Produit> metier = new MetierProduitImpl();
  private final String MENU = "\n"
      + "1. Afficher la liste des produits.\n"
      + "2. Rechercher un produit par son id.\n"
      + "3. Ajouter un nouveau produit dans la liste.\n"
      + "4. Supprimer un produit par id.\n"
      + "5. Quitter ce programme.\n";

  public Application() {
    getInput();
  }

  public static void main(String[] args) {
    new Application();
  }

  private void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println(MENU);
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println(metier.getAll());
        break;
      default:
        getInput();
    }
  }
}