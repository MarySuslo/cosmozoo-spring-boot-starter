package org.example.cosmozoospringbootstarter.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;

@SpringBootTest(classes = TigrokrisFactory.class)
public class TigrokrisFactoryTest {

    @Autowired
    private ApplicationContext context;

    @ParameterizedTest
    @MethodSource("beanNames")
    void applicationContextContainsBean(String beanName, boolean expected) {
        Assertions.assertEquals(expected, context.containsBean(beanName));
    }

    private static Stream<Arguments> beanNames() {
        return Stream.of(
                Arguments.of("tigrokrisFactory", true),
                Arguments.of("tigrokris", false),
                Arguments.of("closedEnclosure", false)
        );
    }
}
