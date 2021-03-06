
package fr.paris10.miage.procs.exercice5.epicerie;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EpicerieImplService", targetNamespace = "http://epicerie/", wsdlLocation = "file:/C:/Users/flori/OneDrive/Documents/M2-MIAGE/PROCS/WebServices/src/fr/paris10/miage/procs/exercice5/epicerie/wsdl/epicerie.wsdl")
public class EpicerieImplService
    extends Service
{

    private final static URL EPICERIEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EPICERIEIMPLSERVICE_EXCEPTION;
    private final static QName EPICERIEIMPLSERVICE_QNAME = new QName("http://epicerie/", "EpicerieImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/flori/OneDrive/Documents/M2-MIAGE/PROCS/WebServices/src/fr/paris10/miage/procs/exercice5/epicerie/wsdl/epicerie.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EPICERIEIMPLSERVICE_WSDL_LOCATION = url;
        EPICERIEIMPLSERVICE_EXCEPTION = e;
    }

    public EpicerieImplService() {
        super(__getWsdlLocation(), EPICERIEIMPLSERVICE_QNAME);
    }

    public EpicerieImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EPICERIEIMPLSERVICE_QNAME, features);
    }

    public EpicerieImplService(URL wsdlLocation) {
        super(wsdlLocation, EPICERIEIMPLSERVICE_QNAME);
    }

    public EpicerieImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EPICERIEIMPLSERVICE_QNAME, features);
    }

    public EpicerieImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EpicerieImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Epicerie
     */
    @WebEndpoint(name = "EpicerieImplPort")
    public Epicerie getEpicerieImplPort() {
        return super.getPort(new QName("http://epicerie/", "EpicerieImplPort"), Epicerie.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Epicerie
     */
    @WebEndpoint(name = "EpicerieImplPort")
    public Epicerie getEpicerieImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://epicerie/", "EpicerieImplPort"), Epicerie.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EPICERIEIMPLSERVICE_EXCEPTION!= null) {
            throw EPICERIEIMPLSERVICE_EXCEPTION;
        }
        return EPICERIEIMPLSERVICE_WSDL_LOCATION;
    }

}
