package game;

import java.util.Random;

public class Arene extends Salle{
	
	int degats; //valeur des d�g�ts re�us 
	
	public String getArene() {
		
		this.type="arene";
		
		//g�n�re un gain al�atoire pour la valeur des d�g�ts
		Random al�atoire=new Random();
		degats=1 + al�atoire.nextInt(25);
		
		return "Dans une " + this.type + " ! L'assaillant t'a inflig� : " + this.degats + " d�g�ts !!";
				
	}

}
