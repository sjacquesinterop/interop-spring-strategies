package ca.gc.samplestrategiesspring.service;

import org.springframework.stereotype.Service;

@Service
public class SampleStrategiesSpringService {

    public String sampleGet() {
        return "Hello from GET!";
    }

    public String samplePost() {
        return "Hello from POST!";
    }

    public String samplePut() {
        return "Hello from PUT!";
    }

    public void sampleDelete() {
    }
}
