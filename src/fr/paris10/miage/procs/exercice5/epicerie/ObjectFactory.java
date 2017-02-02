
package fr.paris10.miage.procs.exercice5.epicerie;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the epicerie package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: epicerie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListeProduit }
     * 
     */
    public ListeProduit createListeProduit() {
        return new ListeProduit();
    }

    /**
     * Create an instance of {@link ListeStock }
     * 
     */
    public ListeStock createListeStock() {
        return new ListeStock();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link StockProduit }
     * 
     */
    public StockProduit createStockProduit() {
        return new StockProduit();
    }

}
