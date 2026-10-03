import java.util.*;
class Employee {
    String name;
    String employeeId;
    double salary;
    Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    double calculateBonus() {
        return 0;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println();
    }
}
class Developer extends Employee {

    Developer(String name, String employeeId, double salary) {
        super(name, employeeId, salary);
    }
    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}
class Manager extends Employee {

    Manager(String name, String employeeId, double salary) {
        super(name, employeeId, salary);
    }
    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String employeeId = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equals("DEVELOPER")) {
                employees[i] = new Developer(name, employeeId, salary);
            }
            else if (type.equals("MANAGER")) {
                employees[i] = new Manager(name, employeeId, salary);
            }
        }
        for (Employee e : employees) {
            e.displayDetails();
        }
        sc.close();
    }
}