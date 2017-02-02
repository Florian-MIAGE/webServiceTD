
package fr.paris10.miage.procs.exercice4.radars.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.paris10.miage.procs.exercice3.radars.service package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.paris10.miage.procs.exercice3.radars.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Voiture }
     * 
     */
    public Voiture createVoiture() {
        return new Voiture();
    }

    /**
     * Create an instance of {@link Amende }
     * 
     */
    public Amende createAmende() {
        return new Amende();
    }

    /**
     * Create an instance of {@link AmendeArray }
     * 
     */
    public AmendeArray createAmendeArray() {
        return new AmendeArray();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

}
