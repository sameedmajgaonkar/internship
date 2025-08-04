import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n 5.Exit");
        while (true) {
            System.out.println("\n\n Select an option");
            String input = sc.next();
            if (input.equals("5")) break;
            System.out.println("Please enter a number");
            double a = sc.nextDouble();
            System.out.println("Please enter a number");
            double b = sc.nextDouble();
            switch (input) {
                case "1" -> System.out.println("Addition: = " + (a + b));
                case "2" -> System.out.println("Subtraction = " + (a - b));
                case "3" -> System.out.println("Multiplication = " + (a * b));
                case "4" -> System.out.println("Division = " + (a / b));
            }
        }

    }
}