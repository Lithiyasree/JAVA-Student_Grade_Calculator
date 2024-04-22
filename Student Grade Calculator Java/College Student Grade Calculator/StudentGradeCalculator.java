import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String courseName = scanner.next();

            System.out.print("Enter credits: ");
            int credits = scanner.nextInt();
            
            Course course = new Course(courseName, credits);

            System.out.print("Enter grade: ");
            String grade = scanner.next();

            Grade gradeObject = new Grade(course, grade);
            student.addGrade(gradeObject);
        }


        //GPA 
        
        double gpa = student.calculateGPA();
        System.out.println("GPA: " + gpa);
        student.displayGrades();


        //CGPA


        System.out.print("Do you want to calculate CGPA? (yes/no): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter number of semesters: ");
            int numSemesters = scanner.nextInt();

            double totalCGPA = 0;

            for (int i = 0; i < numSemesters; i++) {
                System.out.print("Enter GPA for semester " + (i + 1) + ": ");
                double gpaForSemester = scanner.nextDouble();
                totalCGPA += gpaForSemester;
            }

            double cgpa = totalCGPA / numSemesters;
            System.out.println("CGPA: " + cgpa);

            scanner.close();
        }
    }
}
