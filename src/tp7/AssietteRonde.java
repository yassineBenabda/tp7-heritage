package tp7;

public class AssietteRonde extends Assiette {
	private double rayon;
	public AssietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon = rayon;
	}
	public double getRayon() {
		return rayon;
	}
	public double calculerSurface() {
		return 3.14 * rayon *rayon;
	}
	public double calculerValeur() {
		int age = 2024 - this.getAnnee();
		if (age <= 50)
			return 0;
		else 
			return age - 50;
	}
}
