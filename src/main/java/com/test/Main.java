package com.test;

public class Main {

    public static void main(String[] args) {

        String hello = "Hello!";

        int counter = 0;
        for (char ch: hello.toLowerCase().toCharArray()) {
            if (ch == 'o') {
                counter++;
            }
        }
        System.out.println("Count: " + counter);

    }
}
