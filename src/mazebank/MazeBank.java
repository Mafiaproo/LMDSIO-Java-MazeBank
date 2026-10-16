package mazebank;

import metier.*;

import java.util.Scanner;

public class MazeBank {
    public static void main(String[] args)
    {
        /*double depot, retrait, virement;
        Compte uncompte = new Compte("0123AZE", 1000);
        System.out.println("Compte : " + uncompte.getNumero() + " solde = " + uncompte.getSolde());

        depot = 500.0;

        uncompte.verser(depot);
        System.out.println("compte : " + uncompte.getNumero() + " solde après depot de " + depot + " = " + uncompte.getSolde());

        retrait = 250.0;

        uncompte.retirer(retrait);
        System.out.println("compte : " + uncompte.getNumero() + " solde après retrait de " + retrait + " = " + uncompte.getSolde());

        Compte unautrecompte = new Compte("234234ZER", 2500);
        System.out.println("compte : " + unautrecompte.getNumero() + " solde à la creation du compte = " + unautrecompte.getSolde());

        retrait = 200.0;

        unautrecompte.retirer(retrait);
        System.out.println("compte : " + unautrecompte.getNumero() + " solde après retrait de " + retrait + " = " + unautrecompte.getSolde());

        depot = 150.0;unautrecompte.verser(depot);
        System.out.println("compte : " + unautrecompte.getNumero() + " solde après depot de " + depot + " = " + unautrecompte.getSolde());

        virement = 350.0;

        uncompte.virer(virement, unautrecompte);

        System.out.println("compte : " + unautrecompte.getNumero() + " solde après virement de " + virement + " = " + unautrecompte.getSolde());
        System.out.println("compte : " + uncompte.getNumero() + " solde après virement de " + virement + " = " + uncompte.getSolde());*/

        Compte compte = new Compte();
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir le n° du compte : ");
        String numeroCompte = sc.nextLine();

        compte.setNumero(numeroCompte);

        System.out.println("Saisir le montant du solde : ");
        double montantSolde = sc.nextDouble();

        compte.setSolde(montantSolde);
        compte.retirer(100);

        System.out.println("Compte : " + compte.getNumero() + " solde = " + compte.getSolde());
    }
}