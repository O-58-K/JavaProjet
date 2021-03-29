package com.ynov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Nombre {
	
	static int VotreChoix = 0; 							// Ici sera stock� le choix que vous aurez effectu�.
	static int essais = 0; 									// Vous avez le droit � 10 essais maximum, bonne chance !
	static int DevinezMoi = Random(0000, 5000); 				// Le nombre � deviner est g�n�r� ici par l'ordinateur

	public static Scanner scn = new Scanner(System.in);	
	
	public static int Random (int Min, int Max){
		
		double result = Math.random();
		int resultat = (int) (result * (Max - Min + 1)) + Min;
		return resultat;
	}
	 
	public static int Devinez() {
		
		Logger Lgr = LoggerFactory.getLogger(Nombre.class);
	    
	        while (VotreChoix != DevinezMoi) { 									// Tant que le nombre du joueur est diff�rent du nombre � deviner
	        	
	    	    System.out.println("\nLa valeur de la devinette ne d�passe pas 5000 !");
	            System.out.print("Votre choix est : ");
	            VotreChoix = scn.nextInt();
	            System.out.println();
	            
				if ((VotreChoix > 5000) || (VotreChoix < 0) ) { 								// Condition si le joueur envoie un nombre sup�rieur � 5000 ou inf�rieur � 0 alors le programme s'arr�te
	                System.out.println("Votre choix est hors limite !\n");
	        		Lgr.info(" - Erreur, veuillez relancer une partie !");
		            System.exit(1); 															// Sortie du programme 
				}
				else if (essais >= 10) { 														// Si le nombre de tentatives est �gal ou sup�rieur � 10 alors vous avez perdu et le programme s'arr�te
	                System.out.println("Vous avez perdu car vous n'avez rien trouv� apr�s " + essais + " tentatives.\n");
	                System.out.println("Le chiffre �tait " + DevinezMoi + ".\n");
	        		return essais;
				}
	            
				if (VotreChoix <= DevinezMoi)
	            {
	                if (VotreChoix < DevinezMoi) { System.out.println("Que �a ! ce n'est pas assez !.\n"); }           // Nombre trop petit
	                else
	                {
	                    System.out.println("Bien jou� cher ami vous avez r�ussi ! Le chiffre �tait bien" + DevinezMoi);                 // Nombre exact trouv�
	                    return essais;
	                }
	            }
	            else { System.out.println("Haha, mais votre choix est trop grand !\n"); }       // Nombre trop grand 	            		  			
	        
	            essais+= 1 ;	           				
	        }
			
		return essais;
	}
    
}