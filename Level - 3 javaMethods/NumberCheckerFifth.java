/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself

*/
public class NumberCheckerFifth {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2];
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static int productOfCubesOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to find the factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;

        int[] factors = NumberCheckerFifth.findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + NumberCheckerFifth.greatestFactor(factors));
        System.out.println("Sum of factors: " + NumberCheckerFifth.sumOfFactors(factors));
        System.out.println("Product of factors: " + NumberCheckerFifth.productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + NumberCheckerFifth.productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + NumberCheckerFifth.isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + NumberCheckerFifth.isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + NumberCheckerFifth.isDeficientNumber(number));
        System.out.println("Is Strong Number: " + NumberCheckerFifth.isStrongNumber(number));
    }
}
