package ca.gc.samplestrategiesspring.controller;

import ca.gc.samplestrategiesspring.service.SampleStrategiesSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleStrategiesSpringController {

    @Autowired
    SampleStrategiesSpringService sampleStrategiesSpringService;

    @GetMapping("/")
    public ResponseEntity<String> sampleGet() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.sampleGet(),
                HttpStatus.OK
        );
    }

    @PostMapping("/")
    public ResponseEntity<String> samplePost() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.samplePost(),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/")
    public ResponseEntity<String> samplePut() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.samplePut(),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/")
    public ResponseEntity<Void> sampleDelete() {
        sampleStrategiesSpringService.sampleDelete();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
