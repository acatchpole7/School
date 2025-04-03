package week3.Student;

public class WorkstudyStudent extends Student{
    private double hoursWorked;

    public WorkstudyStudent (String name, int IDnum, Major major, double hoursWorked) {
        super(name, IDnum, major);
        this.hoursWorked = hoursWorked;
    }

    public double addHours(double add) {
        return hoursWorked += add;
    }

    public String toString() {
        return super.toString() + "\n" + "This student is a work study student and has earned $" + hoursWorked * 7.25;
    }
}
