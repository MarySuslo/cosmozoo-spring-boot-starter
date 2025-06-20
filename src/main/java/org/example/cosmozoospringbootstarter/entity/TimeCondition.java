package org.example.cosmozoospringbootstarter.entity;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDateTime;

public class TimeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String start = context.getEnvironment().getProperty("app.cleaning.start");
        String end = context.getEnvironment().getProperty("app.cleaning.end");

        int currentHour = LocalDateTime.now().getHour();
        return Integer.parseInt(start) <= currentHour && currentHour <= Integer.parseInt(end);
    }
}
