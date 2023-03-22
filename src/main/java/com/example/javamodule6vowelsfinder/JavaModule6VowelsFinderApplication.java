package com.example.javamodule6vowelsfinder;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JavaModule6VowelsFinderApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String vowels = findVowels(input);
        System.out.println("Vowels: " + vowels);
        }
    private static String findVowels(String input) {
        String vowels = "";
        for (char v : input.toCharArray()) {
            if (v == 'a' ||  v == 'A' || v == 'e'|| v == 'E' || v == 'i' || v == 'I' || v == 'o' || v == 'O' || v == 'u' || v == 'U') {
                vowels += v;
            }
        }
        return vowels;
    }
}
