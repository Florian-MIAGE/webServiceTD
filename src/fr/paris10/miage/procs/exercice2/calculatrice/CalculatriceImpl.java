package fr.paris10.miage.procs.exercice2.calculatrice;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice2.calculatrice.Calculatrice")
public class CalculatriceImpl implements Calculatrice {

	@Override
	public int ajouter(int a, int b) {
		return a+b;
	}

	@Override
	public int soustraire(int a, int b) {
		return a-b;
	}
}