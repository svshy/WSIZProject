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

    /*przeciążenie metody add - metoda nie przyjmuje stworzonego obiektu nowego pracownika
    zamiast tego wywołuje metodę statyczną dodającą pracownika i dodaje go do listy
     */
    public void add() {
        Employee newEmployee = Employee.createAndReadEmployee();
        add(newEmployee);
    }

    public void removeEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer porządkowy pracownika, którego chcesz usunąć");
        int employeeIndex = scan.nextInt();
            while (employeeIndex < 1 || employeeIndex > employees.size()) {
                System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym");
                System.out.println("Podaj poprawny numer porządkowy pracownika");
                employeeIndex = scan.nextInt();
            }
        employees.remove(employeeIndex-1);
    }

    public void printEmployees() {
        if(employees.size() == 0)
            System.out.println("Brak pracowników na liście");
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
