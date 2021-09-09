package ca.gc.samplestrategiesspring.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleStrategiesSpringServiceTests {

    @Autowired
    SampleStrategiesSpringService sampleStrategiesSpringService;

//    @Test
//    public void getTest() {
//        Assertions.assertEquals("Hello from Spring GET",
//                sampleStrategiesSpringService.sampleGet());
//    }
//
//    @Test
//    public void postTest() {
//        Assertions.assertEquals("Hello from Spring POST",
//                sampleStrategiesSpringService.samplePost());
//    }
//
//    @Test
//    public void putTest() {
//        Assertions.assertEquals("Hello from Spring PUT",
//                sampleStrategiesSpringService.samplePut());
//    }

    @Test
    public void deleteTest() {
        sampleStrategiesSpringService.sampleDelete();
    }
}
