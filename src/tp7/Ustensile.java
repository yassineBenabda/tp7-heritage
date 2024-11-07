package tp7;

abstract class Ustensile {
	private int annee;
	
	public Ustensile(int annee) {
		this.annee = annee;
	}
	
	public abstract double calculerValeur();

	public int getAnnee() {
		return annee;
	}

}
