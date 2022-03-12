package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        BinarySearch search = new BinarySearch();
        int[] array = new int[] { 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };

        System.out.print(search.searchIndex(array, 7)); // expected: 2

//        String filePath = "D:\\Users\\filip.kowal\\Desktop\\helloThere.txt";
//
//        byte[] data = Files.readAllBytes(Paths.get(filePath));
//        String text = new String(data, StandardCharsets.UTF_8);
//        System.out.println(text);

//        File file = new File(filePath);
//
//        FileInputStream inputStream = new FileInputStream(file);
//        InputStreamReader fileReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//
//        char[] buffer = new char[1024];
//        int readBytes = fileReader.read(buffer, 0 ,1024);
//
//	    System.out.print(buffer);
    }
}