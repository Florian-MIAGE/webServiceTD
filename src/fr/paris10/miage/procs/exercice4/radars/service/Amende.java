
package fr.paris10.miage.procs.exercice4.radars.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour amende complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="amende">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="immatriculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tarif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amende", propOrder = {
    "immatriculation",
    "numero",
    "payed",
    "tarif"
})
public class Amende {

    protected String immatriculation;
    protected int numero;
    protected boolean payed;
    protected int tarif;

    /**
     * Obtient la valeur de la propri�t� immatriculation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * D�finit la valeur de la propri�t� immatriculation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmatriculation(String value) {
        this.immatriculation = value;
    }

    /**
     * Obtient la valeur de la propri�t� numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * D�finit la valeur de la propri�t� numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propri�t� payed.
     * 
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     * D�finit la valeur de la propri�t� payed.
     * 
     */
    public void setPayed(boolean value) {
        this.payed = value;
    }

    /**
     * Obtient la valeur de la propri�t� tarif.
     * 
     */
    public int getTarif() {
        return tarif;
    }

    /**
     * D�finit la valeur de la propri�t� tarif.
     * 
     */
    public void setTarif(int value) {
        this.tarif = value;
    }

}
