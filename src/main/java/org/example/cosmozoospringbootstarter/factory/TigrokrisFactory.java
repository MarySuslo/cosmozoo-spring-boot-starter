package org.example.cosmozoospringbootstarter.factory;

import org.example.cosmozoospringbootstarter.entity.plase.ClosedEnclosure;
import org.example.cosmozoospringbootstarter.entity.Tigrokris;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration("tigrokrisFactory")
public class TigrokrisFactory {

    @Bean
    @ConditionalOnProperty(
            value="app.tigrokris.create",
            havingValue="true",
           matchIfMissing = false
    )
    public Tigrokris tigrokris(){
        return new Tigrokris();
    }

    @Bean
    @ConditionalOnBean(name = "tigrokris")
    public ClosedEnclosure closedEnclosure( Tigrokris tigrokris){
        return new ClosedEnclosure(tigrokris);
    }

}
