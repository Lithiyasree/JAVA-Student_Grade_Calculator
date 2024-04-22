import java.util.ArrayList;

class Student {
    String name;
    private ArrayList<Grade> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        double totalGPA = 0;
        double totalCredits = 0;
        for (Grade grade : grades) {
            totalGPA += grade.getGPA();
            totalCredits += grade.getCourse().getCredits();
        }
        return totalGPA / totalCredits;
    }

    public void displayGrades() {
        for (Grade grade : grades) {
            System.out.println(grade.getCourse().getName() + ": " + grade.getGPA());
        }
    }
}
