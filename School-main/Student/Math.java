package week3.Student;
import java.util.ArrayList;

public class Math implements Major {
    public boolean qualifyForMajor(ArrayList<Course> list) {
        int count = 0;
        for (Course course : list) {
            if ("Math".equals(course.getDepartment()) && course.getCoursenum() > 200) {
                count++;
            }
        }
        return count >= 3;
    }

    public String toString() {
        return "Math";
    }
}