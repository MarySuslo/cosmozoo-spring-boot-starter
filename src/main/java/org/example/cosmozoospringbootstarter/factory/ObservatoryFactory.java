package org.example.cosmozoospringbootstarter.factory;

import lombok.RequiredArgsConstructor;
import org.example.cosmozoospringbootstarter.entity.observatory.Observatory;
import org.example.cosmozoospringbootstarter.entity.observatory.ObservatoryProperties;
import org.example.cosmozoospringbootstarter.entity.observatory.PlanetariumProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration("observatoryFactory")
@EnableConfigurationProperties(ObservatoryProperties.class)
public class ObservatoryFactory {

    @Bean
    public Observatory observatory(ObservatoryProperties properties) {
        return new Observatory(properties);
    }
}
