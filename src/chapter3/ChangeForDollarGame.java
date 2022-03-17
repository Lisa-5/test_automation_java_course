package chapter3;

import java.util.Scanner;

public class ChangeForDollarGame {

    public static void main(String[] args) {

        //Ask how many pennies, nickels, dimes, quarter user would like.
        System.out.println("The objective is to enter enough " +
                "change to equal exactly $1");

        System.out.println("How many pennies would you like? ");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like? ");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like? ");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like? ");
        int quarters = scanner.nextInt();
        scanner.close();

        // calculate the value of the coins
        double total = (pennies) + (nickels * 5) + (dimes * 10) + (quarters * 25);
        String message = null;

        if(total == 100) {
            message = "  Yay! That is exactly $1. You win!";
        }
        else if(total > 100){
            double over = total - 100;
            message = "  You went over a $1 by " + over + "cents.";
        } else if(total < 100){
            double under = 100 - total;
            message = "  You were under $1 by " + under + "cents.";
        }

        //Notify the user if they win, or how much they went over or under
        System.out.println("The total of "+ pennies + " pennies, " + nickels +
                " nickels, " + dimes + " dimes, " + quarters + " quarters is "
                + total + message);
    }
}
