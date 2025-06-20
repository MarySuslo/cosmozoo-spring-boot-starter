package org.example.cosmozoospringbootstarter.factory;

import org.example.cosmozoospringbootstarter.entity.Napoleon;
import org.example.cosmozoospringbootstarter.entity.plase.Lawn;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

@AutoConfiguration("NapoleonFactory")
public class NapoleonFactory {

    @Bean
    @DependsOn("Garden")
    public Napoleon napoleon() {
        System.out.println("Napoleon created");
        return new Napoleon();
    }

    @Bean
    public Lawn.Garden garden() {
        System.out.println("Garden created");
        return new Lawn.Garden();
    }

    @Bean
    public Lawn lawn(Napoleon napoleon) {
        System.out.println("Lawn created");
        return new Lawn(napoleon);
    }
}
