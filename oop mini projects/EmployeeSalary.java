
abstract class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs. " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    int hours;
    double rate;

    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahul", 101, 30000);
        Employee e2 = new PartTimeEmployee("Amit", 102, 80, 200);

        System.out.println("FULL TIME EMPLOYEE");
        e1.display();

        System.out.println("\nPART TIME EMPLOYEE");
        e2.display();
    }
}
