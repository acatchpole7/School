package week3.Student;
import java.util.Map;
import java.util.HashMap;

public class TesterHW6 {
    public static void main(String[] args) {
//        String mathString = "Math";
//        String computerScienceString = "CMSC";
//        Major math = new Math();
//        Major cmsc = new CMSC( );
//
//        Course fundamentalsI = new Course("Fundamentals1", computerScienceString, 150, 4);
//        Course algorithms = new Course("Algorithms", computerScienceString, 250, 3);
//        Course math200 = new Course("Math200", mathString, 200, 4);
//        Course religion101 = new Course("Religion101", "Religion", 101, 4);
//
//        Student roseBush = new Student("Rose Bush", 123, math);
//        Student helenHeaven = new Student("Helen Heaven", 987, cmsc);
//        Student jerryAttrick = new Student("Jerry Attrick", 444, cmsc);
//        Student tommyGunn = new Student("Tommy Gunn", 515, cmsc);
//
//        Map<Course, Double> jerryScores = new HashMap<>();
//        jerryScores.put(fundamentalsI, 92.3);
//        jerryScores.put(algorithms, 87.6);
//        jerryScores.put(math200, 88.8);
//        System.out.println(jerryScores.get(math200));
//        System.out.println(jerryScores.get(religion101));
//        System.out.println(jerryScores.get(fundamentalsI) < jerryScores.get(algorithms));
//
//        roseBush.addCourse(religion101);
//        Map<Course, Double> roseScores = new HashMap<>();
//        roseScores.put(religion101, 77.7);
//        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();
//        gradebook.put(roseBush, roseScores);
//        System.out.println(gradebook);
//
//        gradebook.put(jerryAttrick, jerryScores);
//        jerryScores.put(fundamentalsI, 66.6);
//        gradebook.put(helenHeaven, jerryScores);
//        System.out.println(gradebook.get(helenHeaven).get(fundamentalsI));
//        System.out.println(gradebook.get(jerryAttrick).get(fundamentalsI));
//        System.out.println(gradebook.get(tommyGunn).get(fundamentalsI));
//
//        //problem 4
//        Student student1 = new Student("Alice", 101, new Major("Computer Science"));
//        Student student2 = new Student("Bob", 102, new Major("Mathematics"));
//        Student student3 = new Student("Charlie", 103, new Major("Physics")); // No scores
//        Student student4 = new Student("David", 104, new Major("History")); // Not in gradebook

        // Create Majors
        Major Math = new Math();
        Major CMSC = new CMSC();

        // Student builder
        Student student1 = new Student("Alice", 12, Math);
        Student student2 = new Student("Bob", 13, Math);
        Student student3 = new Student("Charlie", 14, CMSC);
        Student student4 = new Student("David", 15, CMSC);

        // Course builder
        Course course1 = new Course("SQL 101", "CMSC", 255, 4);
        Course course3 = new Course("History", "HIST", 121, 4);
        Course course4 = new Course("Advanced JAVA", "CMSC", 310, 4);
        Course course5 = new Course("Gym", "PE", 103, 4);
        Course course6 = new Course("Web Development", "CMSC", 120, 4);

        // Create the gradebook
        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();

        // Add students with their scores
        Map<Course, Double> aliceScores = new HashMap<>();
        aliceScores.put(course1, 85.0);
        aliceScores.put(course3, 90.0);

        Map<Course, Double> bobScores = new HashMap<>();
        bobScores.put(course1, 78.0);
        bobScores.put(course3, 88.0);

        gradebook.put(student1, aliceScores);
        gradebook.put(student2, bobScores);
        gradebook.put(student3, new HashMap<>()); // No scores for Charlie

        System.out.println("Alice's average: " + Student.getAverageScore(gradebook, student1)); // 87.5
        System.out.println("Bob's average: " + Student.getAverageScore(gradebook, student2)); // 83.0
        System.out.println("Charlie's average: " + Student.getAverageScore(gradebook, student3)); // 0.0; no scores
        System.out.println("David's average: " + Student.getAverageScore(gradebook, student4)); // -1.0; not in gradebook
    }
}

