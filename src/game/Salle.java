package game;

public class Salle extends Castle {
	
	int id_type; //sert à générer une salle aléatoirement
	String type; //type de salle
	
	public String getSalle() {
		
		this.category="salle";
		
		return "Une " + this.category;
		
	}
	
}