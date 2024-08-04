package Task2;

import java.util.List;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void increaseSalaries(List<Employee> employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }

    @Override
    public String toString() {
        return "Manager: " + name + ", Salary: " + salary;
    }
}
