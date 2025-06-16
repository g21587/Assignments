package assignments;

public class Assignment10_Loops {
	public static void main(String[] args) {
        int[] numbers = {12, 34, 11, 36, 87, 98, 93};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Using regular for loop to find top 3 largest numbers
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Second largest number: " + second);
        System.out.println("Third largest number: " + third);
    }


}
