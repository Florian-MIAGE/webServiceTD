package fr.paris10.miage.procs.exercice4.radars.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.exercice4.radars.service.Amende;
import fr.paris10.miage.procs.exercice4.radars.service.AmendeArray;
import fr.paris10.miage.procs.exercice4.radars.service.Personne;
import fr.paris10.miage.procs.exercice4.radars.service.Voiture;
import fr.paris10.miage.procs.exercice4.radars.service.SystemeAmendes;

public class AmendeClient {
	private static void listingAmendes(SystemeAmendes sysAmendes, String immatriculation){
		System.out.println("\nListing des amendes pour "+immatriculation);
        
		AmendeArray amendes = sysAmendes.lister(immatriculation);
		
        for(Amende a : amendes.getItem())
        	System.out.println(a);
	}

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/saam?wsdl");
        QName qname = new QName("http://service.radars.exercice3.procs.miage.paris10.fr/", "SystemeAmendesImplService");
        Service service = Service.create(url, qname);
        SystemeAmendes sysAmendes = service.getPort(SystemeAmendes.class);
        
        Personne bob = new Personne(), hadock = new Personne(); 
        
        bob.setNom("Sponge");
        bob.setPrenom("Bob");
        bob.setAdresse("Ananas Carré");
        
        hadock.setNom("Captain");
        hadock.setPrenom("Hadock");
        hadock.setAdresse("Tintin Land");
        
        
        Voiture clio3 = new Voiture();
        clio3.setImmatriculation("AB 123 CD");
        clio3.setModele("clio3");
        clio3.setProprietaire(bob);
        
        sysAmendes.enregistrer(clio3);
        
        Voiture punto = new Voiture();
        punto.setImmatriculation("AB 124 CD");
        punto.setModele("punto");
        
        clio3.setProprietaire(hadock);
        
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
