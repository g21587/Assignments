package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		
		// Step 1: Original student names and marks
        String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
        int[] originalMarks = {75, 80, 82};

        // Step 2: Create new array for updated marks
        int[] updatedMarks = new int[3];

        // Step 3: Add 10 marks using assignment operator
        updatedMarks[0] = originalMarks[0] += 10;
        updatedMarks[1] = originalMarks[1] += 10;
        updatedMarks[2] = originalMarks[2] += 10;

        // Step 4: Calculate average
        double average = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / 3.0;

        // Step 5: Print results
        System.out.println("Updated Marks:");
        System.out.println(studentNames[0] + ": " + updatedMarks[0]);
        System.out.println(studentNames[1] + ": " + updatedMarks[1]);
        System.out.println(studentNames[2] + ": " + updatedMarks[2]);
        System.out.println("Average Marks: " + average);

	}

}
