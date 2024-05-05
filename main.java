import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Damian", 2000, 1, "2022-01-01", "Junior IT Specialist");
        Worker worker2 = new Worker("Patrycja", 1800, 2, "2021-12-15", "Senior IT Specialist");
        Worker worker3 = new Worker("Kuba", 2200, 3, "2022-02-10", "Project Manager");
        Worker worker4 = new Worker("Filip", 1900, 4, "2022-03-05", "QA Engineer");

        Manager manager = new Manager("Krystian", 3500, 5, "2021-11-20", "Team Leader");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Pozycja: " + employee.getPosition() +
                    ", Data zatrudnienia: " + employee.getHireDate() +
                    ", Wynagrodzenie " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
