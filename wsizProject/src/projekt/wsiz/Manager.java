package projekt.wsiz;

import java.util.Scanner;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String firstname, String lastname, int age, Sex sex, int salary, String[] skills, int teamSize) {
        super(firstname, lastname, age, sex, salary, skills);
        this.teamSize = teamSize;
    }

    private Manager() {
        super();
    }

    //Manager z przedrostkiem "K" (Kierownik)
    @Override
    public String toString() {
        return "K " + super.toString() + this.teamSize;
    }

    //5% premii od wynagrodzenia bazowego za każde 5 osób w zespole
    @Override
    public int getTotalSalary() {
        return (int) (getSalary() + getSalary() * (teamSize / 5) * 0.05);
    }

    static Manager read() {
        Scanner scan = new Scanner(System.in);
        Manager manager = new Manager();

        manager.readFields();
        System.out.println("Podaj ilość osób w zespole");
        manager.teamSize = scan.nextInt();

        return manager;
    }
}
