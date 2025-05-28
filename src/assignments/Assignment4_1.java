package assignments;

import java.util.Arrays;
import java.util.List;

public class Assignment4_1 {

	public static void main(String[] args) {
		/* Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined.*/
		
		List<Double> cityAreas = Arrays.asList(8340.0, 6077.0, 5890.0, 5400.0, 5030.0);
		// 3rd city is index 2, 4th city is index 3
        double combinedArea = cityAreas.get(2) + cityAreas.get(3);
        System.out.println("Combined area of 3rd and 4th largest cities: " + combinedArea);

	}

}
