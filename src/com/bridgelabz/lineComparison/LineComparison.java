package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComparison {
    public static int x1,x2,y1,y2;
    public static void main(String[] args) {
        CalculateLength cal = new CalculateLength();
        getInput();
        cal.calLength();
    }
    public static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
    }
}
class CalculateLength{
    public void calLength() {
        double length = Math.sqrt((LineComparison.x2 - LineComparison.x1) * (LineComparison.x2 - LineComparison.x1) + (LineComparison.y2 - LineComparison.y1) * (LineComparison.y2 - LineComparison.y1));
        System.out.println("Length of line = "+length);
    }
}