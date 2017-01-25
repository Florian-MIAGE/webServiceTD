package fr.paris10.miage.procs.exercice1.hello;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}