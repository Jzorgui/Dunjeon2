package game;

public class Joueur {

	int pv=100; //vie de d�part
	int butin=0; //butin de d�part
	
	public int getCoffre(int gain) {
		
		this.butin = this.butin + gain;
		
		return this.butin;
	}
	
	public int receiveAttack(int degats) {
		
		this.pv = this.pv - degats;
		
		return this.pv;
		
	}
	
}
