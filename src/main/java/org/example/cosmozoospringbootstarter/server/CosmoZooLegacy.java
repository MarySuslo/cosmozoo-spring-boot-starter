package org.example.cosmozoospringbootstarter.server;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;

import static org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range.OLDER_THAN;
import static org.springframework.boot.system.JavaVersion.EIGHTEEN;

@ConditionalOnJava(value = EIGHTEEN, range = OLDER_THAN)
public class CosmoZooLegacy {

    @PostConstruct
    private void greeting() {
        System.out.println("Старая версия CosmoZoo");
    }
}
