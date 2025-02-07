package week3.Student;

public class Student {
    public String name;
    public int IDnum;
    public static int nextID;

    public Student(String name, int IDnum) {
        this.name = name;
        this.IDnum = IDnum;
    }

    public Student(String name) {
        this.name = name;
        this.IDnum = nextID++;
    }

    public String toString() {
        return(name + " has an ID number of " + IDnum);
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

    public static void main(String[] args) {
        Student joe = new Student("Joe", 10);
        System.out.println(joe);
        Student max = new Student("Max", 11);
        System.out.println(max);
        Student jim = new Student("Jim", 12);
        System.out.println(jim);
        System.out.println(max.Tester(joe)); //false
        System.out.println(joe.Tester(jim)); //true
    }
}
