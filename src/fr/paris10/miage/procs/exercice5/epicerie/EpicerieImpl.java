package fr.paris10.miage.procs.exercice5.epicerie;

import java.util.HashMap;
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
		System.out.println("Creation produit "+produit.getId()+": "+
				produit.getLibelle());
	}

	@Override
	public void ajouter(Object idProduit, int qte) {
		StockProduit stockProduit = products.get(idProduit);
		
		if(stockProduit != null)
			stockProduit.setQuantite(qte);
		
		System.out.println("Ajout Stock "+((Produit) stockProduit.getProduit()).getId()+
				": "+stockProduit.getQuantite());
	}

	@Override
	public int obtenirQuantite(Object idProduit) {
		int qte = 0;
		StockProduit stockProduit = products.get(idProduit);
		
		if(stockProduit != null)
			qte = stockProduit.getQuantite();
		
		return qte;
	}

	@Override
	public ListeProduit listeProduits() {
		ListeProduit listeProduits = new ListeProduit();
		
		for (String productMapKey : products.keySet()) {
			listeProduits.getItem().add(
					(Produit)products.get(productMapKey).getProduit());
		}
		
		return listeProduits;
	}

	@Override
	public ListeStock listeStock() {
		ListeStock listeStock = new ListeStock();
		
		for (String productMapKey : products.keySet()) {
			listeStock.getItem().add(products.get(productMapKey));
			//System.out.println(((Produit)(products.get(productMapKey).getProduit())).getLibelle());
		}
		
		return listeStock;
	}

}
