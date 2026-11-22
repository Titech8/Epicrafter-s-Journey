package prepa;

import java.util.Set;

import prepa.blocs.IBloc;
import prepa.blocs.Mur;

import java.util.LinkedHashSet;

public class Kit {
	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();

	private Set<String> motsclés = new LinkedHashSet<String>();

	public Kit() throws IllegalBlocException {

		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(1, 2, 2, true));

		motsclés.add("cabane");
		motsclés.add("muraille");
	}

	public void afficherKit() {
		System.out.println("nombre de bloc dans le kit : " + blocs.size());

		System.out.println("liste des mots clés du kit : ");
		for (String motsclé : motsclés) {
			System.out.println(motsclé + " ");
		}
	}
}
