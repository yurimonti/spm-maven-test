package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static File createFile(String path, String filename, String extension) throws IOException {
        File myObj = new File(path + "/" + filename + "." + extension);
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        return myObj;
    }

    public static void writeToFile(File file,String content) throws IOException {
        FileWriter myWriter = new FileWriter(file.getAbsolutePath());
        myWriter.write(content);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
}
