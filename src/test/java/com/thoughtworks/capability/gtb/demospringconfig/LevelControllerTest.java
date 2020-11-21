package com.thoughtworks.capability.gtb.demospringconfig;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class LevelControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldGetLevel() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(jsonPath("$", is("basic")));
    }

}