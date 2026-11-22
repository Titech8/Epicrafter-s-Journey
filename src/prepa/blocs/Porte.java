package prepa.blocs;

import prepa.IllegalBlocException;
import prepa.PorteVerrouilleException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Porte extends Bloc {
	private boolean verrouillee;
	
	private static Logger logger = LogManager.getLogger(Porte.class);

	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee)
			throws IllegalBlocException

	{
		super(longueur, largeur, hauteur);
		this.verrouillee = verrouillee;
		this.couleur = Couleur.BLEU;
	}

	public boolean estVerrouillee() {
		return verrouillee;
	}

	public void verrouiller() throws PorteVerrouilleException {
		if (verrouillee) {
			logger.error("La porte ne peut pas etre verrouillee car elle l'est déjà !");
			throw new PorteVerrouilleException();
		} else {
			verrouillee = true;
		}
	}
}
