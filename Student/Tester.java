package week3.Student;

public class Tester {

        public static void main(String[] args) {
            //student builder
            Student joe = new Student("Joe", 10);
            System.out.println(joe);
            Student max = new Student("Max", 11);
            System.out.println(max);
            Student jim = new Student("Jim", 12);
            System.out.println(jim);
            System.out.println(max.Tester(joe)); //false
            System.out.println(joe.Tester(jim)); //true

            //course builder
            Course course1 = new Course("SQL 101", "255", "4");
            Course course2 = new Course("SQL 101", "255", "4");
            Course course3 = new Course("History", "121", "4");
            System.out.println(course1.equals(course2)); // true
            System.out.println(course2.equals(course3)); // false

            //course add/remove tester
            Student Mark = new Student("Mark", 21);
            Course course4 = new Course("Advanced JAVA", "310", "4");
            System.out.println(Mark);
            Mark.addCourse(course1);
            Mark.addCourse(course2);
            Mark.addCourse(course3);
            Mark.addCourse(course4);
//            System.out.println(Mark.getCourses());
//            Mark.removeCourse(course1);
//            System.out.println(Mark.getCourses());

            System.out.println(Mark);

        }
    }

