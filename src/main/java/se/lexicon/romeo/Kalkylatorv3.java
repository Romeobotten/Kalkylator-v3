package se.lexicon.romeo;

import java.util.Scanner;

public class Kalkylatorv3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String input;

        while (true) {
            // The menu part might be better as a method?
            printmenu();

            input = reader.nextLine();  // Reading everything in one string
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thank you and goodbye!");
                break; // Program ends if input is q
            }
            String[] threeParts = input.split(" ");    // Splitting the input string, could be more than three parts!
            // Checking if it is not an array here.
            if (threeParts.length == 3 &&
                    (threeParts[1].equals("+") || threeParts[1].equals("-") || threeParts[1].equals("*") || threeParts[1].equals("/"))) {
                double firstNr = Double.parseDouble(threeParts[0]); // First part of the array
                char operator = threeParts[1].charAt(0);            // Second part, the operator
                double secondNr = Double.parseDouble(threeParts[2]);// the second number
                double result;

                switch (operator) {
                    case '*':
                        result = multiplication(firstNr, secondNr);
                        break;

                    case '/':

                        if (secondNr == 0) {
                            System.out.println("Thou shall not divide by zero!");
                            return; // Program ends if you divide by zero.
                        } else
                            result = division(firstNr, secondNr);
                        break;

                    case '+':
                        result = addition(firstNr, secondNr);
                        break;

                    case '-': // subtraction method
                        result = subtraction(firstNr, secondNr);
                        break;

                    // operator is not one of the case constants (*, /, +, -)
                    default:
                        System.out.println("Error! this operator is not valid. Quitting.");
                        return; // Program ends if you put something else here.
                }

            System.out.println(firstNr + " " + operator + " " + secondNr + " = " + result);
            }
            else { // This is an array
                double result;
                double[] numbersArray = new double[threeParts.length-1];
                char operator = threeParts[threeParts.length - 1].charAt(0);
                // System.out.println("operator: " + operator);
                
                for (int i = 0; i < threeParts.length - 1; i++) {
                    numbersArray[i] = Double.parseDouble(threeParts[i]);
                }
                switch (operator) {
                    case '*':
                        result = multiplication(numbersArray);
                        break;

                    case '+':
                        result = addition(numbersArray);
                        break;

                    case '-': // subtraction method
                        result = subtraction(numbersArray);
                        break;

                    // operator is not one of the case constants (*, +, -)
                    default:
                        System.out.println("Error! this operator is not valid. Quitting.");
                        return; // Program ends if you put something else here.
                }
                System.out.print(numbersArray[0]);
                for (int i = 1; i < numbersArray.length ; i++) {
                    System.out.print(" " + operator + " " + numbersArray[i]);
                }
                System.out.println(" = " + result);
            }
            }
    }

    public static double multiplication(double firstNr, double secondNr) {
        return (firstNr * secondNr);
    }
    public static double multiplication(double[] multiplicationArray) {
        double result = multiplicationArray[0];
        for (int i = 1; i < multiplicationArray.length; i++) {
            result = result * multiplicationArray[i];
        }
        return (result);
    }

    public static double division(double firstNr, double secondNr) {
        return (firstNr / secondNr);
    }

    public static double addition(double firstNr, double secondNr) {
        return (firstNr + secondNr);
    }
    public static double addition(double[] additionArray) {
        double result = additionArray[0];
        for (int i = 1; i < additionArray.length; i++) {
            result = result + additionArray[i];
        }
        return (result);
    }

    public static double subtraction(double firstNr, double secondNr) {
        return (firstNr - secondNr);
    }
    public static double subtraction(double[] subtractionArray) {
        double result = subtractionArray[0];
        for (int i = 1; i < subtractionArray.length; i++) {
            result = result - subtractionArray[i];
        }
        return (result);
    }

    public static void printmenu() {
        // The menu part might be better as a method?
        System.out.print("Enter a mathematic operation (+, -, *, /) in this form: ");
        System.out.println("number, space, operator, space, number");
        System.out.println("Example: (7.5 * 4) or (55.25 + 42.5)");
        System.out.println("Or enter an array of numbers with space between, and end with the operator: (not /)");
        System.out.println("Example: (4 5 6 7 *) or (13.5 2.5 4 6 -)");
        System.out.println("Enter q to quit!");
        return;
    }
}
