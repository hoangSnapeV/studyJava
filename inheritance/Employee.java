package inheritance;

public class Employee extends Person {
    double salary;

    public void costOfSalary() {
        Employee e = new Employee();
        e.name = "Vu";
        e.address = "BRVT";
        e.salary = 5000.5;

    }
}
