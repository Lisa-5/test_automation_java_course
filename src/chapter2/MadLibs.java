package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        System.out.println("Enter an adjective: ");
        Scanner input = new Scanner(System.in);
        String adjective = input.next();

        System.out.println("Enter a season of the year: ");
        String seasonOfYear = input.next();

        System.out.println("Enter a whole number: ");
        int number = input.nextInt();
        input.close();

        System.out.println("On a " +adjective + " " + seasonOfYear + " day, " +
                "I drink a minimum of " + number + " cups of coffee.");
    }
}
