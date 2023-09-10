package com.yuriybishel.program;

import com.yuriybishel.repository.FrequentFlyerRepository;
import com.yuriybishel.util.Json2PojoGenerator;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        FrequentFlyerRepository x = new FrequentFlyerRepository("FrequentFlyerForum-Profiles.json");
        System.out.println(x);
    }
}