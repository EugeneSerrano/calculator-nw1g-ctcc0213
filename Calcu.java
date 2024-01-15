import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
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

            switch (choice) {
                case "1":
                    // Arithmetic Operation
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
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                // Division by zero it will print error
                                System.out.println("Error: Division by zero is not allowed.");
                                return;
                            }
                            break;
                        default:
                            // Invalid operator for Arithmetic Operation
                            System.out.println("Uso mag basa Pre 2024 na");
                            return;
                    }

                    // Display the output of Arithmetic Operation
                    System.out.println("Result: " + result);
                    break;

                case "2":
                    // Scientific Operation
                    System.out.println("Scientific operations:");
                    System.out.println("1. Sin");
                    System.out.println("2. Cos");
                    System.out.println("3. Tan");
                    System.out.println("4. Log");
                    System.out.print("Enter your choice (1-4): ");
                    int scientificC = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    scanner.nextLine();

                    switch (scientificC) {
                        case 1:
                            result = Math.sin(num);
                            break;
                        case 2:
                            result = Math.cos(num);
                            break;
                        case 3:
                            result = Math.tan(num);
                            break;
                        case 4:
                            result = Math.log(num);
                            break;

                        default:
                            // Invalid Choice for scientific operation
                            System.out.println("Invalid choice.Try again.");
                            return;
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

        // Display a message
        System.out.println(name + " Thank you for using Calculator ^.^ .");
    }
}
