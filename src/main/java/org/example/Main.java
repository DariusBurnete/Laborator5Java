package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Map<String, Integer> counts = new HashMap<>();

        try{
            File file = new File("prop.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String word = scanner.next().toLowerCase();
                if(!word.isEmpty()){
                    counts.put(word, counts.getOrDefault(word,0) + 1);
                }
                System.out.println(word + " " + counts);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
            return;
        }
    }
}