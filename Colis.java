
public class Colis extends ObjetPostal {

	private int codePostal;
	private String destination;
	private int tauxDeRecommandation;
	private float volume;
	private int poid;
	private String origine;
	private String contenu;
	private int valeurD�clar�e;
	
	public Colis(int codePostal, String destination, int tauxDeRecommandation, float volume, int poid, String origine, String contenu, int valeurD�clar�e) {
		this.setCodePostal(codePostal);
		this.setDestination(destination);
		this.setPoid(poid);
		this.setTauxDeRecommandation(tauxDeRecommandation);
		this.setVolume(volume);
		this.setOrigine(origine);
		this.setContenu(contenu);
		this.setValeurD�clar�e(valeurD�clar�e);
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

	public int getValeurD�clar�e() {
		return valeurD�clar�e;
	}

	public void setValeurD�clar�e(int valeurD�clar�e) {
		this.valeurD�clar�e = valeurD�clar�e;
	}
	
	public String toString() {
		return "Colis ["+this.codePostal+"/"+this.destination+"/"+this.tauxDeRecommandation+"/"+this.volume+"/"+this.valeurD�clar�e+"]";
	}
	
}
