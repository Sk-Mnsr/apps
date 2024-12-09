package presentation;

import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        ProduitImpl produitImpl = new ProduitImpl();

        System.out.println("=== Saisie du produit ===");
        Produit produit = produitImpl.saisie();

        System.out.println("\n=== Affichage du produit ===");
        produitImpl.affichage(produit);
    }
}
