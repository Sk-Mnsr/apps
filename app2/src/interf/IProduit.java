package interf;

import entity.Produit;

public interface IProduit {
    Produit saisie(); // Méthode pour saisir les informations d'un produit
    void affichage(Produit produit);
}
