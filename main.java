import company.models.Manager;
import company.models.Worker;

public class main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Damian", 2000, 1);
        Worker worker2 = new Worker("Patrycja", 1800, 2);
        Worker worker3 = new Worker("Kuba", 2200, 3);
        Worker worker4 = new Worker("Filip", 1900, 4);

        Manager manager = new Manager("Krystian", 3500, 5);

        System.out.println("Wyplata 1 pracownika: " + worker1.getSalary());
        worker1.work();

        System.out.println("Wyplata 2 pracownika: " + worker2.getSalary());
        worker2.work();

        System.out.println("Wyplata 3 pracownika: " + worker3.getSalary());
        worker3.work();

        System.out.println("Wyplata 4 pracownika " + worker4.getSalary());
        worker4.work();

        System.out.println("Wynagrodzenie menadzera: " + manager.getSalary());
        manager.work();
    }
}
