// Write a TemperatureConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
// Hint: (°C × 9/5) + 32 = °F

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double farenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + 
                " celsius is " + farenheitResult + " fahrenheit");

        sc.close();
    }
}