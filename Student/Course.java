package week3.Student;

import java.util.Objects;

public class Course {
    public String department;
    public String coursenum;
    public String credithours;

    public Course(String department, String coursenum, String credithours) {
        this.department = department;
        this.coursenum = coursenum;
        this.credithours = credithours;
    }

    public String getDepartment() {
        return department;
    }

    public String getCoursenum() {
        return coursenum;
    }

    public String getCredithours() {
        return credithours;
    }

    public String toString() {
        return (department + " which has a course number of "
                + coursenum + " and is " + credithours +
                " credit hours." + "\n");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Course course) {
            return Objects.equals(department, course.department) &&
                    Objects.equals(coursenum, course.coursenum) &&
                    Objects.equals(credithours, course.credithours);
        }
        else {
            return false;
        }
    }
}
