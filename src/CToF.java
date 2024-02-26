import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit;
        double celsius = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter the temperature in Fahrenheit: ");
            if (in.hasNextDouble()) {
                fahrenheit = in.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature in Fahrenheit.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        System.out.println("Temperature in Celsius: " + celsius);

        in.close();
    }
}
