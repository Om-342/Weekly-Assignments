// Write a program to find the side of the square whose perimeter you read from the user
// Hint: Perimeter of the Square is 4 times the side

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        sc.close(); 
    }
}
