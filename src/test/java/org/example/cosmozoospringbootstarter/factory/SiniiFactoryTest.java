package org.example.cosmozoospringbootstarter.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootTest(classes = SiniiFactory.class)
public class SiniiFactoryTest {

    @Autowired
    private ApplicationContext context;

    @ParameterizedTest
    @MethodSource("beanNames")
    void applicationContextConyainBeans(String beanName){
        Assertions.assertTrue(context.containsBean(beanName));
    }

    private static Stream<String> beanNames() {
        return Stream.of(
                "siniiFactory",
                "sinii",
                "swamp"
        );
    }
}
