package week3.Student;

import java.util.Map;
import java.util.HashMap;

public class TesterHW6 {
    public static void main(String[] args) {
        String mathString = "Math";
        String computerScienceString = "CMSC";
        Major math = new Math();
        Major cmsc = new CMSC( );

        Course fundamentalsI = new Course("Fundamentals1", computerScienceString, 150, 4);
        Course algorithms = new Course("Algorithms", computerScienceString, 250, 3);
        Course math200 = new Course("Math200", mathString, 200, 4);
        Course religion101 = new Course("Religion101", "Religion", 101, 4);

        Student roseBush = new Student("Rose Bush", 123, math);
        Student helenHeaven = new Student("Helen Heaven", 987, cmsc);
        Student jerryAttrick = new Student("Jerry Attrick", 444, cmsc);
        Student tommyGunn = new Student("Tommy Gunn", 515, cmsc);

        Map<Course, Double> jerryScores = new HashMap<>();
        jerryScores.put(fundamentalsI, 92.3);
        jerryScores.put(algorithms, 87.6);
        jerryScores.put(math200, 88.8);
        System.out.println(jerryScores.get(math200));
        System.out.println(jerryScores.get(religion101));
        System.out.println(jerryScores.get(fundamentalsI) < jerryScores.get(algorithms));

        roseBush.addCourse(religion101);
        Map<Course, Double> roseScores = new HashMap<>();
        roseScores.put(religion101, 77.7);
        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();
        gradebook.put(roseBush, roseScores);
        System.out.println(gradebook);

        gradebook.put(jerryAttrick, jerryScores);
        jerryScores.put(fundamentalsI, 66.6);
        gradebook.put(helenHeaven, jerryScores);
        System.out.println(gradebook.get(helenHeaven).get(fundamentalsI));
        System.out.println(gradebook.get(jerryAttrick).get(fundamentalsI));
        System.out.println(gradebook.get(tommyGunn).get(fundamentalsI));

    }
}
