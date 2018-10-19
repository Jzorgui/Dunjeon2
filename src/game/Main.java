package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Joueur joueur = new Joueur();
		String saisie;
		
		//consignes de départ
		System.out.println("La règle du jeu est simple, tu te déplace de salle en salle.");
		System.out.println("Tu es dans un couloir et tu choisis de rentrer dans la salle à droite ou à ta gauche, tu n'as que ces deux options pour continuer à avancer.");
		System.out.println("Tu peux aussi faire demi-tour à tout moment !");
		System.out.println("\t Pour aller à droite utilise D (en majuscule)");
		System.out.println("\t Pour aller à gauche utilise G (en majuscule)");
		System.out.println("\t Pour arrêter utilise E (en majuscule)");
		System.out.println("\t Pour aller à droite utilise D (en majuscule)");
		System.out.println("Bonne chance ! \n");



				
		do {
		
			//Saisie du choisx de l'utilisateur
			do {
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Tu va à droite(D) à gauche(G) ou tu arrêtes là(E) ?");
				saisie = keyboard.nextLine();
			} while(!saisie.equals("D") && !saisie.equals("G") && !saisie.equals("E"));
		
			if(saisie.equals("E")) {
				System.out.println("Aurevoir ! Tu t'arrêtes avec " + joueur.butin +" € et " + joueur.pv + "hp \n");
				nouvellePartie(saisie);
			}
			
			//génère un un nombre aléatoire pour obtenir une salle au hasard
			int room;
			Random aléatoire=new Random();
			room = aléatoire.nextInt(3);
					
			if(room == 0) { //entre dans une salle au trésor
				Coffre coffre = new Coffre();
				System.out.println(coffre.description() + coffre.getSalle() + coffre.infoCoffre() + " € !!");
		
				System.out.println("Ton butin est de " + joueur.getCoffre(coffre.gain) + " € ! \n");
			}
			if(room == 1) { //entre dans une salle vide
				Vide vide = new Vide();
				System.out.println(vide.description() + vide.getSalle() + vide.getVide() +"\n");
			}
			if(room == 2) { //entre dans une salle où se trouve un ennemi
				Arene attack = new Arene();
				System.out.println(attack.description() + attack.getArene());
			
				System.out.println("Tu n'as plus que " + joueur.receiveAttack(attack.degats)+ "hp ! \n");
			}
		
		} while (joueur.pv != 0 && joueur.pv > 0);
		
			System.out.println("Tu as perdus la vie ainsi que " + joueur.butin + " €... \n");
			
			nouvellePartie(saisie);
		
		}
	
	public static void nouvellePartie(String saisie) {
		//Propose une nouvelle partie
		do {
			// La saisie du code de l'utilisateur
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Souhaitez vous refaire une partie ? (OK/NO)");
			saisie = keyboard.nextLine();
    	} while(!saisie.equals("OK") && !saisie.equals("NO") && !saisie.equals("ok") && !saisie.equals("no"));
  	
		if(saisie.equals("OK") || saisie.equals("ok")) {
			System.out.println("Bonne chance !!");
			main(null);
		} else { System.out.println("Aurevoir !"); }
	}

}
