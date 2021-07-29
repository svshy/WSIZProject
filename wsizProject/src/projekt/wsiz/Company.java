package projekt.wsiz;

import java.util.ArrayList;

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
    public void add(){
        Employee newEmployee = Employee.createAndReadEmployee();
        add(newEmployee);
    }

    public void printEmployees() {
        System.out.println("------------------");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            int employeeIndex = i + 1;
            System.out.println(employeeIndex + "  " + employee);
        }
        System.out.println("------------------");
    }
}
