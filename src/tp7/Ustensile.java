package tp7;

abstract class Ustensile {
	private int annee;
	
	public Ustensile(int annee) {
		this.annee = annee;
	}
	
	public double calculerValeur() {
		int age = 2024 - this.getAnnee();
		if (age <= 50)
			return 0;
		else 
			return age - 50;
	}
	
	public int getAnnee() {
		return annee;
	}

}
