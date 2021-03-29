package com.ynov;

public class Ordinateur {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);	
	
    static char Valeur = '=';
    static char Plus = '+';
    static char Moins = '-';
    static char ToucheT = ' '; 								// Il s'agit de la valeur que l'utilisateur indique à l'ordinateur pour quider celui-ci    
    static int ValeurMax = 1000; 							// La valeur maximale est 1000
    static int ValeurMin = 0; 								// La valeur minimale est 0
    static int Ancien = 0; 									// Permet de savoir si la valeur retourné par l'ordinateur à déjà été proposé ou non
    static int Nb = 0; 
    static int essaisNb = 0; 								// Nombre d'essais comptés (limités à 10 essais par partie)
    
    public static char Caractere() {
        char touche = ' ';								// Il s'agit de la valeur permmettant de "guider" l'ordinateur (Les touches à utiliser sont "+", "-" et "=")
        while (touche != Plus && touche != Moins && touche != Valeur)  {
            System.out.print("------------\n");
            System.out.print("| Indiquez si l'ordinateur se rapproche du résultat : \n");
            System.out.print("-------------------------------------------------------------\n");
            touche = scanner.next().charAt(0);
        }
        
        return touche;
    }
    
	public static int Random (int Min, int Max){ 			// Fonction random qui permet de générer une valeur aléatoire entre une plage de valeurs choisi
		
		double result = Math.random();
		int resultat = (int) (result * (Max - Min + 1)) + Min;
		return resultat;
	}

	public static int OrdinateurMyst() {
	        
	        while (ToucheT != Valeur) { 					// Tant que la valeur donnée par l'utilisateur est différente de '=' exécuter la boucle
	        
                if (ToucheT != Plus)
                {
                    if (ToucheT == Moins) ValeurMax = Nb - 1;          
                }
                else ValeurMin = Nb + 1;	
                
	            if (Nb > 1000 || Nb < 0){
	            	System.out.print("Valeur trop grande !\n");
	        		return essaisNb;
	            }
	          
	            Ancien = Nb;
	            Nb = ValeurMin + ((ValeurMax - ValeurMin) / Random(2, 5) ); // Première valeur que l'ordinateur propose (au début du programme) et la fonction random est utilisée pour une plage de valeurs aléatoire entre 2 et 5
	            
	            if (Ancien == Nb) {
	                System.out.println("Mais non ! Ce n'est pas possible cette valeur a déjà été proposée !");
	                return essaisNb;
	            }
	            
	            essaisNb += 1 ;
	            System.out.print("------------\n");
	            System.out.println("| Est-ce " + Nb + " ?");  
	            ToucheT = Caractere();           
	        }
	        if (ToucheT == Valeur) {
	    		System.out.println("\nL'ordinateur a réussi à decouvrir le nombre, vous avez perdu !");
	    		System.out.println("Avec " + essaisNb + " essais !");
	        }
		return essaisNb;
	}

}
