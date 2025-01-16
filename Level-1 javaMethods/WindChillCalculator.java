import java.util.Scanner;

public class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
//main method created
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();
//object created and called for the the method
        WindChillCalculator obj = new WindChillCalculator();
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill);

        scanner.close();
    }
}
