package fr.paris10.miage.procs.exercice3.radars.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import fr.paris10.miage.procs.exercice3.radars.model.Amende;
import fr.paris10.miage.procs.exercice3.radars.model.Voiture;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SystemeAmendes {
    @WebMethod void enregistrer (Voiture v);
    @WebMethod int signaler (String immatriculation, String modele, int tarif);
    @WebMethod Amende[] lister(String immatriculation);
    @WebMethod void payer (int numero, String nom, String prenom);
}