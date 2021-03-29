package com.ynov;

import java.util.Scanner;

public class Jouer {

	public static void main(String[] args) {

		Nombre n = new Nombre();
		Ordinateur pc = new Ordinateur();
				
		int choix = 0;													// Correspond � ce que vous allez d�cider de faire depuis le menu 
		
		do {			
			System.out.println("\n__________________________________"); //
			System.out.println("| 1 - Jouer                      |");   //
			System.out.println("__________________________________");   //
			System.out.println("| 2 - Faire deviner l'ordinateur |");   //
			System.out.println("__________________________________");   // MENU DU JEU
			System.out.println("| 3 - Quitter le jeu             |");   //
			System.out.println("__________________________________");   //
			System.out.println("\n  Veuillez faire un choix :\n\n");    //
			
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			
			switch (choix) { 											// Diff�rents choix du menu
			case 1: 													// Choix num�ro 1 (Joueur qui doit deviner)
				n.Devinez();
				break;
			case 2: 													// Choix num�ro 2 (Ordinateur qui doit deviner)
				pc.OrdinateurMyst();
				break;
			case 3: 													// Choix num�ro 3 (Quitter le programme)
				System.out.println("\nFermeture...\n");
				System.exit(1); 										// Sortie du programme
				break;
			default : 													// La valeur saisie est diff�rente des choix propos�s donc le menu se r�affiche
				System.out.println("\nMerci de saisir une ValeurMax entre 1 et 3 :\n");
				break;
			}
			
		} while(choix != -1);
		
		System.out.println("Fermeture...");
        System.exit(1); 												// Sortie du programme
		
	}
	
}
