package assignments;

public class Assignment3_Employees {
	//Storing Employees name in separate variables.
	String empName1 = "Bharath";
	String empName2 = "ABC";
	String empName3 = "XYZ";
	
	//Storing Employee IDs in separate variables.
	int empId1 = 1234;
	int empId2 = 1235;
	int empId3 = 1236;	

	public static void main(String[] args) {
		// Printing to check if it is working.
		
		Assignment3_Employees obj = new Assignment3_Employees();
		System.out.println(obj.empName1 + " "+ obj.empId1);
		System.out.println(obj.empName2 + " "+ obj.empId2);
		System.out.println(obj.empName3 + " "+ obj.empId3);
		
	}

}
