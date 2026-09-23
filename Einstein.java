/**
 * @author Abdul
 * @version 1.0.0
 * @since 2026-09-15
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculates energy from mass using E = mc^2.
 */
public final class Einstein {

    /**
     * For utility class.
     */
    private Einstein() {
    }

    /**
     * Runs the program.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        // Speed of light constant in m/s
        final double speedOfLight = 2.998e8;

        Scanner scanner = new Scanner(System.in);

        // Prompts user for mass
        System.out.print("Enter mass of object in kilograms: ");

        try {
            // Converts input to double
            double mass = scanner.nextDouble();

            // Checks if mass is positive or zero
            if (mass >= 0) {
                // Formula to calculate energy
                double energy = mass * Math.pow(speedOfLight, 2);

                // Formats energy output to scientific notation with 3 decimal places
                String formattedEnergy = String.format("%.3e", energy);

                // Displays result
                System.out.println("The energy released from this object is: " + formattedEnergy + " J");
            } else {
                // Displayed if mass is negative
                System.out.println("Please enter a positive or 0 integer.");
            }
        } catch (InputMismatchException e) {
            // Catches non numeric input
            System.out.println("Please enter a valid number.");
        } finally {
            // Closes scanner
            scanner.close();
        }
    }
}