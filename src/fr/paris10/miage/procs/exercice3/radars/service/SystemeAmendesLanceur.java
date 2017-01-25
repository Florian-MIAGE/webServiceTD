package fr.paris10.miage.procs.exercice3.radars.service;

import javax.xml.ws.Endpoint;

public class SystemeAmendesLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/saam", new SystemeAmendesImpl());
    }
}