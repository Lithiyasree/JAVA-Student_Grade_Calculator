import java.util.Scanner;
//import java.util.ArrayList;

public class GradeCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        System.out.print("\nEnter number of subjects: ");
        int numSubjects = scanner.nextInt();

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            String subjectName = scanner.next();

            System.out.print("Enter mark (0-100): ");
            double mark = scanner.nextDouble();
            System.out.print("\n");
            Subject subject = new Subject(subjectName);
            Grade gradeObject = new Grade(subject, mark);
            student.addGrade(gradeObject);
        }

        System.out.println("Total: " + getTotal(student));
        System.out.println("Average: " + student.calculateAverage());

        System.out.println("Grades:");
        for (Grade gradeObject2 : student.getGrades()) {
            System.out.println(gradeObject2.getSubject().getName() + ": " + gradeObject2.getMark() + " (" + gradeObject2.getLetterGrade() + ")");
        }
        scanner.close();
    }

    private static double getTotal(Student student) {
        double total = 0;
        for (Grade grade : student.getGrades()) {
            total += grade.getMark();
        }
        return total;


    }
}
