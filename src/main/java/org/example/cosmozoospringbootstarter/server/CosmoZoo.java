package org.example.cosmozoospringbootstarter.server;

import jakarta.annotation.PostConstruct;
import org.example.cosmozoospringbootstarter.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@ConditionalOnMissingBean(CosmoZooLegacy.class)
public class CosmoZoo {

    @Autowired(required = false)
    private List<Animal> animals;

    @PostConstruct
    private void greeting() {
        System.out.println("Добро пожаловать в CosmoZoo!");
        animals.forEach(Animal::voice);
    }
}
