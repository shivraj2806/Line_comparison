package com.Bridgelabz;

public class Line_Comparison {

    static double Coordinates (int x1,int y1,int x2,int y2){
        double Length=Math.sqrt(Math.pow( x2 - x1, 2 )+ Math.pow( y2 - y1, 2 ));
        System.out.println("length of a line is " +Length);
        return (Length);
    }
    public static void main(String[] args) {
        Coordinates(4,5,6,5);

    }
}