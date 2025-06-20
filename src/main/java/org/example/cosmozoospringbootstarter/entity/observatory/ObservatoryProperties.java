package org.example.cosmozoospringbootstarter.entity.observatory;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.observatory")
@Data
public class ObservatoryProperties {

    /**
     * Название обсерватории.
     */
    String name;

    /**
     * Диаметр основного телескопа.
     */
    Integer telescopeDiameter;

    /**
     * Автоматический режим ИИ.
     */
    Boolean automaticMode;
}
