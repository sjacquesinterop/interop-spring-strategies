package ca.gc.samplestrategiesspring.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * The Sample strategies spring service tests.
 */
@SpringBootTest
public class SampleStrategiesSpringServiceTests {

    @Autowired
    private SampleStrategiesSpringService sampleStrategiesSpringService;

    /**
     * GET test.
     */
    @Test
    public void getTest() {
        Assertions.assertEquals("Hello from Spring GET",
                sampleStrategiesSpringService.sampleGet());
    }

    /**
     * POST test.
     */
    @Test
    public void postTest() {
        Assertions.assertEquals("Hello from Spring POST",
                sampleStrategiesSpringService.samplePost());
    }

    /**
     * PUT test.
     */
    @Test
    public void putTest() {
        Assertions.assertEquals("Hello from Spring PUT",
                sampleStrategiesSpringService.samplePut());
    }

    /**
     * DELETE test.
     */
    @Test
    public void deleteTest() {
        sampleStrategiesSpringService.sampleDelete();
    }
}
