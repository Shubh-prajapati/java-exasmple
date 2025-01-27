package coffee.LogicDevelopment;

import java.util.Scanner;

public class RangePrimeNumber {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the range from the user
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = scanner.nextInt();

            System.out.print("Enter the upper bound of the range: ");
            int upperBound = scanner.nextInt();

            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            scanner.close();
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // Numbers <= 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Divisible by a number other than 1 and itself
                }
            }
            return true; // Prime number
        }

}
