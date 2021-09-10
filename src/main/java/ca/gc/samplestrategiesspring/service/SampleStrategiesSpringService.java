package ca.gc.samplestrategiesspring.service;

import org.springframework.stereotype.Service;

/**
 * The type Sample strategies spring service.
 */
@Service
public class SampleStrategiesSpringService {

    /**
     * Sample get.
     *
     * @return the GET string
     */
    public String sampleGet() {
        return "Hello from Spring GET";
    }

    /**
     * Sample post.
     *
     * @return the POST string
     */
    public String samplePost() {
        return "Hello from Spring POST";
    }

    /**
     * Sample put.
     *
     * @return the PUT string
     */
    public String samplePut() {
        return "Hello from Spring PUT";
    }

    /**
     * Sample delete.
     */
    public void sampleDelete() {
    }
}
