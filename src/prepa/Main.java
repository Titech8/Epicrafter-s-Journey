package prepa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import prepa.blocs.Porte;

public class Main {
	private static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		
		logger.error("test de logging");
		
		try {
			Porte porte = new Porte(1, 1, 1, true);
			porte.verrouiller();
		} catch (IllegalBlocException e) {
			System.out.println("Impossible de construire le bloc.");
		} catch (PorteVerrouilleException exception) {
			System.out.println("La porte est déjà vérrouillée.");
		}
	}
}