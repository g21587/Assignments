package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {

	public static void main(String[] args) {
		// ===== Table 1: Student Information =====
		
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
        
     // ===== Table 2: Employee Information =====
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Employee ID", "E001");
        employee1.put("Name", "Alice Green");
        employee1.put("Age", "Thirty");
        employee1.put("Gender", "Female");
        employee1.put("Department", "Engineering");
        employee1.put("Position", "Software Engineer");
        employee1.put("Salary", "75K Pounds");
        employee1.put("Email", "alice@example.com");
        employee1.put("PAN Number", "SDF6543210");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Employee ID", "E002");
        employee2.put("Name", "Bob Johnson");
        employee2.put("Age", "Thirty Five");
        employee2.put("Gender", "Male");
        employee2.put("Department", "Marketing");
        employee2.put("Position", "Marketing Manager");
        employee2.put("Salary", "85K Pounds");
        employee2.put("Email", "bob@example.com");
        employee2.put("PAN Number", "REW6543211");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("Employee ID", "E003");
        employee3.put("Name", "Carol White");
        employee3.put("Age", "Twenty Eight");
        employee3.put("Gender", "Female");
        employee3.put("Department", "Sales");
        employee3.put("Position", "Sales Executive");
        employee3.put("Salary", "65K Pounds");
        employee3.put("Email", "carol@example.com");
        employee3.put("PAN Number", "TYR6543212");

        // Sample print checks
        System.out.println("Student 1 Email: " + student1.get("Email"));
        System.out.println("Employee 2 Position: " + employee2.get("Position"));

     // ===== Table 3: Product Inventory =====

        Map<String, String> product1 = new HashMap<>();
        product1.put("Product ID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "12K Pounds");
        product1.put("Stock Quantity", "Not Available");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5 Stars");
        product1.put("Manufacturing Date", "Aug 2023");
        product1.put("Expiry Date", "Aug 2028");

        Map<String, String> product2 = new HashMap<>();
        product2.put("Product ID", "P002");
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "150K Pounds");
        product2.put("Stock Quantity", "Two");
        product2.put("Supplier", "Office Depot"); // Highlighted value
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4 Stars");
        product2.put("Manufacturing Date", "Sep 2024");
        product2.put("Expiry Date", "N/A");

        Map<String, String> product3 = new HashMap<>();
        product3.put("Product ID", "P003");
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "75 Pounds");
        product3.put("Stock Quantity", "Two Hundred");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2 Stars");
        product3.put("Manufacturing Date", "Jan 2025");
        product3.put("Expiry Date", "Jan 2027");

        // ===== Printing one value from each table =====
        System.out.println("Student 1 Email: " + student1.get("Email"));
        System.out.println("Employee 2 Position: " + employee2.get("Position"));
        System.out.println("Product 2 Supplier (highlighted): " + product2.get("Supplier"));
        
	}

}
