package assignments;

public class Assignment4_3 {

	public static void main(String[] args) {
		/* Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		6th Value. */
		
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 5th value = index 4, 6th = index 5
        double average = (numbers[4] + numbers[5]) / 2.0;
        System.out.println("Average of 5th and 6th values: " + average);

	}

}
