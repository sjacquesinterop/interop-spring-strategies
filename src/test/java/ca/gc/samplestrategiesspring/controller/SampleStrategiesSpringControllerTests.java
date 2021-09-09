package ca.gc.samplestrategiesspring.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleStrategiesSpringControllerTests {

    @Autowired
    SampleStrategiesSpringController sampleStrategiesSpringController;

    @Test
    public void putTest() {
        Assertions.assertEquals(1,1);
    }
}
