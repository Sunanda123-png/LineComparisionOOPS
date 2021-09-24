package com.sunanda;
import java.util.Scanner;


public class LineComparision {
    public void calculation(){
        double length;
        Scanner ln = new Scanner(System.in);
        System.out.println("Enter the value of coordinates");
        System.out.println("Enter the value of x1= ");
        int x1 = ln.nextInt();
        System.out.println("Enter the value of x2= ");
        int x2 = ln.nextInt();
        System.out.println("Enter the value of y1= ");
        int y1 = ln.nextInt();
        System.out.println("Enter the value of y2= ");
        int y2 = ln.nextInt();


        length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line is = " + length);

    }
}
class Comparision{
    public static void main(String[] args)
    {
        LineComparision lComparision= new LineComparision();
        lComparision.calculation();
    }
}