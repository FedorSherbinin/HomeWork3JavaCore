package Task2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void increaseSalaries(double amount) {
        Manager.increaseSalaries(employees, amount);
    }

    public void printSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee("Alice", 50000));
        company.addEmployee(new Employee("Bob", 55000));
        company.addEmployee(new Manager("Charlie", 70000));
        company.addEmployee(new Employee("David", 60000));

        System.out.println("Before salary increase:");
        company.printSalaries();

        // Повысьте зарплату всем сотрудникам на 5000
        company.increaseSalaries(5000);

        System.out.println("\nAfter salary increase:");
        company.printSalaries();
    }
}
