package chapter3;

import java.util.Scanner;

public class GradeMessageSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder.";
            case "F" -> "Uh, oh!";
            default -> "Error. invalid grade.";
        };

        System.out.println(message);
    }
}
