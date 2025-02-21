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
            Course course5 = new Course("Gym", "103", "4");
            Course course6 = new Course("Web Development", "120", "4");
            System.out.println(Mark);
            Mark.addCourse(course1);
            Mark.addCourse(course2);
            Mark.addCourse(course3);
            Mark.addCourse(course4);
            Mark.addCourse(course5);
            Mark.addCourse(course6);
            System.out.println(Mark.getCourses());
            Mark.removeCourse(course1);
            Mark.removeCourse(course5);
            System.out.println(Mark.getCourses());

            //new toString method
            Student Fred = new Student("Fred", 19);
            Course ex1 = new Course("Calculus", "121", "4");
            Course ex2 = new Course("Art", "112", "4");
            Course ex3 = new Course("Foundations 1", "100", "4");
            Course ex4 = new Course("Psychology", "201", "4");
            Fred.addCourse(ex1);
            Fred.addCourse(ex2);
            Fred.addCourse(ex3);
            Fred.addCourse(ex4);
            System.out.println(Fred);
            Fred.removeCourse(ex1);
            System.out.println(Fred);
            Student Sally = new Student("Sally", 56);
            System.out.println(Sally);

            //workstudy tester
            WorkstudyStudent Bob = new WorkstudyStudent("Bob", 33, 8);
            Bob.addHours(4);
            Bob.addCourse(ex1);
            Bob.addCourse(course4);
            Bob.addCourse(ex2);
            System.out.println(Bob);

            //variable testing
            Student John = new WorkstudyStudent("John", 77, 9);
            System.out.println(John);
//            WorkstudyStudent Harold = new Student("Harold", 48);

            //CG Course
            CGCourse test = new CGCourse("Math", "191", "4", "West Des Moines");
            Bob.addCourse(test);
            System.out.println(Bob);

        }
    }

