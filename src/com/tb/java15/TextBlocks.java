package com.tb.java15;

public class TextBlocks {
    public static void main(String[] args) {

        // Before Java 15
        String json = "{\n" +
                " \"name\":\"John\",\n" +
                " \"age\":30,\n" +
                " \"car\":null\n" +
                " }";

        // From Java 15
        String jsonData = """
                {
                 "name":"John",
                 "age":30,
                 "car":null
                 }
                """;
        System.out.println(jsonData);
    }
}
