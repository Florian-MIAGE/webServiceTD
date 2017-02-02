package fr.paris10.miage.procs.exercice5.epicerie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice5.epicerie.Epicerie")
public class EpicerieImpl implements Epicerie {
	
	Map<String, StockProduit> products = new HashMap<String, StockProduit>();

	@Override
	public void enregister(Produit produit) {
		StockProduit stockProduit = new StockProduit();
		stockProduit.setProduit(produit);
		stockProduit.setQuantite(0);
		products.put(produit.getId(), stockProduit);
	}

	@Override
	public void ajouter(Object idProduit, int qte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int obtenirQuantite(Object idProduit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListeProduit listeProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListeStock listeStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
