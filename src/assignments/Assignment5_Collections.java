package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {

	public static void main(String[] args) {
		// Student Details
		
		 // Student 1: John Doe
        Map<String, String> student1 = new HashMap<>();
        student1.put("Name", "John Doe");
        student1.put("Age", "Twenty");
        student1.put("Gender", "Male");
        student1.put("Roll Number", "SBA12345");
        student1.put("Grade", "A++");
        student1.put("Major", "Computer Science");
        student1.put("GPA", "3.8");
        student1.put("Email", "john@example.com");
        student1.put("PAN Number", "SDF6543210");
        student1.put("Address", "123 Elm St");

        // Student 2: Jane Smith
        Map<String, String> student2 = new HashMap<>();
        student2.put("Name", "Jane Smith");
        student2.put("Age", "Twenty One");
        student2.put("Gender", "Female");
        student2.put("Roll Number", "SBA12346");
        student2.put("Grade", "B+");
        student2.put("Major", "Mathematics");
        student2.put("GPA", "3.5");
        student2.put("Email", "jane@example.com");
        student2.put("PAN Number", "REW6543211");
        student2.put("Address", "456 Oak St");

        // Student 3: Mike Brown
        Map<String, String> student3 = new HashMap<>();
        student3.put("Name", "Mike Brown");
        student3.put("Age", "Twenty Two");
        student3.put("Gender", "Male");
        student3.put("Roll Number", "SBA12347");
        student3.put("Grade", "A+");
        student3.put("Major", "Physics");
        student3.put("GPA", "3.9");
        student3.put("Email", "mike@example.com");
        student3.put("PAN Number", "TYR6543212");
        student3.put("Address", "789 Pine St");

        // Create a list to store all student maps - I do not know why we did this. Need your input on this.
        List<Map<String, String>> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Just printing one value to check
        System.out.println("Student 2's GPA: " + students.get(1).get("GPA"));
        System.out.println("Student 3's Email: " + students.get(2).get("Email"));

	}

}
