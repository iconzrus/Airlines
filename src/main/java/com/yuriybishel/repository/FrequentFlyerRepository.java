package com.yuriybishel.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuriybishel.model.FrequentFlyer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FrequentFlyerRepository {
    FrequentFlyer frequentFlyer = new FrequentFlyer();

    private ObjectMapper objectMapper = new ObjectMapper();
    public FrequentFlyerRepository(String fileName) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            this.frequentFlyer = objectMapper.readValue(new File(fileName), FrequentFlyer.class);
        }
    }

    @Override
    public String toString() {
        return "FrequentFlyerRepository{" +
                "frequentFlyer=" + frequentFlyer +
                ", objectMapper=" + objectMapper +
                '}';
    }
}
