package org.example.cosmozoospringbootstarter.factory;

import lombok.RequiredArgsConstructor;
import org.example.cosmozoospringbootstarter.entity.observatory.Planetarium;
import org.example.cosmozoospringbootstarter.entity.observatory.PlanetariumProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration("planetariumFactory")
@RequiredArgsConstructor
public class PlanetariumFactory {

    @Bean
    public PlanetariumProperties planetariumProperties() {
        return new PlanetariumProperties();
    }

    @Bean
    public Planetarium planetarium(PlanetariumProperties properties) {
        return new Planetarium(properties);
    }
}
