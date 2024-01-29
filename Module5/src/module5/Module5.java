package module5;

import java.util.ArrayList;
import java.util.Scanner;

public class Module5 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the day of the week (Monday through Sunday): ");
            String day = scanner.nextLine();
            days.add(day);

            System.out.print("Enter the average temperature for " + day + ": ");
            double temperature = scanner.nextDouble();
            temperatures.add(temperature);

           
            scanner.nextLine();
        }

        
        System.out.println("\nTemperature for each day:");
        for (int i = 0; i < 7; i++) {
            System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
        }

        
        double weeklyAverage = calculateWeeklyAverage(temperatures);
        System.out.println("\nWeekly average temperature: " + weeklyAverage + " degrees");

        scanner.close();
    }

    
    private static double calculateWeeklyAverage(ArrayList<Double> temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.size();
    }
}