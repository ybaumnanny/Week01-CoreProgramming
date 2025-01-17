public class UnitConverterThird {

    // Fahrenheit to Celsius conversion
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Conversion formula: (Fahrenheit - 32) * 5/9
        double farhenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Celsius to Fahrenheit conversion
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Conversion formula: (Celsius * 9/5) + 32
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Pounds to Kilograms conversion
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor: 1 pound = 0.453592 kilograms
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Kilograms to Pounds conversion
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor: 1 kilogram = 2.20462 pounds
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Gallons to Liters conversion
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor: 1 gallon = 3.78541 liters
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Liters to Gallons conversion
    public static double convertLitersToGallons(double liters) {
        // Conversion factor: 1 liter = 0.264172 gallons
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Example usage:
        
        // Convert Fahrenheit to Celsius
        double fahrenheit = 98.6;
        System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        // Convert Celsius to Fahrenheit
        double celsius = 37;
        System.out.println(celsius + "°C is " + convertCelsiusToFahrenheit(celsius) + "°F.");

        // Convert pounds to kilograms
        double pounds = 150;
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Convert kilograms to pounds
        double kilograms = 68;
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Convert gallons to liters
        double gallons = 10;
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        // Convert liters to gallons
        double liters = 50;
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}
