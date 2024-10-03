package org.perscholas;

public class Lesson_303_2 {
    public static void main(String[] args) {
        System.out.println("This is line 1");
        System.out.println("This is line 2");
        System.out.println("if we want to have \"quote\" in the print");
        System.out.println("to print special UTF characters: " + (char)(Integer.parseInt("c3b8", 16)));
        System.out.println("to print special UTF characters: " + (char)(Integer.parseInt("c3b9", 16)));
    }
}
