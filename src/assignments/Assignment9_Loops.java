package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_Loops {

	public static void main(String[] args) {
		
		// Employee Data: Name, Base Salary, Experience, Rating
        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
        double[] baseSalaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
        double[] experiences = {5.1, 3.2, 7.1, 10.2, 2.4};
        double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

        // Output Map: Name -> Hike %
        Map<String, Double> hikeMap = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            double variablePayPercent;
            double bonus;

            // Determine variable pay and bonus based on rating
            if (ratings[i] >= 4.0) {
                variablePayPercent = 15.0;
                bonus = 1500;
            } else if (ratings[i] >= 3.0) {
                variablePayPercent = 10.0;
                bonus = 1200;
            } else {
                variablePayPercent = 3.0;
                bonus = 300;
            }

            // Base hike amount (variable pay % of salary)
            double baseHike = (baseSalaries[i] * variablePayPercent) / 100.0;

            // Extra reward if experience >= 5 years
            double reward = (experiences[i] >= 5.0) ? 5000 : 0;

            // Total hike value
            double totalHike = baseHike + bonus + reward;

            // Hike % of base salary
            double hikePercent = (totalHike / baseSalaries[i]) * 100;

            // Store result in map
            hikeMap.put(names[i], hikePercent);
        }

        // Print result
        System.out.println("Employee Hike Percentages:");
        for (Map.Entry<String, Double> entry : hikeMap.entrySet()) {
            System.out.printf("%-15s : %.2f%%\n", entry.getKey(), entry.getValue());
        }
    }

	}

