package projekt.wsiz;

import projekt.wsiz.Employee;

public class Program {

    public static void main(String[] args) {
        Company company = new Company();
        //tworzenie obiektu przez konstruktor
        Employee employee1 = new Employee("Anna", "Kowalska", 25);
        Employee employee2 = new Employee("Jan", "Kowalski", 25);
        Employee employee3 = new Employee("abc", "Kowalska", 25);
        Employee employee4 = new Employee("def", "Kowalska", 25);

        company.add(employee1);
        company.add(employee2);
        company.add(employee3);
        company.add(employee4);

        company.add();
        company.printEmployees();

        company.removeEmployee();

        company.printEmployees();

    }
}
