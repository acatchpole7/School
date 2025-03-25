package week3.Student;

import java.util.Objects;

public class Course {
    private String coursename;
    private String department;
    private int coursenum;
    private int credithours;

    public Course(String coursename, String department, int coursenum, int credithours) {
        this.coursename = coursename;
        this.department = department;
        this.coursenum = coursenum;
        this.credithours = credithours;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getDepartment() {
        return department;
    }

    public int getCoursenum() {
        return coursenum;
    }

    public int getCredithours() {
        return credithours;
    }

    public String toString() {
        return (coursename + " in department " + department + " which has a course number of "
                + coursenum + " and is " + credithours +
                " credit hours." + "\n");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Course course) {
            return Objects.equals(coursename, course.coursename) &&
                    Objects.equals(department, course.department) &&
                    Objects.equals(coursenum, course.coursenum) &&
                    Objects.equals(credithours, course.credithours);
        }
        else {
            return false;
        }
    }
}
