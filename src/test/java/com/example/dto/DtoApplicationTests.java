package com.example.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DtoApplicationTests {

    @Test
    void contextLoads() {
        ObjectMapper objectMapper = new ObjectMapper();
    }

}
