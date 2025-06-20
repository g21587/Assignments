package assignments;

public class Assignment13_Prime {

	public static void main(String[] args) {
        int n1 = 7;
        int n2 = 25;
        int n3 = 1;

        System.out.println(n1 + " is prime? " + isPrime(n1));  // true
        System.out.println(n2 + " is prime? " + isPrime(n2));  // false
        System.out.println(n3 + " is prime? " + isPrime(n3));  // false
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // 1 and below are not prime
        }

        // Loop from 2 to square root of n (optimized)
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;  // If divisible by any number other than 1 and itself
            }
        }

        return true;  // If no divisor found, it's prime
    }
}
