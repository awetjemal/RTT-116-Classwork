package org.perscholas;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of the circle: ");
        double r = input.nextDouble();

        System.out.println("You entered a radius of " + r );

        System.out.print("Area of the circle: " + (r*r*3.14159));
    }
}
