package week3.Student;
import java.util.ArrayList;

public class CMSC implements Major {
    public boolean qualifyForMajor(ArrayList<Course> list) {
        int count = 0;
        boolean highLevel = false;
        for (Course course : list) {
            if ("CMSC".equals(course.getDepartment())) {
                count++;
                if (course.getCoursenum() >= 300) {
                    highLevel = true;
                }
            }
        }
        return count >= 3 && highLevel;
    }

    public String toString() {
        return "CMSC";
    }
}

