public class Grade {
    private Subject subject;
    private double mark;

    public Grade(Subject subject, double mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getMark() {
        return mark;
    }

    public String getLetterGrade() {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    
}
