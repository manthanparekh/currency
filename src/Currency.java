// TODO: import Scanner and Randomizer
import java.util.Scanner;
import java.util.Random;

// TODO: create a currency class
public class Currency {

    // TODO: create a method to convert dollar value to yen
    public static double dollarToYen(double value) {
        return value *= 147.43;
    }

    // TODO: create a method to convert dollar to dirham
    public static double dollarToDirham(double value) {
        return value *= 3.67;
    }

    public static void main(String[] args) {
        // TODO: create objects for Scanner and Random class
        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();

        // TODO: ask for user input using data type as Double
        System.out.println("Enter a number: ");
        double userInput = scan.nextDouble();

        // TODO: generate a random number from 0 to 4999.99...
        double randomDecimal = randomNumber.nextDouble(5000.00);
        System.out.println("The random decimal value: " + randomDecimal);

        // TODO: print out the convertions
        System.out.println("dollar to yen: " + dollarToYen(userInput));
        System.out.println("dollar to dirham: " + dollarToDirham(randomDecimal));
    }
}
