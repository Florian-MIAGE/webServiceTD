package fr.paris10.miage.procs.exercice3.radars.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import fr.paris10.miage.procs.exercice3.radars.model.Amende;
import fr.paris10.miage.procs.exercice3.radars.model.Personne;
import fr.paris10.miage.procs.exercice3.radars.model.Voiture;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice3.radars.service.SystemeAmendes")
public class SystemeAmendesImpl implements SystemeAmendes{
	
	private Map <Integer, Amende> amendes = new HashMap <Integer, Amende> ();
	private Map <String, Voiture> voitures = new HashMap <String, Voiture> ();
	
	@Override
	public void enregistrer(Voiture v) {
		voitures.put(v.getImmatriculation(),v);
		System.out.println("\nVoiture enregistrée");
		System.out.println(v);
	}

	@Override
	public int signaler(String immatriculation, String modele, int tarif) {
		
		if(voitures.get(immatriculation) == null || 
				! voitures.get(immatriculation).getModele().equals(modele))
			return -1;
		
		Amende amende = new Amende(immatriculation, tarif);
		
		amendes.put(amende.getNumero(), amende);
		
		System.out.println("\nAmende enregistrée");
		System.out.println(amende);
		
		return amende.getNumero();
	}

	@Override
	public Amende[] lister(String immatriculation) {
		List <Amende> amendesImmatriculation = new ArrayList <Amende> ();
		
		for (Map.Entry<Integer, Amende> amandeEntry : amendes.entrySet()) {
			Amende a = amandeEntry.getValue();
			
			if(a.getImmatriculation().equals(immatriculation) && !a.isPayed()){
				amendesImmatriculation.add(a);
			}
		}
		
		Amende amendes[] =new Amende[amendesImmatriculation.size()];
		amendes = (Amende[]) amendesImmatriculation.toArray(amendes);
		return amendes;
	}

	@Override
	public void payer(int numero, String nom, String prenom) {
		Amende a = amendes.get(numero);
		
		if(a == null)
			System.out.println("\nL'amande n'éxiste pas");
		else {
			if(a.isPayed())
				System.out.println("\nL'amande a déjà été payée");
			else {
				
				Personne proprietaire = voitures.get(a.getImmatriculation())==null ? 
						null :voitures.get(a.getImmatriculation()).getProprietaire();
				
				if(proprietaire.getNom().equals(nom) && 
						proprietaire.getPrenom().equals(prenom))
				{
					a.setPayed(true);
					System.out.println("\nAmende payée");
					System.out.println(a);
				}
				else
					System.out.println("\nMauvais propriétaire");
			}
		}
		
	}

}
