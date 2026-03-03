// Write a TemperatureConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
// Hint: (°F − 32) x 5/9 = °C

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + 
                " fahrenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}