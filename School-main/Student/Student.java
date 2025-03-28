package week3.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private int IDnum;
    private static int nextID;
    private ArrayList<Course> courses;
    private boolean isSorted;

    public Student(String name, int IDnum) {
        this.name = name;
        this.IDnum = IDnum;
        this.courses = new ArrayList<>();
        this.isSorted = true;
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("This course is already in the list.");
        }
        else {
            courses.add(course);
            System.out.println("Course added successfully.");
            isSorted = false;
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course removed successfully.");
            isSorted = false;
        }
        else {
            System.out.println("This course is not in the list.");
        }
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public Student(String name) {
        this.name = name;
        this.IDnum = nextID++;
        this.courses = new ArrayList<>();
        this.isSorted = true;
    }

    public String toString() {
        if (!isSorted) {
            Collections.sort(courses, Comparator.comparing(Course::getCoursename));
            isSorted = true;
        }

        if (courses.isEmpty()) {
            return (name + " has an ID number of " + IDnum
                    + "\n" + "Student is taking no classes.");
        }
        else if (courses.size() < 4) {
            return (name + " has an ID number of " + IDnum
                    + " and is taking" + "\n" + courses.toString()
                    + "\n" + "Student load is not full time.");
        }
        else {
            return name + " has an ID number of " + IDnum
                    + " and is taking" + "\n" + courses.toString();
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
