package company;

import java.util.Scanner;

public class Company {

    public static void main(String[] args) {
        double itemValue[] = {239.99, 129.75, 99.95, 350.89};
        for (int i = 0; i < 4; i++) {
            System.out.println("Item " + (i + 1) + " Value : " + "$" + itemValue[i]);
        }
        Scanner input = new Scanner(System.in);
        int[] numberOfItemSold = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Number of items sold from item " + (i + 1) + " : ");
            numberOfItemSold[i] = input.nextInt();
        }
        double totalValueSold = 0;
        for (int i = 0; i < 4; i++) {
            totalValueSold += numberOfItemSold[i] * itemValue[i];
        }
        double finalSalary = (9.0 / 100 * totalValueSold) + 200;
        System.out.println("Final Salary Is : $" + finalSalary);
    }

}
