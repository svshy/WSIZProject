package projekt.wsiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();
    private final ConsoleLogger logger;

    public Company(ConsoleLogger logger) {
        this.logger = logger;
    }

    public void add(Employee newEmployee) {
        for (Employee employee : employees) {
            if (newEmployee.equals(employee)) {
                logger.error("Próba dodania pracownika o tych samych danych: " + employee);
                return;
            }
        }
        employees.add(newEmployee);
        logger.info("Pracownik dodany (" + newEmployee + ")");
    }


    void addDeveloper() {
        Employee newEmployee = Developer.read();
        add(newEmployee);
    }

    void addManager() {
        Employee newEmployee = Manager.read();
        add(newEmployee);
    }

    public void removeEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer porządkowy pracownika, którego chcesz usunąć");
        int employeeIndex = scan.nextInt();
        while (employeeIndex < 1 || employeeIndex > employees.size()) {
            logger.error("Lista nie zawiera pracownika o podanym numerze porządkowym");
            logger.error("Próba usunięcia pracownika o niepoprawnym numerze porządkowym: " + employeeIndex);
            System.out.println("Podaj poprawny numer porządkowy pracownika");
            employeeIndex = scan.nextInt();
        }
        Employee employee = employees.remove(employeeIndex - 1);
        logger.info("Pracownik usunięty: (" + employee + ")");
    }

    public void printEmployees() {
        if (employees.size() == 0)
            System.err.println("Brak pracowników na liście");
        else {
            System.out.println("------------------");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                int employeeIndex = i + 1;
                System.out.println(employeeIndex + "  " + employee);
            }
            System.out.println("------------------");
        }
    }

}
