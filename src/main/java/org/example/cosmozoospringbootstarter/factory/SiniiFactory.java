package org.example.cosmozoospringbootstarter.factory;

import org.example.cosmozoospringbootstarter.entity.Sinii;
import org.example.cosmozoospringbootstarter.entity.plase.Swamp;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration("siniiFactory")
public class SiniiFactory {

    @Bean
    @ConditionalOnExpression("${app.sun.is-shining} and '${app.weather}'.equals('clear')")
    public Sinii sinii() {
        return new Sinii();
    }

    @Bean
    @ConditionalOnBean(name="sinii")
    public Swamp swamp(Sinii sinii) {
        return new Swamp(sinii);
    }
}
