package week3.Student;

public class Tester {

        public static void main(String[] args) {
            //major builder
            Major Math = new Math();
            Major CMSC = new CMSC();

            //student builder
            Student joe = new Student("Joe", 10, Math);
            System.out.println(joe);
            Student max = new Student("Max", 11, Math);
            System.out.println(max);
            Student jim = new Student("Jim", 12, Math);
            System.out.println(jim);
            System.out.println(max.Tester(joe)); //false
            System.out.println(joe.Tester(jim)); //true

            //course builder
            Course course1 = new Course("SQL 101", "CMSC", 255, 4);
            Course course2 = new Course("SQL 101", "CMSC", 255, 4);
            Course course3 = new Course("History", "HIST", 121, 4);
            System.out.println(course1.equals(course2)); // true
            System.out.println(course2.equals(course3)); // false

            //course add/remove tester
            Student Mark = new Student("Mark", 21, CMSC);
            Course course4 = new Course("Advanced JAVA", "CMSC", 310, 4);
            Course course5 = new Course("Gym", "PE", 103, 4);
            Course course6 = new Course("Web Development", "CMSC", 120, 4);
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
            Student Fred = new Student("Fred", 19, Math);
            Course ex1 = new Course("Calculus", "MATH", 121, 4);
            Course ex2 = new Course("Art", "ART", 112, 4);
            Course ex3 = new Course("Foundations 1", "FOUN", 100, 4);
            Course ex4 = new Course("Psychology", "PSYC", 201, 4);
            Fred.addCourse(ex1);
            Fred.addCourse(ex2);
            Fred.addCourse(ex3);
            Fred.addCourse(ex4);
            System.out.println(Fred);
            Fred.removeCourse(ex1);
            System.out.println(Fred);
            Student Sally = new Student("Sally", 56, Math);
            System.out.println(Sally);

            //workstudy tester
            WorkstudyStudent Bob = new WorkstudyStudent("Bob", 33, CMSC, 8);
            Bob.addHours(4);
            Bob.addCourse(ex1);
            Bob.addCourse(course4);
            Bob.addCourse(ex2);
            System.out.println(Bob);

            //variable testing
            Student John = new WorkstudyStudent("John", 77, Math, 9);
            System.out.println(John);
//            WorkstudyStudent Harold = new Student("Harold", 48);

            //CG Course
            CGCourse test = new CGCourse("test", "MATH", 191, 4, "West Des Moines");
            Bob.addCourse(test);
            System.out.println(Bob);

            //test for more than 4 courses
//            Student sam = new Student("Sam", 7);
//            Course Math = new Course("Math", 213, 4);
//            sam.addCourse(Math);
//            Course Math2 = new Course("Math", 291, 4);
//            sam.addCourse(Math2);
//            System.out.println(sam);

            //test math major
            Math mathtest = new Math();
            Course mathtest1 = new Course("AdvAlgebra", "Math", 203, 4);
            Course mathtest2 = new Course("Calc3", "Math", 258, 4);
            Course mathtest3 = new Course("Linear", "Math", 321, 4);
            Course mathtest4 = new Course("Angular", "Math", 344, 4);
            Student james = new Student("James", 33, Math);
            james.addCourse(mathtest1);
            james.addCourse(mathtest2);
            james.addCourse(mathtest3);
            james.addCourse(mathtest4);
            boolean qualifies = mathtest.qualifyForMajor(james.getCourses());
            System.out.println("Qualifies for Math Major: " + qualifies); //true

            //CMSC tester
            CMSC cmsctest = new CMSC();
            Course cmsctest2 = new Course("python", "CMSC", 209, 4);
            Course cmsctest3 = new Course("java", "CMSC", 210, 4);
            Course cmsctest4 = new Course("javascript", "CMSC", 311, 4);
            Student jeff = new Student("Jeff", 400, CMSC);
            jeff.addCourse(cmsctest2);
            jeff.addCourse(cmsctest3);
            jeff.addCourse(cmsctest4);
            jeff.addCourse(mathtest3);
            System.out.println(jeff);
            boolean qualifes2 = cmsctest.qualifyForMajor(jeff.getCourses());
            System.out.println("Qualifies for CMSC Major: " + qualifes2); //true

            //few courses in major
            Student mike = new Student("Mike", 80, Math);
            mike.addCourse(mathtest1);
            mike.addCourse(mathtest3);
            System.out.println(mike);
            boolean qualifies3 = mathtest.qualifyForMajor(mike.getCourses());
            System.out.println("Qualifies for Math major: " + qualifies3); //false

            //many courses
            Student grant = new Student("Grant", 450, CMSC);
            grant.addCourse(cmsctest2);
            grant.addCourse(cmsctest3);
            grant.addCourse(cmsctest4);
            grant.addCourse(mathtest1);
            grant.addCourse(mathtest4);
            System.out.println(grant);
            boolean qualifies4 = cmsctest.qualifyForMajor(grant.getCourses());
            System.out.println("Qualifies for CMSC Major: " + qualifies4); //true

        }
    }

