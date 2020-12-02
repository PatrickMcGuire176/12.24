package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        LinkedHashMap<Integer, String> facultyNumbers = new LinkedHashMap<>();
        facultyNumbers.put(0, "Assistant");
        facultyNumbers.put(1, "Associate");
        facultyNumbers.put(2, "Full");

        java.io.File file = new File("HelloWorld.txt");

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, false))) {
            while (counter < 5) {
                printWriter.print("Patrick" + counter + " ");
                printWriter.print("McGuire" + counter + " ");
                int seed = ThreadLocalRandom.current().nextInt(0, 3);
                printWriter.print(facultyNumbers.get(seed) + " ");

                switch (seed) {
                    case 0:
                        printWriter.print(ThreadLocalRandom.current().nextInt(50000, 80000 + 1));
                        break;
                    case 1:
                        printWriter.print(ThreadLocalRandom.current().nextInt(60000, 110000 + 1));
                        break;
                    case 2:
                        printWriter.print(ThreadLocalRandom.current().nextInt(75000, 130000 + 1));
                        break;
                }
                printWriter.println();
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
