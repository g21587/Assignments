package assignments;

public class Assignment2_MultiArray {

	public static void main(String[] args) {
		// First 1D array for which we know all the values.
		//Array 1
		String[] Semester = {"Sem1","Sem2", "Sem3", "Sem4", "Sem5"};
		System.out.println(Semester [1]);
		
		
		// Initiating Array first and then adding values to it. 
		//Array 2 
		String[] Subject = new String[30];
		Subject [0] = "Mathematics I";
		Subject [1] = "Physics";
		Subject [2] = "Chemistry";
		Subject [3] = "Computer Programming";
		Subject [4] = "Engineering Drawing";
		Subject [5] = "Basic Electrical Eng.";
		Subject [6] = "Mathematics II";
		Subject [7] = "Mechanics";
		Subject [8] = "Environmental Sci.";
		Subject [9] = "Basic Electronics";
		Subject [10] = "Engineering Physics";
		Subject [11] = "Engineering Graphics";
		Subject [12] = "Data Structures";
		Subject [13] = "Des Mathematics";
		Subject [14] = "Digital Electronics";
		Subject [15] = "Operating Systems";
		Subject [16] = "Signals and Systems";
		Subject [17] = "Object-Oriented Prog.";
		Subject [18] = "Algorithms";
		Subject [19] = "Computer Networks";
		Subject [20] = "Database Systems";
		Subject [21] = "Microprocessors";
		Subject [22] = "Communication Eng.";
		Subject [23] = "Software Engineering";
		Subject [24] = "Probability";
		Subject [25] = "Machine Learning";
		Subject [26] = "Compiler Design";
		Subject [27] = "Theory of Computation";
		Subject [28] = "Embedded Systems";
		Subject [29] = "Computer Graphics";
		
		
		//Array 3
		String[] StatusMarks = new String[30];
		StatusMarks [0] = "Pass(78)";
		StatusMarks [1] = "Pass(85)";
		StatusMarks [2] = "Fail(21)";
		StatusMarks [3] = "Pass(74)";
		StatusMarks [4] = "Pass(88)";
		StatusMarks [5] = "Pass(79)";
		StatusMarks [6] = "Pass(82)";
		StatusMarks [7] = "Pass(77)";
		StatusMarks [8] = "Pass(93)";
		StatusMarks [9] = "Fail(19)";
		StatusMarks [10] = "Fail(24)";
		StatusMarks [11] = "Pass(90)";
		StatusMarks [12] = "Pass(88)";
		StatusMarks [13] = "Pass(81)";
		StatusMarks [14] = "Pass(76)";
		StatusMarks [15] = "Fail(32)";
		StatusMarks [16] = "Pass(85)";
		StatusMarks [17] = "Pass(78)";
		StatusMarks [18] = "Pass(91)";
		StatusMarks [19] = "Pass(73)";
		StatusMarks [20] = "Fail(19)";
		StatusMarks [21] = "Pass(80)";
		StatusMarks [22] = "Pass(76)";
		StatusMarks [23] = "Pass(87)";
		StatusMarks [24] = "Pass(86)";
		StatusMarks [25] = "Pass(88)";
		StatusMarks [26] = "Pass(84)";
		StatusMarks [27] = "Pass(95)";
		StatusMarks [28] = "Pass(73)";
		StatusMarks [29] = "Pass(90)";
		
		//Combining Arrays
		
		String [][]StudentData = {Subject, StatusMarks};
		System.out.println(StudentData[3][3]);
		
		//

	}

}
