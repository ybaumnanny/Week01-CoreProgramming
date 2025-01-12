/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Area of Triangle is ___*/

import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is " + area);
    }
}
