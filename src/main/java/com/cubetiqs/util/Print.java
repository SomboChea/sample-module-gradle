package com.cubetiqs.util;

/**
 * Print Message
 *
 * @author sombochea
 * @since 1.0
 */
public class Print {
    public static final String ID = "PRINT";

    public static void print(String message) {
        System.out.println(ID + " : " + message);
    }
}

class Main {
    public static void main(String[] args) {
        Print.print("Hello");
    }
}