package org.example.cosmozoospringbootstarter.entity.observatory;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "app.planetarium")
@Data
public class PlanetariumProperties {

    /**
     * Название планетария.
     */
    private String name;

    /**
     * Количество аудиторий.
     */
    private Integer numberOfAuditoriums;

    /**
     * Список программ.
     */
    private List<String> programmes;
}
