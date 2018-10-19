package game;

import java.util.Random;

public class Arene extends Salle{
	
	int degats; //valeur des dégâts reçus 
	
	public String getArene() {
		
		this.type="arene";
		
		//génère un gain aléatoire pour la valeur des dégâts
		Random aléatoire=new Random();
		degats=1 + aléatoire.nextInt(25);
		
		return "Dans une " + this.type + " ! L'assaillant t'a infligé : " + this.degats + " dégâts !!";
				
	}

}
