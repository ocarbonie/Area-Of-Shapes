package com.company;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

    //Declare variables
    Scanner input = new Scanner(System.in);
    double radius;
    double base;
    double height;
    double length;
    double width;
    double side;

    //Ask user input
    System.out.print("Enter the radius of the circle: ");
    radius =input.nextDouble();

    System.out.print("Enter the base then height of the triangle: ");
    base = input.nextDouble();
    height = input.nextDouble();

    System.out.print("Enter the length then width of the rectangle: ");
    length = input.nextDouble();
    width = input.nextDouble();

    System.out.print("Enter the side of each square: ");
    side = input.nextDouble();

    //Create output
        System.out.println("\nThe area of the circle is " + AreaCircle(radius));
        System.out.println("The area of the triangle is " + AreaTriangle(base, height));
        System.out.println("The area of the rectangle is " + AreaRectangle(length,width));
        System.out.println("The area of the square is " + AreaSquare(side));


}

    public static double AreaCircle(double r){
        return (PI * r * r );
    }

    public static double AreaTriangle(double h, double w){
        return(0.5 * h * w);
    }

    public static double AreaRectangle(double l, double w){
        return( l * w);
    }
    public static double AreaSquare(double a){
        return(a*a);
    }
}
