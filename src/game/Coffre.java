package game;

import java.util.Random;

public class Coffre extends Salle {
	
	int gain; //valeur du tr�sor 
	
	public String infoCoffre() {
		
		this.type="coffre";
		
		//g�n�re un gain al�atoire pour la valeur du tr�sor
		Random al�atoire=new Random();
		gain=1 + al�atoire.nextInt(1000);
		
		return " au " + this.type + " contient un tr�sor de : " + this.gain;
				
	}
	
}
