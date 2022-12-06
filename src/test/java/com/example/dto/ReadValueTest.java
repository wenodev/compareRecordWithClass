package com.example.dto;

import com.example.dto.bts.Album;
import com.example.dto.bts.KpopGroup;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class ReadValueTest {
    @Test
    void recordTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/be.json");
        Album album;
        try {
            album = objectMapper.readValue(file, Album.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(album);
    }

    @Test
    void classTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new ParameterNamesModule());
        File file = new File("src/main/resources/bts.json");
        KpopGroup bts;
        try {
            bts = objectMapper.readValue(file, KpopGroup.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bts);
    }
}
