package assignments;

public class Assignment3_EmpGroup_Inherit extends Assignment3_Employees{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_EmpGroup_Inherit obj = new Assignment3_EmpGroup_Inherit();
		System.out.println(obj.empName1 + " "+ obj.empId1);
		System.out.println(obj.empName2 + " "+ obj.empId2);
		System.out.println(obj.empName3 + " "+ obj.empId3);
		
		//Creating Arrays.
		String [] empName = new String [3];
		int [] empId = new int[3];
		
//Adding values into Arrays from Assignment3_Employees		
		
		empName[0] = obj.empName1;
		empName[1] = obj.empName2;
		empName[2] = obj.empName3;
		
		empId[0] = obj.empId1;
		empId[1] = obj.empId2;
		empId[2] = obj.empId3;
		
//Printing Values as per assignment.
		
		System.out.println("Employee Name: " + empName[0] + ", Employee ID: " + empId[0]);
		System.out.println("Employee Name: " + empName[1] + ", Employee ID: " + empId[1]);
		System.out.println("Employee Name: " + empName[2] + ", Employee ID: " + empId[2]);

	}

}
