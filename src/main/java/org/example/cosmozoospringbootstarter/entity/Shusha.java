package org.example.cosmozoospringbootstarter.entity;

import org.springframework.stereotype.Component;

@Component
public class Shusha implements Animal {

    @Override
    public void voice() {
        System.out.println("Привет! Как дела?");
    }
}
