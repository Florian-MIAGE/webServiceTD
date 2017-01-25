package fr.paris10.miage.procs.exercice1.helloclient;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.paris10.miage.procs.exercice1.hello.HelloWorld;

import java.net.URL;

public class HelloWorldClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/bonjour?wsdl");
        QName qname = new QName("http://hello.exercice1.procs.miage.paris10.fr/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.bonjour("Bob"));
    }
}