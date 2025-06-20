package org.example.cosmozoospringbootstarter.entity.observatory;

public class Observatory {

    public Observatory(ObservatoryProperties properties) {
        System.out.println("ObservatoryProperties: " + properties);
    }

    public void observe(ObservatoryProperties properties) {
        System.out.println("Обсерватория: " + properties.getName());
    }
}
