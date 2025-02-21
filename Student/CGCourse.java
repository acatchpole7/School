package week3.Student;

public class CGCourse extends Course{
    private String location;

    public CGCourse (String department, String coursenum, String credithours, String location) {
        super(department, coursenum, credithours);
        this.location = location;
    }

    public String toString() {
        return super.toString() + "CG Course in " + location;
    }
}
