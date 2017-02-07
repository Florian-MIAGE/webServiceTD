package fr.paris10.miage.procs.exercice5.epicerie.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.exercice5.epicerie.Epicerie;
import fr.paris10.miage.procs.exercice5.epicerie.ListeProduit;
import fr.paris10.miage.procs.exercice5.epicerie.ListeStock;
import fr.paris10.miage.procs.exercice5.epicerie.Produit;
import fr.paris10.miage.procs.exercice5.epicerie.StockProduit;

public class EpicerieClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/epicerie?wsdl");
		QName qname = new QName("http://epicerie.exercice5.procs.miage.paris10.fr/", "EpicerieImplService");
		Service service = Service.create(url, qname);
		
		Epicerie epicerie = service.getPort(Epicerie.class);
		
		Produit produit1 = new Produit(), produit2 = new Produit();
		
		produit1.setId("1");
		produit1.setLibelle("Camembert");
		System.out.println("Creation produit "+produit1.getId()+": "+
				produit1.getLibelle());
		
		produit2.setId("2");
		produit2.setLibelle("Pain");
		System.out.println("Creation produit "+produit2.getId()+": "+
				produit2.getLibelle());
		
		epicerie.enregister(produit1);
		epicerie.enregister(produit2);
		
		epicerie.ajouter(produit1.getId(), 20);
		System.out.println("Ajout Stock "+produit1.getId()+": 20");
		epicerie.ajouter(produit2.getId(), 10);
		System.out.println("Ajout Stock "+produit2.getId()+": 10");
		
		ListeProduit listeProduit = epicerie.listeProduits();
		System.out.println("Liste des produits :");
		for (Produit p : listeProduit.getItem())
			System.out.println("- "+p.getLibelle()+" (id="+p.getId()+")");
		
		ListeStock listeStock = epicerie.listeStock();
		System.out.println("Liste des stocks :");
		for (StockProduit sp : listeStock.getItem()){
			System.out.println("- "+
					sp.getProduit()+" :"+sp.getQuantite());
		}
	}
}
