package Line_Comparison_Computation;

import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        
        int x1; int y1; int x2; int y2;
        int a1; int b1; int a2; int b2;
        double lengthOfLine1 = 0;
        double lengthOfLine2 = 0;

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
        System.out.println("Length of line " + lengthOfLine1);
        lengthOfLine1 = (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2));

        System.out.println("Enter the coordinates for line 2");
        System.out.println("Enter a1");
        a1 = sc.nextInt();
        System.out.println("Enter b1");
        b1 = sc.nextInt();
        System.out.println("Enter a2");
        a2 = sc.nextInt();
        System.out.println("Enter b2");
        b2 = sc.nextInt();
        System.out.println("Length of line " + lengthOfLine2);
        lengthOfLine2 = (Math.sqrt(Math.pow((a2-a1),2))+Math.pow((b2-b1) ,2));

        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("Both the lines are equal in length");
        }
        else {
            System.out.println("Both the lines are unequal in length");
        }
    }
}

