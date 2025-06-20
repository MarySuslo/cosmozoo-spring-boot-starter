package org.example.cosmozoospringbootstarter.factory;

import org.example.cosmozoospringbootstarter.annotation.ConditionalOnDayOfWeek;
import org.example.cosmozoospringbootstarter.entity.Cleaner;
import org.example.cosmozoospringbootstarter.entity.Magician;
import org.example.cosmozoospringbootstarter.entity.TimeCondition;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@AutoConfiguration("robotFactory")
public class RobotFactory {

    @Bean
    @Conditional(TimeCondition.class)
    public Cleaner cleaningRobot() {
        return new Cleaner();
    }

    @Bean
    @ConditionalOnDayOfWeek
    public Magician magician() {
        return new Magician();
    }
}
