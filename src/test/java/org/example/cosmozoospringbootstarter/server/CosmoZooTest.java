package org.example.cosmozoospringbootstarter.server;

import org.example.cosmozoospringbootstarter.CosmozooSpringBootStarterApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootTest(classes = CosmozooSpringBootStarterApplication.class)
class CosmoZooTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void printAllBeanNames() {
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }
    }

    @ParameterizedTest
    @MethodSource("beanNames")
    void applicationContextContainsBean(String beanName, boolean expected) {
        Assertions.assertEquals(expected, context.containsBean(beanName));
    }

    private static Stream<Arguments> beanNames() {
        return Stream.of(
                Arguments.of("cosmoZoo", true),
                Arguments.of("cosmoZooLegacy", false)
        );
    }

}
