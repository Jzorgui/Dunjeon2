package game;

import java.util.Random;

public class Coffre extends Salle {
	
	int gain; //valeur du trésor 
	
	public String infoCoffre() {
		
		this.type="coffre";
		
		//génère un gain aléatoire pour la valeur du trésor
		Random aléatoire=new Random();
		gain=1 + aléatoire.nextInt(1000);
		
		return " au " + this.type + " contient un trésor de : " + this.gain;
				
	}
	
}
