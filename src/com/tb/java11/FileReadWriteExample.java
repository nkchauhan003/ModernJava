package com.tb.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Since Java 11
public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/exampleFile.txt");
        String fileData = Files.readString(path);
        System.out.println(fileData);

        /*Output
        This is line 1
        This is line 2
        This is line 3
        This is line 4
         */

        //Path path = Paths.get("./resources/exampleFile.txt");
        String fileContent = "{\n" +
                " \"name\":\"John\",\n" +
                " \"age\":30,\n" +
                " \"car\":null\n" +
                " }";
        Files.writeString(path, fileContent);
    }
}
