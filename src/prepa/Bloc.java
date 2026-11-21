package prepa;

public abstract class Bloc implements IBloc {
	protected int longueur;
	protected int largeur;
	protected int hauteur;
	protected Couleur couleur;

	public Bloc(final int longueur, final int largeur, final int hauteur) throws IllegalBlocException {
		if (longueur < min_longueur || largeur < min_largeur || hauteur < min_hauteur) {
			throw new IllegalBlocException();
		}

		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public void afficherDescription() {
		System.out.print("je suis un bloc !");
	}
}
