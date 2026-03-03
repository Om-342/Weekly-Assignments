// Write a program that takes the base and height in cm to find the area 
// of a triangle in square inches and square centimeters
// Hint: Area of a Triangle is 1/2 * base * height and 1 in = 2.54 cm

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " 
                + areaInches + " and sq cm is " + areaCm);

        sc.close();
    }
}
