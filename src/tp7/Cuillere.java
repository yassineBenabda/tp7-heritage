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
}
