
package Midterm;

import java.util.Scanner;


public class basic_calculator {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            boolean u = true;
            while (u){
                
        // Get user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        // Perform calculation
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            return;
        }

        // Output the result
        System.out.println("Result: " + result);
     }
    }
}
    

