package fr.paris10.miage.procs.exercice2.calculatrice;

import javax.xml.ws.Endpoint;

public class CalculatriceLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/calculatrice", new CalculatriceImpl());
    }
}