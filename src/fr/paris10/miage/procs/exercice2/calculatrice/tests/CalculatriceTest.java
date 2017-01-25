package fr.paris10.miage.procs.exercice2.calculatrice.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.exercice2.calculatrice.Calculatrice;

public class CalculatriceTest {

	   private Calculatrice calc;

	    @BeforeClass
	    public void setUp() throws Exception {
	    	URL url = new URL("http://localhost:9999/ws/calculatrice?wsdl");
	        QName qname = new QName("http://calculatrice.exercice2.procs.miage.paris10.fr/", "CalculatriceImplService");
	        Service service = Service.create(url, qname);
	        calc = service.getPort(Calculatrice.class);
	    }

	    @AfterClass
	    public void tearDown() throws Exception {
	        calc = null;
	    }

	    @Test
	    public void testAjouter() throws Exception {
	        assertEquals(calc.ajouter(2,3),5);
	    }

	    @Test
	    public void testSoustraire() throws Exception {
	        assertEquals(calc.soustraire(2,3),-1);
	    }
}
