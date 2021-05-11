package ca.gc.samplestrategiesspring.service;

import org.springframework.stereotype.Service;

@Service
public class SampleStrategiesSpringService {

    public String sampleGet() {
        return "Hello from Spring GET";
    }

    public String samplePost() {
        return "Hello from Spring POST";
    }

    public String samplePut() {
        return "Hello from Spring PUT";
    }

    public void sampleDelete() {
    }
}
