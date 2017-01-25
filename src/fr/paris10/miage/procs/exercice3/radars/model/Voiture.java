package fr.paris10.miage.procs.exercice3.radars.model;

import java.io.Serializable;

public class Voiture implements Serializable {

	private static final long serialVersionUID = 7410038862654797213L;
	private String immatriculation;
    private String modele;
    private Personne proprietaire;

    public Voiture() { super(); }

    public Voiture(String immatriculation, String modele) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.proprietaire = null;
    }
    public void setProprietaire(Personne p) { this.proprietaire = p; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
    public void setModele(String modele) { this.modele = modele; }

    public String getImmatriculation() { return immatriculation; }
    public String getModele() { return modele; }
    public Personne getProprietaire() { return proprietaire; }

    @Override
    public String toString() {
        String rtr = modele + " " + immatriculation;
        if(proprietaire != null) {
            rtr += "\n" + "poss�d�e par " + proprietaire;
        }
        else {
            rtr += "\n" + "pas de propri�taire connu";
        }
        return rtr;
    }
}