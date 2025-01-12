/*Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___*/

import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter the name of the person traveling:");
        String name = sc.nextLine();

        System.out.println("Enter the city from which the person is traveling:");
        String fromCity = sc.nextLine();

        System.out.println("Enter the via city:");
        String viaCity = sc.nextLine();

        System.out.println("Enter the destination city:");
        String toCity = sc.nextLine();

        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles:");
        double distanceFromToVia = sc.nextDouble();

        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " in hours and minutes (HH MM):");
        int hoursFromToVia = sc.nextInt();
        int minutesFromToVia = sc.nextInt();
        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles:");
        double distanceViaToFinalCity = sc.nextDouble();

        System.out.println("Enter the time taken from " + viaCity + " to " + toCity + " in hours and minutes (HH MM):");
        int hoursViaToFinalCity = sc.nextInt();
        int minutesViaToFinalCity = sc.nextInt();
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;

        // Calculating total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Converting total time to hours and minutes
        int totalHours = totalTime / 60;
        int totalMinutes = totalTime % 60;

        System.out.println(name + " traveled from " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("The total distance traveled is " + totalDistance + " miles.");
        System.out.println("The total time taken is " + totalHours + " hours and " + totalMinutes + " minutes.");
    }
}
