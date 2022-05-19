
public class ObjetPostal {

	public ObjetPostal() {
		super();
	}

	public float affranchissement() {
		float affranchissement = 2.0F;
		if (this.tauxDeRecommandation == 1) {
			affranchissement += 0.5F;
		} else if (this.tauxDeRecommandation == 2) {
			affranchissement += 1.5F;
		}
		if (this.volume >= 0.125F) {
			affranchissement += 3.0F;
		}
		return affranchissement;
	}

	public float tarifRemboursement() {
		float remboursement = 0.0F;
		if(this.tauxDeRecommandation == 1) {
			remboursement = 0.1F*this.valeurDéclarée;
		} else if(this.tauxDeRecommandation == 2) {
			remboursement = 0.5F*this.valeurDéclarée;
		}
		return remboursement;
	}

}