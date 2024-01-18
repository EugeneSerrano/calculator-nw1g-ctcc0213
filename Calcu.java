import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        // Get the user's name
        System.out.print("Name: ");
        String name = scanner.nextLine();

        do {

            // Display choices for selecting operation
            System.out.println("Choose  operation:");
            System.out.println("1. Arithmetic ");
            System.out.println("2. Scientific ");
            System.out.print("Enter 1 or 2 , or enter 3 to quit: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("3")) {
                // Exit the loop and end program
                break;
            }

            if (!choice.matches("[12]")) {
                System.out.println("Invalid input. Please enter 1 or 2 or 3 to quit.");
                continue;
            }

            switch (choice) {
                case "1":
                    // Arithmetic Operation
                    boolean arithmeticInvalid = true;
                    while (arithmeticInvalid) {
                        System.out.print("Enter an operator (+, -, *, /): ");
                        String operator = scanner.nextLine();

                        System.out.print("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        scanner.nextLine();

                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                arithmeticInvalid = false;
                                break;
                            case "-":
                                result = num1 - num2;
                                arithmeticInvalid = false;
                                break;
                            case "*":
                                result = num1 * num2;
                                arithmeticInvalid = false;
                                break;
                            case "/":
                                if (num2 != 0) {
                                    result = num1 / num2;
                                    arithmeticInvalid = false;
                                } else {
                                    // Division by zero it will print error
                                    System.out.println("Error: Division by zero is not allowed.");
                                }
                                break;
                            default:
                                // Invalid operator for Arithmetic Operation
                                System.out.println("Invalid operator. Try again.");
                                break;
                        }
                    }

                    // Display the output of Arithmetic Operation
                    System.out.println("Result: " + result);
                    break;

                case "2":
                    // Scientific Operation
                    boolean scientificInvalid = true;
                    while (scientificInvalid) {

                        System.out.println("Scientific operations:");
                        System.out.println("1. Sin");
                        System.out.println("2. Cos");
                        System.out.println("3. Tan");
                        System.out.println("4. Log");
                        System.out.println("5. √ ");
                        System.out.print("Enter your choice (1-5): ");
                        int scientificC = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter a number: ");
                        double num = scanner.nextDouble();
                        scanner.nextLine();

                        switch (scientificC) {
                            case 1:
                                result = Math.sin(num);
                                scientificInvalid = false;
                                break;
                            case 2:
                                result = Math.cos(num);
                                scientificInvalid = false;
                                break;
                            case 3:
                                result = Math.tan(num);
                                scientificInvalid = false;
                                break;
                            case 4:
                                if (num > 0) {
                                    result = Math.log(num);
                                    scientificInvalid = false;
                                } else {
                                    System.out.println(
                                            "Error: Natural logarithm (ln) is only defined for positive numbers.");
                                }
                                break;
                            case 5:
                                if (num >= 0) {
                                    result = Math.sqrt(num);
                                    scientificInvalid = false;
                                } else {
                                    System.out.println("Error: Square root of negative number is not a real number.");
                                }
                                break;

                            default:
                                // Invalid Choice for scientific operation
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    }

                    // Display the output of Scientific Operation
                    System.out.println("Result: " + result);
                    break;

                default:

                    System.out.println("Invalid choice. Try again.");
                    break;
            }

            // Ask the user if they want to perform another calculation
            System.out.println("\n******************************");
            System.out.println("Enter 1 if want to solve more, any other character to end: ");
            System.out.print("User: ");
            char rep = scanner.next().charAt(0);
            scanner.nextLine();

            if (rep != '1') {

                // If the user enters anything other than 1, it will exit the loop
                break;
            }

        } while (true);

        // Closed Scanner
        scanner.close();

        // Display a message
        System.out.println(name + " Thank you for using Calculator ^.^ .");

    }
}