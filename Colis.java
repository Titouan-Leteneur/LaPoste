
public class Colis extends ObjetPostal {

	private int codePostal;
	private String destination;
	private int tauxDeRecommandation;
	private float volume;
	private int poid;
	private String origine;
	private String contenu;
	private int valeurDéclarée;
	
	public Colis(int codePostal, String destination, int tauxDeRecommandation, float volume, int poid, String origine, String contenu, int valeurDéclarée) {
		this.setCodePostal(codePostal);
		this.setDestination(destination);
		this.setPoid(poid);
		this.setTauxDeRecommandation(tauxDeRecommandation);
		this.setVolume(volume);
		this.setOrigine(origine);
		this.setContenu(contenu);
		this.setValeurDéclarée(valeurDéclarée);
	}

	public int getTauxDeRecommandation() {
		return tauxDeRecommandation;
	}

	public void setTauxDeRecommandation(int tauxDeRecommandation) {
		this.tauxDeRecommandation = tauxDeRecommandation;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getValeurDéclarée() {
		return valeurDéclarée;
	}

	public void setValeurDéclarée(int valeurDéclarée) {
		this.valeurDéclarée = valeurDéclarée;
	}
	
	public String toString() {
		return "Colis ["+this.codePostal+"/"+this.destination+"/"+this.tauxDeRecommandation+"/"+this.volume+"/"+this.valeurDéclarée+"]";
	}
	
}
