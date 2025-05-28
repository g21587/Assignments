package assignments;

import java.util.Arrays;
import java.util.List;

public class Assignment4_4 {

	public static void main(String[] args) {
		/* Create a list of the top 5 highest-grossing movies of all time and print out the third
		movie on the list. */
		  List<String> movies = Arrays.asList(
		            "Avatar",
		            "Avengers: Endgame",
		            "Titanic",
		            "Star Wars: The Force Awakens",
		            "Avengers: Infinity War"
		        );

		        // 3rd movie = index 2
		        System.out.println("3rd highest-grossing movie: " + movies.get(2));
		

	}

}
