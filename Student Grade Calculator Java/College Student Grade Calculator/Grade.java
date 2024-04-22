public class Grade {
    private Course course;
    private double gpa;

    public Grade(Course course, String grade) {
        this.course = course;
        switch (grade) {
            case "O":
                this.gpa = 10;
                break;
            case "A+":
                this.gpa = 9;
                break;
            case "A":
                this.gpa = 8;
                break;
            case "B+":
                this.gpa = 7;
                break;
            case "B":
                this.gpa = 6;
                break;
            case "C":
                this.gpa = 5;
                break;
            default:
                this.gpa= 0;
                break;
            
        }
    }

    public Course getCourse() {
        return course;
    }

    public double getGPA() {
        return gpa * course.getCredits();
    }

    
}
