package week3.Student;
import java.util.*;

public class Student {
    private String name;
    private int IDnum;
    private static int nextID;
    private ArrayList<Course> courses;
    private Major major;

    public Student(String name, int IDnum, Major major) {
        this.name = name;
        this.IDnum = IDnum;
        this.courses = new ArrayList<>();
        this.major = major;
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("This course is already in the list.");
        }
        else {
            courses.add(course);
            System.out.println("Course added successfully.");
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course removed successfully.");
        }
        else {
            System.out.println("This course is not in the list.");
        }
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public static double getAverageScore(Map<Student, Map<Course, Double>> gradebook, Student student) {
        if (!gradebook.containsKey(student)) {
            System.out.println(student + " is not in the gradebook.");
            return -1.0;
        }

        Map<Course, Double> studentScores = gradebook.get(student);
        if (studentScores.isEmpty()) {
            System.out.println(student + " has no recorded scores.");
            return 0.0;
        }

        double totalScore = 0.0;
        int count = 0;
        for (double score : studentScores.values()) {
            totalScore += score;
            count++;
        }
        return totalScore / count;
    }


    public Student(String name) {
        this.name = name;
        this.IDnum = nextID++;
    }

    public String toString() {
        if (courses.isEmpty()) {
            return (name + " has an ID number of " + IDnum
                    + " and is major in " + major
                    + "\n" + "Student is taking no classes.");
        }
        else if (courses.size() < 4) {
            return (name + " has an ID number of " + IDnum + ", is majoring in "
                    + major + ", and is taking" + "\n" + courses.toString()
                    + "\n" + "Student load is not full time.");
        }
        else {
            return name + " has an ID number of " + IDnum
                    +  ", is majoring in " + major
                    + ", and is taking" + "\n" + courses.toString()
                    + "\n" + "Student load is full time.";
        }
    }

    public void NameChange(String newname) {
        this.name = newname;
    }

    public boolean Tester(Student anotherStudent) {
        if (this.IDnum < anotherStudent.IDnum) {
            return true;
        }
        else {
            return false;
        }
    }
}
