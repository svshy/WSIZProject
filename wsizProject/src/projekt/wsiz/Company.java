package projekt.wsiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee newEmployee) {
        for (Employee employee : employees) {
            if (newEmployee.equals(employee)) {
                System.out.println(newEmployee + " - Taki pracownik już istnieje");
                return;
            }
        }
        employees.add(newEmployee);
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
            System.err.println("Lista nie zawiera pracownika o podanym numerze porządkowym");
            System.err.println("Podaj poprawny numer porządkowy pracownika");
            employeeIndex = scan.nextInt();
        }
        employees.remove(employeeIndex - 1);
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
