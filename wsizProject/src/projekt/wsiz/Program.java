package projekt.wsiz;

import projekt.wsiz.Employee;

public class Program {

    public static void main(String[] args) {

        //tworzenie obiektu przez konstruktor
        Employee employee1 = new Employee("Jan", "Kowalski", 25);
        System.out.println(employee1);

        //tworzenie i zwrócenie obiektu przez metodę statyczną
        Employee employee2 = Employee.createAndReadEmployee();
        System.out.println(employee2);

        Company company = new Company();
        company.add(employee1);
        company.add(employee2);

    }
}
