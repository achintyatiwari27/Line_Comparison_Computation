package com.BridgeLabz;

import java.util.Scanner;

public class LineComparisonComputation {
    static int x1; static int x2; static int y1; static int y2;
    static int a1; static int a2; static int b1; static int b2;
    static double lengthOfLine1 = 0;
    static double lengthOfLine2 = 0;

private static void compareTo(double lengthOfLine1, double lengthOfLine2) {
    lengthOfLine1 = (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));
    lengthOfLine2 = (Math.sqrt(Math.pow((a2-a1),2))+Math.pow((b2-b1) ,2));
    if (lengthOfLine1 == lengthOfLine2) {
        System.out.println("Both the lines are equal");
    }else if (lengthOfLine1 > lengthOfLine2) {
        System.out.println("Length of Line 1 is greater than length of Line 2");
    }else {
        System.out.println("Length of line 2 is greater than length of Line 1");
    }
}
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for line 1");
        System.out.println("Enter x1");
        x1 = sc.nextInt();
        System.out.println("Enter y1");
        y1 = sc.nextInt();
        System.out.println("Enter x2");
        x2 = sc.nextInt();
        System.out.println("Enter y2");
        y2 = sc.nextInt();

        System.out.println("Enter the coordinates for line 2");
        System.out.println("Enter a1");
        a1 = sc.nextInt();
        System.out.println("Enter b1");
        b1 = sc.nextInt();
        System.out.println("Enter a2");
        a2 = sc.nextInt();
        System.out.println("Enter b2");
        b2 = sc.nextInt();

          compareTo(lengthOfLine1,lengthOfLine2);
    }
}


