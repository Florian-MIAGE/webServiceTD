package fr.paris10.miage.procs.exercice3.radars.model;

import java.io.Serializable;

public class Amende implements Serializable {

	private static final long serialVersionUID = 2601728297891610844L;
	private static int numero_ = 0;
    private int numero;
    private String immatriculation;
    private int tarif;
    private boolean isPayed;

	public Amende() { super(); }

    public Amende(String immatriculation, int tarif) {
        numero_++;
        numero = numero_;
        this.immatriculation = immatriculation;
        this.tarif = tarif;
        this.isPayed = false;
    }
    
    public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}

    public int getNumero() {
        return numero;
    }
    public String getImmatriculation() {
        return immatriculation;
    }
    public int getTarif() { return tarif; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
    public void setTarif(int tarif) { this.tarif = tarif; }

    @Override
    public String toString() {
        return String.format("Amende n°%d de %d EUR pour %s",numero,tarif,immatriculation);
    }
}