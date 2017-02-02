
package fr.paris10.miage.procs.exercice5.epicerie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StockProduit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StockProduit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produit" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockProduit", propOrder = {
    "produit",
    "quantite"
})
public class StockProduit {

    @XmlElement(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object produit;
    protected int quantite;

    /**
     * Obtient la valeur de la propriété produit.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProduit() {
        return produit;
    }

    /**
     * Définit la valeur de la propriété produit.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProduit(Object value) {
        this.produit = value;
    }

    /**
     * Obtient la valeur de la propriété quantite.
     * 
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Définit la valeur de la propriété quantite.
     * 
     */
    public void setQuantite(int value) {
        this.quantite = value;
    }

}
