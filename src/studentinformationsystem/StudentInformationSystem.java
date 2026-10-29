package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // i. Display student name and student ID
        String studentName = "Nurin";
        String studentId = "S85456";
        
        System.out.println("=== Student Information System ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID  : " + studentId);
        
        // ii. Store two marks using variables
        double mark1 = 42.5;
        double mark2 = 45.0;
         double totalMark = mark1 + mark2;
        
        // iv. Display the total
        System.out.println("Total Mark  : " + totalMark + " / 100");
        
        // v. Display a message based on the total
        System.out.print("Result      : ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}