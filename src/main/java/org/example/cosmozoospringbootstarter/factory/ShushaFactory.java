package org.example.cosmozoospringbootstarter.factory;

import org.example.cosmozoospringbootstarter.entity.Shusha;
import org.example.cosmozoospringbootstarter.entity.plase.Park;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;

@AutoConfiguration("shushaFactory")
public class ShushaFactory {

    @Bean
    @ConditionalOnResource(resources = "classpath:notebook.txt")
    public Shusha shusha(){
        return new Shusha();
    }

    @Bean
    @ConditionalOnBean(name = "shusha")
    public Park park( Shusha shusha){
        return new Park(shusha);
    }
}
