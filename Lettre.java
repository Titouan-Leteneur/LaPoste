
public class Lettre {

	private int codePostal;
	private String destination;
	private int tauxDeRecommandation;
	private String caractereUrgence;
	
	private float affranchissement;
	final float tarifDeBase = 0.5F;
	final float tarifCaractereUrgence = 0.3F;
	
	public Lettre(int codePostal, String destination, int tauxDeRecommandation, String caractereUrgence) {
		this.setCodePostal(codePostal);
		this.setDestination(destination);
		this.setTauxDeRecommandation(tauxDeRecommandation);
		this.setCaractereUrgence(caractereUrgence);
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTauxDeRecommandation() {
		return tauxDeRecommandation;
	}

	public void setTauxDeRecommandation(int tauxDeRecommandation) {
		this.tauxDeRecommandation = tauxDeRecommandation;
	}

	public String getCaractereUrgence() {
		return caractereUrgence;
	}

	public void setCaractereUrgence(String caractereUrgence) {
		this.caractereUrgence = caractereUrgence;
	}
	
	public float affranchissement() {
		this.affranchissement  = this.tarifDeBase;
		if(this.tauxDeRecommandation == 1) {
			this.affranchissement += 0.5;
		} else if(this.tauxDeRecommandation == 2) {
			this.affranchissement += 1.5;
		}
		if(this.caractereUrgence == "urgente") {
			this.affranchissement += this.tarifCaractereUrgence;
		}
		return this.affranchissement;
	}

	public float tarifRemboursement() {
		if(this.tauxDeRecommandation == 0) {
			return 0.0F;
		} else if(this.tauxDeRecommandation == 1) {
			return 1.5F;
		} else {
			return 15.0F;
		}
		
	}
	
	public String toString() {
		return "Lettre ["+this.codePostal+"/"+this.destination+"/"+this.tauxDeRecommandation+"/"+this.caractereUrgence+"]";
	}
	
}
 