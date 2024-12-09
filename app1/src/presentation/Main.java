package presentation;

import entity.Employe;
import entity.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> list = new ArrayList<>();
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donner le nombre d'etudiants");
            n = scanner.nextInt();
        }while (n <= 0);
        System.out.println("Remplissage de la liste d'etudiants");
        for (int i = 0; i < n; i++) {
            Etudiant etudiant = new Etudiant();
            etudiant.saisie();
            list.add(etudiant);
        }
        System.out.println("Affichage de la liste d'etudiants");
        for (Etudiant e : list) {
            e.affiche();
        }
        Employe employe = new Employe();
        System.out.println("=== Saisie Employe ===");
        employe.saisie();
        System.out.println("=== Affichage Employe ===");
        employe.affiche();
    }
}