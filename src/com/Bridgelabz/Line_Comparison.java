package com.Bridgelabz;

import java.util.Scanner;

public class Line_Comparison {
    public double calculateLength() {
        int x1, x2, y1, y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length);
        return length;
    }
    public void equalityOfLines() {

        double Length0f_line1;
        double Length0f_line2;
        System.out.println("Length of line 1 is");
        Length0f_line1 = calculateLength();
        System.out.println("Length of line 2 is");
        Length0f_line2 = calculateLength();

        if (Length0f_line1 == Length0f_line2) {
            System.out.println("Length are equal ");
        } else{
            System.out.println("Length are not equal");
        }
    }
}




