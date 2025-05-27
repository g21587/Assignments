package assignments;

public class Assignment2_MultiArray {

	public static void main(String[] args) {
		
		// 3D Array: [semester][subject][0 = subject name, 1 = status/marks]
        String[][][] academicData = {
            {   // Semester 1
                {"Mathematics I", "Pass(78)"},
                {"Physics", "Pass(85)"},
                {"Chemistry", "Fail(21)"},
                {"Computer Programming", "Pass(74)"},
                {"Engineering Drawing", "Pass(88)"},
                {"Basic Electrical Eng.", "Pass(79)"}
            },
            {   // Semester 2
                {"Mathematics II", "Pass(82)"},
                {"Mechanics", "Pass(77)"},
                {"Environmental Sci.", "Pass(93)"},
                {"Basic Electronics", "Fail(19)"},
                {"Engineering Physics", "Fail(24)"},
                {"Engineering Graphics", "Pass(90)"}
            },
            {   // Semester 3
                {"Data Structures", "Pass(88)"},
                {"Discrete Mathematics", "Pass(81)"},
                {"Digital Electronics", "Pass(76)"},
                {"Operating Systems", "Fail(32)"},
                {"Signals and Systems", "Pass(85)"},
                {"Object-Oriented Prog.", "Pass(78)"}
            },
            {   // Semester 4
                {"Algorithms", "Pass(91)"},
                {"Computer Networks", "Pass(73)"},
                {"Database Systems", "Fail(19)"},
                {"Microprocessors", "Pass(80)"},
                {"Communication Eng.", "Pass(76)"},
                {"Software Engineering", "Pass(87)"}
            },
            {   // Semester 5
                {"Probability & Stats", "Pass(86)"},
                {"Machine Learning", "Pass(88)"},
                {"Compiler Design", "Pass(84)"},
                {"Theory of Computation", "Pass(95)"},
                {"Embedded Systems", "Pass(73)"},
                {"Computer Graphics", "Pass(90)"}
            }
        };

        // Print Semester 2 Subject 4 and 5 names
        System.out.println("Semester 2, Subject 4: " + academicData[1][3][0]); // Basic Electronics
        System.out.println("Semester 2, Subject 5: " + academicData[1][4][0]); // Engineering Physics

        // Print Status/Marks of Semester 4 Subject 3 and Subject 6
        System.out.println("Semester 4, Subject 3 Status: " + academicData[3][2][1]); // Fail(19)
        System.out.println("Semester 4, Subject 6 Status: " + academicData[3][5][1]); // Pass(87)
    }

	}

