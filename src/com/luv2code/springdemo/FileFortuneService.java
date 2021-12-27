package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{
    private final List<String> fileFortunes;
    private final Random rand = new Random();

    public FileFortuneService() {
        String fileName = "/Users/glenn/IdeaProjects/spring-demo-annotations/src/fortune-data.txt";
        File isFile = new File(fileName);
        System.out.println("Initialising File: " + isFile);
        System.out.println("File Found: " + isFile.exists());

        fileFortunes = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(isFile))) {
            String tempLine;
            while((tempLine = bufferedReader.readLine()) != null) {
                fileFortunes.add(tempLine);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = rand.nextInt((fileFortunes.size()));
        return fileFortunes.get(index);
    }
}
