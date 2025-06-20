package org.example.cosmozoospringbootstarter.entity;

import org.springframework.stereotype.Component;

@Component
public class Sinii implements Animal{
    @Override
    public void voice() {
        System.out.println("Буль");
    }
}
