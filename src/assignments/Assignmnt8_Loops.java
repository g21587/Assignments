package assignments;

import java.util.ArrayList;

public class Assignmnt8_Loops {

	public static void main(String[] args) {
		
		// Step 1: Store all the transactions
        ArrayList<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        // Variables to store results
        int creditCount = 0;
        int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;
        int suspiciousCount = 0;

        // Loop through all transactions
        for (int amount : transactions) {
            if (amount > 0) {
                creditCount++;
                totalCredit += amount;
                if (amount > 10000) {
                    System.out.println("Suspicious credit transaction with amount: " + amount);
                    suspiciousCount++;
                }
            } else {
                debitCount++;
                totalDebit += amount;  // totalDebit will be negative
                if (amount < -10000) {
                    System.out.println("Suspicious debit transaction with amount: " + amount);
                    suspiciousCount++;
                }
            }
        }
	}
}


        
