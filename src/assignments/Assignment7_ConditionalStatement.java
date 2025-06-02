package assignments;

public class Assignment7_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Input data
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        System.out.println("Loan Evaluation for " + customerName);

        // Step 1: Check Credit Score
        if (creditScore > 750) {
            System.out.println("Loan Approved: Excellent credit score.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            // Step 2: Check income
            if (income >= 50000.0) {
                // Step 3: Check employment
                if (isEmployed) {
                    // Step 4: Check debt-to-income ratio
                    if (debtToIncomeRatio < 40.0) {
                        System.out.println("Loan Approved: Meets all criteria.");
                    } else {
                        System.out.println("Loan Denied: High debt-to-income ratio.");
                    }
                } else {
                    System.out.println("Loan Denied: Customer is unemployed.");
                }
            } else {
                System.out.println("Loan Denied: Income below required threshold.");
            }
        } else {
            System.out.println("Loan Denied: Poor credit score.");
        }

	}

}
