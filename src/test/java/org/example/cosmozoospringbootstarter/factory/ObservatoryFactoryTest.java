package org.example.cosmozoospringbootstarter.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootTest(classes = ObservatoryFactory.class)
@TestPropertySource(properties = {
        "app.observatory.name=КекОбсерватория",
        "app.observatory.telescope-diameter=100",
        "app.observatory.automatic-mode=true"
})
class ObservatoryFactoryTest {

    @Autowired
    private ApplicationContext context;

    @ParameterizedTest
    @MethodSource("beanNames")
    void applicationContextContainsBean(String beanName) {
        Assertions.assertTrue(context.containsBean(beanName));
    }

    private static Stream<String> beanNames() {
        return Stream.of(
                "observatoryFactory",
                "app.observatory-org.example.cosmozoospringbootstarter.entity.observatory.ObservatoryProperties",
                "observatory"
        );
    }
}
