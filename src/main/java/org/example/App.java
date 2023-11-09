package org.example;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Person fornari = new Person("Fabrizio","Fornari");
        String jsonString = new GsonObjectManager<Person>().toJson(fornari);
        try {
            File toWrite = FileManager.createFile("./","prova","txt");
            FileManager.writeToFile(toWrite,jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
