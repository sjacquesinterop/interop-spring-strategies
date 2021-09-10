package ca.gc.samplestrategiesspring.controller;

import ca.gc.samplestrategiesspring.service.SampleStrategiesSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The Sample strategies spring controller.
 */
@RestController
@RequestMapping("spring")
public class SampleStrategiesSpringController {

    @Autowired
    private SampleStrategiesSpringService sampleStrategiesSpringService;

    /**
     * Sample GET request.
     *
     * @return the GET response entity
     */
    @GetMapping("/")
    public ResponseEntity<String> sampleGet() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.sampleGet(),
                HttpStatus.OK
        );
    }

    /**
     * Sample POST request.
     *
     * @return the POST response entity
     */
    @PostMapping("/")
    public ResponseEntity<String> samplePost() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.samplePost(),
                HttpStatus.CREATED
        );
    }

    /**
     * Sample PUT request.
     *
     * @return the PUT response entity
     */
    @PutMapping("/")
    public ResponseEntity<String> samplePut() {
        return new ResponseEntity<>(
                sampleStrategiesSpringService.samplePut(),
                HttpStatus.OK
        );
    }

    /**
     * Sample DELETE request.
     *
     * @return the DELETE response entity
     */
    @DeleteMapping("/")
    public ResponseEntity<Void> sampleDelete() {
        sampleStrategiesSpringService.sampleDelete();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
