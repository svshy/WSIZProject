package projekt.wsiz;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;


    //utowrzenie obiektu przez konstruktor
    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    //konstruktor domyślny
    public Employee() {

    }

    //utworzenie obiektu i wczytanie danych przez metodę statyczną
    public static Employee createAndReadEmployee() {
        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        employee.setFirstname(scan.nextLine());
        System.out.print("Podaj nazwisko: ");
        employee.setLastname(scan.nextLine());
        System.out.print("Podaj wiek: ");
        employee.setAge(scan.nextInt());
        return employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // nadpisana metoda toString zwracająca informacje o pracowniku
    @Override
    public String toString() {
        return firstname + " " + lastname + " " + age;
    }
}
