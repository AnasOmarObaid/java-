package homework;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        final double CONSTANT = 9 / 5;
        double f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Tempreture Value (Celsius): ");
        double c = input.nextDouble();
        f = CONSTANT * c + 32;
        System.out.println(c + " Celsius equals " + f + " Fahrenheit.");
    }
}
