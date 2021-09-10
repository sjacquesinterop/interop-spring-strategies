package ca.gc.samplestrategiesspring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The Sample strategies spring controller tests.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class SampleStrategiesSpringControllerTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * GET test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getTest() throws Exception {
        mockMvc
                .perform(get("/spring/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello from Spring GET")));
    }

    /**
     * POST test.
     *
     * @throws Exception the exception
     */
    @Test
    public void postTest() throws Exception {
        mockMvc
                .perform(post("/spring/"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().string(containsString("Hello from Spring POST")));
    }

    /**
     * PUT test.
     *
     * @throws Exception the exception
     */
    @Test
    public void putTest() throws Exception {
        mockMvc
                .perform(put("/spring/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello from Spring PUT")));
    }

    /**
     * DELETE test.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteTest() throws Exception {
        mockMvc
                .perform(delete("/spring/"))
                .andDo(print())
                .andExpect(status().isNoContent());
    }
}
