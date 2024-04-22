import java.util.ArrayList;
class Student {
    private String name;
    private ArrayList<Grade> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getMark();
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
}
