package timecompute;

import java.util.Scanner;

public class TimeCompute {

    public static void main(String[] args) {
        System.out.println("Enter amount of seconds");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int amountOfSeconds = seconds;
        int days, hours, minutes;
        days = seconds / (24 * 60 * 60);
        seconds -= (days * (24 * 60 * 60));
        hours = seconds / (60 * 60);
        seconds -= (hours * (60 * 60));
        minutes = seconds / 60;
        seconds -= minutes * 60;
        System.out.println(amountOfSeconds + " seconds are " + days + " days and " + hours + " hours and " + minutes + " minutes and" + seconds + " seconds.");
    }

}
