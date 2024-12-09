package entity;

import interf.IProduit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {

    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la référence : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé : ");
        String libelle = scanner.nextLine();

        double quantite;
        do {
            System.out.print("Entrez la quantité : ");
            quantite = scanner.nextDouble();
        } while (quantite < 0);

        int prix;
        do {
            System.out.print("Entrez le prix : ");
            prix = scanner.nextInt();
        } while (prix < 0);

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println(produit);
    }
}

