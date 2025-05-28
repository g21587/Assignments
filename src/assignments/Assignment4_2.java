package assignments;

import java.util.HashSet;
import java.util.Set;

public class Assignment4_2 {

	public static void main(String[] args) {
		/* Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.*/
		
		Set<String> attractions = new HashSet<>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Statue of Liberty");
        attractions.add("Taj Mahal");
        attractions.add("Machu Picchu");
        attractions.add("Christ the Redeemer");
        attractions.add("Colosseum");
        attractions.add("Niagara Falls");
        attractions.add("Louvre Museum");
        attractions.add("Burj Khalifa");

        // Print individually
        System.out.println("Top Tourist Attractions:");
        System.out.println(attractions.toString());

        // Print size
        System.out.println("Total attractions: " + attractions.size());

	}

}
