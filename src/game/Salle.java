package game;

public class Salle extends Castle {
	
	int id_type; //sert � g�n�rer une salle al�atoirement
	String type; //type de salle
	
	public String getSalle() {
		
		this.category="salle";
		
		return "Une " + this.category;
		
	}
	
}