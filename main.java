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
        Worker worker5 = new Worker("Anna", 2500, 5, "2022-04-15", "Software Developer");

        Manager manager1 = new Manager("Krystian", 3500, 6, "2021-11-20", "Team Leader");
        Manager manager2 = new Manager("Monika", 4000, 7, "2021-10-10", "Head of IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Suma wynagrodzen dla wszystkich pracownikow " + totalSalary);
        System.out.println("Suma wynagrodzen menadzerow " + totalManagerSalary);
        System.out.println("Suma wynagrodzen pracownikow " + totalWorkerSalary);

        for (Employee employee : employees) {
            for (Employee other : employees) {
                if (employee.equals(other)) {
                    System.out.println(employee.getName() + " ma odpowiednik w kolekcji: " + other.getName());
                }
            }
        }
    }
}
