package tp7;

public class Cuillere extends Ustensile {
	private double longeur;
	public Cuillere(int annee,double longeur) {
		super(annee);
		this.longeur = longeur;
	}
	public double getLongeur() {
		return longeur;
	}
	public double calculerValeur() {
		int age = 2024 - this.getAnnee();
		if (age <= 50)
			return 0;
		else 
			return age - 50;
	}
}
