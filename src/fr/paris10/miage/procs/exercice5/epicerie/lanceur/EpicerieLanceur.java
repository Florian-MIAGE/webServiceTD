package fr.paris10.miage.procs.exercice5.epicerie.lanceur;

import javax.xml.ws.Endpoint;

import fr.paris10.miage.procs.exercice5.epicerie.EpicerieImpl;

public class EpicerieLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/epicerie", new EpicerieImpl());
    }
}
