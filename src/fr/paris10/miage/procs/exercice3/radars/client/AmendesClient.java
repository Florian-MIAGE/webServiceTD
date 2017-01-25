package fr.paris10.miage.procs.exercice3.radars.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.exercice3.radars.model.Amende;
import fr.paris10.miage.procs.exercice3.radars.model.Personne;
import fr.paris10.miage.procs.exercice3.radars.model.Voiture;
import fr.paris10.miage.procs.exercice3.radars.service.SystemeAmendes;

import java.net.URL;
import java.util.List;

public class AmendesClient {
	
	private static void listingAmendes(SystemeAmendes sysAmendes, String immatriculation){
		System.out.println("\nListing des amendes pour "+immatriculation);
        
		List<Amende> amendes = sysAmendes.lister(immatriculation);
        
		System.out.println("size :"+amendes.size());
		
        for(Amende a :amendes)
        	System.out.println(a);
	}

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/saam?wsdl");
        QName qname = new QName("http://service.radars.exercice3.procs.miage.paris10.fr/", "SystemeAmendesImplService");
        Service service = Service.create(url, qname);
        SystemeAmendes sysAmendes = service.getPort(SystemeAmendes.class);
        
        Voiture clio3 = new Voiture("AB 123 CD", "clio3");
        clio3.setProprietaire(new Personne("Sponge","Bob","Ananas Carré"));
        
        sysAmendes.enregistrer(clio3);
        
        Voiture punto = new Voiture("AB 124 CD", "punto");
        clio3.setProprietaire(new Personne("Captain","Hadock","Tintin Land"));
        
        sysAmendes.enregistrer(punto);
        
        System.out.println("Amande n° :"+
        		sysAmendes.signaler("AB 123 CD", "clio3", 90)+" enregistrée");
        System.out.println("Amande n° :"+
        		sysAmendes.signaler("AB 123 CD", "tracteur", 90)+" enregistrée");
        System.out.println("Amande n° :"+
        		sysAmendes.signaler("AB 123 CD", "clio3", 140)+" enregistrée");
        
        listingAmendes(sysAmendes,"AB 123 CD");
        
        sysAmendes.payer(1, "Captain", "Hadock");
        
        listingAmendes(sysAmendes,"AB 123 CD");
        
        sysAmendes.payer(1, "Sponge", "Bob");
        
        listingAmendes(sysAmendes,"AB 123 CD");
    }
}