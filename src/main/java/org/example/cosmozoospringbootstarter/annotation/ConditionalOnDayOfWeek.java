package org.example.cosmozoospringbootstarter.annotation;

import org.example.cosmozoospringbootstarter.entity.DayOfWeekCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(DayOfWeekCondition.class)
public @interface ConditionalOnDayOfWeek {
}
