public class UnitConverterSecond {

    // Yards to Feet conversion
    public static double convertYardsToFeet(double yards) {
        // Conversion factor: 1 yard = 3 feet
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Feet to Yards conversion
    public static double convertFeetToYards(double feet) {
        // Conversion factor: 1 foot = 0.333333 yards
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Meters to Inches conversion
    public static double convertMetersToInches(double meters) {
        // Conversion factor: 1 meter = 39.3701 inches
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Inches to Meters conversion
    public static double convertInchesToMeters(double inches) {
        // Conversion factor: 1 inch = 0.0254 meters
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Inches to Centimeters conversion
    public static double convertInchesToCm(double inches) {
        // Conversion factor: 1 inch = 2.54 centimeters
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Example usage:
        
        // Convert yards to feet
        double yards = 5;
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        // Convert feet to yards
        double feet = 15;
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        // Convert meters to inches
        double meters = 10;
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        // Convert inches to meters
        double inches = 20;
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        // Convert inches to centimeters
        System.out.println(inches + " inches is " + convertInchesToCm(inches) + " centimeters.");
    }
}
