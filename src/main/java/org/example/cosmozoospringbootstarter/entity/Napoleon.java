package org.example.cosmozoospringbootstarter.entity;

import org.springframework.stereotype.Component;

@Component
public class Napoleon implements Animal {

    @Override
    public void voice() {
        System.out.println("Требую капусты!");
    }
}
