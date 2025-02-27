package week3.Student;

public class CGCourse extends Course{
    private String location;

    public CGCourse (String courseName, String department, int coursenum, int credithours, String location) {
        super(courseName, department, coursenum, credithours);
        this.location = location;
    }

    public String toString() {
        return super.toString() + "CG Course in " + location;
    }
}
