package tp7;

public class AssietteCarree extends Assiette {
	private double cote;
	public AssietteCarree(int annee,double cote) {
		super(annee);
		this.cote = cote;
	}
	public double getCote() {
		return cote;
	}
	public double calculerSurface() {
		return cote * cote;
	}
	public double calculerValeur() {
	    int age = 2019 - this.getAnnee();
	    if (age <= 50) {
	        return 0;
	    } else {
	        return (age - 50) * 5;
	    }
	}

}
