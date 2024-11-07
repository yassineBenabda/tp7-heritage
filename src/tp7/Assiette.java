package tp7;

abstract class Assiette extends Ustensile {
	public Assiette(int annee) {
		super(annee);
	}
	public abstract double calculerSurface();
	public abstract double calculerValeur();
}
